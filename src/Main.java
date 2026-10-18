//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("pyepez","pyepez@correo.com");
        Usuario u2 = new Usuario("pipecolla","pipecolla@correo.com");
        Usuario u3 = new Usuario("nicolas08","nicolas08@correo.com");
        Usuario u4 = new Usuario("pauladelosrios","pauladelosrios@correo.com");
        System.out.println("Total de Usuarios: " + Usuario.getContadorUsuarios());

        }
    }