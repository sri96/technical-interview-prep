import java.util.Scanner;

import com.sun.tools.jdeprscan.scan.Scan; 

public class LicenseKeyFormattingSolution{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a license key:");
        String licenseKey = scanner.nextLine();
        System.out.println("Enter the group character length:");
        int groupCharLength = scanner.nextInt();
        System.out.println("Formatted License Key = " + LicenseKeyFormatting.formatLicenseKey(licenseKey, groupCharLength));
    }
}

public class LicenseKeyFormatting{

    public static String formatLicenseKey(String licenseKey, int groupCharLength){
        licenseKey = licenseKey.replaceAll("-", "").toUpperCase();
        StringBuilder sBuilder = new StringBuilder(licenseKey);

        int i = licenseKey.length() - groupCharLength;
        while (i > 0){
            sBuilder.insert(i, '-');
            i -= groupCharLength;
        }
        return sBuilder.toString();
    }
}