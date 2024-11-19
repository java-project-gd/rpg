package rpg;

import rpg.buffs.Buff;
import rpg.classes.Druid;
import rpg.classes.Knight;
import rpg.classes.Paladin;
import rpg.classes.Sorcerer;
import rpg.personagem.Personagem;
import rpg.utils.Utils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        System.out.println("Escolha os atributos:");

        System.out.println("Nome:");
        String nome = scanner.nextLine();

        System.out.println("Pontos de forca:");
        int pontosDeForca = scanner.nextInt();

        System.out.println("Pontos de defesa:");
        int pontosDeDefesa = scanner.nextInt();

        System.out.println("Pontos de ataque:");
        int pontosDeAtaque = scanner.nextInt();

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
        personagem.setPontosDeForca(pontosDeForca);
        personagem.setPontosDeDefesa(pontosDeDefesa);
        personagem.setPontosDeAtaque(pontosDeAtaque);
        personagem.setBuff(buff);
        personagem.imprimirPersonagem();

        // Save character information to a JSON file
        Utils.savePersonagemToJson(personagem);
    }
}