package bmi;

import java.util.ArrayList;

public class Data implements IData {
	private class Person {
		String cpr;
		String name;
		double height;
		double weight;
		
		public Person(String cpr, String name, double height, double weight) {
			this.cpr = cpr;
			this.name = name;
			this.height = height;
			this.weight = weight;
		}
	}
	
	private ArrayList<Person> persons;
	
	public Data() {
		persons  = new ArrayList<Person>();
		persons.add(new Person("234567-8901", "Ib Olsen", 1.80, 75.0));
        persons.add(new Person("456789-0123", "Ole Jensen", 1.75, 95.0));
        persons.add(new Person("123456-7890", "Eva Hansen", 1.65, 65.0));
	}

	@Override
	public String getName(String cpr) {
		for (int i= 0; i< persons.size(); i++)
            if (persons.get(i).cpr.equals(cpr))
                return persons.get(i).name;
        return null;
	}

	@Override
	public double getWeight(String cpr) {
		for (int i= 0; i< persons.size(); i++)
            if (persons.get(i).cpr.equals(cpr))
                return persons.get(i).weight;
        return -1.0;

	}

	@Override
	public double getHeight(String cpr) {
		for (int i= 0; i< persons.size(); i++)
            if (persons.get(i).cpr.equals(cpr))
                return persons.get(i).height;
        return -1.0;
	}
	
}
