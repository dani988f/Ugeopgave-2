public class Uge2 {
    void main(){

        /* //Simple Betingelelser – 1
        double finalPrice;
        double totalPrice = 1200.0;
        if (totalPrice > 1000) {
            finalPrice = totalPrice * 0.8;
            System.out.println("Congratulations, you've achieved 20% discount on your purchase! " +
                    "Your final price is " + finalPrice + " kr");
        }
         */

        /* // Betingelser med AND – 3
        int tid = 14;
        if (tid >= 5 && tid <= 11) {
            System.out.println("Godmorgen");
        } else if (tid >= 12 && tid <=17) {
            System.out.println("Godeftermiddag");
        } else if (tid >= 18 && tid <= 21) {
            System.out.println("Godaften");
        }else {System.out.println("Godnat");
        }

         */

        /* //Betingelser med OR – 6
        int ageLimit = 15;
        int guestAge = 14;
        boolean hasParentalConsent = true;
        if (guestAge>=ageLimit || (guestAge >= 13 && hasParentalConsent)){
            System.out.println("Can Watch movie");
        }else {System.out.println("Cannot watch movie");
        }
         */

        /* //Kombinerede operatorer – 9
        boolean isAdmin = true;
        boolean accountActive = true;
        boolean isSuperUser = false;
        boolean isUser = false;
        boolean suspended = false;
        boolean isGuest = false;
        boolean guestTimeValid = false;

        String accessLevel;
        if ((isAdmin && accountActive) || isSuperUser) {
            accessLevel = "FULL ACCESS";
        } else if ((isUser && accountActive && !suspended) || (isGuest && guestTimeValid)) {
            accessLevel = "LIMITED ACCESS";
        } else {
            accessLevel = "ACCESS DENIED";
        }
        System.out.println("Admin: " + isAdmin);
        System.out.println("Active: " + accountActive);
        System.out.println("Result: " + accessLevel);

         */

        /* //Switch-case – 10
        String item = "Pizza";
        int quantity = 2;
        double price;

        switch (item) {
            case "Burger":
                price = 89.0;
                break;
            case "Pizza":
                price = 95.0;
                break;
            case "Salad":
                price = 65.0;
                break;
            case "Pasta":
                price = 79.0;
                break;
            case "Steak":
                price = 145.0;
                break;
            default:
                price = 0.0;
                System.out.println("Item not found");
        }

        double total = price * quantity;

        System.out.println("Item: " + item);
        System.out.println("Price: " + price + " kr");
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + total + " kr");

         */

        /* //While loops – 15
        double savings = 0.0;
        double monthlyDeposit = 500.0;
        double goal = 10000.0;
        int months = 0;

        while (savings < goal) {
            savings += monthlyDeposit;
            months++;
            System.out.println("Month " + months + ": " + savings + " kr");
        }

        System.out.println("Efter " + months + ", har du sparet 10.000 kr op");

         */

        /* //For loops – 20
        double monthlySavings = 1000.0;
        double total = 0.0;

        for (int month = 1; month <= 12; month++) {
            total += monthlySavings;
            System.out.println(total + " kr");
        }

        System.out.println();
        System.out.println("Total after 1 year: " + total + " kr");

         */

        /* //For loops med array – 24
        int[] scores = {85, 92, 78, 88, 95, 73, 90};
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double average = (double) sum / scores.length;
        int min = scores[0];
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) min = scores[i];
            if (scores[i] > max) max = scores[i];
        }

        int countAbove80 = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > 80) {
                countAbove80++;
            }
        }
        System.out.println("Gennemsnit: " + average);
        System.out.println("Højest: " + max);
        System.out.println("Lavest: " + min);
        System.out.println("Over 80: " + countAbove80);

         */

        //For-each loops – 27
        double[] prices = {299.0, 149.0, 899.0, 49.0};
        double total = 0.0;

        for (double price : prices) {
            total += price;
        }
        System.out.println("Total: " + total + " kr");
        
    }
}
