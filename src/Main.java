import esercizio1.Rettangolo;
import esercizio2.Sim;
import esercizio2.SingleCall;

public class Main {
    public static void main(String[] args) {

        // -----esercizio1
        
        // Rettangolo rettangolo = new Rettangolo(10, 20);
        // System.out.println(rettangolo.area(rettangolo.getBase(),
        // rettangolo.getAltezza()));
        // System.out.println(rettangolo.perimetro(rettangolo.getBase(),
        // rettangolo.getAltezza()));
        // System.out.println(rettangolo.toString());
        // }



        // -----esercizio2
        Sim simDate = new Sim();
        simDate.setCalls(new SingleCall[] {
                new SingleCall("Mario", "3333513622", "00:30:00"),
                new SingleCall("francesco", "3333513622", "00:25:00"),
                new SingleCall("andrea", "3333513622", "00:50:15"),
                new SingleCall("genoveffo", "3333513622", "01:35:17"),
                new SingleCall("martina", "3333513622", "04:45:58"),
        });
        System.out.println(simDate.toString());

    }
}