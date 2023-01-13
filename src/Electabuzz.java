import java.util.Random;

public class Electabuzz extends ElectricPokemon {

    private static final int ATTACK_POINTS = 100 ;
    private static final int HEALTH = 30 ;
    private static final String NAME = " Electabuzz ";
    private static final int LEVEL = 1;
    private static final int THUNDER_COST = 60 ;
    private static final int MAX_DAMAGE = 40 ;
    private static final int MIN_DAMAGE = 50 ;


    public Electabuzz () {
        super( HEALTH , ATTACK_POINTS  ,NAME, LEVEL);
    }

    public Electabuzz ( int health , int attackPoints , String name , int level ) {
        super(health , attackPoints , name ,level);
    }

    private void thunder ( Pokemon pokemon ){

        Random random = new Random();
        int damage = random.nextInt(MIN_DAMAGE , MAX_DAMAGE)  ;

        this.setAttackPoints(this.getAttackPoints() - THUNDER_COST);
        pokemon.setHealth(pokemon.getHealth() - damage);

    }



    public String toString() {
        return super.toString();
    }




}
