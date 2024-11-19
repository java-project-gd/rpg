package rpg.classes;

import lombok.Data;
import rpg.personagem.Personagem;

@Data
public class Paladin extends Personagem {
    public Paladin() {
        super();
        this.setPontosDeVida(300);
        this.setPontosDeMana(300);
    }
}