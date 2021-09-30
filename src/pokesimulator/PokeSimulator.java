package pokesimulator;

public class PokeSimulator {

    
    public static void main(String[] args) {
        // Instanciar um objeto do tipo Pokemon
        int vencedor;
        Pokemon pokemon1 = new Pokemon("Fogo", 10);
        Pokemon pokemon2 = new Pokemon("Agua", 10);
        Pokemon pokemon3 = new Pokemon("Planta", 10);
        
        Batalha batalha = new Batalha(pokemon1.getVida(), pokemon2.getVida());
        
        vencedor = batalha.lute(pokemon1.getVida(), pokemon2.getVida());
        if(vencedor == 1) {
            System.out.println("O " + pokemon1.getNome() + " venceu.");
        }
        else {
            System.out.println("O " + pokemon2.getNome() + " venceu.");
        }
    }
    
}
