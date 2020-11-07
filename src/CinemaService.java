public class CinemaService {


    public void checkOrder(Hall hall, Client client, Movie movie) {
        if (checkSeats(hall)) ;
        else if (checkAge(client, movie)) ;
        else {
            makeOrder(hall, client, movie);
            printTicket(hall, client, movie);
        }
    }


    private boolean checkSeats(Hall hall) {
        if (hall.getFreeSeats() == 0) {
            System.out.println("Brak wolnych miejsc na seans");
            return true;
        } else {
            return false;
        }
    }

    private boolean checkAge(Client client, Movie movie) {
        if (client.getAge() < movie.getAgeRequired()) {
            System.out.println("Film dostępny dla osób powyżej " + movie.getAgeRequired() + " lat");
            return true;
        } else
            return false;
    }

    private void makeOrder(Hall hall, Client client, Movie movie) {
        client.setTicketId(client.getTicketId() + 1);
        client.setTicketPersonData(client.getFirstName() + " " + client.getLastName());
        movie.setTicketMovieTitle(movie.getMovieTitle());
        hall.setFreeSeats(hall.getFreeSeats() - 1);
    }

    private void printTicket(Hall hall, Client client, Movie movie) {
        System.out.println("Sprzedane bilety");
        if (client.getTicketId() != 0) {
            System.out.println(client.getTicketId() + " | " + client.getTicketPersonData()
                    + " | " + movie.getTicketMovieTitle() + " - " + movie.getMovieType()
                    + " - " + movie.getMovieTime() + "min");
        }

        System.out.println("Liczba pozostałych miejsc: " + hall.getFreeSeats());
        System.out.println("Liczba sprzedanych biletów: " + (hall.getMaxSeats() - hall.getFreeSeats()));
    }

}
