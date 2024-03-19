package CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Itens> carrinhoCompras;

    public CarrinhoDeCompras(){
        this.carrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoCompras.add(new Itens(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        Iterator<Itens> iterator = carrinhoCompras.iterator();
        while (iterator.hasNext()){
            Itens item = iterator.next();
            if (item.getNome().equalsIgnoreCase(nome)){
                iterator.remove();
            }
        }
    }

    public double  calcularValorTotal(){
        double total = 0d;
        for (Itens item : carrinhoCompras){
            double valorTotal = item.getPreco() * item.getQuantidade();
            total += valorTotal;
        }

        return total;
    }

   // public Integer precoCarrinho(){return calcularValorTotal();

    public void  exibirCarrinho(){System.out.println(this.carrinhoCompras);}

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + carrinhoCompras +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Camisa", 50.30d, 2);
        carrinhoDeCompras.adicionarItem("short", 20.90d, 3);

        carrinhoDeCompras.exibirCarrinho();

        System.out.println("O preço total do carrinho é " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("short");

        carrinhoDeCompras.exibirCarrinho();

        System.out.println("O preço total do carrinho é " + carrinhoDeCompras.calcularValorTotal());



    }
}
