import java.util.Random;

public class Pikachu extends Pichu {

    private static final int ATTACK_POINTS = 40 ;
    private static final int HEALTH = 50 ;
    private static final String NAME = " pikachu ";
    private static final int LEVEL = 2 ;
    private static final int ELECTRO_BALL_COST = 10  ;
    private static final int MAX_DAMAGE = 30 ;
    private static final int MIN_DAMAGE = 40 ;


    public Pikachu () {
        super( HEALTH , ATTACK_POINTS  ,NAME, LEVEL);
    }

    public Pikachu ( int health , int attackPoints , String name , int level ) {
        super(health , attackPoints , name ,level);
    }

    private void electroBall ( Pokemon pokemon ){

        Random random = new Random();
        int damage = random.nextInt(MIN_DAMAGE , MAX_DAMAGE)  ;

        this.setAttackPoints(this.getAttackPoints() - ELECTRO_BALL_COST );
        pokemon.setHealth(pokemon.getHealth() - damage);

    }



    public String toString() {
        return super.toString();
    }



}
