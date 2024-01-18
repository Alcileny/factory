public class Main {
    public static void main(String[] args) {
        // Criando produtos usando a ProductFactory
        Product livro = ProductFactory.createProduct("livro");
        Product camiseta = ProductFactory.createProduct("camiseta");
        Product sapato = ProductFactory.createProduct("sapato");

        // Exemplo de cálculo de preço e exibição
        System.out.println("Livro Preço: " + livro.getPreco());
        System.out.println("Camiseta Preço: " + camiseta.getPreco());
        System.out.println("Sapato Preço: " + sapato.getPreco());
    }
}
    
    
