package rpg.classes;

import lombok.Data;
import rpg.personagem.Personagem;

@Data
public class Knight extends Personagem {
    public Knight() {
        super();
        this.setPontosDeVida(5800);
        this.setPontosDeMana(1500);
        this.setPontosDeAtaque(2800);
        this.setPontosDeDefesa(4000);
        this.setClasse("Knight");
    }
}