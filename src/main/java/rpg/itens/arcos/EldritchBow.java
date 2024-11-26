package rpg.itens.arcos;

public class EldritchBow extends Arco{
    private String tier;
    private int danoTier;

    public EldritchBow(int danoBase, int alcance, String tier, int danoTier) {
        super(danoBase, alcance);
        this.tier = tier;
        this.danoTier = danoTier;
    }
}
