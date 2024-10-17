package edu.penzgtu;

public class App 
{
    public static void main( String[] args )
    {
        // IPs for IPv6.isIPv6Adress
        final String CORRECT_IP = "2041:0000:140F:0000:0000:0000:875B:131B";
        final String INCORRECT_IP_1 = "0000:140F::875B:131B";
        final String INCORRECT_IP_2 = "192.168.0.102";
        final String INCORRECT_IP_3 = null;
        final String INCORRECT_IP_4 = "";

        // Tests
        System.out.println();
        System.out.println("Is " + CORRECT_IP + " correct IPv6 adress?\n" + IPv6.isIPv6Adress(CORRECT_IP) + "\n");
        System.out.println("Is " + INCORRECT_IP_1 + " correct IPv6 adress?\n" + IPv6.isIPv6Adress(INCORRECT_IP_1) + "\n");
        System.out.println("Is " + INCORRECT_IP_2 + " correct IPv6 adress?\n" + IPv6.isIPv6Adress(INCORRECT_IP_2) + "\n");
        System.out.println("Is " + INCORRECT_IP_3 + " correct IPv6 adress?\n" + IPv6.isIPv6Adress(INCORRECT_IP_3) + "\n");
        System.out.println("Is " + INCORRECT_IP_4 + " correct IPv6 adress?\n" + IPv6.isIPv6Adress(INCORRECT_IP_4) + "\n");
    }
}
