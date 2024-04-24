import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Application {
    public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    ValidateAccount va = new ValidateAccount();
    Controller c = new Controller();
    boolean isCheck = false;
    while(!isCheck){
        System.out.println("Dang nhap");
        System.out.println("Nhap so dien thoai: ");
        String mobile = sc.nextLine();
        System.out.println("Nhap mat khau: ");
        String password = sc.nextLine();
        isCheck  = va.validateAccount(mobile, password);
    }
    while(true){
        menu();
        int choose = sc.nextInt();
        switch(choose){
            case 1:
                System.out.println("So du: ");
                long balance = c.getBalanceNumber();
                System.out.println(Controller.formatMoney(balance));
                break;
            case 2:
                c.actionTransfer();
                break;
            case 3:
                System.out.println("Lich su giao dich: ");
                c.historyBank();
                break;
            case 4:
                sc.close();
                System.exit(0);
        }
    }
    }
    public static void menu(){
        System.out.println("1. xem so du tai khoan ");
        System.out.println("2. chuyen khoan");
        System.out.println("3. xem lich su giao dich");
        System.out.println("4. thoat");
        System.out.println("5. lua chon cua ban la: ");
    }
}