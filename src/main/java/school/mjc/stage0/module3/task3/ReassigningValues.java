package school.mjc.stage0.module3.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        //Initialization three variables
        int first = 1;
        int second = 10;
        int third = 100;

        // Printing three variables
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        int linkToFirst = first;
        int linkToSecond = second;
        int linkToThird = third;

        first = 15;
        second = 6;
        third = 4;

        // Printing three variables
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        // Printing new three variables
        System.out.println(linkToFirst);
        System.out.println(linkToSecond);
        System.out.println(linkToThird);
    }
}
