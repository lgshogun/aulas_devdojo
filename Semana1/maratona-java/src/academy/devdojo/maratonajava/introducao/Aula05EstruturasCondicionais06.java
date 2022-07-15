package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        byte diautil = 1;
        switch (diautil){
            case 1:
                System.out.println("Dom, dia nao util");
                break;
            case 2:
                System.out.println("Seg, dia util");
                break;
            case 3:
                System.out.println("Ter, dia util");
                break;
            case 4:
                System.out.println("Qua, dia util");
                break;
            case 5:
                System.out.println("Qui, dia util");
                break;
            case 6:
                System.out.println("Sex, dia util");
                break;
            case 7:
                System.out.println("Sab, dia nao util");
                break;
            default:
                System.out.println("Invalido");
                break;
        }
    }
}
