package a;


import java.util.Scanner;

/**
 *  atm 取款机入口
 */
public class AtmMain {

    private static String cardid;
    private static String cardPwd;
    private static CustomerService customerService;

    public static void main(String[] args) {
        customerService= new CustomerService();
        TextUitl.welcome();
        int i = 0;
        while (i<6){
            doWritePassword();
            doCheckPassword(cardid,cardPwd);
            i++;
        }
    }
    private static void doCheckPassword(String cardid, String  cardPwd) {
        if (cardid.length()==8) {
            customerService.checkPwd(cardid,cardPwd);
        }
    }
    private static void doWritePassword() {
        System.out.println("请输入卡号");
        Scanner scanner = new Scanner(System.in);
        cardid = scanner.nextLine();
        System.out.println("cardid = " + cardid);
        System.out.println("请输入密码");
        cardPwd = scanner.nextLine();
        System.out.println("cardPwd = " + cardPwd);
    }


}
