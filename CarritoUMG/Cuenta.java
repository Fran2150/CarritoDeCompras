public class Cuenta
{
    public String Usuario = "Pan";
    public Banco tarjetas;
    public double saldo;
    
    public Cuenta(String Usuario, double saldo)
    {
     this.saldo = saldo;
     this.Usuario = Usuario;
    }
    public String registorT(String Pcvv){
        if(Pcvv.equals(Tarjeta.cvv)){
            System.out.println("Tiene un saldo de Q." + saldo);
        }
    }
}