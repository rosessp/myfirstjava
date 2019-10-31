
import java.util.Scanner;
class a{
public static void main(String[] args){
personalized_greeting();
}
String language;
 Scanner SC=new Scanner(System.in);
 System.out.print("Enter native language - English/French/Spanish: ");
 language= SC.nextLine();
 switch(language){
 case "English": {System.out.println ("Hello Welcome to the universe of Java"); 
	            break;}
 case "French": {System.out.println ("Bonjour Bienvenue dans l'univers de Java");
	           break;}
 case "Spanish":{System.out.println ("Hola bienvenidos al universo de Java");
	            break;}
 default:{System.out.println ("Opps we dont have your lanuage configured anyway, Hello World");}	   
 }
/**Personalized Greeting Message (Roja --> 31-10-19) */
//Input - Greeting Name
//Output - Greeting Message 
public static void personalized_greeting() {
  String greetingName;
  
  System.out.println("************************");
  System.out.print("Enter a Greeting Name:) ");
  greetingName= SC.nextLine();
  System.out.println("Welcome " + greetingName + "! to the world of java :)");
}
}
