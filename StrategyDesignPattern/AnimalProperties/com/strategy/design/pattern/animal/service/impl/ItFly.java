package com.strategy.design.pattern.animal.service.impl;

import com.strategy.design.pattern.animal.service.Fly;

public class ItFly implements Fly {

	@Override
	public String fly() {
		return "Fly High";
	}

}
