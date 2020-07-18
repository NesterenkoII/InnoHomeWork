package ru.nesterenko.part01.lesson13.task01;

public class Child {

    private Boolean isLikeFood(Food food) {
        return food.getPreference();
    }

    public void eat(Food food) throws ChildDontLikeFoodException {
        if (isLikeFood(food)) {
            System.out.printf("<<Съел %s за обе щеки>>\n", food.name());
        } else {
            throw new ChildDontLikeFoodException("<<Капризничает>>");
        }
    }
}
