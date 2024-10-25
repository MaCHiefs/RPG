import java.util.*;
public class gameLogic {
    public static String turnOrder(String turnOrder){
if(turnOrder.equalsIgnoreCase("player")){// Turn Order
    return "npc";
}
else 
{
return "player";
}
    }


public static String PlayerinputHandler(int weaponDamage){//Player Action
    Scanner eskaner = new Scanner(System.in);

    String action = eskaner.nextLine();
    
   
System.out.println("\n");

return action;

}









    }

