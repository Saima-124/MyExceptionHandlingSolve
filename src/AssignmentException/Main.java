package AssignmentException;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("2312476124",100);
        try{
            account.deposit(50.0);
            account.withdraw(200);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            account.withdraw(50);
            account.deposit(-10);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Final balance is = " + account.getBalance());
            System.out.println("End of transcription");
        }

    }
}
