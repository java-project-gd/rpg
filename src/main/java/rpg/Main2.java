package rpg;

import rpg.personagem.Personagem;
import rpg.utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<Personagem> knightsList = new ArrayList<>();


        List<Personagem<?>> personagensFromDB = Utils.readPersonagensFromJson();
        assert personagensFromDB != null;
        personagensFromDB.stream()
                .filter(personagem -> personagem.getClasse().equals("Knight"))
                .collect(Collectors.toList());
//                .forEach(System.out::println);

    }
}
