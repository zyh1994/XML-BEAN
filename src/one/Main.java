package one;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.JAXBException;

import one.bean.MyPhone;
import one.bean.Person;

public class Main {

	public static void main(String[] args) {
//		DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
//		MyPhone android=new MyPhone("华为", "no.1", df.format(new Date(2017,01,23)), df.format(new Date(2050,01,23)));
//		MyPhone ios=new MyPhone("苹果", "no.2",  df.format(new Date(2015,11,12)),  df.format(new Date(2025,11,12)));
		MyPhone android=new MyPhone("华为", "no.1", "2017-01-23", "2050-01-23");
		MyPhone ios=new MyPhone("苹果", "no.2",  "2015-11-12", "2025-11-12");
		Person zyh =new Person("zyh",10,android,ios);
		try {
			String xml=XmlHelper.objectToXML(Person.class, zyh);
			Person my=(Person)XmlHelper.xmlToObject(Person.class, xml);
			System.out.println(xml);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
