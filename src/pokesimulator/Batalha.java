package pokesimulator;


public class Batalha {
    int life1;
    int life2;

    public Batalha(int life1, int life2) {
        this.life1 = life1;
        this.life2 = life2;
    }
    
    public int lute(int life1, int life2) {
        int vencedor;
        if(life1 > life2) {
            vencedor = 1;
        }
        else {
            vencedor = 2;
        }
        return vencedor;
    }
    
    
}

