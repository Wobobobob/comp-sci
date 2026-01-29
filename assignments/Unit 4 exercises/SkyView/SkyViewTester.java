public class SkyViewTester {
    public static void main(String[] args) {
        double[] scanned1 = {0.3, 0.7, 0.5, 1.0, 0.2, 0.8};
        SkyView sky1 = new SkyView(2, 3, scanned1);
        System.out.println("SkyView 1:");
        System.out.println(sky1);
        double[] scanned2 = {0.3, 0.7, 0.5, 1.0, 0.2, 0.8};
        SkyView sky2 = new SkyView(2, 3, scanned2);
        System.out.println("SkyView 1 equals SkyView 2:");
        System.out.println(sky1.equals(sky2));
        double[] scanned3 = {0.3, 0.7, 0.5, 1.0, 0.9, 0.8};
        SkyView sky3 = new SkyView(2, 3, scanned3);
        System.out.println("SkyView 1 equals SkyView 3:");
        System.out.println(sky1.equals(sky3));
        double avg = sky1.getAverage(0, 1, 1, 2);
        System.out.println("Average (rows 0-1, cols 1-2):");
        System.out.println(avg);
    }
}
