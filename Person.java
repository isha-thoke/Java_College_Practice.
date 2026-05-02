class Person{
private String name;
private int rollNumber;
public String getName()
{
return name;
}
public void setName(String name)
{
this.name = name;
}
public int getRollNumber(){
	return rollNumber;
}
public void setRollNumber(int rollNumber){
	this.rollNumber = rollNumber;
}

public static void main(String args[]){
Person p1 = new Person();
p1.setName("Isha");
System.out.println(p1.getName());
p1.setRollNumber(123456);
System.out.println(p1.getRollNumber());
}
}