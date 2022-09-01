package com.example.Searchbyname.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Product_Data")
public class User {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    @Column(name = "price",nullable = true)
    private Double price;
    @Column(name = "brand", nullable = true)
    private String brand;
    @Column(name = "model", nullable = true)
    private String model;
    @Column(name = "performance", nullable = true)
    private String performance;
    @Column(name = "description", nullable = true)
    private String description;

}
