package com.bandanarama.finance.repository.expenseRepository;

import com.bandanarama.finance.model.expenseModel.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

    Category findByName(String name);
}
