package ClassTrials;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Akın Cengiz","19031903",15000);
        System.out.println("Açılan Hesap Sayısı\t: " + BankAccount.getAccountCounter());
        System.out.println("Para Yatırma İşlemi Sayısı\t: " + BankAccount.getInProcess());
        System.out.println("Toplam Bakiye Miktarı\t: " + BankAccount.getTotalBalance());
        System.out.println("Para Çekme İşlemi Sayısı\t: " + BankAccount.getOutProcess());

        System.out.println("Hesap Bakiyesi\t: " + bankAccount.getBalance());

        System.out.println("\n*****************************************\n");

        BankAccount[] bankAccounts = new BankAccount[5];
        for(int i = 0; i < bankAccounts.length; i++)
        {
            String name = "Müşteri - "+i;
            String number = ""+i+""+i+""+i+""+i+""+i+""+i+""+i+""+i;
            double cash = i*1000;
            bankAccounts[i] = new BankAccount(name,number,cash);
        }
        for(BankAccount bA : bankAccounts)
        {
            bA.getAccountInfo();
        }

        System.out.println("\n*****************************************\n");
        System.out.println("Açılan Hesap Sayısı\t: " + BankAccount.getAccountCounter());
        System.out.println("Para Yatırma İşlemi Sayısı\t: " + BankAccount.getInProcess());
        System.out.println("Toplam Bakiye Miktarı\t: " + BankAccount.getTotalBalance());
        System.out.println("Para Çekme İşlemi Sayısı\t: " + BankAccount.getOutProcess());

        bankAccounts[4].outCash(1500);
        bankAccounts[3].outCash(1000);
        bankAccounts[2].outCash(500);
        System.out.println("\n*****************************************\n");
        System.out.println("Açılan Hesap Sayısı\t: " + BankAccount.getAccountCounter());
        System.out.println("Para Yatırma İşlemi Sayısı\t: " + BankAccount.getInProcess());
        System.out.println("Toplam Bakiye Miktarı\t: " + BankAccount.getTotalBalance());
        System.out.println("Para Çekme İşlemi Sayısı\t: " + BankAccount.getOutProcess());
    }
}
