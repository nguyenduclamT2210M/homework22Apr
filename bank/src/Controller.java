import java.text.DecimalFormat;
import java.time.LocalDateTime;
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
    public long transfer(int number){
       if(number < 50000){
           System.out.println("so tien toi thieu la 50000");
       }else if(number  > balanceNumber){
           System.out.println("so du khong du");
       } else  {
           balanceNumber = balanceNumber - number;
           System.out.println("Chuyen tien thanh cong!!");

       }

        return balanceNumber;
    }
    public void historyBank(){
//        listHistory.add(new TransactionHistory("fdkHSFKDHFDKJAD", "Nguyen van a",10000));
//        listHistory.add(new TransactionHistory("fdkHSFKDHFDKJAD", "Nguyen van b",1000));
//        listHistory.add(new TransactionHistory("fdkHSFKDHFDKJAD", "Nguyen van c",10000));
        for(TransactionHistory history : listHistory){
            System.out.println(history);
        }



    }

    public void actionTransfer(){
    System.out.println("nhap so tai khoan huong thu: ");
    String aa = scanner.next();
    System.out.println("Nhap so tien:  ");
    int bb = scanner.nextInt();

    System.out.println("Mo ta: ");
    String mo = scanner.next();
        transfer(bb);
        LocalDateTime date= LocalDateTime.now();
    if(bb > 50000||balanceNumber == 0){
        listHistory.add(new TransactionHistory(IdGenerate.getNewID(),bb,mo, date,aa));
    }

    }

    public static String formatMoney(long money){


        DecimalFormat df = new DecimalFormat("###,###.00");
        return df.format(money);
    }




}
