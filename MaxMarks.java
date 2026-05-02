//find the Maximum Marks 
import java.util.*;
class MaxMarks{
public static void main(String arg[]){
Scanner sc = new Scanner(System.in);
int marks[] = new int[5];
System.out.println("Enter the 5 subject marks: ");
for(int i = 0; i < 5 ; i++ ){
marks[i] = sc.nextInt();
}
int max = marks[0];
for(int i = 0; i < 5;i++){
if(marks[i] < max){
max = marks[i];	
}
}
System.out.println(max);
}
}