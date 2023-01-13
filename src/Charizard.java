import java.util.Random;

public class Charizard extends Charmeleon {

    private static final int ATTACK_POINTS = 80  ;
    private static final int HEALTH = 130;
    private static final String NAME = " Charizard ";
    private static final int LEVEL = 3;
    private static final int FIERY_BLAST_COST = 50 ;
    private static final int MAX_DAMAGE = 51 ;
    private static final int MIN_DAMAGE = 50 ;

    public Charizard () {
        super( HEALTH , ATTACK_POINTS  ,NAME, LEVEL );
    }

    public void flameTale ( Pokemon pokemon ){

        Random random = new Random();
        int damage = random.nextInt(MIN_DAMAGE , MAX_DAMAGE)  ;

        this.setAttackPoints(this.getAttackPoints() - FIERY_BLAST_COST);
        pokemon.setHealth(pokemon.getHealth() - damage);

    }


    public String toString() {
        return super.toString();
    }
}
