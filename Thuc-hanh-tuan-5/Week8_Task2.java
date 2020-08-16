package th_Tuan5;
import java.io.*;

public class Week8_Task2 {
	//create some null value
	private static void create_some_Null() {
		Object Obj = null;
		Obj.hashCode();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		
		//NullPointerException
		try {
			create_some_Null();
		}catch(NullPointerException  e) {
			System.out.println(e.getMessage());
		}
		
		//ArrayIndexOutOfBoundsException
		try {
			System.out.println(arr[12]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	   //ArithmeticException
		try {
			int rs = 2/0;
			System.out.println(rs);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		//FileNotFoundException and IOException
		try {
			File file = new File("C:\\Users\\blabla\\asdasd"); 
			BufferedReader in = new BufferedReader(new FileReader(file));
			String str;
			while( (str = in.readLine()) != null) {
				System.out.println(str);
			}}
		   catch(FileNotFoundException e)	{
	    	System.out.println(e.getMessage());
	    	e.printStackTrace();
	      }	
		  catch(IOException e) {
			  System.out.println(e.getMessage());
			  e.printStackTrace();
		  }
	    
	}

}
