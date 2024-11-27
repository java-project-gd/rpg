package rpg.itens.bestas;

public class TheIronworker extends Besta {
    private String tier;
    private int danoTier;

    public TheIronworker(int danoBase, int alcance, String tier, int danoTier) {
        super(danoBase, alcance);
        this.tier = tier;
        this.danoTier = danoTier;
    }
}
