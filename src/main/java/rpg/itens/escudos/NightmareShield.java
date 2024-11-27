package rpg.itens.escudos;

public class NightmareShield extends Escudo {
    private String tier;
    private int defesaTier;

    public NightmareShield(int defesaBase, String tier, int defesaTier) {
        super(defesaBase);
        this.tier = tier;
        this.defesaTier = defesaTier;
    }
}
