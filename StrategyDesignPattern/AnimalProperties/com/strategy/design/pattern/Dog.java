package com.strategy.design.pattern;

import com.strategy.design.pattern.animal.service.impl.CanNotFly;

public class Dog extends Animal {
	public Dog() {
		setFlyType(new CanNotFly());
	}
}
