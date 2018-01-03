import java.util.Arrays;
import java.util.Scanner;

public class Element_SortOrder {

	public static void main(String[] args) {
		
		Specific_Element("ABC");
		//Find_Element();
		//Compare();
		
	    
	    
	}
	//-------------------Array elementt sort order---------------------
	
	public static  void Find_Element() {
		String[] F = {
	              "asd","gsj","ppp","vcjm"};

	    int indexOfFlower = Arrays.asList(F).indexOf("vcjm");
	    System.out.println(indexOfFlower);
	    
	}
	
	//------------------------Find specific element-------------------------
	
	public static void Specific_Element(String s) {
		
		String [] array= {"ABC","DEF","GHI", "JKL","MNO"};
				
		boolean r=Arrays.asList(array).contains(s);
		
		if(r==true){
			System.out.println("Elemnet is present in array");
		}
		else{
			System.out.println("Element not found");
		}
		
		
	}
	
	
//--------------------Array comparison---------------------------------------	
	
	public static void Compare() {
		
		Scanner S= new Scanner(System.in);
        System.out.println("Enter number of elemnets for array 1");
        int n=S.nextInt();
        int arr1[]=new int[n];
        System.out.println("Enter number of elemnets for array 2");
        int n2=S.nextInt();
        int arr2[]= new int[n2];
        if (arr1.length==arr2.length){
        	
        System.out.println("enter elements in array 1");
              
                for(int i=0; i<n;i++) {
        	
        	arr1[i]=S.nextInt();
        }
        
        System.out.println("enter elements in array 2");
        
for(int i=0; i<n;i++) {
        	
        	arr2[i]=S.nextInt();
        }

		
		
		boolean r= Arrays.equals(arr1, arr2);
		
		if (r==true) {
			System.out.println("Correct");
		}
		else {
			
		System.out.println("Incorrect");
		
		}
		
			
		}
		else {
			System.out.println("Length of array not matched");
		}
	}

	
		
	
}
