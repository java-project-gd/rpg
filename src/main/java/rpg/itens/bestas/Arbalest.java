package rpg.itens.bestas;

public class Arbalest extends Besta {
    private String tier;
    private int danoTier;

    public Arbalest(int danoBase, int alcance, String tier, int danoTier) {
        super(danoBase, alcance);
        this.tier = tier;
        this.danoTier = danoTier;
    }
}
