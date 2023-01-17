import java.util.Random;
import java.util.Scanner;

public class Charmeleon extends Charmander {

   /*public Charmeleon () {
        super( Definition.CHARMELEON_HEALTH , (int) (Definition.CHARMELEON_ATTACK_POINTS * Definition.SEVENTY_FIVE_PERCENT),Definition.CHARMELEON_NAME, Definition.CHARMELEON_LEVEL );
    }*/


   /* public Charmeleon ( int health , int attackPoints , String name , int level ) {
        super(health , attackPoints , name ,level);
    }*/
    public Charmeleon(int health , int attackPoints, String charizardName, int charizardLevel){
       super( health , attackPoints, Definition.CHARMELEON_NAME,Definition.CHARMELEON_LEVEL);

    }

    public Charmeleon() {

    }
    public void flameTale ( Pokemon pokemon ){

        Random random = new Random();
        int damage = random.nextInt(Definition.CHARMELEON_MIN_DAMAGE , Definition.CHARMELEON_MAX_DAMAGE)  ;

        this.setAttackPoints(this.getAttackPoints() - Definition.CHARMELEON_FLAME_TAIL_COST);
        pokemon.setHealth(pokemon.getHealth() - damage);

    }
    public void printAttackMenu (){
        super.printAttackMenu();
        System.out.println(" 3 - Flame tail attack damage between 30-50 \n cost - 40 points ");

    }
    public void attacks ( Pokemon enemy ){
        printAttackMenu();
        int userChoice ;
        do {
            Scanner scanner = new Scanner(System.in);
            userChoice = scanner.nextByte();
            if (userChoice ==1 || userChoice ==2){
            super.attacks(enemy);
            }else {
                flameTale(enemy);
            }
        }while (userChoice < 1 || userChoice > 3);

    }

    public Charizard upgrade() {

        this.setHealth(this.getHealth()-Definition.UPGRADE_TWO_COST_HEALTH_POINTS);
        this.setAttackPoints(this.getAttackPoints()-Definition.UPGRADE_TWO_COST_ATTACK_POINTS);

        return new Charizard(this.getHealth(),this.getAttackPoints());
    }

    public String toString() {
        return super.toString();
    }
}
