package baiTH_Wekk4;
import java.lang.Math;

public class Week4 {
    
	/**

     * 

     * @param a

     * @param b

     * @return max of $a and $b

     */
    public static int max2Int(int a, int b) {
           if(a >= b)
        	   return a;
           else 
        	   return b;


    }



    /**

     * 

     * @param arr

     * @return min of array $arr

     */

    public static int minArray(int[] arr) {
           int min_Num = arr[0];
           for(int i =1; i< arr.length ;i++) {
        	  if(arr[i] < arr[i-1])
        		  min_Num = arr[i];
           }
           return min_Num;
    }



    /**

     * 

     * @param weight: in kg

     * @param height: in m

     * @return BMI index

     */

    public static String calculateBMI(double weight, double height) {
                 //Parameter
    	         double BMI_num ;
                 String status ;
                 
                 BMI_num =  weight/(height*height);
                 //Lam tron 1 so thap phan
                 BMI_num = Math.round(BMI_num*10)/10;
                 
                 if(BMI_num < 18.5)
                	 status = "Thieu Can";
                 if(BMI_num >=18.5 &&  BMI_num < 22.9)
                	 status = "Binh thuong";
                 if(BMI_num >= 23 && BMI_num < 24.9)
                	 status = "Thua can";
                 else 
                	 status = "Beo phi"; 
                 return status;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
