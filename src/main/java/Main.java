public class Main {
    public static void main(String[] args) {
        Burger chizburger = new Burger();
        chizburger.name = "Чизбургер";
        chizburger.description = "Пряный горчичный соус, кетчуп, сочные стрипсы в\n" +
                "оригинальной панировке, лук, сыр Чеддер, огурцы на\n" +
                "пшеничной булочке с кукурузной посыпкой.";
        chizburger.picture = "https://s82079.cdn.ngenix.net/9VW3RQfY33AnJi7Yu38nKiHc.png?dw=230";
        chizburger.price = "69";
        chizburger.weight = "167";
        chizburger.calories = "237";
        chizburger.protein = "13.2";
        chizburger.fats = "8.6";
        chizburger.carbohydrates = "26.6";

        System.out.println(chizburger);

        Burger longerBBQ = new Burger();
        longerBBQ.name = "Лонгер BBQ";
        longerBBQ.description = "Сочная курочка, маринованные огурчики, лук и аппетитный соус\n" +
                "барбекю! Спешите попробовать!";
        longerBBQ.picture = "https://s82079.cdn.ngenix.net/sRrSzWpf86c4hMMwCJ7aHBph.png?dw=230";
        longerBBQ.price = "50";
        longerBBQ.weight = "107";
        longerBBQ.calories = "236";
        longerBBQ.protein = "9.7";
        longerBBQ.fats = "7.1";
        longerBBQ.carbohydrates = "33.3";

        System.out.println(longerBBQ);
    }
}
