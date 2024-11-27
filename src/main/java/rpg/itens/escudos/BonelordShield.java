package rpg.itens.escudos;

public class BonelordShield extends Escudo {
    private String tier;
    private int defesaTier;

    public BonelordShield(int defesaBase, String tier, int defesaTier) {
        super(defesaBase);
        this.tier = tier;
        this.defesaTier = defesaTier;
    }
}
