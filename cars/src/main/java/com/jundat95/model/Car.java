package com.jundat95.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by tinhngo on 2/6/17.
 */
@Document(collection = "cars")
public class Car {

   private String id;
   private String make;
   private String model;
   private String description;

    public Car() {
    }

    public Car(String id, String make, String model, String description) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
