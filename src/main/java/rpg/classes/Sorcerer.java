package rpg.classes;

import lombok.Data;
import rpg.personagem.Personagem;

@Data
public class Sorcerer extends Personagem {
    public Sorcerer() {
        super();
        this.setPontosDeVida(200);
        this.setPontosDeMana(400);
    }
}