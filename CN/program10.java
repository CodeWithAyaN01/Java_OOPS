import java.util.Random;
import java.util.Scanner;

class program10 {

    public static void main(String args[]) {

        int drop = 0, mini, nsec, p_remain = 0;
        int o_rate, b_size, i;
        int packet[];

        packet = new int[100];

        Scanner in = new Scanner(System.in);

        System.out.println("Enter bucket size:");
        b_size = in.nextInt();

        System.out.println("Enter the output rate:");
        o_rate = in.nextInt();

        System.out.println("Enter the number of seconds you want to simulate:");
        nsec = in.nextInt();

        Random rand = new Random();

        // Generate random packets for each second
        for (i = 0; i < nsec; i++)
            packet[i] = ((rand.nextInt(9) + 1) * 10);

        System.out.println("Seconds | packets received | packets sent | packets left | packets dropped");
        System.out.println("----------------------------------------------------------------------------");

        for (i = 0; i < nsec; i++) {

            p_remain += packet[i];  // Add incoming packets

            if (p_remain > b_size) {  // Overflow condition
                drop = p_remain - b_size;
                p_remain = b_size;
            }

            System.out.print((i + 1) + "\t\t");
            System.out.print(packet[i] + "\t\t");

            mini = Math.min(p_remain, o_rate);  // How many packets can be sent

            System.out.print(mini + "\t\t");

            p_remain = p_remain - mini;  // Remaining packets after sending

            System.out.print(p_remain + "\t\t");
            System.out.print(drop);

            System.out.println();

            drop = 0;  // Reset dropped count each second
        }

        // Clear remaining packets in bucket after time ends
        while (p_remain != 0) {

            if (p_remain > b_size) {
                drop = p_remain - b_size;
                p_remain = b_size;
            }

            mini = Math.min(p_remain, o_rate);

            System.out.print("\t\t" + p_remain + "\t\t" + mini);

            p_remain = p_remain - mini;

            System.out.println("\t\t" + p_remain + "\t\t" + drop);

            drop = 0;
        }
    }
}
