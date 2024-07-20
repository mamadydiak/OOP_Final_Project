public class Scooter extends Motorbike {

    public Scooter() {
        super.setPrice(20000);
    }

    @Override
    public String toString() {
        int count = 0;

        String product = "Scooter";
        if (super.isAbs() || super.isSeatHeating()) {
            product += " with";
        }
        if (super.isAbs()) {
            product += " ABS";
            count++;
        }
        if (super.isSeatHeating()) {
            if (count > 0) {
                product += ", Seat Heating";
            } else {
                product += " Seat Heating";
            }

        }

        product += " having a total price of " + super.getTotalPrice() + " TL\n";
        return product;
    }
}