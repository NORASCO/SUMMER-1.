

public class Project4

{
    public static void main(String[] args)

    {
        double newHeight, oldHeight, answer;// This is how we call variables in java languages//
        int expectedHeight; /* This is an interger data type */
        /**
         * we make initialization like this in java and always is very important to
         * initialize the variable
         **/
        newHeight = 20.3423D;
        oldHeight = 12.342D;
        expectedHeight = 20;
        final int BOX_CONSTANT = 200;// We decrare the fixed constant like this in JAVA//

        answer =   (newHeight * BOX_CONSTANT) / oldHeight + expectedHeight;

        System.out.printf("the volume of a container is: " + answer);// shound display answer//

    }

}