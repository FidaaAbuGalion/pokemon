import java.util.Random;

public class Charmander extends FirePokemon {

    private static final int ATTACK_POINTS = 40 ;
    private static final int HEALTH = 80;
    private static final String NAME = " Charmander ";
    private static final int LEVEL = 1;
    private static final int SCRATCH_COST = 15 ;
    private static final int MAX_DAMAGE = 30 ;
    private static final int MIN_DAMAGE = 25 ;


    public Charmander() {
        super( HEALTH , ATTACK_POINTS  ,NAME, LEVEL);
    }

    public Charmander( int health , int attackPoints , String name , int level ) {
        super(health , attackPoints , name ,level);
    }

    private void scratch ( Pokemon pokemon ){

        Random random = new Random();
        int damage = random.nextInt(MIN_DAMAGE , MAX_DAMAGE)  ;

        this.setAttackPoints(this.getAttackPoints() - SCRATCH_COST);
        pokemon.setHealth(pokemon.getHealth() - damage);

    }



    public String toString() {
        return super.toString();
    }
}
