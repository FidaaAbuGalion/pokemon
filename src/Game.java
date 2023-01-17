import java.util.Random;
import java.util.Scanner;

public class Game {

   /* // Fire pokemon                       // Electric pokemon
    Charmander c1 = new Charmander();     Pichu p1 = new Pichu();
    Salandit s1 = new Salandit();         Blitzle b1 =new Blitzle();
    Moltres m1 = new Moltres();           Electabuzz e1 = new Electabuzz();


    Pokemon player1Pokemon = null;
    Pokemon player2Pokemon = null;

    Pokemon [] pokemons = {c1,s1,m1,p1,b1,e1};

    public void startGame (Pokemon player1Pokemon , Pokemon player2Pokemon){

        System.out.println(" Welcome - pokemon game ");
        System.out.println(" pokemon of player 1 is : " + "\n" + player1Pokemon + "\n" +
                           " pokemon of player 2 is : " + "\n" + player2Pokemon );

       *//* do {
            System.out.println( " its player 1 tern pick an option : " + "\n" + player1Pokemon +
                                " press-1 to attacks  "  );



        }while ();
*//*


    }


    private void randomPokemonPlayer ( Pokemon [] pokemons){

        Random random = new Random();
        int player1PokemonIndex = random.nextInt(0,7);
        int player2PokemonIndex = random.nextInt(0,7);

        for (int i = 0; i < pokemons.length -1 ; i++) {

            player1Pokemon = pokemons[player1PokemonIndex];
            player2Pokemon = pokemons[player2PokemonIndex];

        }

        startGame(player1Pokemon , player2Pokemon);

    }

    private void optionOneInGame (Pokemon playerPokemon ){

        System.out.println(" This is what you can do :" + "\n" +
                           " The First Option -  regular kick - damage 2 - to the enemy, didnt cost you any thing " + "\n" +
                           " press 1 to use  ");
                           Scanner scanner = new Scanner(System.in);
                           int playerOption = scanner.nextInt();
                           if (playerOption == 1) {
                              // Pokemon pokemon = new Pokemon();
                             //  pokemon.kick(playerPokemon);
                           } else if (playerOption == 2) {



                           }


    }


    */

    // Fire pokemon                       // Electric pokemon
    Charmander c1 = new Charmander();     Pichu p1 = new Pichu();
    Salandit s1 = new Salandit();         Blitzle b1 =new Blitzle();
    Moltres m1 = new Moltres();           Electabuzz e1 = new Electabuzz();


    Pokemon player1Pokemon = null;
    Pokemon player2Pokemon = null;

