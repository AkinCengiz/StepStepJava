package ClassTrials;

public class BankAccount {
    /*
            Bir banka hesabı için sınıf tasarlayın. Bu sınıfta hesabın kime ait oldugunu
            tutan hesapNo, hesaptakiPara, para yatirma ve çekme metotları olsun.
            Ayrıca bu hesaplarda olan tüm parayı, açılan hesap sayısını, yapılan toplam
            paracekme ve para yatırma sayısını gösteren bir metot ve iki hesabı para
            değişkenine göre birbiriyle kıyaslayacak metot bulunmalı.

     */

    private static int accountCounter = 0;
    private static double totalBalance = 0;
    private static int inProcess = 0;
    private static int outProcess = 0;

    private String accountHolder;
    private String accountNumber;
    private double balance;

    public static int getAccountCounter() {
        return accountCounter;
    }

    public static double getTotalBalance() {
        return totalBalance;
    }

    public static int getInProcess() {
        return inProcess;
    }

    public static int getOutProcess() {
        return outProcess;
    }


    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String accountHolder,String accountNumber)
    {
        this(accountHolder,accountNumber,0);
    }
    public BankAccount(String accountHolder, String accountNumber,double balance)
    {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        accountCounter = getAccountCounter() + 1;
        totalBalance = getTotalBalance() + balance;
        if(balance > 0)
        {
            inProcess = getInProcess() + 1;
        }
    }

    public void inCash(double amount)
    {
        this.balance += amount;
        totalBalance = getTotalBalance() + amount;
        inProcess = getInProcess() + 1;
    }
    public void outCash(double amount)
    {
        if(this.balance >= amount)
        {
            this.balance -= amount;
            totalBalance = getTotalBalance() - amount;
            outProcess = getOutProcess() + 1;
        }else{
            System.out.println("Yetersiz bakiye...");
        }

    }

    public void getAccountInfo()
    {
        System.out.println("Hesap Sahibi\t: " + this.getAccountHolder() + " Hesap No\t: " + this.getAccountNumber() + " Bakiye\t: " + this.getBalance());
    }
}
