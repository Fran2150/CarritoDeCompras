using System;
using System.Collections.Generic;
namespace carrito.Logica 
public class Carrito
{
    public List<Detalle> lstDetalle { get; set; }
    //constructor
    public Carrito()
    {
        this.lstDetalle = new List<Detalle>();
    }
    public bool agregarCarrito(int intCantidad, Producto objproducto)
    {
        //Validacion
        if (!objproducto.verificarStock(intCantidad))
        {
            Console.WriteLine("Sin Stock");
            return false;
        }
        lstDetalle.Add(new Detalle(objproducto, intCantidad));
    }

}