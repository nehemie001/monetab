package ci.digitalacademy.monetab.services.Impl;

import ci.digitalacademy.monetab.models.Person;
import ci.digitalacademy.monetab.repositories.PersonRepository;
import ci.digitalacademy.monetab.services.PersonService;
import ci.digitalacademy.monetab.services.dto.PersonDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    /**
     * @param personDTO
     * @return
     */
    @Override
    public PersonDTO save(PersonDTO personDTO) {
        return null;
    }

    /**
     * @param personDTO
     * @return
     */
    @Override
    public PersonDTO update(PersonDTO personDTO) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<PersonDTO> findOne(Long id) {
        return Optional.empty();
    }

    /**
     * @return
     */
    @Override
    public List<PersonDTO> findAll() {
        return List.of();
    }

    /**
     * @param id
     */
    @Override
    public void delete(Long id) {

    }
}
