package ci.digitalacademy.monetab.services.Impl;

import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.repositories.UserRepository;
import ci.digitalacademy.monetab.services.UserService;
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

//    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class); // Une autre methode pour gerer les log.Debug
    private final UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        log.debug("Request to update user {} ", user);
//        La meilleur methode
        return findOne(user.getId())
                .map(existingUser -> { //Fonction lambda permettant de modifier l'utilisateur
                    existingUser.setPseudo(user.getPseudo());
                    existingUser.setPassword(user.getPassword());
                    return existingUser;
                }).map(existingUser -> { // Fonction lambda permettant d'enregistrer l'utilisateur modifié dans la table
                    return save(existingUser);
                }).orElseThrow(() -> new IllegalArgumentException()); // Lever d'une exception en cas d'innexistance dans la bd

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
    public Optional<User> findOne(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> findAll() {
        log.debug("Request to find all users");
        return userRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete user {} ", id);
        userRepository.deleteById(id);
    }
}
