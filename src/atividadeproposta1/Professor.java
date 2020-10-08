package atividadeproposta1;

public class Professor {
    String nome;
    String email;
    String telefone;
    String matricula;
    Professor ant;
    Professor prox;

    public Professor() {
        nome = "";
        email = "";
        telefone = "";
        matricula = "";
        ant = null;
        prox = null;
    }

    @Override
    public String toString() {
        return "\n\nNome = " + nome + "\nEmail = " + email + "\nTelefone = " + telefone +
                "\nMatricula = " + matricula;
    }
}
