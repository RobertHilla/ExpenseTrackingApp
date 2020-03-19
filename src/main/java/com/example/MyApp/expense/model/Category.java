package com.example.MyApp.expense.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;


import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@Table(name = "category")
public class Category {

    @Id
    private Long id;

    @NonNull
    private String name;

    public Long getId() {
        return id;
    }
}
