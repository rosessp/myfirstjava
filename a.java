import java.util.Scanner;

class a{
public static void main(String[] args){

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
}
}