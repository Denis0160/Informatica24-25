public class Tavolo {
    private int numero;
    private int nPosti;
    private  final int  nmax=6;

    private boolean libero;

    public Tavolo(int numero, int nPosti, boolean libero)throws Exception{

        if(nPosti>nmax){
            throw new Exception("I posti massimi sono stati superati");
        }else{
            this.nPosti=nPosti;
        }
        this.numero=numero;
        this.libero=libero;
    }
    public void setnPosti(int nPosti){
        this.nPosti=nPosti;
    }


    public int getnposti(){
        return nPosti;
    }

    public void setNumero(int numero){
        this.numero=numero;
    }

    public int getNumero(){
        return numero;
    }

    public void setLibero(boolean libero){
        this.libero=libero;
    }

    public boolean getLibero(){
        return libero;
    }
}


