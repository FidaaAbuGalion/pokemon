import java.util.Random;

public class Salandit extends FirePokemon {

    private static final int ATTACK_POINTS = 60 ;
    private static final int HEALTH = 100 ;
    private static final String NAME = " Salandit ";
    private static final int LEVEL = 1 ;
    private static final int LIVE_COAL_COST = 10 ;
    private static final int MAX_DAMAGE = 25 ;
    private static final int MIN_DAMAGE = 0 ;


    public Salandit() {
        super( HEALTH , ATTACK_POINTS  ,NAME, LEVEL);
    }

    public Salandit ( int health , int attackPoints , String name , int level ) {
        super(health , attackPoints , name ,level);
    }

    private void liveCoal ( Pokemon pokemon ){

        Random random = new Random();
        int damage = random.nextInt(MIN_DAMAGE , MAX_DAMAGE)  ;

        this.setAttackPoints(this.getAttackPoints() - LIVE_COAL_COST);
        pokemon.setHealth(pokemon.getHealth() - damage);

    }









}
