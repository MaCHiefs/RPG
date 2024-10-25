public class NPC {
    String npcType;
    int health;
    int weaponDamage;
NPC(String species, int health, int weaponDamage){
this.npcType = species;
this.health= health;
this.weaponDamage= weaponDamage;
}
    

public static String conditionalAction(int health){
if(health < 20*0.25){
    return "heal";
}
else{
    return "attack";
}

}





public static int ATTACK(int damage){
System.out.println("The Skeleton slashed his rusty sword");
System.out.println("The sword dealt "+damage+" damage!");
return damage;
    }   
public static int BLOCK(int incomingDamage){
    return Math.floorDivExact(incomingDamage, 2);

    }
public static int HEAL(){
    System.out.println("The Skeleton grabbed a life potion from its....... wait, why did that skeleton grabbed a potion from his ass???");
    System.out.println("Anyways, the skeleton drank(How???) the potion and gained 3 HP... despite lacking any skin or calcium for that matter");
    return 3;
    }


}
