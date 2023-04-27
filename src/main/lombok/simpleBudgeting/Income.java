package simpleBudgeting;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Income {
    float amount;
    String currency;
    String source;
    String date;
    boolean cash;
}
