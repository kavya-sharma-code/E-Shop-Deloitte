package com.thekavyasharma.eshop.rest.api.repository;

import com.thekavyasharma.eshop.rest.api.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
