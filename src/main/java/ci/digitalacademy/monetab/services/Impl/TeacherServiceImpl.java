package ci.digitalacademy.monetab.services.Impl;

import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.repositories.TeacherRepository;
import ci.digitalacademy.monetab.services.TeacherService;
import ci.digitalacademy.monetab.services.dto.TeacherDTO;
import ci.digitalacademy.monetab.services.mapper.TeacherMapper;
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
     * @param teacherDTO
     * @return
     */
    @Override
    public TeacherDTO save(TeacherDTO teacherDTO) {
        Teacher teacher = TeacherMapper.toEntity(teacherDTO);
        teacher = teacherRepository.save(teacher);
        return TeacherMapper.toDto(teacher);
    }

    /**
     * @param teacherDTO
     * @return
     */
    @Override
    public TeacherDTO update(TeacherDTO teacherDTO) {
        return findOne(teacherDTO.getId()).map(existingTeacher -> {
            existingTeacher.setMatiere(teacherDTO.getMatiere());
            return save(existingTeacher);
        }).orElseThrow(() -> new IllegalArgumentException());
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<TeacherDTO> findOne(Long id) {
        return teacherRepository.findById(id).map(teacher -> {
            return TeacherMapper.toDto(teacher);
        });
    }

    /**
     * @return
     */
    @Override
    public List<TeacherDTO> findAll() {
        return teacherRepository.findAll().stream().map(teacher -> {
            return TeacherMapper.toDto(teacher);
        }).toList();
    }

    /**
     * @param id
     */
    @Override
    public void delete(Long id) {
        teacherRepository.deleteById(id);
    }
}
