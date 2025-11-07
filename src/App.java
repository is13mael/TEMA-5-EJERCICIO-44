public class App {
    public static void main(String[] args) throws Exception {
        try{
        System.out.print("Por favor, untrodzca un número entero positivo: ");
        long numeroInt = Long.parseLong(System.console().readLine());

        System.out.print("Introduzca la posición donde quiera insertar: ");
        long posicion = Long.parseLong(System.console().readLine());

        System.out.print("Introduzca el dígito que quiere insertar: ");
        long digito = Long.parseLong(System.console().readLine());

        long numeroOriginal = numeroInt;
        
        int longitud = 0;

        do{
            numeroOriginal /=10;
            longitud++;
        }while(numeroOriginal > 0);

        long Izquierda = numeroInt/(long)(Math.pow(10, longitud - posicion + 1));
        Izquierda = Izquierda * 10 +digito;

        long Derecha = numeroInt % (long)(Math.pow(10, longitud - posicion + 1));

        numeroOriginal = Izquierda * (long)(Math.pow(10, longitud - posicion + 1)) + Derecha;

        System.out.print("El número resultante es " + numeroOriginal);
    }catch(NumberFormatException e){
        System.out.println("Número mal introducido.");
    }catch(Exception e){
        System.out.println("Ha ocurrido un error inesperado.");
    }
}
}