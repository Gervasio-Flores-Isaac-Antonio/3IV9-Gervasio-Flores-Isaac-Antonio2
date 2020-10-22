import java.util.Scanner;

public class CalculaArea {

    public static void main(String[] args) {

        calculaArea();
    }

    public static void calculaArea() {

        boolean status=true;
    do {
        Scanner s = new Scanner(System.in);
        
        
        System.out.println("CALCULA EL AREA DE UN TRIANGULO.  -> FORMULA ( B X A) / 2");
        
        System.out.println("Pon el numero de la Altura:");
        int a = s.nextInt();
        System.out.println("Pon el numero de la Base: ");
        int b = s.nextInt();
        System.out.println("Calculando .... ");
        
        float restemp = (a*b);
        float resultado = restemp / 2;
        System.out.println("El resultado es = " + resultado );
        System.out.println("---------------------------");
        System.out.println("Presiona la tecla ' s ' para salir");
        System.out.println("Presiona la tecla ' a ' para calcular area de un triangulo");
        String word=s.next();
        if(word.equals("s") || word.equals("S")){
            status=false;
        }
       
    } while (status);
        
    }//calculaArea
}//CLASE