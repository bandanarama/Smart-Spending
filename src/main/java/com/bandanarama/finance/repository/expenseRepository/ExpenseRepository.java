package com.bandanarama.finance.repository.expenseRepository;

import com.bandanarama.finance.model.expenseModel.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
