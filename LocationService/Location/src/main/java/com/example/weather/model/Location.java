package com.example.weather.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    @Id @GeneratedValue
    int id;
    @NonNull
    /*Проблема в типе данных? */
      Double longitude;
    @NonNull
      Double latitude;
    @NonNull
     String name;
}