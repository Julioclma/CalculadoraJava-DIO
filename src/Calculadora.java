import java.util.Scanner;

public class Calculadora {
    private final Scanner keyboard = new Scanner(System.in);
    public Double media(String[] alunos) {

        Double total = 0.0;

        for (String aluno : alunos) {
            System.out.println("Insira a nota do " + aluno);
            total += keyboard.nextDouble();
        }

        return this.getMedia(total, alunos);
    }

    public Double getMedia(Double total, String[] alunosTarget) {
        return total / alunosTarget.length;
    }
}
