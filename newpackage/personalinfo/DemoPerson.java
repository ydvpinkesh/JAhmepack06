package newpackage.personalinfo;

import newpackage.countryinfo.Country;
import newpackage.countryinfo.State;

public class DemoPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Country c = new Country("India");
		State s = new State("Gujarat");	
		Person p = new Person("Pinkesh",c,s);
		
		System.out.println(p);
		

	}

}
