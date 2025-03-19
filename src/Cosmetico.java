public class Cosmetico extends Loja {


    //    ATRIBUTOS


    private double taxaComercializacao;


    //    CONSTRUTOR


    public Cosmetico (String nome,
                     int quantidadeFuncionarios,
                     double salarioBaseFuncionario,
                     Endereco endereco,
                     Data dataFundacao,
                     double taxaComercializacao,
                     int quantidadeProdutos) {

        super   (nome,
                quantidadeFuncionarios,
                salarioBaseFuncionario,
                endereco,
                dataFundacao,
                quantidadeProdutos);

        this.taxaComercializacao = taxaComercializacao;
    }


    //    GETTERS / SETTERS


    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }


    //    toString


    @Override
    public String toString() {
        return super.toString() + "\nTaxa de comercialização: " + taxaComercializacao;
    }
}