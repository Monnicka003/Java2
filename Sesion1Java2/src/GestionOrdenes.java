import java.util.*;
public class GestionOrdenes {
    //se crea un metodo tipo lista generico que puede extender de clases de orden produccuon y mas pequeñas

    public static void mostrarOrdenes(List<? extends OrdenProduccion> lista) {
        System.out.println("ordenes registradas");

        for (OrdenProduccion ordenProduc : lista) {
            ordenProduc.mostrarResumen();

        }
    }

    public static void ProcesarPersonalizadas(List<? super OrdenPersonalizada> Lista) {
        System.out.println("Procesando ordenes personalizadas...");
        for (Object obj : Lista) {
            if (obj instanceof OrdenPersonalizada) {
                OrdenPersonalizada op = (OrdenPersonalizada) obj;
                System.out.println("orden" + op.getCodigo());
            }
        }
    }

    public static void main(String[] args) {
        List<OrdenProduccion> todasLasOrdenes = new ArrayList<>();
        //Se agregan al arreglo todas las listas con datos

        List<OrdenMasa> masas = Arrays.asList(new OrdenMasa("AFO", 800), new OrdenMasa("AFO", 700));

        List<OrdenPersonalizada> listaPersonalizada = Arrays.asList(new OrdenPersonalizada("OrdenPer001", 100, "Pamela Gomez"), new OrdenPersonalizada("OrdernPer002", 500, "Daniel Perez"));

        List<OrdenPrototipo> listaPrototipo = Arrays.asList(new OrdenPrototipo("OrdenPro001", 300, "prueba"), new OrdenPrototipo("OrdenPro002", 400, "prueba2"));


        todasLasOrdenes.addAll(masas);
        todasLasOrdenes.addAll(listaPersonalizada);
        todasLasOrdenes.addAll(listaPrototipo);
        //MOSTRAR ORDENES POR TIPO
        mostrarOrdenes(masas);
        mostrarOrdenes(listaPersonalizada);
        mostrarOrdenes(listaPrototipo);

        /*System.out.println("Resumen del total de ordenes**");
        System.out.println("Resumen del total de ordenes**" + masas);
        System.out.println("Resumen del total de ordenes**" + listaPersonalizada);
        System.out.println("Resumen del total de ordenes**" + listaPrototipo);
*/
    }
}





/*
        // Mostrar órdenes por tipo
        mostrarOrdenes(masas);
        mostrarOrdenes(personalizadas);
        mostrarOrdenes(prototipos);

        // Procesar órdenes personalizadas
        procesarPersonalizadas(personalizadas, 200);

        // 🚀 Código de desafío opcional: contar órdenes por tipo
        contarOrdenes(todasLasOrdenes);
        // 🚀 Código de desafío opcional: contar órdenes por tipo
        public static void contarOrdenes(List<? extends OrdenProduccion> lista) {
            long masas = lista.stream().filter(o -> o instanceof OrdenMasa).count();
            long personalizadas = lista.stream().filter(o -> o instanceof OrdenPersonalizada).count();
            long prototipos = lista.stream().filter(o -> o instanceof OrdenPrototipo).count();

            System.out.println("\n📊 Resumen total de órdenes:");
            System.out.println("🔧 Producción en masa: " + masas);
            System.out.println("🛠️ Personalizadas: " + personalizadas);
            System.out.println("🧪 Prototipos: " + prototipos);
        }
    }
}*/