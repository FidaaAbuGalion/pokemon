import java.util.Random;

public class Salazzle extends Salandit {


    private static final int ATTACK_POINTS = 80;
    private static final int HEALTH = 160 ;
    private static final String NAME = " Salazzle ";
    private static final int LEVEL = 2 ;
    private static final int FIRE_CLAWS_COST = 25  ;
    private static final int MAX_DAMAGE = 50 ;
    private static final int MIN_DAMAGE = 0 ;


    public Salazzle() {
        super( HEALTH , ATTACK_POINTS  ,NAME, LEVEL);
    }

    // receive enemy pokemon
    private void fireClaws ( Pokemon pokemon ){

        Random random = new Random();
        int damage = random.nextInt(MIN_DAMAGE , MAX_DAMAGE)  ;

        this.setAttackPoints(this.getAttackPoints() - FIRE_CLAWS_COST);
        pokemon.setHealth(pokemon.getHealth() - damage);

    }



}
