package rpg.classes;

import rpg.personagem.Personagem;

public class Classe<T extends Personagem> {
    private T personagem;

    public Classe(T personagem) {
        this.personagem = personagem;
    }
}