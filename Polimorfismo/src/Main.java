// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Rettangolo rett = new Rettangolo(3,5);
        Triangolo triangolo = new Triangolo(3,5);


        System.out.println("L'area del rettangolo : " + rett.calcolaArea());

        System.out.println("L'area del triangolo : " + triangolo.calcolaArea());


    }
}