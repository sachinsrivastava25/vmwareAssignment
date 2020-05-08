package com.calulator.calulatordemo.model;

import org.springframework.stereotype.Component;

@Component
public class Inputs
{
	int x;
	int y;
	
	public Inputs() 
	{
		
	}
	
	public Inputs(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Inputs [x=" + x + ", y=" + y + "]";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	
	
}
