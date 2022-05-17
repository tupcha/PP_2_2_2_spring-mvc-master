package web.model;

public class Car {
    private String Model;
    private int series;
    private int hoursPower;


    public Car(String Model, int series, int hoursPower) {
        this.Model = Model;
        this.series = series;
        this.hoursPower = hoursPower;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getHoursPower() {
        return hoursPower;
    }

    public void setHoursPower(int hoursPower) {
        this.hoursPower = hoursPower;
    }
}
