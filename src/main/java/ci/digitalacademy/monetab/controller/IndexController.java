package ci.digitalacademy.monetab.controller;

import ci.digitalacademy.monetab.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class IndexController {

    @GetMapping
    public String index(Model model) {
        User user = new User(1, "kakou", "seraphin");
        User user1 = null;
        model.addAttribute("student", user);
        model.addAttribute("student1", user1);
        return "home";
    }
}
