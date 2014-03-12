package com.gowindie.capitols;

import java.util.ArrayList;

import com.gowindie.capitols.helpers.CapitolHelper;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> capitols = new ArrayList<String>();
		
		capitols.add("Brasilia");
		capitols.add("Washington, DC");
		
		CapitolHelper cHelper = new CapitolHelper(capitols);
		
		System.out.println(cHelper.getCapitols());
		
		cHelper.addCapitol("New Delhi");
		
		System.out.println(cHelper.getCapitols());
		
		System.out.println("The capital of Brazil is " + cHelper.getCapitol(0));
		System.out.println("The capital of the United States is " + cHelper.getCapitol(1));
		System.out.println("The capital of India is " + cHelper.getCapitol(2));
	}

}
