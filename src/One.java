import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class One {
    public void  revers () {

        String st = "Salam";



        StringBuilder builder = new StringBuilder(st);

        builder.reverse();

        System.out.println(builder);

    }

    public  void  reversTheSecondWay() {

        String st = "Bonjur";


        char doe[] = st.toCharArray();

        for (int x = doe.length - 1; x >= 0; x--) {

            System.out.println(doe[x]);
        }

        }

    public void ThirdTaskWay1() {


        int a;
        int b;
        int sum;

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("До обмена значениями " + a + b);
        sum = a;
        a = b;
        b = sum;

        System.out.println("После обмена значениями " + a + b);
    }

    public void withoutUsingTheThirdVariable() {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("\na = " + a + "\nb = " + b);

        // a = 4  b = 6

        a = a + b;  //  a=// 10
        b = a - b; // b=4
        a = a - b;//a=6

        System.out.println("\na = " + a + "\nb = " + b);


    }
    public void FifthTask() {


        String st = "Baku Kiev Oslo Donetsk Oslo Oslo Baku ";

        String[] words = st.split(" ");

        HashMap<String, Integer> keyValue = new HashMap<>();

        for (int i = 0; i <= words.length - 1; i++) {
            if (keyValue.containsKey(words[i])) {

                int counter = keyValue.get(words[i]);

                keyValue.put(words[i], counter + 1);

            } else keyValue.put(words[i], 1);

        }
        System.out.println(keyValue);
    }


    public void SixthTask() {

        HashMap<Integer, String> keyValue = new HashMap<>();
        keyValue.put(1, "Hello");
        keyValue.put(2, "My");
        keyValue.put(3, "dear");
        keyValue.put(4, "friend");
        System.out.println(keyValue.size());

        Iterator iterator = keyValue.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry qurentMe = (Map.Entry) iterator.next();
            System.out.println("Ключ это " + qurentMe.getKey() + " Значение это " + qurentMe.getValue());

        }
        for (Map.Entry entry : keyValue.entrySet()) {
            System.out.println("Ключ это: " + entry.getKey() + " Значение это: " + entry.getValue());


        }
    }


    public void SeventhTask() {


        int tempNumber;
        int number;

        boolean numberIsPrime = true;

        Scanner sc = new Scanner(System.in);

        number = sc.nextInt();


// цикл todo
        for (int x = 2; x <= number / 2; x++) {

            tempNumber = number % x;

            if (tempNumber == 0) {

                numberIsPrime = false;
                break;
            }


        }
        if (numberIsPrime) {
            System.out.println(number + "число  является простым ");
        } else
            System.out.println(number + "число не является простым ");


    }


    public boolean  EighthTask (String word ) {
        int lenght = word.length();

        for (int i = 0; i < (lenght / 2); i++) {

            if (word.charAt(i) != word.charAt(lenght - i - 1)) {
                return false;
            }


        }
        return true;
    }




    public  void  NinthTask () {

        int number;
        int x = 0;
        int y = 0;
        int z = 1;

        Scanner scanner = new Scanner(System.in);

        number = scanner.nextInt();

        System.out.println("Серия чисел Фибоначи ");

        for (int i = 0; i <= number; i++) {

            x = y;
            y = z;
            z = y + x;
            System.out.println(x + "");
        }


    }



    public void  FifteenTask () {

        String st = "Hello world";

        int counter  = 0;

        char[] charArray = st.toCharArray();
        for (char value : charArray) {

            for (char c : charArray) {
                if (value == c) {

                    counter++;
                    break;
                }
            }
        }



    }


    public void EighteenthTask() {


        String st = "Жили-были кот и собака и я ";

        String st2 = st.replaceAll("\\s", "");

        System.out.println(st2);

    }
}
