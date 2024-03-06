import esercizio1.Rettangolo;
public class Main {
    public static void main(String[] args) {
     Rettangolo  rettangolo = new Rettangolo(10, 20);
     System.out.println(rettangolo.area(rettangolo.getBase(), rettangolo.getAltezza()));
    System.out.println(rettangolo.perimetro(rettangolo.getBase(), rettangolo.getAltezza()));
    System.out.println(rettangolo.toString());
    }
}