public class Homework1 {

    public static void main(String[] args) {
        // Primitives
        int myPrimitive = 10;
        System.out.println(Integer.toBinaryString(myPrimitive));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));

        float myFloatPrimitive = 10.5f;
        double myDoublePrimitive = 10.5f;
        System.out.println(myFloatPrimitive);

        char myCharPrimitive = 'c';

        boolean myBooleanPrimitive = true;
        boolean myFalseBooleanPrimitive = false;

        // Objects
        Integer myIntegerPrimitive = 10;

        String myString = "Hello PentaStagiu!";


        // Control blocks

        // Display parity
        int myVar = 11;
        if (myVar % 2 == 0) {
            System.out.println("The variable is even!");
        } else {
            System.out.println("The variable is odd!");
        }

//        if (myVar % 2 != 0) {
//            System.out.println("The variable is odd!");
//        }

        // Display week-days
        byte weekDay = 50;

        switch (weekDay) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wen");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Wrong number: " + weekDay);
        }


        // Loop blocks

        int[] ints = {1, 2, 3, 4, 5};
        // Calculate sum of all numbers
        int sum = ints[0] + ints[1] + ints[2] + ints[3] + ints[4];

        //for
        sum = 0;
        for (int i = 0; i < 5; i++) {
            //code block
            sum = sum + ints[i];
        }
        System.out.println("Veniturile mele sunt: " + sum);

        int j = 0;
        sum = 0;
        while (j < ints.length) {
            sum = sum + ints[j];
            j = j + 1;
//            j++;
//            j+=1;
        }
        System.out.println("Veniturile dupa while: " + sum);

        j = 0;
        do {
            sum = sum + ints[j];
            j = j + 1;
        } while (j < ints.length);
        System.out.println("Veniturile dupa do-while: " + sum);


    }


}
