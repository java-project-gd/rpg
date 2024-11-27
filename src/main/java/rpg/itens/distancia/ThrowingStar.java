package rpg.itens.distancia;

public class ThrowingStar extends Distancia {
    private String tier;
    private int danoTier;

    public ThrowingStar(int danoBase, int alcance, String tier, int danoTier) {
        super(danoBase, alcance);
        this.tier = tier;
        this.danoTier = danoTier;
    }
}
