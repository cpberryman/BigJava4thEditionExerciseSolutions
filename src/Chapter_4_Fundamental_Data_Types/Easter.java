/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_4_Fundamental_Data_Types;

/**
 * Solution to exercise P4.19 
 * 
 * Computes the date of Easter Sunday in a given year.
 *
 * @author ChrisBerryman
 */
public class Easter {

    /**
     * Returns the month Easter Sunday is in.
     *
     * @param year the year
     * @return the month
     */
    public int getEasterSundayMonth(int year) {

        int y = year;

        double a = y % 19;
        int b = y / 100;
        double c = y % 100;
        int d = b / 4;
        double e = b % 4;
        int g = (8 * b + 13) / 25;
        double h = (19 * a + b - d - g + 15) % 30;
        int j = (int) c / 4;
        double k = c % 4;
        int m = (int) (a + 11 * h) / 319;
        double r = (2 * e + 2 * j - k - h + m + 32) % 7;
        int n = (int) (h - m + r + 90) / 25;
        double p = (h - m + r + n + 19) % 32;

        return n;

    }

    /**
     * Returns the day Easter Sunday is in.
     *
     * @param year the year
     * @return the day
     */
    public double getEasterSundayDay(int year) {

        int y = year;

        double a = y % 19;
        int b = y / 100;
        double c = y % 100;
        int d = b / 4;
        double e = b % 4;
        int g = (8 * b + 13) / 25;
        double h = (19 * a + b - d - g + 15) % 30;
        int j = (int) c / 4;
        double k = c % 4;
        int m = (int) (a + 11 * h) / 319;
        double r = (2 * e + 2 * j - k - h + m + 32) % 7;
        int n = (int) (h - m + r + 90) / 25;
        double p = (h - m + r + n + 19) % 32;

        return p;

    }
}
