import java.util.Arrays;

public class Shopping {


    //    ATRIBUTOS


    private String nome;
    private Endereco endereco;
    private Loja[] lojas;


    //    CONSTRUTOR


    public Shopping(String nome, Endereco endereco, int quantMaxLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantMaxLojas];
    }


    //    METODOS DE ACESSO


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }


    //    METODO insereLoja


    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }


    //    METODO removeLoja


    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            Loja loja = lojas[i];
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }


    //    METODO quantidadeLojasPorTipo


    public int quantidadeLojasPorTipo(String tipoLoja) {
        int count = 0;
        for (Loja loja : lojas) {
            if (loja != null) {
                switch (tipoLoja) {
                    case "Cosmético":
                        if (loja instanceof Cosmetico) {
                            count++;
                        }
                        break;

                    case "Vestuário":
                        if (loja instanceof Vestuario) {
                            count++;
                        }
                        break;

                    case "Bijuteria":
                        if (loja instanceof Bijuteria) {
                            count++;
                        }
                        break;

                    case "Alimentação":
                        if (loja instanceof Alimentacao) {
                            count++;
                        }
                        break;

                    case "Informática":
                        if (loja instanceof Informatica) {
                            count++;
                        }
                        break;
                    default:
                        return -1;
                }
            }
        }
        return count;
    }


    //    METODO lojaSeguroMaisCaro


    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaSeguroMaisCaro = null;
        double maiorSeguro = 0;

        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica lojaInformatica = (Informatica) loja;
                if (lojaInformatica.getSeguroEletronicos() > maiorSeguro) {
                    maiorSeguro = lojaInformatica.getSeguroEletronicos();
                    lojaSeguroMaisCaro = lojaInformatica;
                }
            }
        }
        return lojaSeguroMaisCaro;
    }


    //    toString


    @Override
    public String toString() {
        return  "\nNome do shopping: " + nome +
                "\nEndereço: " + endereco +
                "\nLojas: " + Arrays.toString(lojas);
    }
}