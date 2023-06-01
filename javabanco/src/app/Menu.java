package app;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a = true;

        do {

            System.out.printf(
                    "Selecione uma opção %n 1 - Inserir contato %n 2 - Deletar contato %n 3 - Encontrar contato por inicial %n 4 - Encontrar contato por id %n 5 - Alterar dados de contato %n S ou X para fechar o programa %n");

            String item = sc.nextLine();

            switch (item.toLowerCase()) {
                case "1":
                    new TesteDaoInsere();
                    break;
                case "2":
                    new TesteDaoDelete();
                    break;
                case "3":
                    new TesteDaoListaByInicial();
                    break;
                case "4":
                    new TesteDaoListaById();
                    break;
                case "5":
                    new TesteDaoUpdate();
                    break;
                case "x":
                    a = false;
                    break;
                case "s":
                    a = false;
                    break;
                default:
                    System.out.println("Insira uma opção valida");
                    break;
            }
        } while (a == true);
        sc.close();

    }

}