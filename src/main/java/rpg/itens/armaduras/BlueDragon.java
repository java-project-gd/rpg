package rpg.itens.armaduras;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BlueDragon extends Armadura {
    private int defesa = 800;

    public BlueDragon(int defesa, String helmet, String chestplate, String leggings, String boots) {
        super(helmet, chestplate, leggings, boots);
        this.defesa = defesa;
    }

}
