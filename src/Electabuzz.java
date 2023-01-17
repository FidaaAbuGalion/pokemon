import java.util.Random;
import java.util.Scanner;

public class Electabuzz extends ElectricPokemon {


    public Electabuzz () {
        super(Definition.ELECTABUZZ_HEALTH , (int) (Definition.ELECTABUZZ_ATTACK_POINTS * Definition.SEVENTY_FIVE_PERCENT),Definition.ELECTABUZZ_NAME, Definition.ELECTABUZZ_LEVEL);
    }

    public Electabuzz ( int health , int attackPoints , String name , int level ) {
        super(health , attackPoints , name ,level);
    }

    private void thunder ( Pokemon pokemon ){

        Random random = new Random();
        int damage = random.nextInt(Definition.ELECTABUZZ_MIN_DAMAGE , Definition.ELECTABUZZ_MAX_DAMAGE)  ;

        this.setAttackPoints(this.getAttackPoints() - Definition.ELECTABUZZ_THUNDER_COST);
        pokemon.setHealth(pokemon.getHealth() - damage);

    }

    public void printAttackMenu (){
        super.printAttackMenu();
        System.out.println(" 2 - Thunder attack damage between 40-50 \n cost - 60 points ");

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
               thunder(enemy);
            }
        }while (userChoice < 1 || userChoice > 2);
    }



    public String toString() {
        return super.toString();
    }

    public Electabuzz upgrade (){

        this.setHealth(this.getHealth() - Definition.UPGRADE_ONE_COST_HEALTH_POINTS);
        this.setAttackPoints(this.getAttackPoints() - Definition.CHARMELEON_ATTACK_POINTS);
        return new Electivire( this.getHealth() , this.getAttackPoints() );
    }


}
