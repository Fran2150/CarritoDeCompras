

public class Usuario
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String contraseña;
    private final int intentos;
    
    public Usuario(String nombre, String contraseña){
        // initialise instance variables
        this.nombre = nombre;
        this.contraseña = contraseña;
        intentos = 0;
    }

    public boolean verificarUsuario(String Pcontraseña){
        if(Pcontraseña.equals(contraseña)){
            int intentos = 0;
            System.out.println(Cuenta);
            return true;
        }
        
    }

}