//2 arrys in merge
import java.util.Scanner;
class Arr2D{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number 2 -d array : ");
int n = sc.nextInt();
int arr[][] = new int[n][n];
System.out.println("Enter the number: ");
for(int i = 0; i < n; i++ ){
	for(int j = 0 ; j < n ; j++){
		arr[i][j] = sc.nextInt();	}
}
System.out.println("Merge of Array: ");
for(int i = 0 ; i<n;i++ ){
for(int j =0 ;j<n; j++){
System.out.print(arr[i][j]+" ");
}
System.out.println(" ");
}
}
}	