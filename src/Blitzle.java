import java.util.Random;
import java.util.Scanner;

public class Blitzle extends ElectricPokemon   {
    

    public Blitzle () {
        super( Definition.BLITZLE_HEALTH , (int) (Definition.BLITZLE_ATTACK_POINTS * Definition.SEVENTY_FIVE_PERCENT),Definition.BLITZLE_NAME, Definition.BLITZLE_LEVEL);

    }
    public Blitzle ( int health , int attackPoints , String name , int level ) {
        super(health , attackPoints , name ,level);
    }

    private void flop ( Pokemon pokemon ){

        Random random = new Random();
        int damage = random.nextInt(Definition.BLITZLE_MIN_DAMAGE , Definition.BLITZLE_MAX_DAMAGE)  ;

        this.setAttackPoints(this.getAttackPoints() - Definition.BLITZLE_FLOP_COST);
        pokemon.setHealth(pokemon.getHealth() - damage);

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
                flop(enemy);
            }
        }while (userChoice < 1 || userChoice > 2);
    }

    public void printAttackMenu (){
        super.printAttackMenu();
        System.out.println(" 2 - Flop attack damage between 20-25 \n cost - 20 points ");

    }

    public Blitzle upgrade (){

        this.setHealth(this.getHealth() - Definition.UPGRADE_ONE_COST_HEALTH_POINTS);
        this.setAttackPoints(this.getAttackPoints() - Definition.CHARMELEON_ATTACK_POINTS);
        return new Zebstrika ( this.getHealth() , this.getAttackPoints() );
    }


    public String toString() {
        return super.toString();
    }





}
