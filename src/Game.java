import java.util.Random;
import java.util.Scanner;

public class Game {

    // Fire pokemon                       // Electric pokemon
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

        do {
            System.out.println( " its player 1 tern pick an option : " + "\n" + player1Pokemon +
                                " press-1 to attacks  "  );



        }while ();



    }


    private void randomPokemonPlayer1 ( Pokemon [] pokemons){

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
                               Pokemon pokemon = new Pokemon();
                               pokemon.kick(playerPokemon);
                           } else if (playerOption == 2) {



                           }


    }





}
