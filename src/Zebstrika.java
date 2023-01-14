import java.util.Random;

public class Zebstrika extends Blitzle {

    private static final int ATTACK_POINTS = 50 ;
    private static final int HEALTH = 100 ;
    private static final String NAME = " Zebstrika ";
    private static final int LEVEL = 2 ;
    private static final int ZAP_KICK_COST = 30 ;
    private static final int MAX_DAMAGE = 35 ;
    private static final int MIN_DAMAGE =  30 ;



    public Zebstrika () {
        super( HEALTH , ATTACK_POINTS  ,NAME, LEVEL );
    }


    public void zapKick ( Pokemon pokemon ){

        Random random = new Random();
        int damage = random.nextInt(MIN_DAMAGE , MAX_DAMAGE)  ;

        this.setAttackPoints(this.getAttackPoints() - ZAP_KICK_COST  );
        pokemon.setHealth(pokemon.getHealth() - damage);

    }



    public String toString() {
        return super.toString();
    }


}
