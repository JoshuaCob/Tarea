package Libreta;
public class Hoja{
    private static int n = 0; 
    private int num;
    private String contenido;
    public Hoja(int num){
        setNum(num);
        contenido = "algo";
    }
    public Hoja(int num, String contenido){
        setNum(num);
        this.contenido = contenido;
    }
    public String getContenido(){
        return contenido;
    }
    public void setContenido(String contenido){
        this.contenido = contenido;
    }
    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num = num;
    }
    public String toString(){
        return "Hoja Num: " + getNum() +"\t" + getContenido(); 
    }
}
