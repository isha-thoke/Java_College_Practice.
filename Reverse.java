//Array Reverse
import java.util.*;
class Reverse{
	public static void main(String args[]){
	Scanner sc =  new Scanner(System.in);
	int marks[] = new int[5];
	System.out.println("Enter the 5 subject ");
	for(int i = 0 ; i < 5; i++){
		marks[i] = sc.nextInt();
	}
	System.out.println("Print 5 subject marks: ");
	for(int i = 4; i>= 0; i--){
		System.out.println(marks[i]);
	}
	
	}
}