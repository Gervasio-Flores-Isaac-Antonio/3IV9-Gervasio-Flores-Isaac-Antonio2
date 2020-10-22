import java.util.Scanner;

public class CalculaHexagono {

    public static void main(String[] args) {

        calculaArea();
    }

    public static void calculaArea() {

        boolean status=true;
    do {
        Scanner s = new Scanner(System.in);
        
        
        System.out.println("CALCULA EL AREA Y PERIMETRO DE UN HEXAGONO.");
        
        System.out.println("Pon el numero de un lado:");
        int l = s.nextInt();
        System.out.println("Pon el numero de la apotema:");
        int a = s.nextInt();
        

        float perimetro = l+l+l+l+l+l;
        float areat = (perimetro*a);
         float area = (areat)/2;
        System.out.println("El resultado del area es = " + area +" u2");
        System.out.println("El resultado del perimetro es = " + perimetro );
        System.out.println("---------------------------");
        System.out.println("Presiona la tecla ' s ' para salir");
        System.out.println("Presiona la tecla ' a ' para calcular area y perimetro de un hexagono");
        String word=s.next();
        if(word.equals("s") || word.equals("S")){
            status=false;
        }
       
    } while (status);
        
    }//calculaArea
}//CLASE