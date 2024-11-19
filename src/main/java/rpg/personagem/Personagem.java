
package rpg.personagem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import rpg.classes.Druid;
import rpg.classes.Knight;
import rpg.classes.Paladin;
import rpg.classes.Sorcerer;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personagem<T> {
    private String nome;
    private int pontosDeForca;
    private int pontosDeDefesa;
    private int nivel = 0;
    private int pontosDeVida;
    private int pontosDeAtaque;
    private int buff;
    private int pontosDeMana;
    private T classe;

    public Personagem(String nome, int pontosDeForca, int pontosDeDefesa, int pontosDeAtaque, int buff, T classe) {
        this.nome = nome;
        this.pontosDeForca = pontosDeForca;
        this.pontosDeDefesa = pontosDeDefesa;
        this.nivel = 0;
        this.pontosDeAtaque = pontosDeAtaque;
        this.buff = buff;
        this.classe = classe;

        if (classe instanceof Druid || classe instanceof Sorcerer) {
            this.pontosDeVida = 200;
            this.pontosDeMana = 400;
        } else if (classe instanceof Paladin) {
            this.pontosDeVida = 300;
            this.pontosDeMana = 300;
        } else if (classe instanceof Knight) {
            this.pontosDeVida = 450;
            this.pontosDeMana = 150;
        } else {
            this.pontosDeVida = 100; // Default value if class is not recognized
            this.pontosDeMana = 100; // Default value if class is not recognized
        }
    }

    public void atacar(Personagem alvo) {
        int dano = this.pontosDeForca - alvo.pontosDeDefesa;
        if (dano < 0) {
            dano = 0;
        }
        alvo.pontosDeVida -= dano;
    }

    public void ganharExperiencia(int experiencia) {
        // Implementation for gaining experience
    }

    public void aumentarForca() {
        // Implementation for increasing strength
    }

    public void aumentarDefesa() {
        // Implementation for increasing defense
    }

    public void aumentarAgilidade() {
        // Implementation for increasing agility
    }

    public void aumentarSorte() {
        // Implementation for increasing luck
    }
}