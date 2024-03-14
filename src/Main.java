
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numPaginas = numPag(sc);
        System.out.println(numPaginas);

        sc.close();

    }

    private static void escolhaServico(Scanner sc) {
        String servico = sc.nextLine();
        switch (servico.toUpperCase()) {
            case "DIG":
                System.out.println("DIG");
                break;
            case "ICO":
                System.out.println("ICO");
                break;
            case "IBO":
                System.out.println("IBO");
                break;
            case "FOT":
                System.out.println("FOT");
                break;
            default:
                System.out.println("Opção incorreta. Tente novamente");
                escolhaServico(sc);
        }
    }

    private static void listaServicos() {
        System.out.println("Seja bem vindo a loja do Matheus!");
        System.out.println("Escolha um de nossos serviços: ");
        System.out.println("Serviço de Digitalização (DIG) \n " +
                "Serviço de Impressão Colorida (ICO)\n" +
                "Serviço de Impressão Preto e Branco (IBO)\n" +
                "Serviço de Fotocópia (FOT)");

    }

    private static int numPag(Scanner sc) {
        System.out.println("Qual a quantidade de páginas desejadas?");
        int numPaginas = sc.nextInt();
        if (numPaginas > 20000) {
            System.out.println("Número de páginas excedido");
            return numPag(sc);
        }
        return numPaginas;
    }
}


