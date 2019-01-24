package com.solutec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.solutec.dao.UserRepository;
import com.solutec.entities.User;

@SpringBootApplication
public class PrimoApplication implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepos;
	
	public static void main(String[] args) {
		SpringApplication.run(PrimoApplication.class, args);
	}

	@Override //ajout de données dans la bdd user
	public void run(String... args) throws Exception {
		/**userRepos.save(new User("nom","jojo@moi.com"));
		userRepos.save(new User("toto","toto@moi.com"));
		userRepos.save(new User("lala","lala@moi.com"));
	*/}

}

