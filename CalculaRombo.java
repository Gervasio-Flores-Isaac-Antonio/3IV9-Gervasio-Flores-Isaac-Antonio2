import java.util.Scanner;

public class CalculaRombo {

    public static void main(String[] args) {

        calculaArea();
    }

    public static void calculaArea() {

        boolean status=true;
    do {
        Scanner s = new Scanner(System.in);
        
        
        System.out.println("CALCULA EL AREA Y PERIMETRO DE UN ROMBO.");
        
        System.out.println("Pon el numero de la diagonal mayor:");
        int D = s.nextInt();
        System.out.println("Pon el numero de la diagonal menor: ");
        int d = s.nextInt();
        System.out.println("Calculando .... ");
        
        float areat = d*D;
        float area = areat/2;
        float perimetro = D+d+D+d;
        System.out.println("El resultado del area es = " + area +" u2");
        System.out.println("El resultado del perimetro es = " + perimetro );
        System.out.println("---------------------------");
        System.out.println("Presiona la tecla ' s ' para salir");
        System.out.println("Presiona la tecla ' a ' para calcular area y perimetro de un rombo");
        String word=s.next();
        if(word.equals("s") || word.equals("S")){
            status=false;
        }
       
    } while (status);
        
    }//calculaArea
}//CLASE