import java.util.*;
class main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1 :");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2 :");
        int num2 = scanner.nextInt();
        boolean result = lessThan100(num1,num2);
        System.out.println(result);

    }
    public static boolean lessThan100(int a, int b){
        int sum = a+b;
        if(sum<100){
            return true;
        }
        else{
            return false;
        }
    }
}
class winLose{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print 3 numbers :");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        loseWin(a,b,c);
    }
    public static void loseWin(int a, int b,int c){
        if(b>a) {
            if (a <= c && c<= b) {
                System.out.println("you win");
            } else {
                System.out.println("you lose");
            }

        }
    }
}
class weight1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 1 for female and 2 for male");
        int type = scanner.nextInt();
        System.out.println("No of feet:");
        int feet = scanner.nextInt();
        System.out.println("No of inches:");
        int inch = scanner.nextInt();
        int weight =0;
        if(type==1){
            if(feet<=5){
                weight = 100 +(inch*6);
            }else {
                int feet1 = feet - 5;
                int calc = 12*feet1;
                weight = (calc*6) + 100 + (inch*6);
            }
            System.out.println("You should weight "+ weight +" pounds");
        }
        else if (type ==2) {
            if(feet<=5){
                weight = 106 +(inch*7);
            }else {
                int feet1 = feet - 5;
                int calc = 12*feet1;
                weight = (calc*7) + 106 + (inch*7);
            }
            System.out.println("You should weight "+weight+" pounds");
        }
        else{
            System.out.println("Check you input");
        }
    }
}
class DecreasingSequenceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of values:");
        int n = scanner.nextInt();

        int[] num = new int[n];
        System.out.println("Enter the sequence values:");
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }
        boolean decreasing = true;
        for (int i = 0; i < n - 1; i++) {
            if (num[i] < num[i + 1]) {
                decreasing = false;
                break;
            }
        }
        if (decreasing) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Non-Decreasing");
        }
    }
}
class frequency{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the heights :");
        for(int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        for (int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(a[i]>a[j]){
                    int temp =a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        int count = 1;
        for(int i=1;i<n;i++) {
            if (a[i - 1] == a[i]) {
                count++;
            } else {

                System.out.println(a[i - 1] + " " + count);
                count = 1;
            }
        }
        System.out.println(a[n-1] + " "+count);
        int sum =0;
        for (int i=0;i<n;i++){
            sum = sum +a[i];
        }
        int avg = sum / n;
        System.out.println("the average is "+ avg);
    }
}
class nestTed{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num>-1 && num<10){
            if(num == 1){
                System.out.println("one");
            } else if (num ==2) {
                System.out.println("two");
            }else if (num ==3) {
                System.out.println("three");
            }else if (num ==4) {
                System.out.println("four");
            }else if (num ==5) {
                System.out.println("five");
            }else if (num ==6) {
                System.out.println("six");
            }else if (num ==7) {
                System.out.println("Seven");
            }else if (num ==8) {
                System.out.println("eight");
            }else if (num ==9) {
                System.out.println("nine");
            }else{
                System.out.println("Zero");
            }

        }else {
            System.out.println("Give correct input");
        }
    }
}

class switchCase{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            default:
                System.out.println("Give correct input 0 - 8");
        }
    }
}


class PrintDayInWord{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n>=0 && n<7){
            if(n==0){
                System.out.println("Sunday");
            } else if (n==1) {
                System.out.println("Monday");
            } else if (n==2) {
                System.out.println("tuesday");

            } else if (n==3) {
                System.out.println("Wednesday");

            } else if (n==4) {
                System.out.println("thursday");

            } else if (n==5) {
                System.out.println("friday");

            }else{
                System.out.println("Saturday");
            }
        }else {
            System.out.println("Give 0-6 not beyond that:!!!!!");
        }
    }
}

class printDaySwitch{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            default:
                System.out.println("Give 0-6 only");



        }
    }
}

