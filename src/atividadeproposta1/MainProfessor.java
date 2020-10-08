package atividadeproposta1;

import java.util.Scanner;

public class MainProfessor {
    static Scanner scanner = new Scanner(System.in);

    static void menu() {
        ListaProfessor listaProfessor = new ListaProfessor();
        int op = 0;

        do {
            System.out.println("\n-----------------   Menu   -----------------");
            System.out.println("|   1 - Adicionar um professor no inicio   |");
            System.out.println("|   2 - Listar todos os professores        |");
            System.out.println("|   3 - Remover professor                  |");
            System.out.println("|   4 - Esvaziar lista de professores      |");
            System.out.println("|   5 - Buscar professor na lista          |");
            System.out.println("|   6 - Sair                               |");
            System.out.printf("Opção: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    listaProfessor.inserirElemento();
                    break;

                case 2:
                    listaProfessor.mostrarLista();
                    break;

                case 3:
                    listaProfessor.retirarElemento();
                    break;

                case 4:
                    listaProfessor.esvaziarLista();
                    break;

                case 5:
                    listaProfessor.buscarElemento();
                    break;
            }
        } while (op != 6);
    }

    public static void main(String[] args) {
        menu();
    }
}
