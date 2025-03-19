public class Vestuario extends Loja {


    //    ATRIBUTOS


    private boolean produtosImportados;


    //    CONSTRUTOR


    public Vestuario (String nome,
                      int quantidadeFuncionarios,
                      double salarioBaseFuncionario,
                      Endereco endereco,
                      Data dataFundacao,
                      boolean produtosImportados,
                      int quantidadeProdutos) {

        super   (nome,
                quantidadeFuncionarios,
                salarioBaseFuncionario,
                endereco,
                dataFundacao,
                quantidadeProdutos);

        this.produtosImportados = produtosImportados;
    }


    //    GETTERS / SETTERS


    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }


    //    toString
    @Override
    public String toString() {
        return super.toString() + "Produtos importados: " + produtosImportados;
    }
}