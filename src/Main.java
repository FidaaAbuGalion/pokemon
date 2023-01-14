import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Charmander c1 = new Charmander();
        Salandit s1 = new Salandit();
        Moltres m1 = new Moltres();

        Pichu p1 = new Pichu();
        Blitzle b1 =new Blitzle();
        Electabuzz e1 = new Electabuzz();


        Pokemon player1Pokemon = null;
        Pokemon player2Pokemon = null;

          Pokemon [] pokemons = {c1,s1,m1,p1,b1,e1};

        Random random = new Random();
        int player1PokemonIndex = random.nextInt(0,7);
        int player2PokemonIndex = random.nextInt(0,7);

        for (int i = 0; i < pokemons.length -1 ; i++) {

            player1Pokemon = pokemons[player1PokemonIndex];
            player2Pokemon = pokemons[player2PokemonIndex];

        }
        System.out.println(player1Pokemon);
        System.out.println(player2Pokemon);


        System.out.println(b1);

    }
}