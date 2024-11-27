package rpg.itens.escudos;

public class TortoiseShield extends Escudo {
    private String tier;
    private int defesaTier;

    public TortoiseShield(int defesaBase, String tier, int defesaTier) {
        super(defesaBase);
        this.tier = tier;
        this.defesaTier = defesaTier;
    }
}
