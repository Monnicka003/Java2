//Agrega fase desarollo como atributo tipo String y del super se jala el codigo y canttidad    ñmnbvewq1qw3e4r5t6y7u8i9o0p'`¡


public class OrdenPrototipo extends OrdenProduccion {
    private final String faseDesarrollo;

    public OrdenPrototipo(String codigo, int cantidad, String faseDesarrollo) {
        super(codigo, cantidad);
        this.faseDesarrollo = faseDesarrollo;
    }

    public String getFaseDesarrollo() {
        return faseDesarrollo;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("🧪 OrdenPrototipo - Código: " + getCodigo() +" - Cantidad: " + getCantidad() +  " - Fase: " + faseDesarrollo);
    }
}