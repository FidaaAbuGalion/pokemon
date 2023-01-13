import java.util.Random;

public class Charmeleon extends Charmander {

    private static final int ATTACK_POINTS = 60 ;
    private static final int HEALTH = 90;
    private static final String NAME = " Charmeleon ";
    private static final int LEVEL = 2;
    private static final int FLAME_TAIL_COST = 40 ;
    private static final int MAX_DAMAGE = 50 ;
    private static final int MIN_DAMAGE = 30 ;



    public Charmeleon () {
        super( HEALTH , ATTACK_POINTS  ,NAME, LEVEL );
    }
    public Charmeleon ( int health , int attackPoints , String name , int level ) {
        super(health , attackPoints , name ,level);
    }

    public void flameTale ( Pokemon pokemon ){

        Random random = new Random();
        int damage = random.nextInt(MIN_DAMAGE , MAX_DAMAGE)  ;

        this.setAttackPoints(this.getAttackPoints() - FLAME_TAIL_COST);
        pokemon.setHealth(pokemon.getHealth() - damage);

    }



    public String toString() {
        return super.toString();
    }
}
