public class Usuario {

private int id;
private String username;
private String correo;
private boolean activo;
private static int contadorUsuarios = 0;
public static int getContadorUsuarios(){
    return contadorUsuarios;
}


public Usuario(String username, String correo ){
    contadorUsuarios++;
    this.id= contadorUsuarios;
    this.username = username;
    this.correo = correo;
    this.activo = true;
}
}

