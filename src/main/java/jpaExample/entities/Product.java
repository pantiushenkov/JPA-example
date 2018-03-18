package jpaExample.entities;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    private String name;
    private double quantityKG;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantityKG() {
        return quantityKG;
    }

    public void setQuantityKG(double quantityKG) {
        this.quantityKG = quantityKG;
    }
}
