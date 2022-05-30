package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int salario1 = 2000;
        int salario2 = 4000;
        int salarioTotal = salario1 + salario2;

        int devendo1 = 50;
        int devendo2 = 10000;

        boolean verSeTaDevendo = devendo1 > salarioTotal || devendo2 > salarioTotal && salarioTotal == 7000;

        double valorDoDevendo = 10000;

        valorDoDevendo+=valorDoDevendo;

        if (verSeTaDevendo == true) {
            System.out.println("Ta tudo ok");
        }else{
            System.out.println("Fudeukkkk");
        }

        System.out.println(verSeTaDevendo);

        System.out.println(valorDoDevendo);
    }
}
