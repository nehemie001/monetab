package ci.digitalacademy.monetab.services;

import ci.digitalacademy.monetab.services.dto.AddressDTO;

import java.util.List;
import java.util.Optional;

public interface AdresseService {

    AddressDTO save(AddressDTO adresse);

    AddressDTO update(AddressDTO adresse);

    Optional<AddressDTO> findOne(Long id);

    List<AddressDTO> findAll();

    void delete(Long id);
}
