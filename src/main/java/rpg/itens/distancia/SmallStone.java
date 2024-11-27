package rpg.itens.distancia;

public class SmallStone extends Distancia {
    private String tier;
    private int danoTier;

    public SmallStone(int danoBase, int alcance, String tier, int danoTier) {
        super(danoBase, alcance);
        this.tier = tier;
        this.danoTier = danoTier;
    }
}
