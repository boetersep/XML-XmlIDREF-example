package cc.boeters.xmlcrossreference.model;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class PersonAdapter extends XmlAdapter<AdaptedPerson, Person> {

	@Override
	public AdaptedPerson marshal(Person person) throws Exception {
		AdaptedPerson adaptedPerson = new AdaptedPerson();
		adaptedPerson.setAddress(person.getAddress());
		adaptedPerson.setName(person.getName());
		return adaptedPerson;
	}

	@Override
	public Person unmarshal(AdaptedPerson adaptedPerson) throws Exception {
		Person person = new Person(adaptedPerson.getAddress());
		person.setName(adaptedPerson.getName());
		return person;
	}

}
