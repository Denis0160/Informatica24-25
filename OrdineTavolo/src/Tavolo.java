public class Tavolo {

    /**
     * contatore per il numero del tavolo
     */
    private static int numeroCounter = 1;

    /**
     * numero del tavolo
     */
    private int numero;

    /**
     * numero di posti per tavolo
     */
    private int nPosti;

    /**
     * numero massimo di posti per tavolo
     */
    private  final int  nmax=6;

    /**
     * per stabilire se è libero o no
     */
    private boolean libero;

    /**
     * costruttore del tavolo
     * @param nPosti
     * @param libero
     * @throws Exception
     */
    public Tavolo( int nPosti, boolean libero)throws Exception{

        if(nPosti>nmax || nPosti < 0){
            throw new Exception("I posti massimi sono stati superati ");
        }else{
            this.nPosti=nPosti;
        }
        this.libero=libero;
        this.numero = numeroCounter++;
    }

    /**
     * metodo per modificare il numero dei posti
     * @param nPosti
     */
    public void setnPosti(int nPosti){
        this.nPosti=nPosti;
    }

    /**
     * metodo per avere il numero dei posti
     * @return numero posti
     */
    public int getnposti(){
        return nPosti;
    }

    /**
     * metodo per avere il numero del tavolo
     * @return numero del tavolo
     */
    public int getNumero(){
        return numero;
    }

    /**
     * metodo che modifica lo stato del tavolo
     * @param libero
     */
    public void setLibero(boolean libero){
        this.libero=libero;
    }

    /**
     * metodo get per vedere se il tavolo è libero
     * @return true se il tavolo è libero false se è occcupato
     */
    public boolean getLibero(){
        return libero;
    }

    /**
     * metodo per stampare i tavoli
     * @return Stringa formattata che stampa i dati del tavolo
     */
    @Override
    public String toString(){
        return String.format( "nPosti: %d  numero tavolo: %d   libero: %b",this.nPosti,this.numero,this.libero );
    }
}


