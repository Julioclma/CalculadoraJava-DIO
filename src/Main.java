public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        String[] alunos = {"Julio", "João", "Maria"};

        Double result = calculadora.media(alunos);

        System.out.println("Média = "+result);
    }
}