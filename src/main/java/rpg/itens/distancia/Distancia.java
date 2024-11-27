package rpg.itens.distancia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public  abstract class Distancia {
    private int danoBase;
    private int alcance;
}
