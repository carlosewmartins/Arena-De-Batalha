public class Personagem {
    private String nome;
    private int vida;
    private int ataque;
    private int defensa;

    public Personagem(String nome, int vida, int ataque, int defensa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
