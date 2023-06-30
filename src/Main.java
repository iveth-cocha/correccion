import javax.sound.midi.Soundbank;
import  java .util.ArrayList;



public class Main {
    public static void main(String[] args) {
        //creaccion de array
        ArrayList<Provincia> info = new ArrayList<Provincia>();

        //llenar array

        info.add(new Provincia(593, "Ecuador", "Insular", "Galapagos"));
        info.add(new Provincia(51, "Mexico", "Costa", "chiapas"));

        //Imprimir array

       for (int i=0; i<info.size();i++){
           System.out.println("Datos Provincia"+ info.get(i));
       }


    }
}