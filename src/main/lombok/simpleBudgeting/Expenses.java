package simpleBudgeting;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Expenses {
    float expensesAmount;
    String currancy;
    String category; // ez lehetne enumerátor
    String date;
}
