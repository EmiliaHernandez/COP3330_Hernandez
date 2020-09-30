public class App {

    public static void displayBmiInfo()
    {
        System.out.println(bmi);
    }

    public static int getUserHeight()
    {
        System.out.println("Enter height:\n");
        int height = input.nextLine();
    }

    public static int getUserWeight()
    {
        System.out.println("Enter weight:\n");
        int weight = input.nextLine();
    }

    public static String DisplayBmiStatistics(bmiData)
    {
        System.out.println("Underweight < 18.5 \n" +
                "Normal weight = 18.5–24.9 \n" +
                "Overweight = 25–29.9 \n" +
                "Obesity >= 30");
    }

    public static int moreInput()
    {
        System.out.println("More Body Mass to Calculate: Type Y or N \n");
        String response = input.nextLine();
        if(response.contains("Y"))
        {
            return 1;
        }
        else if(response.contains("N"))
        {
            return 0;
        }
    }

    public static void main(String[] args) {
        ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();

        while (moreInput()) {
            double height = getUserHeight();
            double weight = getUserWeight();

            BodyMassIndex bmi = new BodyMassIndex(height, weight);
            bmiData.add(bmi);

            displayBmiInfo(bmi);
        }

        displayBmiStatistics(bmiData);
    }
}
