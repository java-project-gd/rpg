package rpg.classes;

import lombok.Data;
import rpg.personagem.Personagem;

@Data
public class Sorcerer extends Personagem {
    public Sorcerer() {
        super();
        this.setPontosDeVida(2000);
        this.setPontosDeMana(6000);
        this.setPontosDeAtaque(2700);
        this.setPontosDeDefesa(900);
        this.setClasse("Sorcerer");
    }
}