package rpg.itens.bestas;

public class UmbralMasterCrossbow extends Besta {
    private String tier;
    private int danoTier;

    public UmbralMasterCrossbow(int danoBase, int alcance, String tier, int danoTier) {
        super(danoBase, alcance);
        this.tier = tier;
        this.danoTier = danoTier;
    }
}
