package rpg.classes;

import lombok.Data;
import rpg.personagem.Personagem;

@Data
public class Druid extends Personagem {
    public Druid() {
        super();
        this.setPontosDeVida(200);
        this.setPontosDeMana(400);
    }
}