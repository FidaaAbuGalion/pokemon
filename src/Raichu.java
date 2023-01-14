import java.util.Random;

public class Raichu extends Pikachu {

    private static final int ATTACK_POINTS = 80 ;
    private static final int HEALTH = 160 ;
    private static final String NAME = " Raichu ";
    private static final int LEVEL = 3 ;
    private static final int ELECTRIC_SURFER_COST = 60  ;
    private static final int MAX_DAMAGE = 120 ;
    private static final int MIN_DAMAGE = 20 ;


    public Raichu () {
        super( HEALTH , ATTACK_POINTS  ,NAME, LEVEL);
    }


    private void electricSurfer ( Pokemon pokemon ){

        Random random = new Random();
        int damage = random.nextInt(MIN_DAMAGE , MAX_DAMAGE)  ;

        this.setAttackPoints(this.getAttackPoints() - ELECTRIC_SURFER_COST );
        pokemon.setHealth(pokemon.getHealth() - damage);

    }



    public String toString() {
        return super.toString();
    }


}
