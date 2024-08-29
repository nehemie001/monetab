package ci.digitalacademy.monetab.services.Impl;

import ci.digitalacademy.monetab.models.Adresse;
import ci.digitalacademy.monetab.repositories.AdresseRepository;
import ci.digitalacademy.monetab.services.AdresseService;
import ci.digitalacademy.monetab.services.dto.AddressDTO;
import ci.digitalacademy.monetab.services.mapper.AddressMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class AdresseServiceImpl implements AdresseService {

    private final AdresseRepository adresseRepository;

    /**
     * @param adresseDTO
     * @return
     */
    @Override
    public AddressDTO save(AddressDTO adresseDTO) {
        log.debug("Request to save: {}", adresseDTO);
        Adresse adresse = AddressMapper.toEntity(adresseDTO);
        adresse = adresseRepository.save(adresse);
        return AddressMapper.toDto(adresse);
    }

    /**
     * @param addressDTO
     * @return
     */
    @Override
    public AddressDTO update(AddressDTO addressDTO) {
        return findOne(addressDTO.getId()).map(existingAddress -> {
            existingAddress.setCountry(addressDTO.getCountry());
            existingAddress.setCity(addressDTO.getCity());
            return save(existingAddress);
        }).orElseThrow(() -> new IllegalArgumentException());
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<AddressDTO> findOne(Long id) {
        return adresseRepository.findById(id).map(adresse -> {
            return AddressMapper.toDto(adresse);
        });
    }

    /**
     * @return
     */
    @Override
    public List<AddressDTO> findAll() {
        return adresseRepository.findAll().stream().map(adresse -> {
            return AddressMapper.toDto(adresse);
        }).toList();
    }

    /**
     * @param id
     */
    @Override
    public void delete(Long id) {

    }
}
