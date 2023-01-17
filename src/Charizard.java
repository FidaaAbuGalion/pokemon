import java.util.Random;
import java.util.Scanner;

public class Charizard extends Charmeleon {


    /*public Charizard () {
        super( Definition.CHARIZARD_HEALTH, (int) (Definition.CHARIZARD_ATTACK_POINTS * Definition.SEVENTY_FIVE_PERCENT),Definition.CHARIZARD_NAME, Definition.CHARIZARD_LEVEL );
    }*/
    public Charizard (int health , int attackPoints){
        super( health , attackPoints, Definition.CHARIZARD_NAME,Definition.CHARIZARD_LEVEL);


    }


    public void fieryBlast ( Pokemon pokemon ){

        Random random = new Random();
        int damage = random.nextInt(Definition.CHARIZARD_MIN_DAMAGE , Definition.CHARIZARD_MAX_DAMAGE)  ;

        this.setAttackPoints(this.getAttackPoints() - Definition.CHARIZARD_FIERY_BLAST_COST);
        pokemon.setHealth(pokemon.getHealth() - damage);

    }
    public void printAttackMenu () {
        super.printAttackMenu();
        System.out.println(" 4 - Fiery blast attack \n damage 50 \n cost - 50 points ");
    }

    public void attacks ( Pokemon enemy ){
        printAttackMenu();
        int userChoice;
        do {
            Scanner scanner = new Scanner(System.in);
            userChoice = scanner.nextInt();
            if (userChoice == 1 || userChoice == 2 || userChoice == 3 ) {
                super.attacks(enemy);
            }else if (userChoice == 4){

             fieryBlast(enemy);
            }
        }
        while (userChoice < 1 || userChoice > 4);
    }

        public String toString() {
        return super.toString();
    }


}
