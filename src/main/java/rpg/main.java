package rpg;

import rpg.classes.Druid;
import rpg.classes.Knight;
import rpg.classes.Paladin;
import rpg.classes.Sorcerer;
import rpg.personagem.Personagem;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     System.out.println("Enter character name:");
     String nome = scanner.nextLine();

     System.out.println("Enter character strength points:");
     int pontosDeForca = scanner.nextInt();

     System.out.println("Enter character defense points:");
     int pontosDeDefesa = scanner.nextInt();

     System.out.println("Enter character attack points:");
     int pontosDeAtaque = scanner.nextInt();

     System.out.println("Enter character buff points:");
     int buff = scanner.nextInt();

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

     personagem.setNome(nome);
     personagem.setPontosDeForca(pontosDeForca);
     personagem.setPontosDeDefesa(pontosDeDefesa);
     personagem.setPontosDeAtaque(pontosDeAtaque);
     personagem.setBuff(buff);

     System.out.println("Character created: " + personagem);

    }
}
