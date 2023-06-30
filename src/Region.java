public class Region extends Paises {  //clase hija
   //variable propia de la clase hija
    String nombre_re;
 //constructor clase hija
    public Region(int cod_pais, String nom_pais, String nombre_re) {
        super(cod_pais, nom_pais);
        this.nombre_re=nombre_re;
    }
    //get y set
    public String getNombre_re() {
        return nombre_re;
    }

    public void setNombre_re(String nombre_re) {
        this.nombre_re = nombre_re;
    }
}
