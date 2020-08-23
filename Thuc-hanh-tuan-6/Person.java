package th_Tuan6;

public class Person {
    private String name;
    private int tuoi;
    private String address;
    
    public Person(String name, int tuoi ,String address) {
    	  this.name  = name ;
    	  this.tuoi  = tuoi;
    	  this.address = address;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
    Person person1 = new Person("Nguyen A", 22 ,"Ha Noi");
    Person person2 = new Person("Nguyen A", 20 ,"Ha Nam");
    Person person3 = new Person("Le B", 20 ,"Ha Tay");
    
	}

}
