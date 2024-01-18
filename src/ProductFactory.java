public class ProductFactory {
    public static Product createProduct(String type) {
        if (type.equals("livro")) {
            return new livro();
        } else if (type.equals("camiseta")) {
            return new camiseta();
        } else if (type.equals("sapato")) {
            return new sapato();
        } else {
            throw new IllegalArgumentException("Tipo de produto inválido");
        }
    }
}
