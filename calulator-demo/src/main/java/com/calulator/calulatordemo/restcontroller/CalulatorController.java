package com.calulator.calulatordemo.restcontroller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.calulator.calulatordemo.model.Inputs;
import com.calulator.calulatordemo.model.Result;

@RestController
@RequestMapping("/api")
public class CalulatorController
{
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public Result sum(@RequestBody Inputs input)
	{
		Result res = new Result();
		res.setResult(input.getX() + input.getY());
		return res;
	}
	
	@RequestMapping(value="/diff", method = RequestMethod.POST)
	public Result diff(@RequestBody Inputs input)
	{
		Result res = new Result();
		res.setResult(input.getX() - input.getY());
		return res;
	}
}
