package rpg.itens.arcos;

import lombok.Data;

@Data
public class CompositeHornbow extends Arco{
    private String tier;
    private int danoTier;

    public CompositeHornbow(int danoBase, int alcance, String tier, int danoTier) {
        super(danoBase, alcance);
        this.tier = tier;
        this.danoTier = danoTier;
    }


}
