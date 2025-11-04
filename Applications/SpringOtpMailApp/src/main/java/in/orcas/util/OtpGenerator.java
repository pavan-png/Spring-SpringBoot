package in.orcas.util;

import java.security.SecureRandom;

public class OtpGenerator {

    // Generates a random 6-digit OTP using SecureRandom (better than Random)
    public static String generateOtp() {
        SecureRandom random = new SecureRandom();
        int otp = 100000 + random.nextInt(900000); // always 6 digits
        return String.valueOf(otp);
    }
}
