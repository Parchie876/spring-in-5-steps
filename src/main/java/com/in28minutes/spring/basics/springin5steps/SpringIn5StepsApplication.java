package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {
	// ? What are the beans? --> By importing the @Component
	// ? What are the dependencies of a bean? --> importing @Autowired
	// ? What to search for beans --> identify the package the beans are

	public static void main(String[] args) {
		// BinarySearchImpl binarySearch =
		// new BinarySearchImpl(new BubbleSortAlgorithm());
		// ! Application Context --> manages all the beans

		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] { 12, 4, 6, 7, 8 }, 3);

		System.out.println(result);
	}

}
