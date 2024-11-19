package rpg.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import rpg.personagem.Personagem;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Utils {
    public static void savePersonagensToJson(List<Personagem<?>> personagens) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            File directory = new File("src/main/resources/personagensDB");
            if (!directory.exists()) {
                directory.mkdirs();
            }
            objectMapper.writeValue(new File(directory, "personagens.json"), personagens);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Personagem<?>> readPersonagensFromJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            File file = new File("src/main/resources/personagensDB/personagens.json");
            return objectMapper.readValue(file, new TypeReference<List<Personagem<?>>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}