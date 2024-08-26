package ci.digitalacademy.monetab.services.Impl;

import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.repositories.TeacherRepository;
import ci.digitalacademy.monetab.services.TeacherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    /**
     * @param teacher
     * @return
     */
    @Override
    public Teacher save(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    /**
     * @param teacher
     * @return
     */
    @Override
    public Teacher update(Teacher teacher) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Teacher> findOne(Long id) {
        return Optional.empty();
    }

    /**
     * @return
     */
    @Override
    public List<Teacher> findAll() {
        return List.of();
    }

    /**
     * @param id
     */
    @Override
    public void delete(Long id) {

    }
}
