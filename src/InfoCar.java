public class InfoCar {
    private int yearOfProduction;
    private String carModel;
    private String color;
    private int price;

    public InfoCar(int yearOfProduction,String carModel,String color,int price) {
        this.yearOfProduction = yearOfProduction;
        this.carModel=carModel;
        this.color=color;
        this.price=price;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "InfoCar{" +
                "yearOfProduction=" + yearOfProduction +
                ", carModel='" + carModel + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
