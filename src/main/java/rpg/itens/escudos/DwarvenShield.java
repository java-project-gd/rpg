package rpg.itens.escudos;

public class DwarvenShield extends Escudo {
    private String tier;
    private int defesaTier;

    public DwarvenShield(int defesaBase, String tier, int defesaTier) {
        super(defesaBase);
        this.tier = tier;
        this.defesaTier = defesaTier;
    }
}
