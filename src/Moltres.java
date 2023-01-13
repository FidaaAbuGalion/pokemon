import java.util.Random;

public class Moltres extends FirePokemon {

    private static final int ATTACK_POINTS = 60 ;
    private static final int HEALTH = 120 ;
    private static final String NAME = " Moltres ";
    private static final int LEVEL = 1 ;
    private static final int ASSISTING_HEATER_COST = 30 ;
    private static final int MAX_DAMAGE = 60 ;
    private static final int MIN_DAMAGE = 10 ;


    public Moltres () {
        super( HEALTH , ATTACK_POINTS  ,NAME, LEVEL);
    }

    // receive enemy pokemon
    private void scratch ( Pokemon pokemon ){

        Random random = new Random();
        int damage = random.nextInt(MIN_DAMAGE , MAX_DAMAGE)  ;

        this.setAttackPoints(this.getAttackPoints() - ASSISTING_HEATER_COST );
        pokemon.setHealth(pokemon.getHealth() - damage);

    }

    public String toString() {
        return  "there is just one level in  this pokemon " + "\n" + super.toString();
    }
}
