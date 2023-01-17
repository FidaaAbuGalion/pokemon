import java.util.Random;
import java.util.Scanner;

public class Zebstrika extends Blitzle {


    public Zebstrika (int health , int attackPoint) {
        super( health , attackPoint,Definition.ZEBSTRIKA_NAME, Definition.ZEBSTRIKA_LEVEL );
    }


    public void zapKick ( Pokemon pokemon ){

        Random random = new Random();
        int damage = random.nextInt(Definition.ZEBSTRIKA_MIN_DAMAGE , Definition.ZEBSTRIKA_MAX_DAMAGE)  ;

        this.setAttackPoints(this.getAttackPoints() - Definition.ZEBSTRIKA_ZAP_KICK_COST  );
        pokemon.setHealth(pokemon.getHealth() - damage);

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
                zapKick(enemy);
            }
        }while (userChoice < 1 || userChoice > 3);

    }

    public void printAttackMenu (){
        super.printAttackMenu();
        System.out.println(" 3 - Zap kick attack damage between 30-35 \n cost - 30 points ");

    }



    public String toString() {
        return super.toString();
    }


}
