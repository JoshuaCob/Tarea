package Libreta;
import java.util.Vector;

public class LibretaVector {
        private String marca;
        private String portada;
        private Vector<Hoja> hojas;
        private String tamanio;
        private Tipo tipo; //0 cuadros 1 rayas 2 blanco
    
        public LibretaVector(String marca, String portada, String tamanio, Tipo tipo){
            this.marca = marca.equals("")?"Scribe":marca;
            this.portada = portada.equals("")?"Scribe":portada;
            this.tamanio = tamanio.equals("")?"Profesional":tamanio;
            this.tipo = tipo;
            hojas = new Vector<Hoja>();
            for(int i=1; i<=100; i++){
                System.out.println("Hojavector agregada");
                hojas.add(new Hoja(i));
            }
        }
        public LibretaVector(){
            this.marca = "Scribe";
            this.portada = "Scribe";
            this.tamanio = "Profesional";
            this.tipo = Tipo.RAYAS;
            this.hojas = new Vector<Hoja>();
            for(int i=1; i<=100; i++){
                hojas.add(new Hoja(i));
            }
        }
        public Hoja getHoja(int num){
            if (num > 0 && hojas.size()>=num)
                return hojas.get(num-1);
            return hojas.get(0);
        }
        public void setContenidoHoja(int pos, String contenido){
            hojas.get(pos-1).setContenido(contenido);
        }
        public boolean addHoja(Hoja hoja){
            System.out.print(hojas.size());
            int index = hojas.size();
            hoja.setNum(index+1);
            return hojas.add(hoja);
        }    
}
