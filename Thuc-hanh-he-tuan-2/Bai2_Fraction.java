/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baith_tuan2;

/**
 *
 * @author CCNE
 */
public class Fraction {
      private int numerator;
      private int denominator;
      
      //Cai dat gia tri cho phan so
      public void setterFr(int num , int den){
             this.numerator  = num ;
             this.denominator = den;
       }      
      //Lay gia tri va tra ve 1 phan so 
      public Fraction getterFr(){
             Fraction fr = new Fraction();
             fr.numerator = this.numerator;
             fr.denominator = this.denominator;
             
             return fr;
      }
      //Ham rut gon phan so
      public Fraction reduce(Fraction fr){
             int ucln_FR = BaiTH_Tuan2.gcd(fr.numerator, fr.denominator);
             fr.numerator /= ucln_FR;
             fr.denominator /= ucln_FR;
             return fr;
      }
      //Ham cong 2 phan so 
      public Fraction add(Fraction fr1 ,Fraction fr2){
             Fraction fr = new Fraction();
                      fr.numerator = fr1.numerator + fr2.denominator;
                      fr.denominator = fr1.denominator + fr2.denominator;
                      fr.reduce(fr);
             return fr;
      }
      //Ham tru 2 phan so 
      //Nhan 2 phan so
      //Chia 2 phan so
      
      //Kiem tra 2 phan so bang nhau
      public boolean compare_Fraction(Object obj1 ,Object obj2) {
    	           if(obj1 instanceof Fraction && obj2 instanceof Fraction) {
    	        	  Fraction fr1 = (Fraction) obj1;
    	        	  Fraction fr2 = (Fraction) obj2;
    	        	  if(fr1.numerator == fr2.numerator && fr1.denominator == fr2.denominator)
    	        		  return 1;
    	        	  else 
    	        		  return 0;
    	           }else {
    	        	   return 0;
    	           }
    	           
    	  
      }
      
      //Main function
      public static void main(String[] args){
             Fraction fr_demo = new Fraction();
             fr_demo.setterFr(8, 6);
             System.out.println("-Tu so = " + fr_demo.numerator);
             System.out.println("-Mau so = " + fr_demo.denominator);
             
             fr_demo.reduce(fr_demo);
             System.out.println("Sau khi rut gon :");
             System.out.println("-Tu so = " + fr_demo.numerator);
             System.out.println("-Mau so = " + fr_demo.denominator);
          
      }
}
