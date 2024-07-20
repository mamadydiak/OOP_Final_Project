import java.util.ArrayList;
public class Inventory {

    private ArrayList<Car> cars = new ArrayList();
    private ArrayList<Motorbike> motorbikes = new ArrayList();

    void add(Car car) {
        cars.add(car);
    }

    void add(Motorbike mBike) {
        motorbikes.add(mBike);
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public ArrayList<Motorbike> getMotorbikes() {
        return motorbikes;
    }

    public void setMotorbikes(ArrayList<Motorbike> motorbikes) {
        this.motorbikes = motorbikes;
    }

    public Inventory() {
    }

    @Override
    public String toString() {
        int totalPrice = 0;
        StringBuilder product = new StringBuilder();
        for (Car car : cars) {
            product.append(car);
            totalPrice += car.getTotalPrice();
        }
        for (Motorbike motorbike : motorbikes) {
            product.append(motorbike);
            totalPrice += motorbike.getTotalPrice();
        }
        product.append("TOTAL : ").append(cars.size() + motorbikes.size()).append(" Vehicles including ");
        int count = 0;
        if (cars.size() > 0) {
            product.append(cars.size()).append(" Cars");
            count++;
        }
        if (motorbikes.size() > 0) {
            if (count > 0) {
                product.append(" and ");
            }
            product.append(motorbikes.size()).append(" Motorbikes");
        }
        product.append(" having a total price of ").append(totalPrice).append(" TL");
        return product.toString();
    }

}
