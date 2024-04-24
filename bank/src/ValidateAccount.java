public class ValidateAccount {
    public final  String MOBILE = "0123456789";
    public final String PASSWORD = "nguyen duc lam";
    public boolean validateAccount(String mobile, String password) {
        if(mobile.equals(MOBILE)){
            if(password.equals(PASSWORD)){
                System.out.println("Dang nhap thanh cong!");
                return true;
            }else {
                System.out.println("Tai khoan hoac mat khau khong dung!");
                return false;
            }
        } else {
            System.out.println("Tai khoan hoac mat khau khong dung!");
            return false;

        }
    }
}
