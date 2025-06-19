//se crea una clase con dos atributos codig0 y canticdad final que no se puede modificar
//recuerda que para que un metodo se  abastacto necesita delcararse la clase como abstracta
public abstract class OrdenProduccion {
    private final String codigo;
    private final int cantidad;

    public OrdenProduccion(String codigo, int cantidad) {
        this.codigo = codigo;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }
    public int getCantidad() {
        return cantidad;
    }

    public abstract void mostrarResumen();
}