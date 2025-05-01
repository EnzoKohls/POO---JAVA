    import java.util.Scanner;

    public class Mains {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String resposta = "";

            while (!resposta.equalsIgnoreCase("sair")) {
                System.out.println("Celia é de todos, Digite (verdade para encerrar): ");
                resposta = sc.nextLine();
                System.out.println("Todos os buracos são de todos ");
            }

            System.out.println("Programa encerrado, você triste é nossa felicidade.");
            sc.close();
        }
    }
