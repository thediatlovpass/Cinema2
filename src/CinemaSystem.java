public class CinemaSystem {
    public static void main(String[] args) {

        Movie movie1 = new Movie("Omen", "horror", 128, 16);
        Hall hall1 = new Hall(72, 72);
        Client client1 = new Client("Jan", "Kowalski", 16);
        CinemaService cinemaService1 = new CinemaService();
        cinemaService1.checkOrder(hall1,client1,movie1);
        Client client2 = new Client("Jan", "Kowalski", 16);
        cinemaService1.checkOrder(hall1,client2,movie1);
    }
}
