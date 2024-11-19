package rpg.buffs;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Buff {
    STRENGTH(1),
    DEFENSE(2),
    AGILITY(3),
    LUCK(4),
    MAGIC(5);

    private final int value;


}
