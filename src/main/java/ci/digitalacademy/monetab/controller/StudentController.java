package ci.digitalacademy.monetab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentController {

    @GetMapping
    public String showStudentPage() {
        return "/students/list";
    }

    @GetMapping("/add")
    public String showAddStudentPage() {
        return "/students/forms";
    }

    @GetMapping("/udpate")
    public String showUpdateStudentPage() {
        return "/students/forms";
    }
}
