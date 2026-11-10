import java.util.Scanner;

class BankAccount {
    private int balance;

    BankAccount(int openingBalance) {
        balance = openingBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int starting = sc.nextInt();
        int amount = sc.nextInt();

        BankAccount account = new BankAccount(starting);
        System.out.println("Starting balance: " + account.getBalance());

        account.withdraw(amount);
        System.out.println("Final balance: " + account.getBalance());
    }
}