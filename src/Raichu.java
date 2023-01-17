import java.util.Random;
import java.util.Scanner;

public class Raichu extends Pikachu {

    /*public Raichu () {
        super( Definition.RAICHU_HEALTH , (int) (Definition.RAICHU_ATTACK_POINTS * Definition.SEVENTY_FIVE_PERCENT),Definition.RAICHU_NAME, Definition.RAICHU_LEVEL);
    }*/

    public Raichu ( int health , int attackPoints ){
        super(health, attackPoints,Definition.RAICHU_NAME, Definition.RAICHU_LEVEL);

    }


    private void electricSurfer ( Pokemon pokemon ){

        Random random = new Random();
        int damage = random.nextInt(Definition.RAICHU_MIN_DAMAGE , Definition.RAICHU_MAX_DAMAGE)  ;

        this.setAttackPoints(this.getAttackPoints() - Definition.RAICHU_ELECTRIC_SURFER_COST );
        pokemon.setHealth(pokemon.getHealth() - damage);

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

                electricSurfer(enemy);
            }
        }
        while (userChoice < 1 || userChoice > 4);
    }

    public void printAttackMenu () {
        super.printAttackMenu();
        System.out.println(" 4 - Electric Surfer attack damage between 20-120 \n cost - 60 points ");
    }



    public String toString() {
        return super.toString();
    }


}
