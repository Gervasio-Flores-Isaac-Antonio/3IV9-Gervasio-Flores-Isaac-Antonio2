import java.util.Scanner;

public class CalculaRectangulo {

    public static void main(String[] args) {

        calculaArea();
    }

    public static void calculaArea() {

        boolean status=true;
    do {
        Scanner s = new Scanner(System.in);
        
        
        System.out.println("CALCULA EL AREA Y PERIMETRO DE UN RECTANGULO.");
        
        System.out.println("Pon el numero de la Altura:");
        int a = s.nextInt();
        System.out.println("Pon el numero de la Base: ");
        int b = s.nextInt();
        System.out.println("Calculando .... ");
        
        float area = (a*b);
        float perimetro = a+a+b+b;
        System.out.println("El resultado del area es = " + area +" u2");
        System.out.println("El resultado del perimetro es = " + perimetro );
        System.out.println("---------------------------");
        System.out.println("Presiona la tecla ' s ' para salir");
        System.out.println("Presiona la tecla ' a ' para calcular area y perimetro de un rectangulo");
        String word=s.next();
        if(word.equals("s") || word.equals("S")){
            status=false;
        }
       
    } while (status);
        
    }//calculaArea
}//CLASE