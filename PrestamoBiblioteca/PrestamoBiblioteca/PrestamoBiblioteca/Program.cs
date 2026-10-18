using System.ComponentModel.Design;
using PrestamoBiblioteca.aplicacion;
using prestamo biblioteca.persistencia;
namespace PrestamoBiblioteca;

internal static class  program
{private static void main()
    {
        try
        {
            var iniciar = new inicializarbasededatos();
            iniciar.iniciar();
            var REPO = new repositoriobiblioteca(iniciar.cadenaconexion);
            new MenuCommand biblioteca(REPO).ejecutar();
        }
        catch (Exception ex)
        {
            Console.WriteLine($"no se puede iniciar{ex.iostring()}");
        }

    
}