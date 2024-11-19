package rpg.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import rpg.personagem.Personagem;

import java.io.File;
import java.io.IOException;

public class Utils {
    public static void savePersonagemToJson(Personagem<?> personagem) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            File directory = new File("src/main/resources/personagens");
            if (!directory.exists()) {
                directory.mkdirs();
            }
            objectMapper.writeValue(new File(directory, personagem.getNome() + ".json"), personagem);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}