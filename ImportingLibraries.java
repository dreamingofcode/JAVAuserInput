import java.security.MessageDigest;
import java.util.Scanner;
// import javax.xml.bind.DatatypeConverter;

public class ImportingLibraries{
    public static void main( String[] args) throws Exception{
        Scanner input= new Scanner( System.in);
        String pw;

        MessageDigest digest= MessageDigest.getInstance("SHA-256");

        System.out.print("Password: ");
        pw=input.nextLine();

        digest.update(pw.getBytes("UTF-8"));
        // hash= DatatypeConverter.printHexBinary( digest.digest());
        System.out.println( pw.getBytes("UTF-8") );
    }

}