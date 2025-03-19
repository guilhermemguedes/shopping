public class Informatica extends Loja {


    //    ATRIBUTOS


    private double seguroEletronicos;


    //    CONSTRUTOR


    public Informatica (String nome,
                       int quantidadeFuncionarios,
                       double salarioBaseFuncionario,
                       Endereco endereco,
                       Data dataFundacao,
                       double seguroEletronicos,
                       int quantidadeProdutos) {

        super   (nome,
                quantidadeFuncionarios,
                salarioBaseFuncionario,
                endereco,
                dataFundacao,
                quantidadeProdutos);

        this.seguroEletronicos = seguroEletronicos;
    }


    //    GETTERS / SETTERS


    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }


    //    toString


    @Override
    public String toString() {
        return super.toString() + "Seguro dos eletrônicos: R$" + seguroEletronicos;
    }
}