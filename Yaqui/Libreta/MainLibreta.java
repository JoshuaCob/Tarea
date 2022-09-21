package Libreta;
public class MainLibreta {
    public static void main(String args[]){
        Libreta milibreta = new Libreta();
        LibretaVector miotralibreta = new LibretaVector();
        //System.out.println(args[0]);
        System.out.println("antes "+ milibreta.getHoja(1).getContenido());
        milibreta.setContenidoHoja(1, "esta es la hoja 1 de mi libreta");
        System.out.println("despues " + milibreta.getHoja(1).toString());

        System.out.println("antes " + miotralibreta.getHoja(56).toString());
        milibreta.setContenidoHoja(56, "esta es la hoja 56 de mi otra libreta");
        System.out.print("despues " + miotralibreta.getHoja(56).toString()); 
        Hoja hoja = new Hoja(1, "Esta es la nueva hoja para la Libreta");
        for(int x=0; x<10; x++){
            if (milibreta.addHoja(hoja))
                System.out.println("la pude agregar");
            else 
                System.out.println("no la pude agregar");
        }
        hoja.setContenido("esta es la hoja final");
        miotralibreta.addHoja(hoja);
        System.out.print("despues " + miotralibreta.getHoja(100).toString());
    }
}



