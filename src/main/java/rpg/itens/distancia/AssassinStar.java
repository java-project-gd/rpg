package rpg.itens.distancia;

public class AssassinStar extends Distancia {
    private String tier;
    private int danoTier;

    public AssassinStar(int danoBase, int alcance, String tier, int danoTier) {
        super(danoBase, alcance);
        this.tier = tier;
        this.danoTier = danoTier;
    }
}
