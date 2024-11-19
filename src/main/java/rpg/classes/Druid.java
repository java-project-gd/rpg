package rpg.classes;

import lombok.Data;
import rpg.personagem.Personagem;

@Data
public class Druid extends Personagem {
    public Druid() {
        super();
        this.setPontosDeVida(2000);
        this.setPontosDeMana(6000);
        this.setPontosDeAtaque(2700);
        this.setPontosDeDefesa(900);
        this.setClasse("Druid");
    }
}