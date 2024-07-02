package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        //you will have to figure this one out
        //and you'll have to call getRows in here
        String str = "";
        for (int i = 1; i < numberOfRows; i++){
            str += getRow(i) + "\n";
        }
        return str;

    }

    public static String getRow(int numberOfStars) {
        String str = "";
        for (int i = 0; i < numberOfStars; i++){
            str += "*";
        }
        return str;
    }

    public static String getSmallTriangle() {

        return getTriangle(5);
    }

    public static String getLargeTriangle() {

        return getTriangle(10);
    }
}
