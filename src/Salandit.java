import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Salandit extends FirePokemon {




    public Salandit() {
        super( Definition.SALANDIT_HEALTH , (int) (Definition.SALANDIT_ATTACK_POINTS * Definition.SEVENTY_FIVE_PERCENT), Definition.SALANDIT_NAME, Definition.SALANDIT_LEVEL);
    }

    public Salandit ( int health , int attackPoints , String name , int level ) {
        super(health , attackPoints , name ,level);
    }

    private void liveCoal ( Pokemon pokemon ){

        Random random = new Random();
        int damage = random.nextInt(Definition.SALANDIT_MIN_DAMAGE , Definition.SALANDIT_MAX_DAMAGE)  ;

        this.setAttackPoints(this.getAttackPoints() - Definition.SALANDIT_LIVE_COAL_COST);
        pokemon.setHealth(pokemon.getHealth() - damage);

    }


    public void printAttackMenu() {
        super.printAttackMenu();
        System.out.println(" 2 - live coal # damage between 0-25 \n cost - 10 points ");
    }


    public void attacks(Pokemon enemy) {
        printAttackMenu();
        int userChoice;
        do {
            Scanner scanner = new Scanner(System.in);
            userChoice = scanner.nextInt();
            if (userChoice == 1) {
                super.attacks(enemy);
            } else if (userChoice == 2){
                liveCoal(enemy);
            }
        }while (userChoice < 1 || userChoice > 2);

        super.attacks(enemy);
    }

    public Salandit upgrade (){

            this.setHealth(this.getHealth() - Definition.UPGRADE_ONE_COST_HEALTH_POINTS);
            this.setAttackPoints(this.getAttackPoints() - Definition.CHARMELEON_ATTACK_POINTS);

        return new Salazzle( this.getHealth() , this.getAttackPoints() );
    }



}
