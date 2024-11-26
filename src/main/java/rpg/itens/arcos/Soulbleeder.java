package rpg.itens.arcos;

public class Soulbleeder extends Arco{
    private String tier;
    private int danoTier;

    public Soulbleeder(int danoBase, int alcance, String tier, int danoTier) {
        super(danoBase, alcance);
        this.tier = tier;
        this.danoTier = danoTier;
    }
}
