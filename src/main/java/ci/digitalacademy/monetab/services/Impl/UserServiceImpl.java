package ci.digitalacademy.monetab.services.Impl;

import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.repositories.UserRepository;
import ci.digitalacademy.monetab.services.UserService;
import ci.digitalacademy.monetab.services.dto.UserDTO;
import ci.digitalacademy.monetab.services.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Cela nous permet d'eviter de generer un constructor
@RequiredArgsConstructor
//Gérer les debugs
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserDTO save(UserDTO userDTO) {
        log.debug("Request to save: {}", userDTO);
        User user = UserMapper.toEntity(userDTO);
        user = userRepository.save(user);
        return UserMapper.toDto(user);
    }

    @Override
    public UserDTO update(UserDTO userDTO) {
        log.debug("Request to update user {} ", userDTO);
//        Pour modifier quelques element de la table
        return findOne(userDTO.getId()).map(existingUse -> {
            existingUse.setPseudo(userDTO.getPseudo());
            existingUse.setPhone(userDTO.getPhone());
            return save(existingUse);
        }).orElseThrow(() -> new IllegalArgumentException());
//        La meilleur methode
//        return findOne(user.getId())
//                .map(existingUser -> { //Fonction lambda permettant de modifier l'utilisateur
//                    existingUser.setPseudo(user.getPseudo());
//                    existingUser.setPassword(user.getPassword());
//                    return existingUser;
//                }).map(existingUser -> { // Fonction lambda permettant d'enregistrer l'utilisateur modifié dans la table
//                    return save(existingUser);
//                }).orElseThrow(() -> new IllegalArgumentException()); // Lever d'une exception en cas d'innexistance dans la bd

//        Autre methode

//        Optional<User> optionalUser = findOne(user.getId()); //recuperation d'un optional
//        if (optionalUser.isPresent()) { // verification de l'existance d'un contenu dans le Optional
//            User userToUpdate = optionalUser.get(); // Declaration + Affectation d'un ser a partir du Optional
//            userToUpdate.setPseudo(user.getPseudo()); // Mise a jour du pseudo
//            userToUpdate.setPassword(user.getPassword()); // Mise a jour du password
//            return save(userToUpdate); // Enregistrement de l'utilisateur modifié
//        } else {
//            throw new IllegalArgumentException();
//        }
    }

    @Override
    public Optional<UserDTO> findOne(Long id) {
        return userRepository.findById(id).map(user -> {
            return UserMapper.toDto(user);
        });
    }

    @Override
    public List<UserDTO> findAll() {
        return userRepository.findAll().stream().map(user -> {
            return UserMapper.toDto(user);
        }).toList();
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete user {} ", id);
        userRepository.deleteById(id);
    }
}
