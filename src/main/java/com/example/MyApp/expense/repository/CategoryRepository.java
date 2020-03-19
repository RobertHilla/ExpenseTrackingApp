package com.example.MyApp.expense.repository;

import com.example.MyApp.expense.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long > {

    Category findByName(String name);
}
