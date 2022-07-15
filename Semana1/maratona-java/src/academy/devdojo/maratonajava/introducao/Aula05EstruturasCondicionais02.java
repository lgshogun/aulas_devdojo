package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {

    public static void main(String[] args) {
        String cabelo1 = "ruivo";
        String cabelo2 = "preto";

        boolean eCabeloRuivo = cabelo1 == cabelo2;

        if (eCabeloRuivo == true) {
            System.out.println("Seu cabelo me fascina");
        } else {
            System.out.println("Nao, mas tambem e bonito");
        }
    }

}
