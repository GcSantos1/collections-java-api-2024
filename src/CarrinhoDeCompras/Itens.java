package CarrinhoDeCompras;

public class Itens {

    private String nome;
            double preco;
            int  quantidade;


    public Itens(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public String getNome(){
        return nome;
    }

    public double getPreco(){return preco;}

    public int getQuantidade(){return quantidade;}

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quant=" + quantidade +
                '}'
                ;}
};



