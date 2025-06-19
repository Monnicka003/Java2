//de la clase super se jala codigo y cantidad
public class OrdenMasa extends OrdenProduccion {
    //creamor el constructor
    public OrdenMasa(String codigo, int cantidad) {
        super(codigo, cantidad);
    }

    @Override
    public void mostrarResumen() {
        System.out.println("🔧 OrdenMasa - Código: " + getCodigo() + " - Cantidad: " + getCantidad());
    }
}