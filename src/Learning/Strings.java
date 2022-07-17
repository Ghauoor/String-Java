package Learning;

public class Strings {
    public static void main(String[] args) {
        /*
        String Pool
        Imu
        String foo = "Ghayoor";
        System.out.println(foo);
        foo = "Hussain";
        System.out.println(foo);
         */
        String foo = "Ghayoor";
        String bar = "Ghayoor";
        cop(foo,bar);
        System.out.println();
        comparison();
    }
    //Inside the string pool
    static void cop(String a, String b){
        System.out.println(a == b);
        System.out.println(a.equals(b));

    }
    //Outside of String pool
    static void comparison(){
        String a = new String("Ghayoor");
        String b = new String("Hussain");

        System.out.println(a == b);

    }
}
