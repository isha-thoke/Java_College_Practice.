//Merge Sort
import java.util.*;
class Merge{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first size of array index: ");
int num1 = sc.nextInt();
int arr1[] =new int[num1];
System.out.println("Enter numbre of array: ");
for(int i =0; i< num1; i++){
	arr1[i] = sc.nextInt();
}
System.out.println("Enter the second size of array index: ");
int num2 =sc.nextInt();
int arr2[] =new int[num2];
System.out.println("Enter number of array: ");
for(int i = 0; i< num2 ; i++){
	arr2[i] = sc.nextInt();
}
int result[] = new int[num1 +num2];
for(int i = 0 ; i< num1;i++ ){
	result[i] = arr1[i];
}
for(int i =0; i< num2 ; i++){
	result[num1+ i] = arr2[i]; 
}
System.out.println("Merge array: ");
for(int i =0; i<result.length; i++){
	System.out.print(result[i]+ " ");
}
}
}