public class Main {

    public static void main(String[] args) {
        int present = 0;
        int absent = 1;
        int checkattendance = (int) (Math.random() * 10);
        if (checkattendance == present) {
            System.out.println("Employee present");
        }else {
            System.out.println("Employee absent");
        }
    }
}