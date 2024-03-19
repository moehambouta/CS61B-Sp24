public class Main {
    /* *
     * Prints out the following:
     * *
     * **
     * ***
     * ****
     * *****
     * */
    public static void starTriangle() {
        for (int i = 0; i < 5; i++) {
            String s = "*";
            for (int j = 0; j < i; j++) {
                s += "*";
            };
            System.out.println(s);
        };
    };

    /* *
    * Prints out the following:
    * 24 1
    * 22 2
    * 19 3
    * 15 4
    * 10 5
    *
    * The takeaway here is that the number
    * of loop iterations changes after each
    * one due to the var total changing.
    * */
    public static void numberTotal() {
        int total = 25;
        for (int number = 1; number <= (total / 2); number++) {
            total = total - number;
            System.out.println(total + " " + number);
        };
    };

    /* *
    * For each char in a given string, prints out the char
    * as well as the index of the char if the string was reversed
    *
    * @param s the text that will be used for computation
    * */
    public static void printIndexed(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            System.out.print(s.length() - 1 - i);
        };
        System.out.println(" ");
    };

    /* *
    * Returns the quadrant enclosing the given coordinates.
    *
    * @param    x   x-axis coordinate
    * @param    y   y-axis coordinate
    * @return       the quadrant val
    * */
   public static int quadrant(double x, double y) {
       int result = 1;

       if (x == 0 || y == 0) {
           result = 0;
       } else if (x < 0 && y > 0) {
           result = 2;
       } else if (x < 0 && y < 0) {
           result = 3;
       } else if (x > 0 && y < 0) {
           result = 4;
       };

       return result;
   };

    public static void main(String[] args) {
        starTriangle();
        numberTotal();
        printIndexed("ZELDA");

        System.out.println(quadrant(12.4, 17.8));
        System.out.println(quadrant(-2.3, 3.5));
        System.out.println(quadrant(-15.2, -3.1));
        System.out.println(quadrant(4.5, -4.5));
        System.out.println(quadrant(0, 0));
        System.out.println(quadrant(12.5, 0));
        System.out.println(quadrant(0, 2.3));
    };
};
