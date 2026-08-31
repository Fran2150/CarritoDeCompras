 import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Confirmar_Compra> lstDetalle;

    public Carrito() {
        this.lstDetalle = new ArrayList<>();
    }

    public List<Confirmar_Compra> getLstDetalle() {
        return lstDetalle;
    }

    public void setLstDetalle(List<Confirmar_Compra> lstDetalle) {
        this.lstDetalle = lstDetalle;
    }

        public boolean agregarCarrito(int intCantidad, Producto objproducto) {

        if (!objproducto.vercant(intCantidad)) {
            System.out.println("Sin Stock");
            return false;
        }

        lstDetalle.add(new Confirmar_Compra(objproducto, intCantidad));
        return true; 
    }
}
