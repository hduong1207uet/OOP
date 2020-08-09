package baiTH4;

public class Staff extends Person {
       private String school;
       private double pay;
       
       public Staff(String name, String address ,String school, double pay) {
    	      setName(name);
    	      setAddress(address);
    	      this.school = school;
    	      this.pay  = pay;
       }
       public void setPay(double pay) {
    	     this.pay = pay;    	     
       }
       public double getPay() {
    	     return pay;
       }
       public void setSchool(String school) {
    	     this.school = school;
       }
       public String getSchool() {
    	     return school;
       }
       public String toString() {
    	    String s0 = "Staff[" + toString() + ",school =" +school + ",pay =" +pay + "]" ;
    	    return s0;
       }
}
