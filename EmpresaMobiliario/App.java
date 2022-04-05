import elementos.ElementoA;
import elementos.ElementoB;
import elementos.ElementoCompuesto;

public class App {
    public static void main(String[] args) throws Exception {
        
        ElementoA elementoA = new ElementoA(736, 12.43);
        ElementoB elementoB = new ElementoB(234, 23.65);
        ElementoCompuesto allElementos = new ElementoCompuesto(elementoA, elementoB);
        System.out.println(String.format("El codigo del kit es %d", allElementos.getCodigo()));
        System.out.println(String.format("El precio del kit con un 10%% de descuento es de %.2f €", allElementos.getPrecio()));
    }
}
