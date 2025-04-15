public class ClientePremium extends Cliente {
    private String serviziAggiuntivi;

    public ClientePremium(String nome, String cognome, String codiceCliente, String email, String serviziAggiuntivi) {
        super(nome, cognome, codiceCliente, email);
        this.serviziAggiuntivi = serviziAggiuntivi;
    }

    public String getServiziAggiuntivi() { return serviziAggiuntivi; }
    public void setServiziAggiuntivi(String serviziAggiuntivi) { this.serviziAggiuntivi = serviziAggiuntivi; }

    public void offriConsulenza() {
        System.out.println("Consulenza offerta al cliente premium.");
    }
}