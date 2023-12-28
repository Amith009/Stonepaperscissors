import java.util.Scanner;
import java.util.Random;
public class rockpaperscissors {
 public static void main(String[] args) {
System.out.println("Stone,paper,Scissors");
System.out.println("Enter your value");
//stone=1;
//paper=2;
//scissors=3;    

    Random random=new Random();
    Scanner s1= new Scanner(System.in);
    
    int userValue=s1.nextInt();
    System.out.print("Your value: ");
    switch(userValue){
        case 1:
        System.out.println("Stone");
        break;
        case 2:
        System.out.println("paper");
        break;
        case 3:
        System.out.println("scissors");
        break;
    }


    int computerValue =random.nextInt(3)+1;
    
    System.out.print("Computer's value:");
    switch(computerValue){

        case 1:
        System.out.println("Stone");
        break;

        case 2:
        System.out.println("Paper");
        break;

        case 3:
        System.out.println("Scissors");
        break;
    }
    if(userValue==1 && computerValue==2||userValue==2 && computerValue==3||userValue==3 && computerValue==1||userValue==2&&computerValue==3){
        System.out.println("Computer Won !");
    }
    else if(userValue==2 && computerValue==2||userValue==1&&computerValue==1||userValue==3&&computerValue==3){
        System.out.println("Draw");
    }
    else if(userValue==2 && computerValue==1||userValue==3 && computerValue==2||userValue==1 && computerValue==3||userValue==3&&computerValue==2){
        System.out.println("You Won!");
    }
    
 }   
}
