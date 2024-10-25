import java.util.*;;
public class PC {
    String weapon;
    int health;
    int weaponDamage;
    int escapeChance;
public PC(String weapon, int health, int weaponDamage, int escapeChance){
this.weapon = weapon;
this.health = health;
this.weaponDamage = weaponDamage;
this.escapeChance =escapeChance;
}
    
public static int ATTACK(int weaponDamage){
System.out.println("You slash your steel sword");
System.out.println("The sword dealt "+weaponDamage+ " damage!");
System.out.println("\n");
return weaponDamage;

}

public static int BLOCK(int incomingDamage){
return Math.floorDivExact(incomingDamage, 2);


    
}


public static int HEAL(){
    System.out.println("You reached for a life potion in your bag");
    System.out.println("You drank and it healed you for 3 HP");
    return 3;
}


public static boolean ESCAPE(int enemyHealth, int escapeChance){
    Random rand = new Random();
int ifEscape =Math.abs((rand.nextInt(10)+1)+Math.floorDiv(escapeChance,enemyHealth));
System.out.println(Math.floorDiv(enemyHealth,escapeChance));

if(ifEscape==10){
    System.out.println("You escaped the encounter with your nuts still intact");
    System.out.println(ifEscape);
    return false;
}
else{
    System.out.println("Skeleton:" + "Bone noises and crackling" + "(You aren't escaping me that easily!)");
    System.out.println(ifEscape);
    return true;}




}


}
