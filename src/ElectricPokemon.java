public class ElectricPokemon extends Pokemon{


    public ElectricPokemon ( int health , int attackPoints , String name , int level ){

        super(health , attackPoints , name , level);

    }

    public String toString() {
        return  " This is an electric pokemon " + "\n" + super.toString();
    }
}
