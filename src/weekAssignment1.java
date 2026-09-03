import java.sql.SQLOutput;

public class weekAssignment1 {

    void main(){

        //Opgave 1
        /*
        double product1 = 25.50; //DKK
        double product2 = 15.00; //DKK
        double product3 = 30.00; //DKK
        double vatRate = 25; //percentages

        double productSum = product1 + product2 + product3; //DKK

        double totalAfterVat = productSum * (1 + (25.00/100)); //DKK

        System.out.println(productSum);
        System.out.println(totalAfterVat);
         */


        //Opgave 2
        /*
        double food = 450.0; //DKK
        double drinks = 120.0; //DKK
        double waiterTips = 50.0; //DKK
        double costumerAmount = 4;

        double billSum = food + drinks + waiterTips; //DKK

        double billSplit = billSum/costumerAmount; //DKK

        System.out.println(billSplit);
         */


        //Opgave 3
        /*
        double basePrice = 300.0; //DKK
        double discount = 20.0; //percentages
        double vatRate = 25.0; //percentages

        double discountPrice = basePrice * (1-(discount/100.0)); //DKK

        double finalPrice = discountPrice * (1+(vatRate/100)); //DKK

        System.out.println(basePrice);
        System.out.println(discountPrice);
        System.out.println(finalPrice);
         */


        //Opgave 4
        /*
        int guestAmount = 15;
        int cupcakesAmount = 40;

        int cupcakesEach = cupcakesAmount / guestAmount;
        int cupcakesLeftover = cupcakesAmount % guestAmount;

        System.out.println("Each guest gets "+ cupcakesEach +" cupcakes");
        System.out.println(cupcakesLeftover +" cupcakes left left over");
         */


        //Opgave 5
        /*
        String name = "Anna";
        int age = 25;

        StringBuilder welcome = new StringBuilder("Hello, ");
        welcome.append(name);
        welcome.append("! ");
        welcome.append("You are ");
        welcome.append(age);
        welcome.append(" years old.");

        System.out.println(welcome);
         */


        //Opgave 6
        /*
        int score = 100;
        System.out.println(score);

        score += 50;
        System.out.println(score);

        score += 25;
        System.out.println(score);
         */


        //Opgave 7
        /*
        int health = 100;

        health -= 15;
        System.out.println(health);

        health -= 20;
        System.out.println(health);
         */


        //Opgave 8
        /*
        double price = 50.0;
        System.out.println(price);

        price *= 2;
        System.out.println(price);
         */


        //Opgave 9
        /*
        int count = 10;
        System.out.println(count);

        count ++;
        System.out.println(count);

        count --;
        System.out.println(count);
         */


        //Opgave 10
        /*
        int number = 10;

        number += 5;
        System.out.println(number);

        number -= 3;
        System.out.println(number);

        number ++;
        System.out.println(number);

        number --;
        System.out.println(number);
         */


        //Opgave 11
        /*
        Beskrivelse	                                        Værdi	                Datatype og variabelnavn
        en ting der er til salg	                            "Laptop"                String product
        hvad en kunde skal betale for en ting	            7999.99                 double productPrice
        om der er flere tilbage af en ting	                true                    boolean inStock
        hvor mange de er tilbage af en ting	                15                      int stockLeft
        hvor mange procenter man får i rabat på en ting	    10.0                    double percentDiscount
        Hvilken kategori en ting tilhører	                "Electronics"           String productCategory
        */


        //Opgave 12
        /*
        Beskrivelse	                                    Værdi	                Datatype og variabelnavn
        en elevs navn	                                "Anna"                  String studentName
        point fra en prøve	                            85                      int testScore
        point fra afleveringer	                        92                      int assignmentScore
        den endelige karakter (gennemsnit)	            88.5                    double finalGrade
        om eleven har bestået kurset	                true                    boolean hasPassed
         */


        //Opgave 13
        /*
        Beskrivelse	                                Værdi	                        Datatype og variabelnavn
        en gæsts navn	                            "Peter Hansen"                  String guestName
        hvilket værelse gæsten bor på	            204                             int roomNumber
        hvor mange nætter gæsten skal bo	        3                               int nightsStaying
        hvad én overnatning koster	                899.00                          double pricePerNight
        om morgenmad er inkluderet	                true                            boolean breakfastIncluded
        hvad gæsten skal betale i alt	            2697.00                         double totalPrice
         */


        //Opgave 14
        /*
        Beskrivelse	                                    Værdi	            Datatype og variabelnavn
        hvor mange skridt man har gået i dag	        8547                int stepsToday
        hvor mange skridt man gerne vil gå	            10000               int stepsGoal
        hvor langt man har gået i kilometer	            6.2                 double kilometerWalked
        hvor mange kalorier man har forbrændt	        420                 int caloriesBurned
        om man har nået sit mål	                        false               boolean reachedGoal
         */


        //Opgave 15
        /*
        Beskrivelse                                                             Datatype og variabelnavn
        en bogs titel                                                           String bookTitle
        forfatterens navn                                                       String authorName
        bogens ISBN-nummer                                                      String isbn
        hvor mange sider bogen har                                              int bookPages
        om bogen kan lånes lige nu                                              boolean isRentable
        hvem der har lånt bogen (hvis nogen)                                    String borrowedBy
        hvornår bogen skal afleveres                                            String dueDate
        hvor meget man skal betale i gebyr hvis bogen er forsinket              double delayFees
        om bogen er en bestseller                                               boolean isBestseller
        bogens bedømmelse (fra 0.0 til 5.0)                                     double bookRating
         */
    }
}
