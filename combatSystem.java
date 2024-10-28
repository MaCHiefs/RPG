
public class combatSystem {
    public static void main(String[] args){
NPC skeleton = new NPC("Skeleton", 20, 5);
PC player = new PC("sword",20,6,6);
String turnOrder="player";
boolean escape = true;





System.out.println("A skeleton is standing in your path holding a rusty sword. It looks at you with a cold lifeless expression. It seems to be determined to turn you like him.");


do{

    if(turnOrder.equalsIgnoreCase("player")){
        gameScreen.showGame(skeleton.health,player.health);

        System.out.println("What will you do?");

switch (gameLogic.PlayerinputHandler(player.weaponDamage)) {//Player Input
    case "attack":skeleton.health = skeleton.health - PC.ATTACK(player.weaponDamage);
        break;
    case "heal":player.health = player.health + PC.HEAL();
    break;
    case "block": player.health=player.health-(skeleton.ATTACK(skeleton.weaponDamage) - player.BLOCK());
    turnOrder ="npc";
    break;
    case "retreat": escape = PC.ESCAPE(skeleton.health, player.escapeChance);
    break;
    default: System.out.println("That's not a possible option");
    turnOrder ="npc";   
    break;
    }

        if(escape==false){
        System.exit(0);
    }

}

    else if(turnOrder.equalsIgnoreCase("npc")){//NPC Action
        switch (NPC.conditionalAction(skeleton.health)){
            case "attack":
                player.health = player.health-NPC.ATTACK(skeleton.weaponDamage);
                break;
            case "heal": skeleton.health =skeleton.health+NPC.HEAL();
            break;
            case "block": skeleton.health= NPC.BLOCK(player.weaponDamage);
            default:
                break;
        }
    }


    

turnOrder = gameLogic.turnOrder(turnOrder);}
while(skeleton.health>0 && player.health>0);

if(skeleton.health==0){
    System.out.println("You killed the Skeleton");
}
else if(player.health==0){
    System.out.println("You Died. Skill issue");
}


    }
}

