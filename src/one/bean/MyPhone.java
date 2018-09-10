package one.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlType(propOrder= {"ID","name","createTime","deadLine"})
public class MyPhone {
	private  String ID;
	private String name;
	private String createTime;
	private String deadLine;
	
	public MyPhone() {
		super();
	}

	public MyPhone(String name, String ID, String createTime, String deadLine) {
		super();
		this.name = name;
		this.ID = ID;
		this.createTime = createTime;
		this.deadLine = deadLine;
	}
	@XmlElement(name="NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@XmlElement(name="ID")
	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}
	@XmlElement(name="CREATETIME")
	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	@XmlElement(name="DEADLINE")
	public String getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(String deadLine) {
		this.deadLine = deadLine;
	}
	
	

}
