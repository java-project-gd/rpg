package rpg.itens.bestas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Besta {
    private int danoBase;
    private int alcance;
}
