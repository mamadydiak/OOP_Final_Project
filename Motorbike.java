public class Motorbike {

    private int price;
    private int totalPrice;
    private boolean abs;
    private boolean seatHeating;

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public boolean isSeatHeating() {
        return seatHeating;
    }

    public void setSeatHeating(boolean seatHeating) {
        this.seatHeating = seatHeating;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotalPrice() {
        totalPrice = price;
        if (abs) {
            totalPrice += 5000;
        }
        if (seatHeating) {
            totalPrice += 2000;
        }
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Motorbike(int price, int totalPrice, boolean abs, boolean seatHeating) {
        this.price = price;
        this.totalPrice = totalPrice;
        this.abs = abs;
        this.seatHeating = seatHeating;
    }

    public Motorbike() {
    }

}