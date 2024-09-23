public class Main {
    public static void main(String[] args) {
        int ticketPrice = 5894;
        int rublesPerMil = 20;
        int mils = ticketPrice / rublesPerMil;

        if (ticketPrice < 20) {
            System.out.println("У Вас пока нет миль");
        } else {
            System.out.println("Вам начисленно " + mils + " миль");
        }
    }
}
