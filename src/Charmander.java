import java.util.Random;
import java.util.Scanner;

public class Charmander extends FirePokemon {



    public Charmander() {
        super( Definition.CHARMANDER_HEALTH , (int) (Definition.CHARMANDER_ATTACK_POINTS * Definition.SEVENTY_FIVE_PERCENT),Definition.CHARMANDER_NAME, Definition.CHARMANDER_LEVEL);
    }

    public Charmander( int health , int attackPoints , String name , int level ) {
        super(health , attackPoints , name ,level);
    }
    private void scratch ( Pokemon pokemon ){

        Random random = new Random();
        int damage = random.nextInt(Definition.CHARMANDER_MIN_DAMAGE , Definition.CHARMANDER_MAX_DAMAGE)  ;

        this.setAttackPoints(this.getAttackPoints() - Definition.CHARMANDER_SCRATCH_COST);
        pokemon.setHealth(pokemon.getHealth() - damage);

    }

    public void printAttackMenu (){
        super.printAttackMenu();
        System.out.println(" 2 - Scratch attack damage between 25-30 \n cost - 15 points ");

    }
    public void attacks ( Pokemon enemy ){
        printAttackMenu();
        int userChoice;
        do {
            Scanner scanner = new Scanner(System.in);
             userChoice = scanner.nextInt();
            if (userChoice == 1) {
                super.attacks(enemy);
            } else if (userChoice == 2){
                scratch(enemy);
            }
        }while (userChoice < 1 || userChoice > 2);
    }

    public Charmeleon upgrade (){

        this.setHealth(this.getHealth()-Definition.UPGRADE_ONE_COST_HEALTH_POINTS);
        this.setAttackPoints(this.getAttackPoints()-Definition.UPGRADE_ONE_COST_ATTACK_POINTS);

        return new Charmeleon( this.getHealth() , this.getAttackPoints(), Definition.CHARIZARD_NAME, Definition.CHARIZARD_LEVEL);
    }


    public String toString() {
        return super.toString();
    }
}
