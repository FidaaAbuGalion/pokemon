import java.util.Random;
import java.util.Scanner;

public class Pikachu extends Pichu {


   /* public Pikachu () {
        super( Definition.PIKACHU_HEALTH , (int) (Definition.PIKACHU_ATTACK_POINTS * Definition.SEVENTY_FIVE_PERCENT),Definition.PIKACHU_NAME, Definition.PIKACHU_LEVEL);
    }*/

    public Pikachu ( int health , int attackPoints , String name , int level ) {
        super(health , attackPoints , name ,level);
    }

    public Pikachu ( int health , int attackPoints ){

        super(health,attackPoints,Definition.PIKACHU_NAME, Definition.PIKACHU_LEVEL);

    }

    private void electroBall ( Pokemon pokemon ){

        Random random = new Random();
        int damage = random.nextInt(Definition.PIKACHU_MIN_DAMAGE , Definition.PIKACHU_MAX_DAMAGE)  ;

        this.setAttackPoints(this.getAttackPoints() - Definition.PIKACHU_ELECTRO_BALL_COST );
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
                electroBall(enemy);
            }
        }while (userChoice < 1 || userChoice > 3);

    }
    public void printAttackMenu (){
        super.printAttackMenu();
        System.out.println(" 3 - Elctro Ball damage between 30-40 \n cost - 10 points ");

    }

    public Pikachu upgrade (){

        this.setHealth(this.getHealth() - Definition.UPGRADE_TWO_COST_HEALTH_POINTS );
        this.setAttackPoints(this.getAttackPoints() - Definition.UPGRADE_TWO_COST_ATTACK_POINTS );

        return new Raichu(this.getHealth() ,this.getAttackPoints() );
    }


    public String toString() {
        return super.toString();
    }



}
