package ci.digitalacademy.monetab.services;

import ci.digitalacademy.monetab.services.dto.PersonDTO;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    PersonDTO save(PersonDTO person);

    PersonDTO update(PersonDTO person);

    Optional<PersonDTO> findOne(Long id);

    List<PersonDTO> findAll();

    void delete(Long id);
}
