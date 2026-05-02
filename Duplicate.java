//Duplicate element find 
import java.util.Scanner;
class Duplicate {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int[] num = new int[5];
	System.out.println("Enter the 5 number :");
	for(int i = 0 ; i < num.length ; i++){
		num[i] = sc.nextInt();
	}
	for(int i = 0 ; i < num.length ; i++){
		for(int j = i+1 ;j < num.length; j++){
		
		//System.out.print(num[i] + " ");
		if(num[i] == num[j]){
			System.out.println("Duplicate number: "+ num[i]);
		}
		}
	}
	System.out.println("");
	}
}