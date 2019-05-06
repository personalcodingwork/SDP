package com.strategy.design.pattern;

import com.strategy.design.pattern.animal.service.impl.ItFly;

public class Bird extends Animal{
	public Bird() {
		setFlyType(new ItFly());
	}
}
