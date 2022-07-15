package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        String[] nomes = new String[4];

        nomes[0] = "Erasmo";
        nomes[1] = "Lauro";
        nomes[2] = "Eva";
        nomes[3] = "Febem";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
