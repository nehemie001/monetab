package ci.digitalacademy.monetab.services.Impl;

import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.repositories.StudentRepository;
import ci.digitalacademy.monetab.services.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    /**
     * @param student
     * @return
     */
    @Override
    public Student save(Student student) {
        return null;
    }

    /**
     * @param student
     * @return
     */
    @Override
    public Student update(Student student) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Student> findOne(Long id) {
        return Optional.empty();
    }

    /**
     * @return
     */
    @Override
    public List<Student> findAll() {
        return List.of();
    }

    /**
     * @param id
     */
    @Override
    public void delete(Long id) {

    }
}
