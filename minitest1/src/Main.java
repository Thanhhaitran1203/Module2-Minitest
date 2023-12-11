import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user;
        String pass;
        int count = 0;
        do {
            if(count == 3){
                System.out.println("Nhập sai hết rồi");
                System.exit(0);
            }
            System.out.println("user name");
            user = sc.nextLine();
            System.out.println("password");
            pass = sc.nextLine();
            count++;
        }while (!user.equals("admin")  && !pass.equals("123456"));
        int num;
        do {
            menu();
            num = sc.nextInt();
            switch (num){
                case 1:
                    drawRectangle();
                    break;
                case 2:
                    drawTriangle();
                    break;
                case 3:
                    drawIsoscelesTriangle();
                    break;
                case 4:
                    break;
            }
        }while (num != 4);
    }
    public static void menu(){
        System.out.println("Menu:");
        System.out.println("1. Vẽ hình chữ nhật");
        System.out.println("2. Vẽ tam giác vuông");
        System.out.println("3. Vẽ tam giác cân");
        System.out.println("4. Thoát");
    }
    public static int[]  getData(){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];
        System.out.println("Nhập chiều rộng");
        arr[0] = sc.nextInt();
        System.out.println("Nhập chiều cao");
        arr[1]= sc.nextInt();
        return arr;
    }
    public static void drawRectangle(){
        String result = "";
        int[] arr;
        arr = getData();
        for (int i = 0; i < arr[1]; i++) {
            for (int j = 0; j < arr[0]; j++) {
                result += "*";
            }
            result += "\n";
        }
        System.out.println(result);
    }
    public static void drawTriangle(){
        String result = "";
        int[] arr;
        arr = getData();
        for (int i = 0; i < arr[1]; i++) {
            for (int j = arr[0] - i; j > 0; j--) {
                result += "*";
            }
            result += "\n";
        }
        System.out.println(result);
    }
    public static void drawIsoscelesTriangle(){
//        String result = "";
//        int[] arr;
//        arr = getData();
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 0; j <= 5-i; j++) {
//                result += " ";
//            }
//            for (int j = 1; j <= 2 * i -1; j++) {
//                result += "*";
//            }
//            result += "\n";
//        }
//        System.out.println(result);
    }
}