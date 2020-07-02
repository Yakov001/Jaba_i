public class test2 {
    public static void main(String[] args) {
        int r = 0;
        String k ="aaa";
        test(r,k);
        k.replace("a", "b");
        System.out.println(r);
        System.out.println(k);
    }
    public static void test(int r, String k)
    {
        r+=1;
        k.toUpperCase();
    }

}
