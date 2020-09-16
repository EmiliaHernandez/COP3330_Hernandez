import java.util.Scanner;

public class Encrypter
{
    private static String encrypt(String aboutToBeEncrypted)
    {
        int i = Integer.parseInt(aboutToBeEncrypted);//this makes it an integer

        int lastDigit = i % 10;       //get the last digit
        int remainingNumber = i / 10; // tacks off the last digit
        int tempLast = (lastDigit + 7) % 10;//operation for encryption first step

        int newLastDigit = (remainingNumber % 10);
        int newRemainingNumber = remainingNumber /10;
        int tempThird = (newLastDigit + 7) % 10;

        int revampedLastDigit = (newRemainingNumber % 10);
        int revampedRemainingNumber = newRemainingNumber /10;
        int tempSecond = (newRemainingNumber + 7) % 10;

        int finalLastDigit = (revampedRemainingNumber % 10);
        int finalRemainingNumber = revampedRemainingNumber /10;
        int tempFirst = (revampedRemainingNumber + 7) % 10;


//changing my integers to strings
        String fourthVal = String.valueOf(tempLast);
        String thirdVal = String.valueOf(tempThird);
        String secondVal = String.valueOf(tempSecond);
        String firstVal = String.valueOf(tempFirst);

        String encrypted = "";
        encrypted = encrypted.concat(thirdVal);
        encrypted = encrypted.concat(fourthVal);
        encrypted = encrypted.concat(firstVal);
        encrypted = encrypted.concat(secondVal);

        return encrypted;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numbers to encrypt");
        String numToEncrypt = input.nextLine();

        //System.out.println(numToEncrypt);

        String encryptedValue = Encrypter.encrypt(numToEncrypt);

        System.out.println("Encrypted Value: ");
        System.out.println(encryptedValue);
    }
}