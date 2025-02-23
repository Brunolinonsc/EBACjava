

public class Carro {
    /**
     */
    private String marca;
    private int ano;
    private Double potencia;
    private String cor;
    private Double valor;


    public Carro(String marca, String cor, int ano, Double potencia, Double valor){
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.potencia = potencia;
        this.valor = valor;
    }
    /**
     * Método set
     * @return
     */
    public String setMarca(){
        return marca;
    }
    public int setAno(){
        return ano;
    }
    public Double setPotencia(){
        return potencia;
    }
    public String setCor(){
        return cor;
    }
    public Double setValor(){
        return valor;
    }
    /**
     * Métodos getters
     * @return
     */
    public String getMarca(){
        return marca;
    }
    public int getAno(){
        return ano;
    }
    public Double getPotencia(){
        return potencia;
    }
    public String getCor(){
        return cor;
    }
    public Double getValor(){
        return valor;
    }

}
