package com.relationship.onetomany;

import com.relationship.onetomany.entity.Address;
import com.relationship.onetomany.entity.Laptop;
import com.relationship.onetomany.entity.Student;
import com.relationship.onetomany.repositories.*;
import jakarta.annotation.PostConstruct;
import org.aspectj.bridge.MessageUtil;
import org.hibernate.engine.spi.SessionDelegatorBaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class OnetomanyApplication {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(OnetomanyApplication.class, args);
	}

	@PostConstruct
	public void add() throws Exception {
		Student student = new Student();
		student.setStudentName("Munir");
		student.setStudentStatus("Away");

		Laptop laptop = new Laptop();
		laptop.setLaptopName("Hp");
		laptop.setLaptopModeNumber("FEFET54432");

	    laptop.setStudent(student);
		student.setLaptop(laptop);

		studentRepository.save(student);


		Address  address1 = new Address();
		address1.setAdressId(1);
		address1.setHouseNo(453);
		address1.setCity("Karachi");


		Address  address2 = new Address();
		address2.setAdressId(1);
		address2.setHouseNo(453);
		address2.setCity("Karachi");




		List<Address> addressList= new ArrayList<>();
		addressList.add(address1);
		addressList.add(address2);
		student.setAddressList(addressList);

		studentRepository.save(student);







		//studentRepository.save(student);



	}
}
