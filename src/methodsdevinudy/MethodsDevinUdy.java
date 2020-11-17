package methodsdevinudy;

//Objective: 
//  Write a main method to: 
//      Have user enter 3 integers, 
//      call triangleType method, 
//      display return type
import java.util.Arrays;

public class MethodsDevinUdy
{

    public static void main(String[] args)
    {

        String[] sides = new String[3];
        String answer, response;
        answer = "y";
        Keyboard kbd;
        kbd = new Keyboard();
        do
        {
//        Have user enter 3 integers
            System.out.println("Please submit a size for side A");
            sides[0] = kbd.readLine();
            System.out.println("Please submit a size for side B");
            sides[1] = kbd.readLine();
            System.out.println("Please submit a size for side C");
            sides[2] = kbd.readLine();

            Arrays.sort(sides);
            Arrays.toString(sides);
//        call and return triangleType method
            System.out.println("Triangle type " + triangleType(sides[0], sides[1], sides[2]));
            System.out.println("Do you want to submit different lengths? y/n");
            response = kbd.readLine();
        } while (answer.equals(response));
    }

    private static String triangleType(String sA, String sB, String sC)
    {
        String type;
        int a, b, c;
        a = Integer.parseInt(sA);
        b = Integer.parseInt(sB);
        c = Integer.parseInt(sC);
        if (a + b <= c)
        {
            System.out.println("INVALID TRIANGLE");
            type = "INVALID TRIANGLE";
        } else if (a == c)
        {
            System.out.println("EQUILATERAL");
            type = "EQUILATERAL";
        } else if (a == b || b == c)
        {
            System.out.println("ISOSCELES");
            type = "ISOSCELES";
        } else
        {
            System.out.println("SCALENE");
            type = "SCALENE";
        }

        return type;

    }

}
