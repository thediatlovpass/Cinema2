public class Hall {
    private int maxSeats;
    private int freeSeats;

    public Hall(int maxSeats, int freeSeats) {
        this.maxSeats = maxSeats;
        this.freeSeats = freeSeats;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public int getFreeSeats() {
        return freeSeats;
    }

    public void setFreeSeats(int freeSeats) {
        this.freeSeats = freeSeats;
    }

}
