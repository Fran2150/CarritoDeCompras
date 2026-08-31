namespace Carrito.Logica
{
    public class Producto
    {
        public string STRCodigo { get; set; }
        public string STRNombre { get; set; }
        public double DBLPrecio { get; set; }
        public int intSTOCK { get; set; }
        public Producto(string strCodigo, string strNombre, double DBLPrecio, int intSTOCK)
        {
            this.STRCodigo = strCodigo;
            this.STRNombre = strNombre;
            this.DBLPrecio = DBLPrecio;
            this.intSTOCK = intSTOCK;
        }

        public Boolean verificarStock(int intCantidad)
        { 
            return intCantidad > 0 && this.intSTOCK >= intCantidad;
        }
        public void mostrarProducto()
        {
            Console.WriteLine($"{STRNombre}{intSTOCK}");
        }
    }
}