import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //1. Дано целое число:
        //int num = 10203304506;
        //Выведите в консоль позиции всех цифр 0 в этом числе, за исключением первой и последней.
//        long num = 10203304506L;
//        String num_to_str = Long.toString(num);
//
//        int amount = 0;
//        for(int i=0;i<num_to_str.length();i++)
//        {
//            if(num_to_str.charAt(i)=='0'){
//                amount++;
//            }
//        }
//
//        int[] arr_indexes = new int[amount];
//        int n=0;
//        for (int i=0; i<num_to_str.length();i++){
//            if(num_to_str.charAt(i)=='0')
//            {
//                arr_indexes[n]=i;
//                n++;
//            }
//        }
//
//        for(int i=1;i<arr_indexes.length-1;i++){
//            System.out.print(arr_indexes[i]);
//        }

        //2. Дан массив с целыми числами:
        //int arr1[] = {123, 334, 456, 556, 789};
        //Запишите в новый массив числа, состоящие из разных цифр:
        //int arr2[] = {123, 456, 789};

//        int arr1[] =  {123, 334, 456, 556, 789};
//        int new_arr[] = new int[3];
//        int j=0;
//        for(int i=0;i<arr1.length;i++){
//            if(i%2==0){
//                new_arr[j]=arr1[i];
//                j++;
//            }
//        }
//        System.out.println(Arrays.toString(new_arr));

        //3. Дано дробное число:
        //float num = 12.34;
        //Запишите целую часть числа в одну переменную, а дробную часть - в другую:
        //int num1 = 12;
        //int num1 = 34;
//        float num = 12.34f;
//        int num_integer = (int)num;
//        int num_fraction = (int)((num-num_integer)*100);
//        System.out.println(num_integer);
//        System.out.println(num_fraction);

        //4. Дана некоторая строка с буквами и цифрами. Получите позицию первой цифры в этой строке.
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter line: ");
//        String str = scan.nextLine();
//        for(int i=0;i<str.length();i++){
//            if(Character.isDigit(str.charAt(i))){
//                System.out.println("Position of digit is: "+i);
//                break;
//            }
//        }

        //5. Напишите программу, которая сформирует следующую строку:
        //"xxxxx"
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter symbol: ");
//        char ch = scan.next().charAt(0);
//        String str = "";
//        for(int i=0;i<5;i++){
//            str+=ch;
//        }
//        System.out.println(str);

        //6. Дан массив:
        //int[] {1, 0, 2, 3, 0, 5}
        //Удалите из массива все нули и запишите результат в новый массив:
        //int[] {1, 2, 3, 5}
//        int[] arr = new int[] {1, 0, 2, 3, 0, 5};
//        List<Integer> new_arr = new ArrayList<Integer>();
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]!=0){
//                new_arr.add(arr[i]);
//            }
//        }
//        System.out.println(new_arr);

        //7.Дана строка с целыми числами, разделенными пробелами
        //String str = "123 456 789";
        //Найдите сумму чисел из этой строки.
//        String str = "123 456 789";
//        String[] nums_str = str.split(" ");
//        int sum = 0;
//        for(String num_str : nums_str){
//            int num = Integer.parseInt(num_str);
//            sum+=num;
//        }
//        System.out.println("Sum: "+sum);

        //8. Дана строка со словами:
        //String str = "word1 word2 word3";
        //Получите первые N слов из этой строки.

//        String str ="Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
//                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
//                "when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
//                "It has survived not only five centuries, but also the leap into electronic typesetting, " +
//                "remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset " +
//                "sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like " +
//                "Aldus PageMaker including versions of Lorem Ipsum.";
//
//        String[] words = str.split(" ");
//        Scanner scan = new Scanner(System.in);
//
//        int n;
//        do{
//            System.out.print("Enter amount of words (N): ");
//            n=scan.nextInt();
//            if(n>str.length()){
//                System.out.println("N is bigger than amount of the words! Try again.");
//            }
//        }while(n>str.length());
//
//        for(int i=0;i<n;i++){
//            System.out.println(words[i]);
//        }

        //9. Дан массив символов, содержащий цифры:
        //chars[] {'1', '2', '3', '4', '5'};
        //Слейте элементы этого массива в целое число:
        //int 12345;
//        char[] char_nums = new char[]{'1','2','3','4','5'};
//        String num_str = new String(char_nums);
//        int num = Integer.parseInt(num_str);
//        System.out.println(num);


        //10. Дана некоторая строка:
        //"AbCdE"
        //Смените регистр букв этой строки на противоположный. В нашем случае должно получится следующее:
        //"aBcDe"
//        String str = "AbCdE";
//
//        char[] symbols = str.toCharArray();
//        for(int i=0;i<symbols.length;i++){
//            if(symbols[i]>='A' && symbols[i]<='Z'){
//                symbols[i]+=32;
//            }
//            else if(symbols[i]>='a' && symbols[i]<='z'){
//                symbols[i]-=32;
//            }
//        }
//        String str_new = new String(symbols);
//        System.out.println(str_new);

        //11. Дана дата в следующем формате:
        //String date = "31-12-2025";
        //Преобразуйте ее в следующий формат:
        //String date = "31 декабря 2025";
//        String date = "31-12-2025";
//        String[] arr_date = date.split("-");
//
//        String[] months = new String[]{"January", "February", "March",
//                "April", "May", "June",
//                "July", "August", "September",
//                "October", "November", "December"};
//        String date_to_str = "";
//        for(int i=0;i<arr_date.length;i++){
//            if(i==1){
//                date_to_str+=months[Integer.parseInt(arr_date[i])-1];
//            }else{
//                date_to_str+=arr_date[i];
//            }
//            date_to_str+=" ";
//        }
//        System.out.println(date_to_str);
    }
}