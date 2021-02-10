package Units;

import lombok.Data;

@Data
public class Product {
    int id;
    String title;
    int cost;


    @Override
    public String toString() {
        return String.format("Product id = %s title - %s cost = %s %n", id,title,cost);
    }
}
