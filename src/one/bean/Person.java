package one.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlRootElement(name="PERSON")
@XmlType(propOrder= {"name","age","hasPhone"})
public class Person {
	private String name;
	private int age;
	private List<MyPhone> hasPhone;
	
	public Person() {
		super();
	}

	public Person(String name, int age, MyPhone...myPhones) {
		super();
		this.name = name;
		this.age = age;
		hasPhone=Arrays.asList(myPhones);
	}
	@XmlElement(name="NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@XmlElement(name="AGE")
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@XmlElement(name="HASPHONE")
	public List<MyPhone> getHasPhone() {
		return hasPhone;
	}

	public void setHasPhone(List<MyPhone> hasPhone) {
		this.hasPhone = hasPhone;
	}
	
	
}
