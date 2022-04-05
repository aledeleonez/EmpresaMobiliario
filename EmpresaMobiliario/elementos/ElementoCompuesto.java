package elementos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementoCompuesto extends ElementoBase {

    protected List<ElementoBase> kit = new ArrayList<>();

    public ElementoCompuesto(ElementoBase... elementos) {
        super(0, 0);
        añadir(elementos);
    }

    public void añadir(ElementoBase elemento){
        kit.add(elemento);
    }

    public void añadir(ElementoBase... elementos){
        kit.addAll(Arrays.asList(elementos));
    }

    public void borrar(ElementoBase elemento){
        kit.remove(elemento);
    }

    public void borrar(ElementoBase... elementos){
        kit.removeAll(Arrays.asList(elementos));
    }

    public double getPrecio(){
        if(kit.size() == 0){
            return 0;
        }
        
        double x = kit.get(0).getPrecio();
        for (ElementoBase elemento : kit) {
                x += elemento.getPrecio();
        }
        return x - x*0.10;
    }

    public int getCodigo(){
        return (int) Math.floor(Math.random()*100+1);
    }
    
}
