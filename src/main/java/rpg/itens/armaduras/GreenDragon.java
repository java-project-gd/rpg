package rpg.itens.armaduras;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GreenDragon extends Armadura{
    private int defesa = 600;

    public GreenDragon(int defesa, String helmet, String chestplate, String leggings, String boots) {
        super(helmet, chestplate, leggings, boots);
        this.defesa = defesa;
    }
}
