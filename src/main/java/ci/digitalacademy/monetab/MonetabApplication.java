package ci.digitalacademy.monetab;

import ci.digitalacademy.monetab.models.Student;
import ci.digitalacademy.monetab.models.User;
import ci.digitalacademy.monetab.services.StudentService;
import ci.digitalacademy.monetab.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class MonetabApplication implements CommandLineRunner {

	@Autowired
	private StudentService studentService;

	public static void main(String[] args) {
		SpringApplication.run(MonetabApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		User user = new User(null, "nehemie", "12341234", Instant.now());
//		User user1 = new User(null, "pedahel", "12341234", Instant.now());
//		userService.save(user);
//		userService.save(user1);
		Student student = new Student(null, "HJHSDHGH3");
		studentService.save(student);

//		Afficher la liste des utilisateurs
//		List<User> users = userService.findAll();
//		System.out.println(users);
//
////		Recuperer un utilisateur
//		Optional <User> optionalUser = userService.findOne(2L);
//		System.out.println(optionalUser);
//
////		Tester la mise a jour (modifier)
//		user1.setPseudo("pedahel001");
//		userService.save(user1);
//
////		Test pour la suppression d'un utilisateur
//		userService.delete(user.getId());
	}

}
