package rpg.itens.bestas;

public class GrandSanguineCrossbow extends Besta {
    private String tier;
    private int danoTier;

    public GrandSanguineCrossbow(int danoBase, int alcance, String tier, int danoTier) {
        super(danoBase, alcance);
        this.tier = tier;
        this.danoTier = danoTier;
    }
}
