package io.spring.garrageApp.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Car {

    public enum Color{
        RED,
        BLUE,
        GREEN,
        YELLOW
    }

    public Car() {

    }

    @Id
    private Long id;
    private String model;

    private String brand;
    private double year;
    private  Color color;

    public Car(Long id,String model, String brand, double year, Color color) {
        super();
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.id=id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getYear() {
        return year;
    }

    public void setYear(double year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }
}
