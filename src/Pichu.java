import java.util.Random;

public class Pichu extends ElectricPokemon {


    private static final int ATTACK_POINTS = 30 ;
    private static final int HEALTH = 40 ;
    private static final String NAME = " Pichu ";
    private static final int LEVEL = 1 ;
    private static final int QUICK_ATTACK_COST = 5 ;
    private static final int MAX_DAMAGE = 11 ;
    private static final int MIN_DAMAGE = 10 ;


    public Pichu () {
        super( HEALTH , ATTACK_POINTS  ,NAME, LEVEL);
    }

    public Pichu ( int health , int attackPoints , String name , int level ) {
        super(health , attackPoints , name ,level);
    }

    private void quickAttack( Pokemon pokemon ){

        Random random = new Random();
        int damage = random.nextInt(MIN_DAMAGE , MAX_DAMAGE)  ;

        this.setAttackPoints(this.getAttackPoints() - QUICK_ATTACK_COST );
        pokemon.setHealth(pokemon.getHealth() - damage);

    }



    public String toString() {
        return super.toString();
    }


}
