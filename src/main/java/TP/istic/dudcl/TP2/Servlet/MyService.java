package TP.istic.dudcl.TP2.Servlet;

import java.util.ArrayList;
import java.util.Date;

import model.Personne;

import java.util.List;

public class MyService {
	
	List<Personne> pers = new ArrayList<Personne>();
	
	private static MyService instance = null;
	
	public static MyService getInstance() {
		if (instance == null)
			instance =new MyService();
		return instance;
	}

	private MyService() {
		
		Personne p = new Personne("Dupont","Jean", "17/04/1989", 27, "18 rue Charcot");
			
		pers.add(p);
	
	}
	
	public List<Personne> getAllPersons(){
		
		
		
		return pers;
		
	}
	public void addPerson( Personne p){
		
		
		
		pers.add(p);
		
	}


}