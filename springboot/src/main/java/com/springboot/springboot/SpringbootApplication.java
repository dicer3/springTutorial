package com.springboot.springboot;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.springboot.dao.UserRepository;
import com.springboot.springboot.entities.User1;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class); 
		
		// User1 user1= new User1();
		// user1.setName("pragun");
		// user1.setCity("jammu");
		// user1.setStatus("mern stack");

		//User1 user2 = userRepository.save(user);
		// User1 user2= new User1();
		// user2.setName("shivam");
		// user2.setCity("ahodhya");
		// user2.setStatus("mern stack 2");
		// userRepository.save(user2);

		// ArrayList<User1> users = new ArrayList<User1>();
        // users.add(user1);
		// users.add(user2);


        // Iterable<User1> resultUsers = userRepository.saveAll(users);
		// resultUsers.forEach(user -> {
        //   System.out.println(user);
		// });

		// Optional<User1> optional = userRepository.findById(3);
		// User1 user = optional.get();

		// user.setName("shivam mishra");
		// User1 result = userRepository.save(user);

		// System.out.println("result "+result);

		// how to get the data
		// findById(id) - 

		// sIterable<User1> itr = userRepository.findAll();
		
        //Iterator<User1> iterator = itr.iterator();

		// while(iterator.hasNext()){
		// 	User1 user = iterator.next();
		// 	System.out.println(user);
		// }

		// itr.forEach(user -> System.out.println("user "+user));

		// deleteing by userId
		// userRepository.deleteById(3);

		// List<User1> users = userRepository.findByName("pragun");

		// users.forEach(user-> System.out.println("user "+user));

		// List<User1> users2 = userRepository.findByNameAndCity("shivam", "ahodhya");

		// users2.forEach(user-> System.out.println("user 2"+user));

        // List<User1> allUsers = userRepository.getAllUser();
		// allUsers.forEach(user->System.out.println("user "+user));

		// List<User1> userByName = userRepository.getUserByName("pragun","jammu");
		// userByName.forEach(user->System.out.println(user));


		// List<User1> allUsers = userRepository.getAllUsers();
		// allUsers.forEach(user->System.out.println(user));
	}

}
