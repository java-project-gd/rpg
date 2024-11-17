package rpg.personagem;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Personagem {
    private String nome;
    private int vida;
    private int forca;
    private int defesa;
    private int agilidade;
    private int sorte;
    private int nivel;
    private int experiencia;
    private int pontosDeHabilidade;

    public Personagem() {
        // Default constructor
    }
    public Personagem(String nome, int vida, int forca, int defesa, int agilidade, int sorte, int nivel, int experiencia, int pontosDeHabilidade) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.defesa = defesa;
        this.agilidade = agilidade;
        this.sorte = sorte;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.pontosDeHabilidade = pontosDeHabilidade;
    }

    public void atacar(Personagem alvo) {
        int dano = this.forca - alvo.defesa;
        if (dano < 0) {
            dano = 0;
        }
        alvo.vida -= dano;
    }

    public void ganharExperiencia(int experiencia) {
        this.experiencia += experiencia;
        if (this.experiencia >= 100) {
            this.nivel++;
            this.pontosDeHabilidade += 5;
            this.experiencia -= 100;
        }
    }

    public void aumentarForca() {
        if (this.pontosDeHabilidade > 0) {
            this.forca++;
            this.pontosDeHabilidade--;
        }
    }

    public void aumentarDefesa() {
        if (this.pontosDeHabilidade > 0) {
            this.defesa++;
            this.pontosDeHabilidade--;
        }
    }

    public void aumentarAgilidade() {
        if (this.pontosDeHabilidade > 0) {
            this.agilidade++;
            this.pontosDeHabilidade--;
        }
    }

    public void aumentarSorte() {
        if (this.pontosDeHabilidade > 0) {
            this.sorte++;
            this.pontosDeHabilidade--;
        }
    }

}
