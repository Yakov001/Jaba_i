public class Literals04 {
    public static void main(String[] args) {
        int rank;
        String name;
        double qbr;
        String rankText = "Rank number ";
        String favText = " in my all -time favorite NFL QB list is ";
        String overallText = "His overall QB rating is ";
        String period = ".";

        rank = 1;
        name = "Steve Young";
        qbr = 96.8;
        System.out.println(rankText + rank + favText + name + period);
        System.out.println(overallText + qbr + period);
    }
}