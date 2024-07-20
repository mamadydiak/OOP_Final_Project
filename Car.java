public class Car {
    private int price;
    private int totalPrice;
    private boolean airBag;
    private boolean musicSystem;
    private boolean abs;
    private boolean sunRoof;


    public boolean isAirBag() {
        return airBag;
    }

    public void setAirBag(boolean airBag) {
        this.airBag = airBag;
    }

    public boolean isMusicSystem() {
        return musicSystem;
    }

    public void setMusicSystem(boolean musicSystem) {
        this.musicSystem = musicSystem;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public boolean isSunRoof() {
        return sunRoof;
    }

    public void setSunRoof(boolean sunRoof) {
        this.sunRoof = sunRoof;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotalPrice() {
        totalPrice = price;
        if(abs)
            totalPrice += 5000;
        if(musicSystem)
            totalPrice += 1000;
        if(airBag)
            totalPrice += 3000;
        if(sunRoof)
            totalPrice += 2000;
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Car(int price, int totalPrice, boolean airBag, boolean musicSystem, boolean abs, boolean sunRoof) {
        this.price = price;
        this.totalPrice = totalPrice;
        this.airBag = airBag;
        this.musicSystem = musicSystem;
        this.abs = abs;
        this.sunRoof = sunRoof;
    }

    public Car() {
    }




}