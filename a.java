// Greeting Program
import java.util.Scanner;

class a{
public static void main(String[] args){
System.out.println ("Hello World");
personalized_greeting();
}

/**Personalized Greeting Message (Roja --> 31-10-19) */
//Input - Greeting Name
//Output - Greeting Message 
public static void personalized_greeting() {
  String greeting_name;
  Scanner sacnnerObj=new Scanner(System.in);
  System.out.print("************************");
  System.out.print("Enter a Greeting Name:) ");
  greeting_name= scannerObj.nextLine();
  System.out.println("Welcome " + greeting_name + " :)");
}
}
}
