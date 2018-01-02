import java.util.Arrays;
import java.util.Scanner;

public class Sort_Array {

	public static void main(String[] args) {
		
		
//-----------------------User input array--------------------------
        Scanner S= new Scanner(System.in);
        System.out.println("Enter number of elemnets");
        int n=S.nextInt();
        int array[]=new int[n];
        System.out.println("enter");
        for(int i=0; i<n;i++) {
        	
        	array[i]=S.nextInt();
        }
  //-----------------------Sorting of  array--------------------------
		int a[]={10,2,2,8,5};
		String s[]= {"a","z","c","g","d"};
		System.out.println("Integer Array");
		
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
		System.out.println("String Array");
		
		for(int i=0;i<a.length;i++)
		{
		System.out.println(s[i]);
		}
		
		Arrays.sort(a);
		Arrays.sort(s);
		
		System.out.println("After sorting Integer Array");
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("After sorting String Array");
		
		for(int i=0; i<a.length; i++) {
			System.out.println(s[i]);
		}
		
        
        System.out.println("New array user input");
        
        for(int i=0;i<array.length;i++) {
        	System.out.println(array[i]);
        }
        
        System.out.println(" array elemnet with index");
       
        for(int i=0;i<a.length;i++) {
        	System.out.println(i+" "+a[i]);
        	
        	
        	
        }
	}

}
