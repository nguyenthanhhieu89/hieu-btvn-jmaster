package Section11.Bai1;

public enum FoodMenu {
    CAFE(1, "Cafe") , MILK_TEA(2, "Milk Tea");

    private int id ;
    private String name;

    FoodMenu(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
