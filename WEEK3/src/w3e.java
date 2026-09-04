
public class w3e {
    public static void main(String[] args) {
        double x1= 5.00;
        double x2= 9.00;
        double y1= 4.00;
        double y2= 6.00;
        double dist= Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("Distance between ("+x1+","+y1+") and ("+x2+","+y2+") ");
        System.out.println("= "+dist);
    }
}
