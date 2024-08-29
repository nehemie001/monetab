package ci.digitalacademy.monetab.services.mapper;

import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.services.dto.StudentDTO;

public class StudentMappeur {

    private StudentMappeur(){}

    public static StudentDTO toDto(Student student) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setMatricule(student.getMatricule());
        studentDTO.setFirstName(student.getFirstName());
        studentDTO.setLastName(student.getLastName());
        studentDTO.setEmail(student.getEmail());
        return studentDTO;
    }

    public static Student toEntity(StudentDTO studentDTO) {
        Student student = new Student();
        student.setId(student.getId());
        student.setMatricule(studentDTO.getMatricule());
        student.setFirstName(studentDTO.getFirstName());
        student.setLastName(studentDTO.getLastName());
        student.setEmail(studentDTO.getEmail());
        return student;
    }
}
