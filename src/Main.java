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

        //7.
    }
}