package ci.digitalacademy.monetab.services.mapper;

import ci.digitalacademy.monetab.models.Teacher;
import ci.digitalacademy.monetab.services.dto.TeacherDTO;

public class TeacherMapper {

    private TeacherMapper(){}

    public static TeacherDTO toDto(Teacher teacher) {
        TeacherDTO teacherDTO = new TeacherDTO();
        teacherDTO.setId(teacher.getId());
        teacherDTO.setFirstName(teacher.getFirstName());
        teacherDTO.setLastName(teacher.getLastName());
        teacherDTO.setMatiere(teacher.getMatiere());
        teacherDTO.setEmail(teacher.getEmail());
        return teacherDTO;
    }

    public static Teacher toEntity(TeacherDTO teacherDTO) {
        Teacher teacher = new Teacher();
        teacher.setId(teacherDTO.getId());
        teacher.setFirstName(teacherDTO.getFirstName());
        teacher.setLastName(teacherDTO.getLastName());
        teacher.setMatiere(teacherDTO.getMatiere());
        teacher.setEmail(teacherDTO.getEmail());
        return teacher;
    }
}
