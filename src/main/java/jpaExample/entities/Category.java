package jpaExample.entities;

import javax.persistence.*;

@Entity
@Table(name = "Category")
public class Category {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "name")
    private String name;

    public int getCategoryId() {
        return id;
    }

    public void setCategoryId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        String res = "";
        return res + getCategoryId() + ", " + getName();

    }
}

