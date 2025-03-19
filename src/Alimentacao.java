public class Alimentacao extends Loja{


    //    ATRIBUTOS


    private Data dataAlvara;


    //    CONSTRUTOR

    public Alimentacao (String nome,
                       int quantidadeFuncionarios,
                       double salarioBaseFuncionario,
                       Endereco endereco,
                       Data dataFundacao,
                       Data dataAlvara,
                       int quantidadeProdutos) {

        super   (nome,
                quantidadeFuncionarios,
                salarioBaseFuncionario,
                endereco,
                dataFundacao,
                quantidadeProdutos);

        this.dataAlvara = dataAlvara;
    }


    //    GETTERS / SETTERS

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }


    //    toString


    @Override
    public String toString() {
        return super.toString() + "Data do alvará: " + dataAlvara;
    }
}