package model;

public class Pokemon {
	

	public String toString() {
		return "Pokemon [name=" + name + ", type=" + type + ", p_id=" + p_id + "]";
	}
private String name, type;
private int p_id;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getP_id() {
	return p_id;
}
public void setP_id(int p_id) {
	this.p_id = p_id;
}
public Pokemon(int p_id, String name, String type) {
	super();
	this.name = name;
	this.type = type;
	this.p_id = p_id;
}
public Pokemon() {
	super();
}
public Pokemon(String name, String type) {
	super();
	this.name = name;
	this.type = type;
}
		
}
