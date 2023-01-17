import java.util.Random;
import java.util.Scanner;

public class Salazzle extends Salandit {



    public Salazzle(int health , int attackPoint) {
        super( health , attackPoint,Definition.SALAZZLE_NAME, Definition.SALAZZLE_LEVEL);
    }

    // receive enemy pokemon
    private void fireClaws ( Pokemon pokemon ){

        Random random = new Random();
        int damage = random.nextInt(Definition.SALAZZLE_MIN_DAMAGE , Definition.SALAZZLE_MAX_DAMAGE)  ;

        this.setAttackPoints(this.getAttackPoints() - Definition.SALAZZLE_FIRE_CLAWS_COST);
        pokemon.setHealth(pokemon.getHealth() - damage);

    }


    public void printAttackMenu() {
        super.printAttackMenu();
        System.out.println(" fire claws attack - damage between 0-50 points \n cost 50 points ");
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
                fireClaws(enemy);
            }
        }while (userChoice < 1 || userChoice > 3);

    }

}
