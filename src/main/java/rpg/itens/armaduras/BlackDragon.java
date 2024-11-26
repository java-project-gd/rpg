package rpg.itens.armaduras;

import lombok.Data;

@Data
public class BlackDragon extends Armadura {
    private int defesa = 1400;

    public BlackDragon(int defesa, String helmet, String chestplate, String leggings, String boots) {
        super(helmet, chestplate, leggings, boots);
        this.defesa = defesa;
    }

}
