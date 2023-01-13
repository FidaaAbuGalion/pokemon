public class Game {
    private FirePokemon[] TheFirePokemon ;
   // private Electric_Pokemon[] TheElectricPokemon ;


   /* public void createTheFirePokemon (Fire_Pokemon newFirePokemon){
        if (this.TheFirePokemon == null ) {
            Fire_Pokemon [] newArray = new Fire_Pokemon[1];
            newArray [0] = newFirePokemon ;
            this.TheFirePokemon = newArray ;
        }else {
            Fire_Pokemon [] newFirePokemons = new Fire_Pokemon[TheFirePokemon.length+1];
            for (int i = 0; i < this.TheFirePokemon.length; i++) {
                newFirePokemons[i] = newFirePokemon ;
                newFirePokemons = this.TheFirePokemon ;
            }
        }

    }


    public void createTheElectricPokemon (Electric_Pokemon newElectricPokemon){
        if (this.TheElectricPokemon == null ) {
            Electric_Pokemon [] newArray = new Electric_Pokemon[1];
            newArray [0] = newElectricPokemon ;
            this.TheElectricPokemon = newArray ;
        }else {
            Electric_Pokemon [] newElectricPokemons = new Electric_Pokemon[TheFirePokemon.length+1];
            for (int i = 0; i < this.TheElectricPokemon.length; i++) {
                newElectricPokemons[i] = newElectricPokemon ;
                newElectricPokemons = this.TheElectricPokemon ;
            }
        }
    }



    public void play (){
        Scanner scanner = new Scanner(System.in) ;
        String FirstPlayerPokemon = null  , SecundPlayerPokemon = null;
        Electric_Pokemon theFirstPlayerPokemon = new Electric_Pokemon() ;
        Fire_Pokemon theFFirstPlayerPokemon = new Fire_Pokemon() ;

        System.out.println();
        System.out.println("Hey welcome, you will be the first player choose your pokemon name");
        //ودي متودا تعرض اسماء البوكيمون
        FirstPlayerPokemon = scanner.next() ;
        for (int i = 0; i <TheElectricPokemon.length ; i++) {


            if (FirstPlayerPokemon.equals(this.TheElectricPokemon[i].getPokemonName()) ){
                theFFirstPlayerPokemon = this.TheFirePokemon [i] ;
                break;
            }
            if (FirstPlayerPokemon.equals(this.TheFirePokemon[i].getPokemonName())){
                theFirstPlayerPokemon = this.TheElectricPokemon [i] ;
                break;
            }
        }
        //هني في كفل كود لاني ودي افحص اسماء البوكيمون الي بيدخلوهن الثنين فلزم نسوي متودا تفحص  او متودتين وحده بترجع بوكيمون كهرب ووحده نار



    }





//    public String ToString (Fire_Pokemon fire_pokemon){
//        return "Pokemon name:" + getPokemonName() + '\''
//                + "ppkemon level" + getPokemonLevel()  + '\''
//                + "pokemonMaximumLifePoints" + getPokemonMaximumLifePoints() + '\''
//                + "PokemonMaximumAttackPoints" + getPokemonMaximumAttackPoints() + '\''
//                + "PokemonAttacks" + getPokemonAttacks() ;
//    }
//
//    public String ToString (Electric_Pokemon electric_pokemon){
//        return "Pokemon name:" + getPokemonName() + '\''
//                + "ppkemon level" + getPokemonLevel()  + '\''
//                + "pokemonMaximumLifePoints" + getPokemonMaximumLifePoints() + '\''
//                + "PokemonMaximumAttackPoints" + getPokemonMaximumAttackPoints() + '\''
//                + "PokemonAttacks" + getPokemonAttacks() ;
//    }




    //  هذي المتودا بتشتغل بين الادوار تقريبا الشغل الاكثر بيكون هني بس اساع ما بديت فيها كويس
    public void HalfTimeInTheGame (){
        Scanner scanner = new Scanner(System.in) ;
        int UserChoose = 0 ;
        System.out.println("-Option 1: Making an attack.\n" +
                "- Option 2: Waiting.\n" +
                "- Option 3: Development.\n" +
                "- Option 4: Special action");
        UserChoose = scanner.nextInt() ;
        if (UserChoose == 1){

        }

    }*/
}
