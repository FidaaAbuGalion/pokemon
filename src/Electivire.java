import java.util.Random;

public class Electivire extends Electabuzz {

    private static final int ATTACK_POINTS = 120 ;
    private static final int HEALTH = 35 ;
    private static final String NAME = " Electivire ";
    private static final int LEVEL = 2 ;
    private static final int THUNDER_PUNCH = 80 ;
    private static final int MAX_DAMAGE = 50 ;
    private static final int MIN_DAMAGE =  120 ;



    public Electivire () {
        super( HEALTH , ATTACK_POINTS  ,NAME, LEVEL );
    }


    public void thunderPunch ( Pokemon pokemon ){

        Random random = new Random();
        int damage = random.nextInt(MIN_DAMAGE , MAX_DAMAGE)  ;

        this.setAttackPoints(this.getAttackPoints() - THUNDER_PUNCH );
        pokemon.setHealth(pokemon.getHealth() - damage);

    }



    public String toString() {
        return super.toString();
    }



}
