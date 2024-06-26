package Modelos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Compras {
    protected String descricao;
    protected int valor;
    protected List<HashMap<String, Integer>> lista = new ArrayList();



    public void listaUpdate(String descricao, int valor, int limite) {
        HashMap<String, Integer> map = new HashMap<>();
        this.descricao = descricao;
        this.valor = valor;

        System.out.println("Compra realizada!");
        System.out.println("Seu novo limite é: " + limite);
        map.put(descricao, valor);
        lista.add(map);

    }

    public void informacao(int limite) {
                System.out.println(
                "************************************ \n" +
                        "COMPRAS REALIZADAS: \n");

        for (HashMap<String, Integer> item : lista) {
            for (String chave : item.keySet()) {
                System.out.println(chave + " - " + item.get(chave));
            };
        }

        System.out.println("************************************ \n" +
                "Saldo do Cartão: " + limite  + "\n"
        );

    }
}
