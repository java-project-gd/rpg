package rpg.itens.escudos;

public class NecromancerShield extends Escudo {
    private String tier;
    private int defesaTier;

    public NecromancerShield(int defesaBase, String tier, int defesaTier) {
        super(defesaBase);
        this.tier = tier;
        this.defesaTier = defesaTier;
    }
}
