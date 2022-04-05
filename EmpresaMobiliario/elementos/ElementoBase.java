package elementos;

public class ElementoBase implements Elemento {
    public int codigo;
    public double precio;
    
    public ElementoBase(int codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public int getCodigo() {
        return codigo;
    }
}
