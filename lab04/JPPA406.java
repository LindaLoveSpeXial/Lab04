package lab04;

public class JPA406 {
    public static void main(String[] args) {
        int[] parkingHours = {2, 3, 5, 8};
        
        for (int hours : parkingHours) {
            System.out.println("停車時數: " + hours + "小時\n應繳費用: " + calculateFee(hours) + "元整\n------------------");
        }
    }
    public static int calculateFee(int hours) {
        if (hours <= 2) {
            return hours * 30;
        } else if (hours <= 4) {
            return 60 + (hours - 2) * 50;
        } else if (hours <= 6) {
            return 160 + (hours - 4) * 80;
        } else {
            return 320 + (hours - 6) * 100;
        }
    }
}
