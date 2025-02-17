package net.SMS.Students;

//import java.lang.Exception;

import net.SMS.Students.model.StudentData;
//import net.SMS.Students.controller.StudController;
import net.SMS.Students.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SMSApplication implements CommandLineRunner {

//    public SMSApplication(StudentRepository sr) {
//        this.sr = sr;
//    }

    public static void main(String[] args) {
		SpringApplication.run(SMSApplication.class, args);
	}

	@Autowired
	private StudentRepository srepo;

	@Override
	public void run(String... args) throws Exception {
		//StudentData std = new StudentData("501","ram","java","ram@gmail.com");;
		//StudentData std1 = new StudentData("502","raj","python","rajj@gmail.com");;
//		StudentData stud = new StudentData();
//		stud.setEmail("raj@gmail.com");
//		stud.setName("raj");
//		stud.setCourse("java");
//		stud.setId(21);
//		srepo.save(stud);
//		StudentData stud1 = new StudentData();
//		stud1.setEmail("ram@gmail.com");
//		stud1.setName("ram");
//		stud1.setCourse("python");
//		stud1.setId(22);
//		srepo.save(stud1);



	}
}
