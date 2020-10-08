package atividadeproposta2;

public class Fila {
    Ficha inicio;
    Ficha fim;
    Ficha aux;
    int valorFicha = 1;
    int tamanho = 1;

    public Fila() {
        this.inicio = null;
        this.fim = null;
        this.aux = null;
    }

    void retirarSenha() {
        Ficha novaFicha = new Ficha();
        novaFicha.valor = valorFicha;
        novaFicha.prox = null;

        if (inicio == null) {
            inicio = novaFicha;
            fim = novaFicha;
            System.out.printf("\nA senha que você retirou é %d e você é o %d° da fila\n\n", valorFicha, tamanho);
            tamanho++;
        } else {
            fim.prox = novaFicha;
            fim = novaFicha;
            System.out.printf("\nA senha que você retirou é %d e você é o %d° da fila\n\n", valorFicha, tamanho);
            tamanho++;
        }
        valorFicha++;
    }

    void atenderCliente() {
        if (inicio == null) {
            System.out.printf("\nNão tem ninguém na fila!\n\n");
        } else {
            inicio = inicio.prox;
            System.out.printf("\nVocê é o próximo da fila!\n");
            System.out.println(".......");
            System.out.printf("Cliente foi Atendido!\n\n");
            tamanho--;
        }
    }

    void mostrar() {
        if (inicio == null)
            System.out.println("Não tem ninguém na fila!");
        else {
            aux = inicio;

            System.out.print("\nFila: |");
            while (aux != null) {
                System.out.printf(" %d |", aux.valor);
                aux = aux.prox;
            }
            System.out.println("\n");
        }
    }
}
