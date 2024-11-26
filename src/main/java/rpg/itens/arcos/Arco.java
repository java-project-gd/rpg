package rpg.itens.arcos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Arco {
    private int danoBase;
    private int alcance;

}
