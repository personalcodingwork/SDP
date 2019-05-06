package com.strategy.design.pattern.driver;

import com.strategy.design.pattern.Animal;
import com.strategy.design.pattern.Bird;
import com.strategy.design.pattern.Dog;

public class Driver {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal bird = new Bird();
		System.out.println("Dog: "+dog.tryFly());
		System.out.println("Dog: "+bird.tryFly());
	}

}
