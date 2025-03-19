public class Data {


    //    ATRIBUTOS


    private int dia;
    private int mes;
    private int ano;


    //    CONSTRUTOR


    public Data (int dia,
                int mes,
                int ano) {

        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;

        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }


    //    GETTERS / SETTERS


    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    //    METODO verificaAnoBissexto


    public boolean verificaAnoBissexto() {
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //    METODO validarData

    public boolean validarData(int dia, int mes, int ano) {
        if (dia <= 0 || dia >= 32 || mes < 1 || mes > 12) {
            return false;
        }
        if (mes == 2) {
            if (verificaAnoBissexto()) {
                return dia <= 29;
            } else {
                return dia <= 28;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return dia <= 30;
        } else {
            return dia <= 31;
        }
    }


    //    toString

    @Override
    public String toString() {
        return dia +"/"+ mes +"/"+ ano;
    }
}