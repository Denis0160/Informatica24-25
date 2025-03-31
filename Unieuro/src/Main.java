public class Main {
    public static void main(String[] args) {

        GestoreNegozio negozio = new GestoreNegozio("Marchesini shop");

        Smartphone smartphone1 = new Smartphone("123", "Samsung", 500, "Galaxy S20", 128);
        Pc pc1 = new Pc("123", "Asus", 800, "Intel i7", 512);

        try {
            negozio.aggiungiProdotto(smartphone1);
            negozio.aggiungiProdotto(pc1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        negozio.visualizza();
    }
}
