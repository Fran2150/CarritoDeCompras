public class Tarjeta {
    public final String numero;
    public final String cvv;
    public double saldo;
    public String registrarTarjeta;

    public  Tarjeta(String numero, String cvv, double SaldoT){
      if (SaldoT< 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
        }
        this.numero = numero;
        this.cvv = cvv;
        this.saldo = SaldoT;
        }
    public double saldo(){
        return saldo;
    }
    public String numero(){
        return numero;
    }
}
