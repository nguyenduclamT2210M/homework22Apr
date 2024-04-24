import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private static long balanceNumber = 1000000;

    Scanner scanner = new Scanner(System.in);
    List<TransactionHistory> listHistory = new ArrayList<TransactionHistory>();
    public long getBalanceNumber(){

        return  balanceNumber ;
    }
    public static long transfer(){
        return balanceNumber;
    }
    public void historyBank(){
        listHistory.add(new TransactionHistory("fdkHSFKDHFDKJAD", "Nguyen van a",10000));
        listHistory.add(new TransactionHistory("fdkHSFKDHFDKJAD", "Nguyen van b",1000));
        listHistory.add(new TransactionHistory("fdkHSFKDHFDKJAD", "Nguyen van c",10000));
        listHistory.forEach(transactionHistory ->
                System.out.println(transactionHistory.toString()));


    }
    public void actionTransfer(){
    System.out.println("nhap so tai khoan huong thu: ");
    int aa = scanner.nextInt();
    System.out.println("Nhap so tien:  ");
    int bb = scanner.nextInt();
    if(bb >balanceNumber){
        System.out.println("So du khong du!!");
    }else {

        System.out.println("Chuyen tien thanh cong!");
    }

    }

    public static String formatMoney(long money){


        DecimalFormat df = new DecimalFormat("###,###.00");
        return df.format(money);
    }




}
