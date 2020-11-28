package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];
        int itemSoFar = 0;
        int CheeseAm = 0, AppleAm = 0, CakeAm = 0;
        Cheese Ch = new Cheese();
        Cake Ca = new Cake(null);
        Apple Ap = new Apple(null);
        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Сыр")) {
                breakfast[itemSoFar] = new Cheese();
            } else if (parts[0].equals("Яблоко")) {
                breakfast[itemSoFar] = new Apple(parts[1]);
            }
            if (parts[0].equals("Пирожное")) {
                breakfast[itemSoFar] = new Cake(parts[1]);
            }
            itemSoFar++;
        }
        for (int i = 0; i < 20; i++) {
            if (breakfast[i] != null) {
                if (breakfast[i].equals(Ch)) {
                    CheeseAm++;
                } else if (breakfast[i].equals(Ap)) {
                    AppleAm++;
                } else if (breakfast[i].equals(Ca)) {
                    CakeAm++;
                }
            } else break;
        }
        System.out.println("Количество яблок " + AppleAm + ", количество сыра " + CheeseAm + ", количество пирожных " + CakeAm + ".");
        for (Food item : breakfast) {
            if (item != null) {
                item.consume();
            } else break;
        }
        System.out.println("Всего хорошего!");
    }
}
