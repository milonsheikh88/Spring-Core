package com.milonsheikh.commonAnnotations;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {

	public void teach() {

		System.out.println("Hi I am your science teacher");

	}

}
