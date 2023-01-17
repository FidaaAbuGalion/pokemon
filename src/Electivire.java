import java.util.Random;
import java.util.Scanner;

public class Electivire extends Electabuzz {

    public Electivire ( int health , int attackPoints ) {
        super( health , attackPoints,Definition.ELECTIVIRE_NAME, Definition.ELECTIVIRE_LEVEL );
    }


    public void thunderPunch ( Pokemon pokemon ){

        Random random = new Random();
        int damage = random.nextInt(Definition.ELECTIVIRE_MIN_DAMAGE , Definition.ELECTIVIRE_MAX_DAMAGE)  ;

        this.setAttackPoints(this.getAttackPoints() - Definition.ELECTIVIRE_THUNDER_PUNCH );
        pokemon.setHealth(pokemon.getHealth() - damage);

    }


    public void printAttackMenu (){
        super.printAttackMenu();
        System.out.println(" 3 - Thunder punch attack damage between 50-120 \n cost - 80 points ");

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
                thunderPunch(enemy);
            }
        }while (userChoice < 1 || userChoice > 3);

    }



    public String toString() {
        return super.toString();
    }



}
