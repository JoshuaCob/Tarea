package Libreta;
enum Tipo{
    CUADROS, RAYAS, BLANCO;
}
public class Libreta{
    private String marca;
    private String portada;
    private Hoja hojas[];
    private int npag;
    private String tamanio;
    private Tipo tipo; //0 cuadros 1 rayas 2 blanco

    public Libreta(String marca, String portada, String tamanio, Tipo tipo){
        this.marca = marca.equals("")?"Scribe":marca;
        this.portada = portada.equals("")?"Scribe":portada;
        this.tamanio = tamanio.equals("")?"Profesional":tamanio;
        this.tipo = tipo;
        this.npag = 0;
        this.hojas = new Hoja[100];
        for(int i=0; i<100; i++){
            npag += 1;
            hojas[i]=new Hoja(npag);
        }
    }
    public Libreta(){
        this.marca = "Scribe";
        this.portada = "Scribe";
        this.tamanio = "Profesional";
        this.tipo = Tipo.RAYAS;
        this.npag=0;
        this.hojas = new Hoja[100];
        for(int i=0; i<98; i++){
            this.npag +=1;
            hojas[i]=new Hoja(npag);
        }
    }
    public Hoja getHoja(int num){
        if(num>0 && num<=100)
            return hojas[num-1];
        return hojas[0];
    }
    public void setContenidoHoja(int pos, String contenido){
        hojas[pos-1].setContenido(contenido);
    }
    public boolean addHoja(Hoja hoja){
        try{
            npag +=1;
            hojas[npag]= hoja;
            return true;
        }catch(ArrayIndexOutOfBoundsException arr){
            return false;
        }
    }    
}