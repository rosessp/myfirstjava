import java.util.Scanner;

class a{
public static void main(String[] args){
String language;
 Scanner SC=new Scanner(System.in);

 System.out.print("Enter native language - English/French/Spanish: ");
 language= SC.nextLine();
 
 switch(language){
 case "English": {System.out.println ("Hello World"); 
	            break;}
 case "French": {System.out.println ("Bonjour le monde");
	           break;}
 case "Spanish":{System.out.println ("Hola Mundo");
	            break;}
 default:{System.out.println ("Opps we dont have your lanuage configured anyway, Hello World");}	   
 }
}
}