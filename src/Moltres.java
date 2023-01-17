import java.util.Random;
import java.util.Scanner;

public class Moltres extends FirePokemon {


    public Moltres () {
        super( Definition.MOLTRES_HEALTH , (int) (Definition.MOLTRES_ATTACK_POINTS*Definition.SEVENTY_FIVE_PERCENT), Definition.MOLTRES_NAME, Definition.MOLTRES_LEVEL);
    }

    // receive enemy pokemon
    private void assistingHeater ( Pokemon pokemon ){

        Random random = new Random();
        int damage = random.nextInt( Definition.MOLTRES_MIN_DAMAGE , Definition.MOLTRES_MAX_DAMAGE)  ;

        this.setAttackPoints(this.getAttackPoints() - Definition.MOLTRES_ASSISTING_HEATER_COST );
        pokemon.setHealth(pokemon.getHealth() - damage);

    }

    public String toString() {
        return  "there is just one level in  this pokemon " + "\n" + super.toString();
    }

    public void printAttackMenu (){
        super.printAttackMenu();
        System.out.println(" 2 - Assisting Heater attack \n damage between 10-60 \n cost - 30 points ");

    }


    public void attacks ( Pokemon enemy ){
        printAttackMenu();
        int userChoice;
        do {
            Scanner scanner = new Scanner(System.in);
            userChoice = scanner.nextInt();
            if (userChoice == 1) {
                super.attacks(enemy);
            } else {
                assistingHeater(enemy);
            }
        }while (userChoice < 1 || userChoice > 2);
    }



}


