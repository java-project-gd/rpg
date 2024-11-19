package rpg.classes;

import lombok.Data;
import rpg.personagem.Personagem;

@Data
public class Knight extends Personagem {
    public Knight() {
        super();
        this.setPontosDeVida(450);
        this.setPontosDeMana(150);
    }
}