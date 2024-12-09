public class Cameriere {
    private String nome;
    private boolean libero;

    public Cameriere(String nome, boolean libero) {
        this.nome=nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return nome;
    }

    public void setLibero(boolean libero){
        this.libero=libero;
    }
    public boolean getLibero(){
        return libero;
    }

    public String toString(){
        return String.format("nome cameriere:%s: libero: %s", nome, libero);
    }

}
