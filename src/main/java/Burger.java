public class Burger {
    String id;
    String name;
    String description;
    String picture;
    int price;
    int weight;
    int calories;
    double protein;
    double fats;
    double carbohydrates;

    @Override
    public String toString() {
        return "Ссылка на " + name + ": " + id + "\n\n" + name + "\t" + price + " Ꝑ\n\n" + description + "\n\n" + weight + " Г   " + calories + " Ккал\nБ: " + protein + " г\tЖ: " + fats + " г\tУ: " + carbohydrates + " г\n\n";
    }
}
