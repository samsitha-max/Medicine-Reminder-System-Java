import java.time.LocalTime;
import java.util.Scanner;
import javax.swing.JOptionPane;

class MedicineReminder {

    void checkReminder() {

        LocalTime currentTime = LocalTime.now();

        LocalTime morningStart = LocalTime.of(9, 00);
        LocalTime morningEnd = LocalTime.of(9, 30);

        LocalTime nightStart = LocalTime.of(20, 30);
        LocalTime nightEnd = LocalTime.of(21, 0);

        System.out.println(" Current Time: " + currentTime);

        if(currentTime.isAfter(morningStart) && currentTime.isBefore(morningEnd)) {

            System.out.println("Morning Reminder");
            System.out.println("It's time to take your migraine medicine!");

            JOptionPane.showMessageDialog(null,
                    "Morning Reminder\n Time to take your migraine medicine!",
                    "Medicine Alert",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        else if(currentTime.isAfter(nightStart) && currentTime.isBefore(nightEnd)) {

            System.out.println("Night Reminder");
            System.out.println("It's time to take your migraine medicine!");

            JOptionPane.showMessageDialog(null,
                    " Night Reminder\n Time to take your migraine medicine!",
                    "Medicine Alert",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        else {
            System.out.println(" No medicine scheduled right now.");
        }
    }
}

public class ReminderSystem1{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MedicineReminder mr = new MedicineReminder();

        System.out.println(" Medicine Reminder System");

        System.out.print(" Do you have migraine? (yes/no): ");
        String answer = sc.nextLine();

        if(answer.equalsIgnoreCase("yes")) {
            System.out.println(" Reminder activated!");
            mr.checkReminder();
        }
        else {
            System.out.println("No reminder needed. Stay healthy!");
        }

        sc.close();
    }
}