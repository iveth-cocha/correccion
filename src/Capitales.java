public class Capitales extends Provincia { //clase derivada2

    //variable propia de la clase derivada2
    String nombre_capital;

    //constructor clase derivada2
    public Capitales(int cod_pais, String nom_pais, String nombre_re, String nombre_pro ,String nombre_capital) {
        super(cod_pais, nom_pais, nombre_re, nombre_pro);
        this.nombre_capital=nombre_capital;
    }
    //get y set
    public String getNombre_capital() {
        return nombre_capital;
    }

    public void setNombre_capital(String nombre_capital) {
        this.nombre_capital = nombre_capital;
    }
}
