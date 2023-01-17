import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // fire                                  // electric
        Charmander c1 = new Charmander();
        Pichu p1 = new Pichu();
        Salandit s1 = new Salandit();
        Blitzle b1 = new Blitzle();
        Moltres m1 = new Moltres();
        Electabuzz e1 = new Electabuzz();

        Pokemon player1Pokemon = null;
        Pokemon player2Pokemon = null;
        int playerOption ;

        Pokemon[] pokemons = {c1, s1, m1, p1, b1, e1};

        Random random = new Random();
        int player1PokemonIndex = random.nextInt(0, 6);
        int player2PokemonIndex = random.nextInt(0, 6);

        player1Pokemon = pokemons[player1PokemonIndex];
        player2Pokemon = pokemons[player2PokemonIndex];



            do {
                System.out.println(" player 1 pokemon : " + player1Pokemon + "\n" + " player 2 pokemon : " + player2Pokemon);
                System.out.println(" player one turn -> " + "\n" + player1Pokemon);
                options(player1Pokemon,player2Pokemon);

                System.out.println(" player two turn -> " + "\n" + player2Pokemon);
                options(player2Pokemon,player1Pokemon);

            }while (theGameEnd(player1Pokemon,player2Pokemon));


    }
    public static void printMenu (){
        System.out.println(" choose an option : \n" +
                           " 1.attack \n" +
                           " 2.waiting \n" +
                           " 3.development \n" +
                           " 4.special action \n" );

    }


    public static boolean canUpgradeToLevelTwo (Pokemon pokemon){

        boolean upgradeToTheNextLevel = false;
        if (pokemon.getHealth() > 20) {
            if (pokemon.getAttackPoints() > 25) {
                upgradeToTheNextLevel = true;
            }
        }

        return upgradeToTheNextLevel;

    }
    public static boolean canUpgradeToLevelThree (Pokemon pokemon){

        boolean upgradeToTheNextLevel = false;
        if (pokemon.getHealth() > 30) {
            if (pokemon.getAttackPoints() > 40) {
                upgradeToTheNextLevel = true;
            }
        }

        return upgradeToTheNextLevel;

    }

    public static void optionOneInTheMenu(Pokemon playerPokemon , Pokemon enemyPokemon){

        playerPokemon.attacks(enemyPokemon);


    }

    public static void options ( Pokemon playerPokemon , Pokemon enemyPokemon ){
        Moltres m1 = new Moltres();
        printMenu();
        Scanner scanner = new Scanner(System.in);
        int playerOption = scanner.nextInt();
        if (playerOption == 1) {
            optionOneInTheMenu(playerPokemon, enemyPokemon);
            System.out.println(playerPokemon + "\n" + enemyPokemon);
        } else if (playerOption == 2) {
            playerPokemon.bonusOfWaiting();

        } else if (playerOption == 3) {
            if (playerPokemon.equals(m1)) {
                System.out.println(" you cant upgrade");
            } else if (canUpgradeToLevelTwo(playerPokemon)) {
                playerPokemon.equals(playerPokemon.upgrade());
                System.out.println(playerPokemon);
            }
        } else if (playerOption == 4) {

        }

    }
    public static boolean theGameEnd (Pokemon playerPokemon , Pokemon enemyPokemon){
        boolean theGameEnd = false ;
        if (playerPokemon.getHealth() < 0 ){
            System.out.println( enemyPokemon.getName() + " # player 2 # is the winner!" );
            theGameEnd = true;
        } else if (enemyPokemon.getHealth()<0){
            System.out.println( playerPokemon.getName() + " # player 1 # is the winner! " );
            theGameEnd = true;
        }

        return theGameEnd;
    }



}