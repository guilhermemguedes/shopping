public class Produto {


    // ATRIBUTOS


    private String nome;
    private double preco;
    private Data dataValidade;


    //    CONSTRUTOR


    public Produto (String nome,
                    double preco,
                    Data dataValidade) {

        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;

    }


    //    GETTERS / SETTERS


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }


    //    METODO estaVencido


    public boolean estaVencido(Data dataAtual) {
        if (dataAtual.getAno() > dataValidade.getAno()) {
            return true;
        } else if (dataAtual.getAno() < dataValidade.getAno()) {
            return false;
        } else {
            if (dataAtual.getMes() > dataValidade.getMes()) {
                return true;
            } else if (dataAtual.getMes() < dataValidade.getMes()) {
                return false;
            } else {
                return dataAtual.getDia() > dataValidade.getDia();
            }
        }
    }


    //    toString


    @Override
    public String toString() {
        return "Produto: " + nome +
                "\nPreço: R$" + preco +
                "\nData de validade: " + dataValidade;
    }
}