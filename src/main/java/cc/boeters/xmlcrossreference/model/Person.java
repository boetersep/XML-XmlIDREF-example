package cc.boeters.xmlcrossreference.model;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlJavaTypeAdapter(PersonAdapter.class)
public class Person {

	private String name;

	private final Address address;

	public Person(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}

}
