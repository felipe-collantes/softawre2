//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("pyepez","pyepez@correo.com");
        Usuario u2 = new Usuario("pipecolla","pipecolla@correo.com");
        Usuario u3 = new Usuario("nicolas08","nicolas08@correo.com");
        Usuario u4 = new Usuario("pauladelosrios","pauladelosrios@correo.com");
        System.out.println("Total de Usuarios: " + Usuario.getContadorUsuarios());


        System.out.println("--------------------------------------------");

        //--- Prueba Ejercicio SW3.2  ---
        // 1. Creamos 2 aplicaciones
        Aplicacion app1 = new Aplicacion("SistemaVentas" , "1.0");
        Aplicacion app2 = new Aplicacion("GestionInventario" , "2.1");
        // 2. PROBAMOS LOS METODOS INICIAR
        app1.iniciar();
        app2.iniciar();

        //IMPRIMIMOS  EL TOTAL DE APPS
        System.out.println("Total de aplicaciones:" + Aplicacion.getTotalAplicaciones());


        }
    }