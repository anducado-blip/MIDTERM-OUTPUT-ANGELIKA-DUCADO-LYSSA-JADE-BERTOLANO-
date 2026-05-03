// 1. INTERFACE
interface FoodInfo {
    void show();
}

// 2. BASE CLASS (Inheritance & Encapsulation)
class Food implements FoodInfo {
    private String name;      // Encapsulation
    private String type;
    private String nutrients;

    public Food(String name, String type, String nutrients) {
        this.name = name;
        this.type = type;
        this.nutrients = nutrients;
    }

    // Method from interface
    public void show() {
        System.out.println(name + " [" + type + "]: " + nutrients);
    }
}

// 3. SUBCLASSES (Inheritance)
class Veggie extends Food {
    public Veggie(String name, String nutrients) {
        super(name, "Vegetarian", nutrients);
    }
}

class Meat extends Food {
    public Meat(String name, String nutrients) {
        super(name, "Non-Vegetarian", nutrients);
    }
}

// MAIN CLASS
public class FoodClassifier {
    public static void main(String[] args) {

        Food[] foods = {
            new Veggie("Apple", "Fiber"),
            new Veggie("Spinach", "Iron"),
            new Meat("Chicken", "Protein"),
            new Meat("Beef", "Iron"),
            new Veggie("Carrot", "Vitamin A")
        };

        for (Food f : foods) {
            f.show();
        }
    }
}