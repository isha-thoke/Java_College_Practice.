  //Find number linear search
  import java.util.*;
  class Linear{
	  public static void main(String args[]){
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter size: ");
	  int n = sc.nextInt();
	  int arr[] = new int[n];
	  System.out.println("Enter the number:");
	  for(int i = 0 ; i< n ; i++){
		  arr[i] = sc.nextInt();
	  }
	  System.out.println("Find the number: ");
	  int searchNo = sc.nextInt();
	  boolean found = false;
     System.out.println("Display the element:");	  
      for(int i =0; i<n ;i++){
		  if(arr[i]==searchNo){
		  System.out.println("Element found at index "+ i);
		  found = true;
		  break;
	  }
	  }
	  if(!found){
		  System.out.println("Element not found:");
	  }
	  }
  }