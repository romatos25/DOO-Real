public class verduras extends alimentos{

    private String cod_ver, organicas,no_organicas, nutrion;

    public verduras() {
    }

    public verduras(String nombre, int precio_unid, int cantidad, String cod_ver, String organicas,String no_organicas, String nutrion) {
        super(nombre, precio_unid, cantidad);
        this.cod_ver = cod_ver;
        this.organicas = organicas;
        this.nutrion = nutrion;
        this.no_organicas= no_organicas;

    }

    public String getCod_ver() {
        return cod_ver;
    }

    public void setCod_ver(String cod_ver) {
        this.cod_ver = cod_ver;
    }

    public String getOrganicas() {
        return organicas;
    }

    public void setOrganicas(String organicas) {
        this.organicas = organicas;
    }

    public String getNutrion() {
        return nutrion;
    }

    public void setNutrion(String nutrion) {
        this.nutrion = nutrion;
    }

    public String getNo_organicas() {
        return no_organicas;
    }

    public void setNo_organicas(String no_organicas) {
        this.no_organicas = no_organicas;
    }

    @Override
    public String toString() {
        return "verduras{" +
                "cod_ver='" + cod_ver + '\'' +
                ", organicas='" + organicas + '\'' +
                ", no_organicas='" + no_organicas + '\'' +
                ", nutrion='" + nutrion + '\'' +
                '}';
    }
}
