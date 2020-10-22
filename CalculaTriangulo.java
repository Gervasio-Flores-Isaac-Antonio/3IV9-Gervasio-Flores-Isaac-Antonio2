import java.util.Scanner;

public class CalculaTriangulo {

    public static void main(String[] args) {

        calculaArea();
    }

    public static void calculaArea() {

        boolean status=true;
    do {
        Scanner s = new Scanner(System.in);
        
        
        System.out.println("CALCULA EL AREA Y PERIMETRO DE UN TRIANGULO.");
        
        System.out.println("Pon el numero de la Altura:");
        int h = s.nextInt();
        System.out.println("Pon el numero de la Base: ");
        int b = s.nextInt();
        System.out.println("Pon el numero de lado a: ");
        int a = s.nextInt();
        System.out.println("Pon el numero de lado b: ");
        int x = s.nextInt();
        System.out.println("Calculando .... ");
        
        float areat = (h*b);
        float area = areat/2;
        float perimetro = a+b+x;
        System.out.println("El resultado del area es = " + area +" u2");
        System.out.println("El resultado del perimetro es = " + perimetro );
        System.out.println("---------------------------");
        System.out.println("Presiona la tecla ' s ' para salir");
        System.out.println("Presiona la tecla ' a ' para hacer otro calculo de un triangulo");
        String word=s.next();
        if(word.equals("s") || word.equals("S")){
            status=false;
        }
       
    } while (status);
        
    }//calculaArea
}//CLASE