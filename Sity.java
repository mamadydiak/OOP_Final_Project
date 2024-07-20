public class Sity extends Car {

    public Sity() {
        super.setPrice(40000);
    }

    @Override
    public String toString() {
        int count = 0;

        String product = "Sity";
        if (super.isAbs() || super.isMusicSystem() || super.isAirBag() || super.isSunRoof()) {
            product += " with";
        }
        if (super.isAbs()) {
            product += " ABS";
            count++;
        }
        if (super.isMusicSystem()) {
            if (count > 0) {
                product += ", Music System";
            } else {
                product += " Music System";
            }
            count++;
        }
        if (super.isAirBag()) {
            if (count > 0) {
                product += ", Air Bag optional";
            } else {
                product += " Air Bag optional";
            }
            count++;
        }
        if (super.isSunRoof()) {
            if (count > 0) {
                product += ", SunRoof";
            } else {
                product += " SunRoof";
            }

        }
        product += " having a total price of " + super.getTotalPrice() + " TL\n";
        return product;
    }
}