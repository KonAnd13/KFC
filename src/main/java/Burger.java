public class Burger {
    String name;
    String description;
    String picture;
    String price;
    String weight;
    String calories;
    String protein;
    String fats;
    String carbohydrates;

    @Override
    public String toString() {
        return name + "\t" + price + " Ꝑ\n\n" + description + "\n\n" + weight + " Г   " + calories + " Ккал\nБ: " + protein + " г\tЖ: " + fats + " г\tУ: " + carbohydrates + " г\n\n";
    }
}
