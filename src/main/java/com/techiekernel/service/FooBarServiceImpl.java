package com.techiekernel.service;

public class FooBarServiceImpl implements FooBarService{
	public String getMessage(String msg) {
 		String output = "FooBar say : " + msg;
 		return output;
 	}
}
