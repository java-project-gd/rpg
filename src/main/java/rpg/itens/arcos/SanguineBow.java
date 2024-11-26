package rpg.itens.arcos;

public class SanguineBow extends Arco{
    private String tier;
    private int danoTier;

    public SanguineBow(int danoBase, int alcance, String tier, int danoTier) {
        super(danoBase, alcance);
        this.tier = tier;
        this.danoTier = danoTier;
    }
}
