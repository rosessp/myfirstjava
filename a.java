
import java.util.Scanner;
class a{
 public static void main(String[] args){

 String language;
 Scanner SC=new Scanner(System.in);
 String greetingName;
 System.out.println("************************");
 System.out.print("Enter a Greeting Name:) ");
 greetingName= SC.nextLine();
 System.out.print("Enter native language - English/French/Spanish: ");
 language= SC.nextLine();
 switch(language){
 case "English": {System.out.println ("Hello" + greetingName + ", Welcome to the universe of Java"); 
	            break;}
 case "French": {System.out.println ("Bonjour" + greetingName + ", Bienvenue dans l'univers de Java");
	           break;}
 case "Spanish":{System.out.println ("Hola" + greetingName + ", bienvenidos al universo de Java");
	            break;}
 default:{System.out.println ("Opps we dont have your lanuage configured anyway, " + greetingName + ", Welcome to the universe of Java");}	   
 }
}
}
