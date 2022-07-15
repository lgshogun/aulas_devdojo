package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 600000;

        if (salario <= 20384){
            System.out.println("Recebe a taxa de 36,65%");
        } else if (salario >= 20384 && salario <= 68507) {
            System.out.println("Recebe a taxa de 38,10%");
        } else {
            System.out.println("Recebe a taxa de 51,75%");

        }
    }
}
