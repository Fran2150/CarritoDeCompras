namespace Detalle.Logica;

public class Detalle
{
    public Producto objproducto { get; set; }
    public int intCantidad { get; set; }
    public Detalle(Producto objproducto, int intCantidad)
    {
        this.objproducto = objproducto;
        this.intCantidad = intCantidad;
    }
    public double calcularsubtotal()
    {
        if (objproducto == null) return 0.0;
        return objproducto.DBLPrecio * intCantidad;
    }
    public void mostrarDetalle()
    {
        double DBLSubtotal = calcularsubtotal();
        Console.WriteLine($"{objproducto.STRNombre}{DBLSubtotal}");
    }
}