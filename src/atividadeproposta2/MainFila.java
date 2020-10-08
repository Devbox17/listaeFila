package atividadeproposta2;

import java.util.Scanner;

public class MainFila {
    static Scanner scanner = new Scanner(System.in);

    static void menu() {
        Fila fila = new Fila();
        int op = 0;

        do {
            System.out.println("--------- Menu --------");
            System.out.println("| 1 - Retirar senha   |");
            System.out.println("| 2 - Atendimento     |");
            System.out.println("| 3 - Mostrar Fila    |");
            System.out.println("| 4 - Sair            |");
            System.out.print("Opção: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    fila.retirarSenha();
                    break;

                case 2:
                    fila.atenderCliente();
                    break;

                case 3:
                    fila.mostrar();
                    break;
            }
        } while (op != 4);
    }

    public static void main(String[] args) {
        menu();
    }
}
