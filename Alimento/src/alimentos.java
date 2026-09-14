public class alimentos {

    private String nombre;
    private int precio_unid, cantidad;


    public alimentos() {
    }

    public alimentos(String nombre, int precio_unid, int cantidad) {
        this.nombre = nombre;
        this.precio_unid = precio_unid;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio_unid() {
        return precio_unid;
    }

    public void setPrecio_unid(int precio_unid) {
        this.precio_unid = precio_unid;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "alimentos{" +
                "nombre='" + nombre + '\'' +
                ", precio_unid=" + precio_unid +
                ", cantidad=" + cantidad +
                '}';
    }
}

