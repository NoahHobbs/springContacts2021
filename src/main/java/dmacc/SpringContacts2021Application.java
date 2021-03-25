package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Address;
import dmacc.beans.Contact;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ContactRepository;

@SpringBootApplication
public class SpringContacts2021Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringContacts2021Application.class, args);
		
		
	}
	
	//@Autowired
	//ContactRepository repo;
	/*
	@Override
	public void run(String...args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Contact c = appContext.getBean("contact", Contact.class);
		c.setRelationship("best friend");
		repo.save(c);
		
		Contact d = new Contact("Sandra Boynton", "555-555-5557", "friend");
		Address a = new Address("123 Main Street", "Des Moines", "IA");
		d.setAddress(a);
		repo.save(d);
		List<Contact> allMyContacts = repo.findAll();
		for(Contact people: allMyContacts) {
			System.out.println(people.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}
	*/
	
}
