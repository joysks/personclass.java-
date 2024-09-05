public class Person {

public class Address{

public  String city;
public  String state;


public Address(String ci,String st) 
{

this. city= ci;
this.state=st;

}



public void display(){

System.out.println("The city is "+ city+ "State "+state);



} 

}


public static void main(String[]args){
Person person =new Person();
Person.Address address= person.new Address("Uttara ","Dhaka");


address.display();


}

}
