package cc.boeters.xmlcrossreference.boot;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import cc.boeters.xmlcrossreference.model.AddressBook;

public class Runner {
	public static void main(String[] args) throws JAXBException {
		new Runner();
	}

	public Runner() throws JAXBException {
		JAXBContext jc = JAXBContext.newInstance(AddressBook.class);
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		InputStream resourceAsStream = getClass().getResourceAsStream(
				"addressbook.xml");
		AddressBook addressBook = (AddressBook) unmarshaller
				.unmarshal(resourceAsStream);
		System.out.println(addressBook);
	}
}
