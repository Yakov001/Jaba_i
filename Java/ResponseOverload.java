public class ResponseOverload {
    /* ****************** * the String version * *************** */


    /* ****************** * the boolean version * *************** */
    public static void response(boolean data) {

        System.out.println("The data is a boolean " + data + ".");
    }

    /* ****************** * the int version
     * *************** */
    public static void response(long data) {
        System.out.println("The data is an long " + data + ".");
    }

    /* ******************
     * the byte version
     * *************** */

    public static void response(double data) {
        System.out.println("The data is a double " + data + ".");
    }

    /* ****************** * the empty version * *************** */
    public static void response() {
        System.out.println("There is no data.");
    }

    /* ****************** * the main method
     * *************** */
    public static void main(String[] args) {
        String myString = "hello";
        int myInteger = 10;
        byte myByte = -0x80;
        double myDouble = -98.5;
        float myFloat = 99.9F;
        response(myInteger);
        response(myByte);
        response(myDouble);
        response(myFloat);
        response();
    }
}