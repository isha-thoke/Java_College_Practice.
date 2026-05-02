//Calculator do number Addition , Subtration ,Multiple , Divided
import java.util.*;
class Calculator{	
	int a, b ;
	public int add(){
		return a + b ;
	}
	public int subraction(){
		return a - b;
	}
public float divided()}{
	return a / b;
}
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		System.out.println("Enter the number a: ");
		cal.a = sc.nextInt();
		System.out.println("Enter the number b: ");
		
		System.out.println("Sum is " + cal.add());
		System.out.println("Subraction is " + cal.subraction());
		System.out.println("divided is " + cal.divided());
	}
}