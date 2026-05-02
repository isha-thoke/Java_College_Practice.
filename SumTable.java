//Sum of Table
import java.util.*;
class SumTable{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter you number : ");
	int n = sc.nextInt();
	
	int sum = 0 ;
	
	for(int i = 1; i < 10 ; i++){
    	sum =sum + (n*i);
	}
	System.out.println("Sum of table "+ sum);
	}
}