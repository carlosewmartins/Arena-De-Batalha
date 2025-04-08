import java.util.Random;

public class Batalha {
    private Personagem personagem;
    private Inimigo inimigo;
    Random random = new Random();

    public Batalha(Personagem personagem, Inimigo inimigo) {
        this.personagem = personagem;
        this.inimigo = inimigo;
    }

    public void iniciarBatalha() {
        System.out.println("################ Iniciando Batalha ################");
        System.out.println("Nome: " + personagem.getNome() + " VS. " + inimigo.getNome());

        while (personagem.getVida() > 0 && inimigo.getVida() > 0) {
            // Adiciona um dano aleatório entre 0 e 10 como chance de ataque critico
            int danoPersonagem = ((personagem.getAtaque() - inimigo.getDefensa()) + random.nextInt(11));
            inimigo.setVida(inimigo.getVida() - danoPersonagem);
            if (danoPersonagem < 0) {
                System.out.println(personagem.getNome() + " não causou dano!");
            } else {
                System.out.println(personagem.getNome() + " causou " + danoPersonagem + " de dano");
            }
            if (inimigo.getVida() <= 0) {
                System.out.println(inimigo.getNome() + " foi derrotado! " + personagem.getNome() + " venceu!");
                break;
            }

            // Adiciona um dano aleatório entre 0 e 10 como chance de ataque critico
            int danoInimigo = (inimigo.getAtaque() - personagem.getDefensa()) + random.nextInt(11);
            personagem.setVida(personagem.getVida() - danoInimigo);
            if (danoInimigo < 0) {
                System.out.println(inimigo.getNome() + " não causou dano!");
            } else {
                System.out.println(inimigo.getNome() + " causou " + danoInimigo + " de dano");
            }
            if (personagem.getVida() <= 0) {
                System.out.println(personagem.getNome() + " foi derrotado! " + inimigo.getNome() + " venceu!");
                break;
            }
        }
    }
}
