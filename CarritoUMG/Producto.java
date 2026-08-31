public class Producto
{
    public String producto;
    public int cantidad;
    public double precio;
    public String codigo;
    public Producto(String producto, int cantidad, double precio, String codigo){
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.codigo = codigo;
    }
    public boolean vercant(int stock){
        return stock > 0 && this.cantidad >= stock;
    }
    public void verproducto(){
        System.out.println(producto + " " + precio + " " + cantidad);    
    }
} 