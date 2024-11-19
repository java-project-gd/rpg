package rpg;

import rpg.buffs.Buff;
import rpg.classes.Druid;
import rpg.classes.Knight;
import rpg.classes.Paladin;
import rpg.classes.Sorcerer;
import rpg.personagem.Personagem;
import rpg.utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Personagem<?>> personagens = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Insira o nome do personagem (ou aperte 0 para sair):");
            String nome = scanner.nextLine();
            if (nome.equals("0")) {
                break;
            }

            System.out.println("Choose character class (1: Druid, 2: Knight, 3: Sorcerer, 4: Paladin):");
            int classChoice = scanner.nextInt();

            Personagem<?> personagem;
            switch (classChoice) {
                case 1:
                    personagem = new Druid();
                    break;
                case 2:
                    personagem = new Knight();
                    break;
                case 3:
                    personagem = new Sorcerer();
                    break;
                case 4:
                    personagem = new Paladin();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid class choice");
            }

            System.out.println("Escolha seu buff inicial: (1: ATAQUE, 2: DEFESA):");
            int buffChoice = scanner.nextInt();
            Buff buff;
            switch (buffChoice) {
                case 1:
                    buff = Buff.ATAQUE;
                    break;
                case 2:
                    buff = Buff.DEFESA;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid buff choice");
            }

            personagem.setNome(nome);
            personagem.setBuff(personagem.buffar(buff));
            personagem.imprimirPersonagem();

            personagens.add(personagem);

            scanner.nextLine(); // Consume the newline character
        }

        Utils.savePersonagensToJson(personagens);

    }

}