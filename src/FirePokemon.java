import java.util.Random;

public  class FirePokemon extends Pokemon {

    private int selfDamage;

    private static final int MAX_SELF_DAMAGE = 11;
    private static final int MIN_SELF_DAMAGE = 3;

    public FirePokemon ( int health , int attackPoints , String name , int level  ){

        super( health , attackPoints , name , level);
        //this.selfDamage = selfDamageRange();

    }
     public int selfDamageRange (){

         Random random = new Random();
         int rangeSelfDamage = random.nextInt( MIN_SELF_DAMAGE , MAX_SELF_DAMAGE );
         //setHealth( getHealth() - rangeSelfDamage );
         return rangeSelfDamage;
     }
    public void printAttackMenu (){
        super.printAttackMenu();

    }
    public void attacks ( Pokemon enemy ){
        super.attacks(enemy);
    }





    public String toString() {
        return " This is a fire pokemon " + "\n" +super.toString();
    }



}
