package com.example.productservicedb.Repositories;

import com.example.productservicedb.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    @Override
    Category save(Category category);
}
