package rpg.classes;

import lombok.Data;
import rpg.personagem.Personagem;

@Data
public class Druid extends Personagem {
    private int mana;

    public Druid(String nome, int vida, int forca, int defesa, int agilidade, int sorte, int nivel, int experiencia, int pontosDeHabilidade, int mana) {
        super(nome, vida, forca, defesa, agilidade, sorte, nivel, experiencia, pontosDeHabilidade);
        this.mana = mana;
    }

    @Override
    public void atacar(Personagem alvo) {
        int dano = this.getForca() - alvo.getDefesa();
        if (dano < 0) {
            dano = 0;
        }
        alvo.setVida(alvo.getVida() - dano);
        this.mana -= 10;
    }

    public void curar(Personagem alvo) {
        int cura = this.getForca();
        alvo.setVida(alvo.getVida() + cura);
        this.mana -= 10;
    }

    @Override
    public void ganharExperiencia(int experiencia) {
        this.setExperiencia(this.getExperiencia() + experiencia);
        if (this.getExperiencia() >= 100) {
            this.setNivel(this.getNivel() + 1);
            this.setPontosDeHabilidade(this.getPontosDeHabilidade() + 5);
            this.setExperiencia(this.getExperiencia() - 100);
            this.mana += 10;
        }
    }

    @Override
    public void aumentarForca() {
        if (this.getPontosDeHabilidade() > 0) {
            this.setForca(this.getForca() + 1);
            this.setPontosDeHabilidade(this.getPontosDeHabilidade() - 1);
        }
    }

    @Override
    public void aumentarDefesa() {
        if (this.getPontosDeHabilidade() > 0) {
            this.setDefesa(this.getDefesa() + 1);
            this.setPontosDeHabilidade(this.getPontosDeHabilidade() - 1);
        }
    }

    @Override
    public void aumentarAgilidade() {
        if (this.getPontosDeHabilidade() > 0) {
            this.setAgilidade(this.getAgilidade() + 1);
            this.setPontosDeHabilidade(this.getPontosDeHabilidade() - 1);
        }
    }

    public void aumentarMana() {
        if (this.getPontosDeHabilidade() > 0) {
            this.mana++;
            this.setPontosDeHabilidade(this.getPontosDeHabilidade() - 1);
        }
    }
}