class Check{
    public static void main(String[] args){
        if(args.length!=3){
            System.out.print("Usage");
            return;
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        if(num1 == num2 && num2 == num3){
            System.out.println("It is equal");
        }
        else{
            System.out.println("Its NOt");
        }

    }
}

class WindSpeed{
    public static void main(String[] args){
        int speed = Integer.parseInt(args[0]);
        if (speed>74 && speed<95){
            System.out.println("Cat 1");
        } else if (speed>96 && speed<110) {
            System.out.println("Cat 2");
        } else if (speed>111 && speed<130) {
            System.out.println("Cat 3");

        } else if (speed>131 && speed<155) {
            System.out.println("Cat 4");
        }else if(speed>155){
            System.out.println("Cat 5");
        }else {
            System.out.println("Give positive integer only which should be above 75");
        }
    }

}
class Scores{
    public static void main(String[] args){
        float[] num = new float[args.length];
        int i,j;
        float sum = 0;
        for(i=0;i< num.length;i++){
            num[i] = Float.parseFloat(args[i]);
        }
        for (i=0;i< num.length;i++){
            for (j=i+1;j< args.length;j++){
                if(num[i]>num[j]){
                    int temp = (int) num[i];
                    num[i] =num[j];
                    num[j] = num[i];
                }
            }
        }
        for(i=0;i< num.length;i++){
            System.out.println(num[i]);
        }
        for(i=1;i< num.length-1;i++){
            sum +=num[i];
        }
        float avg;
        avg = sum/(num.length);
        System.out.println("avg is :"+avg);
    }

}
class Seasons {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Seasons <month> <day>");
            return;
        }

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid month or day.");
            return;
        }

        String season = getSeason(month, day);
        System.out.println(season);
    }

    private static String getSeason(int month, int day) {
        if ((month == 3 && day >= 21) || (month >= 4 && month <= 5) || (month == 6 && day <= 20)) {
            return "Spring";
        } else if ((month == 6 && day >= 21) || (month >= 7 && month <= 8) || (month == 9 && day <= 22)) {
            return "Summer";
        } else if ((month == 9 && day >= 23) || (month >= 10 && month <= 11) || (month == 12 && day <= 21)) {
            return "Fall";
        } else {
            return "Winter";
        }
    }
}

class Zodiac {
    public static void main(String[] args) {
        System.out.println("Enter month 1 to 12 (aka jan to dec)");
        int m = Integer.parseInt(args[0]);
        System.out.println("Enter day 1 to 31");
        int d = Integer.parseInt(args[1]);
        if (m == 2 && d > 29 || m < 1 || m > 12 || d < 1 || d > 31) {
            System.out.println("bro give valid input");
            return;
        }
        zodiacSign(m, d);
    }


    public static void zodiacSign(int m, int d) {
        if (m <= 12 && d <= 31) {
            if (m == 12 && d > 22 || m == 1 && d < 19) {
                System.out.println("Capricorn");
            } else if (d >= 20 && m == 1 || m == 2 && d <= 17) {
                System.out.println("Aquarius");
            } else if (m == 2 && d > 17 || m == 3 && d < 20) {
                System.out.println("Pisces");
            } else if (m == 3 && d >= 20 || m == 4 && d < 20) {
                System.out.println("Aries");

            } else if (m == 4 && d >= 20 || m == 5 && d <= 20) {
                System.out.println("Taurus");
            } else if (m == 5 && d >= 21 || m == 6 && d <= 20) {
                System.out.println("Gemini");
            } else if (m == 6 && d >= 21 || m == 7 && d <= 22) {
                System.out.println("Cancer");

            } else if ((m == 7 && d >= 23) || (m == 8 && d <= 22)) {
                System.out.println("leo");
            } else if ((m == 8 && d >= 23) || (m == 9 && d <= 22)) {
                System.out.println("virgo");
            } else if ((m == 9 && d >= 23) || (m == 10 && d <= 22)) {
                System.out.println("libra");
            } else if ((m == 10 && d >= 23) || (m == 11 && d <= 21)) {
                System.out.println("Scorpio");
            } else if ((m == 11 && d >= 22) || (m == 12 && d <= 21)) {
                System.out.println("Sagittarius");
            } else {
                System.out.println("invalid date");
            }

        }
    }
}
class QuarterBack {
    public static void main(String[] args) {
        System.out.println("Enter values for A, B, C, D, and E");
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);

        double w = w1(a, b);
        double y = y1(d, b);
        double x = x1(c, b);
        double z = z1(e, b);
        System.out.println("Completion Ratio:"+w);
        System.out.println("Yards per pass:"+x);
        System.out.println("TouchDown Ratio:"+y);
        System.out.println("Interception Ratio:"+z);

        double q;
        if (w <= 39.58 && x <= 39.58 && y <= 39.58 && z <= 39.58) {
            q = (w + x + y + z) / 6 * 100;
            System.out.println("Quarterback Rating: " + q);
        } else {
            System.out.println("It is not satisfied");
        }
    }

    public static double w1(int a, int b) {
        return ((double) 250 / 3) * (((double) a / b) - 0.3);
    }

    public static double x1(int c, int b) {
        return ((double) 25 / 6) * (((double) c / b) - 3);
    }

    public static double y1(int d, int b) {
        return ((double) 1000 / 3) * (((double) d / b));
    }

    public static double z1(int e, int b) {
        return ((double) 1250 / 3) * (0.095 - ((double) e / b));
    }
}

