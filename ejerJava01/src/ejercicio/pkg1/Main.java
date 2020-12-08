package ejercicio.pkg1;

public class Main {

    public static void main(String[] args) {
        //declaración e inicialización de CONSTANTES
        //Utilizar mayusculas para las CONSTANTES 
        //final double PI = 3.1415926536;
        //System.out.println("El valor de la CONSTANTE es: " + PI);

        //Instancia 1 - Creacion de Objeto
        DiaLaboral instancia1 = new DiaLaboral();
        System.out.println("EJERCICIO #1");
        instancia1.ejercicio();//Llamada del metodo de la clase
        System.out.println("TERMINA EL PROGRAMA #1");
        System.out.println("_________________________________");

        //instancia 2 - Creacion de Objeto
        HoraDeSuenio instancia2 = new HoraDeSuenio();
        System.out.println("EJERCICIO #2");
        instancia2.ejercicio2();//Llamada del metodo de la clase
        System.out.println("TERMINA EL PROGRAMA #2");
        System.out.println("_________________________________");

        //instancia 3 - Creacion de Objeto
        Calificaciones instancia3 = new Calificaciones();
        System.out.println("EJERCICIO #3");
        instancia3.ejercicio3();//Llamada del metodo de la clase
        System.out.println("TERMINA EL PROGRAMA #3");
        System.out.println("_________________________________");

        //instancia 4 - Creacion de Objeto
        OperacionesMatematicas instancia4 = new OperacionesMatematicas();
        System.out.println("EJERCICIO #4");
        instancia4.ejercicio4();//Llamada del metodo de la clase
        System.out.println("TERMINA EL PROGRAMA #4");
        System.out.println("_________________________________");

        //instancia 5 - Creacion de Objeto
        CalificacionesValidaMinusculas instancia5 = new CalificacionesValidaMinusculas();
        System.out.println("EJERCICIO #5");
        instancia5.ejercicio5();//Llamada del metodo de la clase
        System.out.println("TERMINA EL PROGRAMA #5");
        System.out.println("_________________________________");

    } //Final metodo main
}//Final de clase
