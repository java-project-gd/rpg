package rpg.classes;

import lombok.Data;

@Data
public class Sorcerer {
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;


    public Sorcerer(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public void atacar(Sorcerer alvo) {
        int dano = this.ataque - alvo.getDefesa();
        if (dano < 0) {
            dano = 0;
        }
        alvo.setVida(alvo.getVida() - dano);
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }
}
