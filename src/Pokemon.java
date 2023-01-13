import java.util.Random;

public abstract class Pokemon  {

    private String name ;
    private int level ;
   private int health;
   private int attackPoints ;

   public Pokemon ( int lifePoints , int attackPoints , String name , int level ){
       this.health = lifePoints ;
       this.attackPoints = attackPoints ;
       this.name = name ;
       this.level = level ;

   }
    public int getHealth(){
       return this.health;
    }
    public void setHealth(int health){

       this.health = health;

    }
    public int getAttackPoints (){
       return this.attackPoints;
    }

    public void setAttackPoints ( int attackPoints ){

       this.attackPoints = attackPoints ;

    }
    public String getName (){
       return this.name;
    }
    public void setName (String name){

       this.name = name;
    }
    public int getLevel (){
       return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    public String toString() {

        return  " Pokemon Information" + "\n" +
                " name: " + this.name + "\n" +
                " Level: " + this.level + "\n" +
                " Health: " + this.health + "\n" +
                " Point attack: " + this.attackPoints + "\n" ;



   }
   public static final int KICK_DAMAGE = 2 ;

   public void kick (Pokemon pokemon){

           int damage = KICK_DAMAGE;
           pokemon.setHealth(pokemon.getHealth() - damage);

   }

}

