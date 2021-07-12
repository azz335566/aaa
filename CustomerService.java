package a;



import java.util.List;
import java.util.Scanner;


public class CustomerService {
    private List<Customer> customerList;
    private Customer currentCustomer;

    public void  checkPwd(String cardid, String  cardPwd){
        CustomerData customerData = CustomerData.getInstance();
        customerList  = customerData.getCustomerList();
        System.out.println("cardid = " + cardid);
        System.out.println("cardPwd = " + cardPwd);

        for (Customer customer : customerList) {
            if (customer.getAccount().equals(cardid) && customer.getPassword().equals(cardPwd)){
                currentCustomer=  customer;
                System.out.println("欢迎"+customer.getCname()+"顾客登录"   );
                TextUitl.oneLeveOption();  // 界面
                Scanner scanner = new Scanner(System.in);
                String option = scanner.nextLine();
                oneOption(option);
            }
        }
    }

    private void oneOption(String option) {
        switch (option){
            case "1":
                System.out.println("余额查询");
                doSelectMoney();
                goOneHome();
                break;
            case "2":
                System.out.println("取款");
                goOneHome();
                break;
            case "3":
                System.out.println("转账");
                goOneHome();
                break;
            case "4":
                System.out.println("存款");
                goOneHome();
                break;
            case "5":
                System.out.println("退卡");
                goOneHome();
                break;
        }
    }

    private void doSelectMoney() {
        double money = currentCustomer.getMoney();
        System.out.println(" 余额是 " +money);
    }

    private  void goOneHome( ){
        TextUitl.oneLeveOption();
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        System.out.println("option1 = " + option);
        oneOption(option);
        // 递归算法
    }


}
