package pokesimulator;


public class Pokemon {
    // ATRIBUTOS ENCAPSULADOS
    private String nome;
    private String tipo;
    private int level;
    private int vida;
    private int ataque;
    private int defesa;
    
    // CONSTRUTOR 

    public Pokemon(String tipo, int level) {
        this.tipo = tipo;
        this.level = level;
        calculaAtributos();
        calculaBonus();
        imprimePokemon();
        
    }
    
    
    // MÉTODOS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    
    public void imprimePokemon() {
        System.out.println("Nome: " + nome + " | " +
                           "Tipo: " + tipo + " | " +
                           "Level: " + level + " | " +
                           "Vida: " + vida + " | " +
                           "Ataque: " + ataque + " | " +
                           "Defesa: " + defesa + " | "
        );
    }
    
    public void calculaAtributos() {
        switch(this.tipo) {
            case "Fogo":
                this.vida = 35;
                this.ataque = 40;
                this.defesa = 30;
            break;
            
            case "Agua":
                this.vida = 60;
                this.ataque = 25;
                this.defesa = 30;
            break;
            
            case "Planta":
                this.vida = 100;
                this.ataque = 20;
                this.defesa = 40;
            break;
            
            case "Voador":
                this.vida = 40;
                this.ataque = 45;
                this.defesa = 30;
            break;
            
            case "Eletrico":
                this.vida = 25;
                this.ataque = 70;
                this.defesa = 30;
            break;
        }
    }
    
    public void calculaBonus() {
        vida = vida + (level / 2);
        ataque = ataque + (level / 3);
        defesa = defesa + (level / 4);
    }
    
}