    Pokemon [] pokemons = {c1,s1,m1,p1,b1,e1};

/*
    public void startGame (Pokemon player1Pokemon , Pokemon player2Pokemon){

        int UserChoose = 0 ;
        Scanner scanner = new Scanner(System.in) ;

        System.out.println(" Welcome - pokemon game ");
        System.out.println(" pokemon of player 1 is : " + "\n" + player1Pokemon + "\n" +
                " pokemon of player 2 is : " + "\n" + player2Pokemon );

        do {
            System.out.println( " its player 1 tern pick an option : " + "\n" + player1Pokemon +
                    " press-1 to attacks  " + "\n" +
                    " press-2 to waiting " + "\n" +
                    " press-3 to upgrade your pokemon" + "\n" +
                    " press-4 to special action");
            UserChoose = scanner.nextInt() ;
            if (UserChoose == 1){
                optionOneInGame(player1Pokemon , player2Pokemon);
            }
            if (UserChoose == 2){
                optionTowInGame(player1Pokemon);
            }
            if (UserChoose == 3){
                optionTreeInGame(player1Pokemon);
            }

        }while ();



    }

    Pokemon pokemon = new Pokemon();
    public void randomPokemonPlayer1 ( Pokemon [] pokemons){ //من وين ودنا انادي على هيذي المتودا

        Random random = new Random();
        int player1PokemonIndex = random.nextInt(0,7);
        int player2PokemonIndex = random.nextInt(0,7);

        for (int i = 0; i < pokemons.length -1 ; i++) {

            player1Pokemon = pokemons[player1PokemonIndex];
            player2Pokemon = pokemons[player2PokemonIndex];

        }

        startGame(player1Pokemon , player2Pokemon);

    }

    private void optionOneInGame (Pokemon theAttackPokemon , Pokemon theSecontPokemon ){

        System.out.println("if you want to do the normal kick her damge : 2 press 1 " + "\n" +
                "if you want to use your Pokemon attack" ) ;
        Scanner scanner = new Scanner(System.in);
        int playerOption = scanner.nextInt();
        if (playerOption == 1) {

            pokemon.kick(theSecontPokemon);

        } else if (playerOption == 2) {
            // if (theAttackPokemon.getAttackPoints() >= theAttackPokemon.)

            // فداء انا مني قادر افهم كيف السيدور تبع الهجمات عشان هذي هذا الي ظل ناقص اما الباقي كله تمام


        }

        startGame(player1Pokemon , player2Pokemon);
    } // ما خلصنت هني!!!!!!!

    private Pokemon optionTowInGame(Pokemon ThePokemon) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int heWantToContinue = 0;
        System.out.println( "upon selection you will give up attacking in this turn" + "prees 1 to add of 5-30 life point " + "\n" +
                "prees 2 to add of 0-40 attack point" + "\n" +
                "prees 3 to triple attack power next turn"
                +"\n" + "the number of point to be added is random");
        heWantToContinue = scanner.nextInt();
        if (heWantToContinue == 1){
            ThePokemon.setHealth(ThePokemon.getHealth() + random.nextInt(40)+5);
            return ThePokemon ;
        } if (heWantToContinue == 2){
            ThePokemon.setAttackPoints(ThePokemon.getAttackPoints() + random.nextInt(40));
            return ThePokemon ;
        }
        if (heWantToContinue == 3){
            //هني ولله تحيرت مني عارف كيف اخليه يسوي ضربه *3 تكون قوتها
        }

        startGame(player1Pokemon , player2Pokemon);
        return ThePokemon;
    }


    private Pokemon optionTreeInGame (Pokemon PokemonUpgrade){ // هني لازم تطوير للبوكيمون
        PokemonUpgrade = player1Pokemon.getLevel()



        return UpgradePokemon ;
    }  // هني متودت التطوير


    private void optionFourInGame (Pokemon ThePokemon){
        Scanner scanner =new Scanner(System.in);
        int playerChoose = 0 , effect = 0 ;
        if (ThePokemon.getName().equals(c1.getName()) || ThePokemon.getName().equals(s1.getName()) || ThePokemon.getName().equals(m1.getName())){
            System.out.println("you cando tow consecutive attacks but the type of attacks will be random "+"\n"+
                    "and in exchange for that , the attack point will be zero and 50% of the life point "+ "\n"+
                    "will drop . if you agreed press 1");
            playerChoose = scanner.nextInt() ;
            if (playerChoose == 1){

                RandomAttack() ;  // هني بتشتغل المتودا الي تحت الي بتسوي هجوم عشوائي


                //نتائج الهجمه تحت
                ThePokemon.setAttackPoints(effect); //
                ThePokemon.setMaxLifePint( (ThePokemon.getMaxLifePoint() / 2)); //
            }
        }else {
            System.out.println("you have tow possibilities , the first is to fill life point press 1 " + "\n" +
                    "the second is to fill attack points press 2");
            playerChoose = scanner.nextInt() ;
            if (playerChoose == 1){
                ThePokemon.setHealth(ThePokemon.getMaxLifePoint());
            }
            if (playerChoose ==2 ){
                ThePokemon.setAttackPoints(ThePokemon.getAttackPoints());
            }

        }
        startGame(player1Pokemon , player2Pokemon);

    }   // تقريبا جاهزه



    private void RandomAttack (Pokemon ThePokemonHePlay ,Pokemon TheSecondPokemon ) {    // هيذي المتودا سويتل عشان تضرب ضربتين ورا بعض لان هذي الامكانيه تبعت بوكيمون النار
        int numberTheAttacks = 2 ;
        for (int i = 0; i < numberTheAttacks; i++) {

            int WahtAttackTheRandomChoose = 0;
            Random random = new Random();
            WahtAttackTheRandomChoose = random.nextInt(2) + 1;
            System.out.println(WahtAttackTheRandomChoose);
            if (WahtAttackTheRandomChoose == 1) {
                //مني مستدير هني فموضوع الهجمات الهجمه العاديه وهجمه الkick
            }
            if (WahtAttackTheRandomChoose == 2) {
                pokemon.kick(TheSecondPokemon);
            }

        }
    }




*/

}
