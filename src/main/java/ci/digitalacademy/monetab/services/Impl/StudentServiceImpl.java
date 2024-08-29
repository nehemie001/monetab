package ci.digitalacademy.monetab.services.Impl;

import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.repositories.StudentRepository;
import ci.digitalacademy.monetab.services.StudentService;
import ci.digitalacademy.monetab.services.dto.StudentDTO;
import ci.digitalacademy.monetab.services.mapper.StudentMappeur;
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
     * @param studentDTO
     * @return
     */
    @Override
    public StudentDTO save(StudentDTO studentDTO) {
        Student student = StudentMappeur.toEntity(studentDTO);
        student = studentRepository.save(student);
        return StudentMappeur.toDto(student);
    }

    /**
     * @param studentDTO
     * @return
     */
    @Override
    public StudentDTO update(StudentDTO studentDTO) {
        return findOne(studentDTO.getId()).map(existingStudent -> {
            existingStudent.setMatricule(studentDTO.getMatricule());
            return save(existingStudent);
        }).orElseThrow(() -> new IllegalArgumentException());
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<StudentDTO> findOne(Long id) {
        return studentRepository.findById(id).map(student -> {
            return StudentMappeur.toDto(student);
        });
    }

    /**
     * @return
     */
    @Override
    public List<StudentDTO> findAll() {
        return studentRepository.findAll().stream().map(student -> {
            return StudentMappeur.toDto(student);
        }).toList();
    }

    /**
     * @param id
     */
    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }
}
