public class AccountExampleTest {
    public static final String[] validAccount   = new String[] { "codegym", "hanoi1", "hoaanhdao", "hoa_anh_dao","forlove" };
    public static final String[] invalidAccount = new String[] { ".$$.", "&^&^", "17_", "ooo" };

    public static void main(String args[]) {
        AccountExample accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
        for (String account : invalidAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
    }
}
