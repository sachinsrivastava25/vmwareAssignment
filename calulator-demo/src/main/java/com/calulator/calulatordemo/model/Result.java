package com.calulator.calulatordemo.model;

import org.springframework.stereotype.Component;

@Component
public class Result 
{
	private int result;
	public Result()
	{
		
	}
	
	public Result(int result)
	{
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return result+"";
	}
	
	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
}
