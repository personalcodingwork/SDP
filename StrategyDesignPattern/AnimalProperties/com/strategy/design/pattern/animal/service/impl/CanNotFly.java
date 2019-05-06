package com.strategy.design.pattern.animal.service.impl;

import com.strategy.design.pattern.animal.service.Fly;

public class CanNotFly implements Fly{

	@Override
	public String fly() {
		return "Can not fly";
	}

}
