public class Aplicacion {
    //ATRIBUTOS PRIVADOS (ENCAPSULAMIENTO)//
    private int id;
    private String nombre;
    private String version;
    private boolean ejecutando;
    //ATRIBUTO ESTATICO compartido por todas las aplicaciones
    private static int totalAplicaciones = 0; // CONTADOR  GLOBAL DE LAS APPS//
    //CONSTRUCTOR
    public Aplicacion(String nombre , String version) {
        totalAplicaciones++;
        this.id = totalAplicaciones;
        this.nombre = nombre;
        this.version = version;
        this.ejecutando = false;

    }
    //Comportamientos del objeto
    //metodo para ncender / iniciar aplicacion
    public void iniciar () {
        this.ejecutando = true;
        System.out.println("La aplicacion " + nombre + " se ha iniciado");

    }
    public void cerrar () {
        this.ejecutando = false;
        System.out.println("La aplicacion " + nombre + " se ha cerrado");

    }
    //METODO ESTATICO
    public static int getTotalAplicaciones(){
        return totalAplicaciones;
    }



}
