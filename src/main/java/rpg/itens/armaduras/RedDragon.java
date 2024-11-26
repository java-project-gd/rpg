package rpg.itens.armaduras;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RedDragon extends Armadura{
    private int defesa = 1000;

    public RedDragon(int defesa, String helmet, String chestplate, String leggings, String boots) {
        super(helmet, chestplate, leggings, boots);
        this.defesa = defesa;
    }
}
