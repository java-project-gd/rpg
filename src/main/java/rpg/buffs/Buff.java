package rpg.buffs;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Buff {
    ATAQUE(1),
    DEFESA(2);
    private final int value;

}
