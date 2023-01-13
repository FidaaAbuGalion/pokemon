public class FirePokemon extends Pokemon {

    public FirePokemon ( int health , int attackPoints , String name , int level ){

        super( health , attackPoints , name , level);
    }

    public String toString() {
        return " This is a fire pokemon " + "\n" +super.toString();
    }
}
