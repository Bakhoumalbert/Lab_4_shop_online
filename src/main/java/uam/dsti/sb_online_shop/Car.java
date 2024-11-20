package uam.dsti.sb_online_shop;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String brand;
    private String model;
    private String color;
    private String registerNumber;

    @Column(name = "annee")
    private int year;

    private double price;

    @ManyToMany(mappedBy = "cars", fetch = FetchType.LAZY)
    private Set<Owner> owners = new HashSet<>();

    // Constructeur par défaut
    public Car() {}

    public Set<Owner> getOwners() {
        return owners;
    }
    public void setOwners(Set<Owner> owners) {
        this.owners = owners;
    }
    // Constructeur avec paramètres
    public Car(String brand, String model, String color, String registerNumber, int year, double price, Set<Owner> owners) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registerNumber = registerNumber;
        this.year = year;
        this.price = price;
        this.owners = owners; // Correction du nom de la variable
    }

    // Getters et setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
