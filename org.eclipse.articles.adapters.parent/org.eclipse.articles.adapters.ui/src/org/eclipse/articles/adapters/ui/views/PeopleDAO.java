package org.eclipse.articles.adapters.ui.views;

import org.eclipse.articles.adapters.core.Person;

public class PeopleDAO {

	public static Person[] getPeople() {
		return new Person[] { 
				new Person("Wayne"), 
				new Person("Donald"),
				new Person("Mike"), 
				new Person("Ian") 
		};
	}

}
