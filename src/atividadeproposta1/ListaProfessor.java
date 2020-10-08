package atividadeproposta1;

import java.util.Random;
import java.util.Scanner;

public class ListaProfessor {
    static Scanner scanner = new Scanner(System.in);
    public Professor inicio;
    public Professor fim;
    public Professor aux;
    public Professor anterior;
    int tamanho;

    public ListaProfessor() {
        inicio = null;
        fim = null;
        aux = null;
        anterior = null;
        tamanho = 0;
    }

    void inserirElemento() {
        Professor novoProf = new Professor();

        System.out.print("\nNome do professor: ");
        novoProf.nome = scanner.nextLine();
        System.out.print("Email do professor: ");
        novoProf.email = scanner.nextLine();
        System.out.print("Telefone do professor: ");
        novoProf.telefone = scanner.nextLine();
        System.out.print("Matrícula do professor: ");
        novoProf.matricula = scanner.nextLine();

        if (inicio == null) {
            inicio = novoProf;
            fim = novoProf;
            novoProf.ant = null;
            novoProf.prox = null;
        } else {
            anterior = null;
            aux = inicio;

            while (aux != null && novoProf.nome.compareToIgnoreCase(aux.nome) > 0) {
                anterior = aux;
                aux = aux.prox;
            }

            if (anterior == null) {
                novoProf.prox = inicio;
                inicio = novoProf;
            } else if (aux == null) {
                fim.prox = novoProf;
                fim = novoProf;
                fim.prox = null;
            } else {
                anterior.prox = novoProf;
                novoProf.prox = aux;
            }
        }
        tamanho++;
    }

    void mostrarLista() {
        if (inicio == null) {
            System.out.printf("A lista não contém nenhum professor!");
            scanner.nextLine();
        } else {
            aux = inicio;
            while (aux != null) {
                System.out.printf("%s", aux.toString());
                aux = aux.prox;
            }
            scanner.nextLine();
        }
    }

    void retirarElemento() {
        if (inicio == null) {
            System.out.printf("A lista não contém nenhum professor!");
            scanner.nextLine();
        } else {
            aux = inicio;
            anterior = null;
            int achou = 0;

            System.out.print("Qual é o nome do professor?: ");
            String nome = scanner.nextLine();

            while (aux != null) {
                if (aux.nome.compareToIgnoreCase(nome) == 0) {
                    achou++;
                    if (aux == inicio) {
                        inicio = aux.prox;
                        aux = inicio;
                        tamanho--;
                    } else if (aux == fim) {
                        anterior.prox = null;
                        fim = anterior;
                        aux = null;
                        tamanho--;
                    } else {
                        anterior.prox = aux.prox;
                        aux.prox.ant = aux.ant;
                        aux = aux.prox;
                        tamanho--;
                    }
                } else {
                    anterior = aux;
                    aux = aux.prox;
                }
            }

            if (achou == 0) {
                System.out.printf("\nNenhum professor com nome %s foi encontrado na lista!\n",
                        nome);
            } else if (achou == 1) {
                System.out.printf("\nO professor %s foi encontrado na lista e removido!\n",
                        nome);
            } else {
                System.out.printf("\nO professor %s foi encontrado %d vezes na lista e " +
                        "removido!\n", nome, achou);
            }
            System.out.printf("\nNúmero de professores na Lista: %d\n", tamanho);
        }
    }

    void esvaziarLista() {
        if (inicio == null) {
            System.out.printf("A lista não contém nenhum professor!");
            scanner.nextLine();
        } else {
            inicio = null;
            fim = null;
            tamanho = 0;
        }
    }

    void buscarElemento() {
        System.out.printf("Qual o nome do professor?: ");
        String nome = scanner.nextLine();

        if (inicio == null) {
            System.out.printf("A lista não contém nenhum professor!");
            scanner.nextLine();
        } else {
            aux = inicio;
            while (aux != null) {
                if (nome.compareToIgnoreCase(aux.nome) == 0) {
                    System.out.printf("%s", aux.toString());
                    break;
                } else {
                    aux = aux.prox;
                }
            }
            if (aux == null) {
                System.out.printf("\nNão existe nenhum professor com o nome %s na lista\n", nome);
            }
            scanner.nextLine();
        }
    }
}
