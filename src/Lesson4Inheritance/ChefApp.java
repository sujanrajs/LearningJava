package Lesson4Inheritance;

public class ChefApp {
    public static void main(String[] args) {
        Chef normalChef = new Chef();
        normalChef.makeChicken();
        normalChef.makeSalad();
        normalChef.makeSpecialDish();

        ChefItalian chefItalian = new ChefItalian();
        chefItalian.makeChicken();

        ChefChinese chefChinese = new ChefChinese();
        chefChinese.makesFriedRice();

        ChefInheritance chefInheritance = new ChefInheritance();
        chefInheritance.makeSalad();
        chefInheritance.myOwnDish();
        chefInheritance.makeSpecialDish();
    }
}
