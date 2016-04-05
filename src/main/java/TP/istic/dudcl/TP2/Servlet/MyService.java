package TP.istic.dudcl.TP2.Servlet;

import java.util.ArrayList;
import java.util.Date;

import model.Personnes;

import java.util.List;

public class MyService {
	
	List<Personnes> pers = new ArrayList<Personnes>();
	
	private static MyService instance = null;
	
	public static MyService getInstance() {
		if (instance == null)
			instance =new MyService();
		return instance;
	}

	private MyService() {
		
		Personnes p = new Personnes("Dupont","Jean", "17/04/1989", 27, "18 rue Charcot");
			
		pers.add(p);
	
	}
	
	public List<Personnes> getAllPersons(){
		
		
		
		return pers;
		
	}
	public void addPerson( Personnes p){
		
		
		
		pers.add(p);
		
	}


}