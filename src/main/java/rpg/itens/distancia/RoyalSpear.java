package rpg.itens.distancia;

public class RoyalSpear extends Distancia {
    private String tier;
    private int danoTier;

    public RoyalSpear(int danoBase, int alcance, String tier, int danoTier) {
        super(danoBase, alcance);
        this.tier = tier;
        this.danoTier = danoTier;
    }
}
