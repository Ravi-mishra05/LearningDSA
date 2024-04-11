package T1_Dailly_Questions_LC_2024.M4_April;

public class April9 {
    public static void main(String[] args) {
        int tickets[] = { 2, 3, 2 };
        System.out.println(timeRequiredToBuy(tickets, 2));
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        int i = 0;
        while (tickets[k] > 0) {
            if (tickets[i] > 0) {
                tickets[i]--;
                time++;
            }
            i++;
            if (i == tickets.length) {
                i = 0;
            }
        }
        return time;
    }
}
