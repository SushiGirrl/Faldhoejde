import java.util.Scanner;
public class Faldhoejde {
    public static void main(String[] args) {
        //kommentar
        System.out.println("Indtast hoejde");
        double hoejde, faldtid, g, sluthastighed;
        Scanner brugerinput = new Scanner(System.in);
        hoejde = brugerinput.nextInt();
        g = 9.80665;
        faldtid = Math.sqrt((2*hoejde)/g);
        sluthastighed = g*faldtid;
        System.out.print("Faldtiden er "+faldtid);
        System.out.print("\nSluthastigheden er "+sluthastighed);

    }
}