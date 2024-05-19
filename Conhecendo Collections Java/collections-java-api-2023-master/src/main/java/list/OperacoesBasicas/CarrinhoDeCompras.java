package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarrinhoDeCompras {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    // Adicionando itens ao carrinho
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
    carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

    // Exibindo os itens no carrinho
    carrinhoDeCompras.exibirItens();

    // Removendo um item do carrinho
    carrinhoDeCompras.removerItem("Lápis");

    // Exibindo os itens atualizados no carrinho
    carrinhoDeCompras.exibirItens();

    // Calculando e exibindo o valor total da compra
    System.out.println("O valor total da compra é = " + carrinhoDeCompras.calculcarValorTotal());
    }

    private List<Item> ItemList;

    public void adicionarItem(String nome, double preco,int quantidade) {
        ItemList.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome) {

        List<Item> itensPraRemover = new ArrayList<>();

        for (Item i: ItemList) {
            //pecorrendo toda a lista
            if (i.getnome().equalsIgnoreCase(nome)) {
                itensPraRemover.add(i);
            }
        }
        ItemList.remove(itensPraRemover);
    }

    public double calculcarValorTotal() {
        double valorTotal = 0d;

        if (!ItemList.isEmpty()) {
            for (Item item : ItemList) {
                double valorItem = item.getpreco() * item.getquantidade();
                valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
            }
            return valorTotal;     
        } 
        else {
        throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        if (!ItemList.isEmpty()) {
            System.out.println(this.ItemList);
          } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
    return "CarrinhoDeCompras{" +
        "itens=" + ItemList +
        '}';
    }
}
