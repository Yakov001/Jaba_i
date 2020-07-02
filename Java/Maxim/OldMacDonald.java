public class OldMacDonald {
    public static void macDonald()
    {
        System.out.print("Old MacDonald had a farm, ");
        System.out.println("E-I-E-I-O");
    }
    public static void had(String name)
    {

        System.out.println( "And on his farm he had " + name + ", E-I-E-I-O" );
    }
    public static void with(String xxx, String yyy)
    {
        System.out.println( "With " + xxx + ", " + yyy + " here" );
        System.out.println( "And " + xxx + ", " + yyy + " there" );
        System.out.println( "Here " + xxx + ", there " + xxx );
        System.out.println( "Everywhere " + xxx + ", " + yyy );
    }
    public static void cowVerse()
    {
        macDonald();
        had("a cow");
        with( "a Moo", "Moo" );
        macDonald();
    }
    public static void pigVerse ()
    {
        macDonald();
        had( "a pig" );
        with( "an Oink", "Oink" );
        with( "a Moo", "Moo" );
        macDonald();
    }
    public static void main(String[] args)
    {
     cowVerse();
     pigVerse();
    }
}
