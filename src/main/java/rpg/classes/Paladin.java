package rpg.classes;

import lombok.Data;
import rpg.personagem.Personagem;

@Data
public class Paladin extends Personagem {
    public Paladin() {
        super();
        this.setPontosDeVida(3700);
        this.setPontosDeMana(3000);
        this.setPontosDeAtaque(3400);
        this.setPontosDeDefesa(2000);
        this.setClasse("Paladin");
    }
}