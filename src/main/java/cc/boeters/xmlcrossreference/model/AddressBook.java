package cc.boeters.xmlcrossreference.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "addressbook")
@XmlAccessorType(XmlAccessType.FIELD)
public class AddressBook {

	@XmlElement(name = "person")
	private List<Person> persons;

	@XmlElement(name = "address")
	private List<Address> addresses;

	public List<Address> getAddresses() {
		return addresses;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	@Override
	public String toString() {
		return "AddressBook [persons=" + persons + ", addresses=" + addresses
				+ "]";
	}

}