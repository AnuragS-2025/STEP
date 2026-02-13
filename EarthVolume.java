import java.lang.Math;
public class EarthVolume {
    public static void main(String[] args) {
        double radius = 6378;
        double vol1= (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double vol2 = vol1 * 0.239913;
        System.out.print("The volume of earth in cubic kilometers is " + vol1);
        System.out.println(" and in cubic miles is " + vol2);
    }
}
