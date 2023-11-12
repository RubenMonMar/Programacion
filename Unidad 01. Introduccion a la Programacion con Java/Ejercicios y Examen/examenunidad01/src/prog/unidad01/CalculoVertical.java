package prog.unidad01;

public class CalculoVertical {
  
  // Creamos dos variables constantes para almacenar la aceleración de la gravedad y la equivalencia entre metros y pies
  public static final double ACELERACION_GRAVEDAD = 9.8;
  public static final double EQUIVALENCIA_METROS_PIES = 3.28;


  public static void main(String[] args) {

    /*
     * 1.- Crea una aplicación, llamada CalculoVertical, que calcula la altura máxima que alcanzará un objeto lanzado hacia arriba 
     * asi como el tiempo que emplea en alcanzar dicha altura.Para ello deberá solicitar por pantalla la velocidad a la que se lanza 
     * el objeto (velocidad inicial) y mostrar por pantalla tanto la altura máxima alcanzada como el tiempo que tarda en alcanzar dicha altura. 
     * Para adecuarlo a público anglosajón se desea que se muestre la altura máxima tanto en metros como en pies. En el caso de los pies la 
     * cantidad se debe mostrar de forma aproximada sin decimales.
    */
    
    // Nombre del Programa
    System.out.println("CÁLCULO DE LANZAMIENTO VERTICAL");
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
        
    // Solicitamos la velocidad inicial del objeto al despegar y creamos una variable para almacenar dicho dato
    System.out.print("Introduzca la velocidad inicial del objeto (en m/s): ");
    double velocidadInicial = Double.parseDouble(sc.nextLine());
    
    // Creamos tres variables para calcular y almacenar el tiempo, la altura máxima alcanzada en metros y la altura máxima en pies
    double tiempoAlcanzarAlturaMaxima = velocidadInicial / ACELERACION_GRAVEDAD;
    double alturaMaximaAlcanzada = (velocidadInicial * tiempoAlcanzarAlturaMaxima) 
        - ((ACELERACION_GRAVEDAD * tiempoAlcanzarAlturaMaxima * tiempoAlcanzarAlturaMaxima) / 2);
    int alturaMaximaEnPies = (int) (alturaMaximaAlcanzada * EQUIVALENCIA_METROS_PIES);
    
    // Mostramos por pantalla la altura en metros, la altura en pies y el tiempo necesario para alcanzar dicha altura
    System.out.println("La altura máxima en metros es de " + alturaMaximaAlcanzada);
    System.out.println("Esta altura equivale a " + alturaMaximaEnPies + " pies");
    System.out.println("El tiempo necesario es " + tiempoAlcanzarAlturaMaxima + " segundos");
    
    sc.close();
  }

}
