import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] array = {25, 14, 56, 15, 36, 56};

	    	   
	   int Index = 2;
	   int newValue= 5;
	   
	  for(int i=array.length-1; i > Index; i--){
	    array[i] = array[i-1];
	   }
	   array[Index] = newValue;
	   
	   for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
	   }
	 
	}

}
