public class exercise8 {
    public static void main(String[] args) {

        int year = 100;
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 ==0))){
            System.out.println(year + " не високосный год");
        } else {
            System.out.println(year + " является високосным г.");
        }
    }
}
