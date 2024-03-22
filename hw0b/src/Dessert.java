public class Dessert {
    int flavor, price;
    static int numDesserts;

    public Dessert(int flavor, int price) {
        this.flavor = flavor;
        this.price = price;
        Dessert.numDesserts += 1;
    }

    public void printDessert() {
        System.out.print(flavor + " " + price + " " + numDesserts);
    }

    public static void main(String[] args) {
        System.out.println("I love dessert!");
    }
}
