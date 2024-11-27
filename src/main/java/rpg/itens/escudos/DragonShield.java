package rpg.itens.escudos;

public class DragonShield extends Escudo {
    private String tier;
    private int defesaTier;

    public DragonShield(int defesaBase, String tier, int defesaTier) {
        super(defesaBase);
        this.tier = tier;
        this.defesaTier = defesaTier;
    }
}
