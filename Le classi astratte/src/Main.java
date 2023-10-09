
public class Main {
    public static void main(String[] args) {

        Rettangolo r = new Rettangolo(3,5);
        Triangolo t = new Triangolo(3,5);

        System.out.println("L'area del rettangolo è: " + r.calcolaArea());
        System.out.println("L'area del triangolo è: " + t.calcolaArea());


    }
}