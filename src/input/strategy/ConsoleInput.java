
package input.strategy;

import java.util.Scanner;

/**
 *
 * @author Andrew Gunn | amgunn1@hotmail.com
 */
public class ConsoleInput implements InputStrategy {

    Scanner keyboard = new Scanner(System.in);
    private String name;
    private double atten;
    
    private final String NAME_PROMPT = "Enter Venue Name:   ";
    private final String ATTEN_PROMPT = "Enter Attendance:  ";
    
    @Override
    public String getName() {
        System.out.println(NAME_PROMPT);
        name = keyboard.nextLine();
        return name;
    }

    @Override
    public double getAttendance() {
        System.out.println(ATTEN_PROMPT);
        atten = keyboard.nextDouble();
        return atten;
    }
}