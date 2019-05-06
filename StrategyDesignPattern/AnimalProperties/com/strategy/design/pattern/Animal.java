package com.strategy.design.pattern;

import com.strategy.design.pattern.animal.service.Fly;

public class Animal {
	private String sound;
	private Fly flyType;
	
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public Fly getFlyType() {
		return flyType;
	}
	public void setFlyType(Fly flyType) {
		this.flyType = flyType;
	}
	public String tryFly() {
		return this.getFlyType().fly();
	}
}
