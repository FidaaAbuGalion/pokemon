import java.util.Random;
import java.util.Scanner;

public class Pichu extends ElectricPokemon {


    public Pichu () {
        super( Definition.PICHU_HEALTH , (int) (Definition.PICHU_ATTACK_POINTS * Definition.SEVENTY_FIVE_PERCENT),Definition.PICHU_NAME, Definition.PICHU_LEVEL);
    }

    public Pichu ( int health , int attackPoints , String name , int level ) {
        super(health , attackPoints , name ,level);
    }

    private void quickAttack( Pokemon pokemon ){

        Random random = new Random();
        int damage = random.nextInt(Definition.PICHU_MIN_DAMAGE , Definition.PICHU__MAX_DAMAGE )  ;

        this.setAttackPoints(this.getAttackPoints() - Definition.PICHU_QUICK_ATTACK_COST );
        pokemon.setHealth(pokemon.getHealth() - damage);

    }
    public void printAttackMenu (){
        super.printAttackMenu();
        System.out.println(" 2 - quick attack damage between 10 points \n cost - 5 points ");

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
                quickAttack(enemy);
            }
        }while (userChoice < 1 || userChoice > 2);
    }



    public String toString() {
        return super.toString();
    }

    public Pichu upgrade(){

        setHealth(this.getHealth() - Definition.UPGRADE_ONE_COST_HEALTH_POINTS);
        setAttackPoints(this.getAttackPoints() - Definition.CHARMELEON_ATTACK_POINTS);

        return new Pikachu( this.getHealth() , this.getAttackPoints() );
    }

}