class Brook{
    public static void main(String[] args)
    {
        int a,b,c,d,e;
        double w,x,y,z;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter values for A,B,C,D and E");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        d=scanner.nextInt();
        e=scanner.nextInt();
        w=((double) 250 /3)*(((double) a /b)-0.3);
        x=((double) 25 /6)*(((double) c /b)-3);
        y=((double) 1000 /3)*(((double) d /b));
        z=((double) 1250 /3)*(0.095-((double) e /b));
        System.out.println("Completion Ratio:"+w);
        System.out.println("Yards per pass:"+x);
        System.out.println("TouchDown Ratio:"+y);
        System.out.println("Interception Ratio:"+z);
        double q;
        if(w<=39.58 && x<=39.58 && y<=39.58 && z<=39.58)
        {
            q=w+x+y+z;
            System.out.println("Quarterback Rating:"+q);
        }
        else {
            System.out.println("Enter correct values");
        }

    }
}

class Tricky{
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Do you like this program?");
        System.out.println();
        System.out.println("I wrote it myself.");
        System.out.println("\\'\"\\\\\"");
    }
}


class Sb {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");
        System.out.println(sb.capacity());
    }
}

//String hannah = "Did Hannah see bees? Hannah did.";
//a.    What is the value displayed by the expression hannah.length()?
//b.    What is the value returned by the method call hannah.charAt(12)?
//c.    Write an expression that refers to the letter b in the string referred to by hannah

class  hannah1{
    public static void main(String[] args){
        String hannah = "Did Hannah see bees? Hannah did.";
        System.out.println(hannah.length());
        System.out.println(hannah.charAt(12));
        System.out.println(hannah.indexOf("b"));
        String sen = "Was it a car or a cat I saw?";
        System.out.println(sen.substring(9, 12));
    }

}


class ComputeResult {
    public static void main(String[] args) {
        String original = "software";
        StringBuilder result = new StringBuilder("hi");
        int index = original.indexOf('a');

        /*1*/   result.setCharAt(0, original.charAt(0));
        /*3*/   result.insert(1, original.charAt(4));
        /*4*/   result.append(original.substring(1,4));
        /*5*/   result.insert(3, (original.substring(index, index+2) + " "));

        System.out.println(result);
    }
}
//5.    Show two ways to concatenate the following two strings together to get the string "Hi, mom.":
//1.    String hi = "Hi, ";
//2.    String mom = "mom.";

class concatenate{
    public static void main(String[] args){
        String hi = "Hi, ";
        String mom = "mom.";
        String hiMom = hi.concat(mom);
        System.out.println(hi.concat(mom));
        System.out.println(hiMom);
        System.out.println(hi + mom);
    }
}

class arraylist{
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> names1 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("if you want to quit inputting names give 0");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                break;
            }
            names.add(input);
        }

        Random random_m = new Random();
        int index = random_m.nextInt(names.size());
        System.out.println("the random name is");
        System.out.println(names.get(index));
        System.out.println("List of names using for each");

        for(String i:names) {
            System.out.println(i);
        }
        for (int i = 0; i < names.size(); i++) {
            boolean found = false;
            for (int j = 0; j < names1.size(); j++) {
                if (names.get(i).equalsIgnoreCase(names1.get(j))) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                names1.add(names.get(i));
            }
        }
        System.out.println(names1);

    }
}

// Create a class named Shirt with data fields for collar size and sleeve length.
// Include a constructor that takes arguments for each field. Also include a String
//  class variable named material and initialize it to "cotton". Write a program named
// TestShirt to instantiate three Shirt objects with different collor sizes and sleeve lengths
// and then display all the data, including material, for each shirt.
//Also write a code to demonstrate by comparing two objects.

class Shirt{
    int collarSize;
    float sleeveLength;
    Shirt(int cSize,float sLen){
        collarSize = cSize;
        sleeveLength = sLen;
    }
    Shirt(int cSize){
        collarSize = cSize;
    }
    String material = "cotton";
    Shirt(){
        collarSize = 32;
        sleeveLength = 12.5F;
        String material = "cotton";
    }
    void Display(){
        System.out.println(this.collarSize);
        System.out.println(this.sleeveLength);
        System.out.println(material);
    }
    public static void main(String[] args) {
        Shirt s1 = new Shirt(20, 1.5F);
        s1.Display();
        Shirt s2 = new Shirt(30);
        s2.Display();
        Shirt s3 = new Shirt();
        s3.Display();
        Shirt s4 = new Shirt();
        s4.Display();
    }
}