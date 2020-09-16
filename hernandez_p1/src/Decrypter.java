import java.util.Scanner;

public class Decrypter {
    private static String decrypt(String aboutToBeDecrypted)
    {
        int i = Integer.parseInt(aboutToBeDecrypted);//this makes it an integer

        int lastDigit = i % 10;       //get the last digit
        int remainingNumber = i / 10; // tacks off the last digit
        int tempLast = ((lastDigit + 10) - 7) % 10;//operation for decryption first step


        int newLastDigit = (remainingNumber % 10);
        int newRemainingNumber = remainingNumber /10;
        int tempThird = ((newLastDigit + 10) - 7) % 10;

        int revampedLastDigit = (newRemainingNumber % 10);
        int revampedRemainingNumber = newRemainingNumber /10;
        int tempSecond = ((newRemainingNumber + 10) - 7) % 10;

        int finalLastDigit = (revampedRemainingNumber % 10);
        int finalRemainingNumber = revampedRemainingNumber /10;
        int tempFirst = ((revampedRemainingNumber +10) - 7) % 10;


//changing my integers to strings
        String fourthVal = String.valueOf(tempLast);
        String thirdVal = String.valueOf(tempThird);
        String secondVal = String.valueOf(tempSecond);
        String firstVal = String.valueOf(tempFirst);

        String decrypted = "";
        decrypted = decrypted.concat(thirdVal);
        decrypted = decrypted.concat(fourthVal);
        decrypted = decrypted.concat(firstVal);
        decrypted = decrypted.concat(secondVal);

        return decrypted;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numbers to decrypt");
        String numToDecrypt = input.nextLine();

        String decryptedValue = Decrypter.decrypt(numToDecrypt);

        System.out.println("decrypted Value: ");
        System.out.println(decryptedValue);
    }
}
