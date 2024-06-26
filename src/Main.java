import Modelos.Compras;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int status = 1;
        Compras compras = new Compras();

        System.out.println("Digite o limite do cartao:");
        int limite = scanner.nextInt();

        while (status != 0) {
            if (status == 1) {

                // Consumir a nova linha pendente
                scanner.nextLine();

                System.out.println("Digite a descricao do item");
                String descricao = scanner.nextLine();

                System.out.println("Digite o valor da compra");
                int valor = scanner.nextInt();
                    if (limite - valor < 0) {
                        System.out.println("\nSua compra excedeu o limite de seu cartão.");
                        compras.informacao(limite);
                    }
                    else {
                        limite-= valor;
                        compras.listaUpdate(descricao, valor, limite);
                    }


                System.out.println("Para continuar Digite 1, para cancelar digite 0");
                status = scanner.nextInt();
            } else {
                System.out.println("Comando desconhecido");
                System.out.println("Para continuar Digite 1, para cancelar digite 0");
                status = scanner.nextInt();
            }
            if (status == 0) {
                compras.informacao(limite);
            }
        }
    }
}