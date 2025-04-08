import java.util.ArrayList;
import java.util.Random;

public class ArenaDeBatalha {
    public static void main(String[] args) {
        Random random = new Random();

        String[] nomesPersonagens = {"Guerreiro", "Mago", "Arqueiro", "Ladino", "Paladino"};
        String[] nomesInimigos = {"Goblin", "Orc", "Esqueleto", "Zumbi", "Dragão"};

        ArrayList<Personagem> personagens = new ArrayList<>();
        for (int i = 0; i < 2; i++) { // Adicionando 2 personagens
            String nomeAleatorio = nomesPersonagens[random.nextInt(nomesPersonagens.length)]; //Sorteia um nome aleatorio
            personagens.add(new Personagem(nomeAleatorio, random.nextInt(101), random.nextInt(21), random.nextInt(21)));
        }

        ArrayList<Inimigo> inimigos = new ArrayList<>();
        for (int i = 0; i < 2; i++) { // Adicionando 2 inimigos
            String nomeAleatorio = nomesInimigos[random.nextInt(nomesInimigos.length)]; //Sorteia um nome aleatorio
            inimigos.add(new Inimigo(nomeAleatorio, random.nextInt(101), random.nextInt(21), random.nextInt(21)));
        }

        Personagem personagem = personagens.get(random.nextInt(personagens.size()));
        Inimigo inimigo = inimigos.get(random.nextInt(inimigos.size()));

        Batalha batalha = new Batalha(personagem, inimigo);
        batalha.iniciarBatalha();
    }
}
