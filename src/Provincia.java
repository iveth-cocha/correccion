public class Provincia extends Region {// clase derivada1

    //variable propia de la clase derivada1
    String nombre_pro;

    //constructor clase derivada1
    public Provincia(int cod_pais, String nom_pais, String nombre_re, String nombre_pro) {
        super(cod_pais, nom_pais, nombre_re);
        this.nombre_pro=nombre_pro;
    }
    //get y set
    public String getNombre_pro() {
        return nombre_pro;
    }

    public void setNombre_pro(String nombre_pro) {
        this.nombre_pro = nombre_pro;
    }
}
