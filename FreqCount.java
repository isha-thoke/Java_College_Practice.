//Frequency count 
import java.util.*;
class FreqCount{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size :");
int n = sc.nextInt();
int arr[] = new int[n];
System.out.println("Enter the number: ");
for(int i= 0 ; i< n ; i++){
arr[i]= sc.nextInt();
}
int number = sc.nextInt();
int count = 0;
for(int i = 0; i < n ;i++){
	if(arr[i] == number){
		count++;
	}
}
System.out.println("Frequency "+ count);
}
}