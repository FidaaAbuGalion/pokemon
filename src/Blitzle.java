import java.util.Random;

public class Blitzle extends ElectricPokemon  implements Interface  {
    

    public Blitzle () {
        super( Definition.HEALTH , Definition.ATTACK_POINTS  ,Definition.NAME, Definition.LEVEL);
    }
    public Blitzle ( int health , int attackPoints , String name , int level ) {
        super(health , attackPoints , name ,level);
    }

    private void flop ( Pokemon pokemon ){

        Random random = new Random();
        int damage = random.nextInt(Definition.MIN_DAMAGE , Definition.MAX_DAMAGE)  ;

        this.setAttackPoints(this.getAttackPoints() - Definition.FLOP_COST);
        pokemon.setHealth(pokemon.getHealth() - damage);

    }



    public String toString() {
        return super.toString();
    }




    public String printAttackType() {
        return  ;
    }
}
