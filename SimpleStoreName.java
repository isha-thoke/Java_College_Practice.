//Simple Store 5 friend names.
import java.util.*;
class SimpleStoreName {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String name[] = new String[5];

System.out.println("Enter the friends  name 5 ");
for(int i = 0 ; i < 5; i++){
name[i] = sc.next();
}

System.out.println("Shows the name :");
for(int i = 0 ; i < 5; i++){
System.out.println(name[i]);
}
}
}	