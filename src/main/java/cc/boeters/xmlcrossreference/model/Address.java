package cc.boeters.xmlcrossreference.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "address")
@XmlAccessorType(XmlAccessType.FIELD)
public class Address {

	@XmlID
	@XmlAttribute
	private String id;

	private String street;

	private Integer houseNo;

	private String city;

	public String getCity() {
		return city;
	}

	public Integer getHouseNo() {
		return houseNo;
	}

	public String getId() {
		return id;
	}

	public String getStreet() {
		return street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setHouseNo(Integer houseNo) {
		this.houseNo = houseNo;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", houseNo="
				+ houseNo + ", city=" + city + "]";
	}

}
