public class Bijuteria extends Loja {


    //    ATRIBUTOS


    private double metaVendas;


    //    CONSTRUTOR


    public Bijuteria (String nome,
                     int quantidadeFuncionarios,
                     double salarioBaseFuncionario,
                     Endereco endereco,
                     Data dataFundacao,
                     double metaVendas,
                     int quantidadeProdutos) {

        super   (nome,
                quantidadeFuncionarios,
                salarioBaseFuncionario,
                endereco,
                dataFundacao,
                quantidadeProdutos);

        this.metaVendas = metaVendas;
    }


    //    GETTERS / SETTERS


    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }


    //    toString
    @Override
    public String toString() {
        return super.toString() + "Meta de Vendas: " + metaVendas;
    }
}