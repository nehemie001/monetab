package ci.digitalacademy.monetab.services.Impl;

import ci.digitalacademy.monetab.models.Person;
import ci.digitalacademy.monetab.repositories.PersonRepository;
import ci.digitalacademy.monetab.services.PersonService;
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
     * @param person
     * @return
     */
    @Override
    public Person save(Person person) {
        return null;
    }

    /**
     * @param person
     * @return
     */
    @Override
    public Person update(Person person) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Person> findOne(Long id) {
        return Optional.empty();
    }

    /**
     * @return
     */
    @Override
    public List<Person> findAll() {
        return List.of();
    }

    /**
     * @param id
     */
    @Override
    public void delete(Long id) {

    }
}
