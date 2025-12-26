import java.util.Scanner;

public class OtpGenerator {

    // Generate 6-digit OTP
    public static int generateOtp() {
        return (int) (Math.random() * 900000) + 100000;
    }

    // Check if array elements are unique
    public static boolean areUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        // Generate 10 OTP numbers
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOtp();
        }

        // Display generated OTPs
        System.out.println("Generated OTPs:");
        for (int i = 0; i < otpArray.length; i++) {
            System.out.println(otpArray[i]);
        }

        // Check uniqueness
        if (areUnique(otpArray)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are repeated.");
        }
    }
}
