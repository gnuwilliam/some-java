package com.gowindie.capitols.helpers;

import java.util.ArrayList;

public class CapitolHelper {
	private ArrayList<String> capitols = new ArrayList<String>();
	
	public CapitolHelper(ArrayList<String> capitol) {
		capitols = capitol;
	}
	
	public ArrayList<String> getCapitols() {
		return capitols;
	}
	
	public String getCapitol(int index) {
		return capitols.get(index);
	}
	
	public void addCapitol(String capitolName) {
		capitols.add(capitolName);
	}
}
