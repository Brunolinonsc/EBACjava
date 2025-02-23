public class App {
    public static void main(String[] args) throws Exception {
/**
 * Método main para testar a classe
 * Aqui esta puxando os dados da classe Pessoa e da classe carro
 */
        Pessoa pessoa1 = new Pessoa("Bruno Lino", 28);
        Carro carro1 = new Carro("Fiat", "Branco", 2008, 1.0, 9.568);
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Cor: " + carro1.getCor());
        System.out.println("Ano: " + carro1.getAno());
        System.out.println("Potencia: " + carro1.getPotencia());
        System.out.println("O valor do caro é: " + carro1.getValor()) ;
    }
}
