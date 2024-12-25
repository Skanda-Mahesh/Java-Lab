class Account {
    protected String customerName;
    protected int customerID;
    protected double balance;
    protected String accType;
    protected double intrest;

    Account(String Name, String type, int ID, double bal) {
        customerName = Name;
        customerID = ID;
        accType = type;
        balance = bal;
    }

    double deposit(int dep) {
        if (dep > 0) {
            balance += dep;
            return balance;
        }
        else {
            System.out.println("Deposit must be possitive!");
            return balance;
        }
    }

    void display() {
        System.out.println("Customer Name: " + customerName + " Customer ID: " + customerID + " Balance: " + balance);;
    }

    double widhrawl (int ammount) {
        if (ammount > balance) {
            System.out.println("Account balance is insufficient");
            return balance;
        }
        else {
            balance -= ammount;
            return balance;
        }
    }

    void intrest () {
        if (accType == "Checking") {
            intrest = balance * 0.05;
        }

        else if (accType == "Savings") {
            intrest = balance * (1 + 0.05);
        }
    }

    void SetType (String T) {
        accType = T;
    }

}

class Savings extends Account {
    Savings(String Name, int ID, double bal) {
        super(Name, "Savings", ID, bal);
        intrest();
    }

}

class Current extends Account {
    Current(String Name, int ID, double bal) {
        super(Name, "Current", ID, bal);
        intrest();
    }

    @Override
    double widhrawl(int ammount) {
        if (ammount > balance) {
            System.out.println("ballance is not sufficient!");
            return balance;
        }
        else if (10000 > (balance - ammount)) {
            balance -= (balance - ammount);
            return balance;
        }
        else {
            balance -= ammount;
            return balance;
        }
    }

}


class Main {
    public static void main(String[] args) {
        Current c1 = new Current("Skanda", 1, 5000);
        Savings s1 = new Savings("Skanda", 2, 20000);

        c1.display();
        s1.display();
        c1.widhrawl(40000);
        s1.widhrawl(205);
        
        c1.display();
        s1.display();

    }
    
}