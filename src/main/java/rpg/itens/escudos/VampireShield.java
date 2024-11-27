package rpg.itens.escudos;

public class VampireShield extends Escudo {
    private String tier;
    private int defesaTier;

    public VampireShield(int defesaBase, String tier, int defesaTier) {
        super(defesaBase);
        this.tier = tier;
        this.defesaTier = defesaTier;
    }
}
