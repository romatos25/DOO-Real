public class frutas extends alimentos{

    private String cod_frutas, pais, temporada;

    public frutas() {
    }

    public frutas(String nombre, int precio_unid, int cantidad, String cod_frutas, String pais, String temporada) {
        super(nombre, precio_unid, cantidad);
        this.cod_frutas = cod_frutas;
        this.pais = pais;
        this.temporada = temporada;
    }

    public String getCod_frutas() {
        return cod_frutas;
    }

    public void setCod_frutas(String cod_frutas) {
        this.cod_frutas = cod_frutas;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return "frutas{" +
                "cod_frutas='" + cod_frutas + '\'' +
                ", pais='" + pais + '\'' +
                ", temporada='" + temporada + '\'' +
                '}';
    }
}