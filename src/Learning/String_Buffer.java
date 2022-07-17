package Learning;

public class String_Buffer {
    public static void main(String[] args) {

        StringBuffer s = new StringBuffer();
        int p = s.length();
        System.out.println(p);

        int n = s.capacity();
        System.out.println(n);
        StringBuffer q = new StringBuffer("Naruto");


//        System.out.println(q.append(" Uzumaki"));
//        System.out.println(q.append(" "+1));

        System.out.println(q.reverse());
       // System.out.println(q.replace(3,4,"Ghayoor"));
    }
}
