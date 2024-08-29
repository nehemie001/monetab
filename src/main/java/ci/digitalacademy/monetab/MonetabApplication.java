package ci.digitalacademy.monetab;

import ci.digitalacademy.monetab.models.*;
import ci.digitalacademy.monetab.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@SpringBootApplication
public class MonetabApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	@Autowired
	private TeacherService teacherService;

	@Autowired
	private StudentService studentService;

	@Autowired
	private AdresseService adresseService;

	public static void main(String[] args) {
		SpringApplication.run(MonetabApplication.class, args);
	}

	@Override
	public void run(String... args) {

//		Student student = new Student();
//		student.setMatricule("22ewdqd");
//		student.setEmail("sdqwdw@gmail.com");
//		student.setFirstName("odao");
//		student.setLastName("iwki");
//
//		Student student1 = new Student();
//		student1.setMatricule("838JHHJGS");
//		student1.setEmail("qwewq@gmail.com");
//		student1.setFirstName("Cisse");
//		student1.setLastName("prisca");
//
//		studentService.save(student);
//		studentService.save(student1);
//
//		Teacher teacher = new Teacher();
//		teacher.setMatiere("Math");
//		teacher.setEmail("sdd@gmail.com");
//		teacher.setFirstName("Yao");
//		teacher.setLastName("brice");
//
//		Teacher teacher1 = new Teacher();
//		teacher1.setMatiere("Chimie");
//		teacher1.setEmail("sadas@gmail.com");
//		teacher1.setFirstName("Ouattara");
//		teacher1.setLastName("Koumare");
//
//		teacherService.save(teacher);
//		teacherService.save(teacher1);
//
//		Adresse adresse = new Adresse();
//		adresse.setStreet("belle ville");
//		adresse.setCity("Bamako");
//		adresse.setCountry("Mali");
//
//		adresseService.save(adresse);
////
//		User user = new User();
//		user.setAdresse(adresse);
//		user.setPseudo("kone");
//		user.setPassword("8i927733");
//		user.setCreationDate(Instant.now());
//
//		userService.save(user);


//		Adresse adresse = new Adresse(null, "abidjan", "cote divoire", "bp");
//		Adresse adresse = new Adresse();
//		adresse.setCountry("Mali");
//		adresse.setCity("Bamako");
//		adresse.setStreet("Rue 14");
//		adresseService.save(adresse);
//
//		User user = new User(null, "nehemie", "12341234", Instant.now(), adresse);
//		userService.save(user);

//		Traitement teacher


//		Traitement fiche de note
//		FicheNote ficheNote1 = new FicheNote();
//		ficheNote1.setNote("10");
//		ficheNote1.setYears("2024");
//
//		FicheNote ficheNote2 = new FicheNote();
//		ficheNote2.setNote("14");
//		ficheNote2.setYears("2024");
//
//		ficheNoteService.save(ficheNote1);
//		ficheNoteService.save(ficheNote2);
//
//		Set<FicheNote> ficheNote = new HashSet<>();
//		ficheNote.add(ficheNote1);
//		ficheNote.add(ficheNote2);
//
//		Teacher teacher = new Teacher();
//		teacher.setMatiere("Histoire");
//		teacher.setFicheNotes(ficheNote);
//		teacherService.save(teacher);

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
