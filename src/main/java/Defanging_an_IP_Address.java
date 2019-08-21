/**
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 *
 * A defanged IP address replaces every period "." with "[.]".
 */

public class Defanging_an_IP_Address {

    public static void main(String[] args) {
        String address = "1.1.1.1";
        String address2 = "255.100.50.0";

        System.out.println(defangIPaddr(address));
        System.out.println(defangIPaddr(address2));
    }

    public static String defangIPaddr(String address) {
        String newaddress = address.replace(".", "[.]");
        return newaddress;
    }

}
