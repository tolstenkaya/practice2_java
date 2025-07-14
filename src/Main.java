public class Main{
    public static void main(String[] args){
        //1. Дано целое число:
        //int num = 10203304506;
        //Выведите в консоль позиции всех цифр 0 в этом числе, за исключением первой и последней.
        long num = 10203304506L;
        String num_to_str = Long.toString(num);
        System.out.println( num_to_str.indexOf('0'));
    }
}