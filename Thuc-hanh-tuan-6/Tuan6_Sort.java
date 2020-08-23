package th_Tuan6;

import java.util.*;

public class Tuan6_Sort {
	
	public static <T> List<T> sortGeneric(T[] arr) {
		List<T> list_sth =  new ArrayList<T>(Arrays.asList(arr));
		Collections.sort(list_sth ,Collections.reverseOrder());
		return list_sth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArr = { 10, 12, 3, -4, 5 };
		Character[] charArr = { 'U', 'E', 'T', 'V', 'N', 'U' };
		Double[] doubleArr = { 5.1, 2.5, 7.3, -4.5 };
		
		//sort something
		sortGeneric(charArr);
		sortGeneric(intArr);
		sortGeneric(doubleArr);
		
		
		

	}

}
