package rpg.itens.armaduras;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Armadura {
    private String helmet;
    private String chestplate;
    private String leggings;
    private String boots;
}
