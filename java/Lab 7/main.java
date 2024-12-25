import java.util.Scanner;

class WrongAge extends Exception {
    public String toString() {
        return "Input age cannot be less than 0";
    }
}

class MismatchedAge extends Exception {
    public String toString() {
        return "Father age cannot be less than child age";
    }
}


class Father {
    int age;
    Father() {};
    Father(int i) throws WrongAge {
        if (i < 0) {
            throw new WrongAge();
        }
        else {
            this.age = i;
        }

    }
}


class Son extends Father {
    int sonAge; 
    Son(int i, int Father) throws WrongAge, MismatchedAge {
        super(Father);
        if (i < 0) {
            throw new WrongAge();
        }
        else if (i > super.age) {
            throw new MismatchedAge();
        }
        else {
            sonAge = age;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Enter Father's age: ");
            int f1 = s.nextInt();
            Father f = new Father(f1);

            System.out.print("Enter Son's age: ");
            int s1 = s.nextInt();
            Son t = new Son(s1, f1);
            System.out.println("Worked");

            System.out.print("Enter Father's age: ");
            int f2 = s.nextInt();
            Father g = new Father(f2);

            System.out.print("Enter Son's age: ");
            int s2 = s.nextInt();
            Son u = new Son(s2, f2);
            System.out.println("Worked");
        } catch (WrongAge e) {
            System.out.println(e);
        } catch (MismatchedAge e) {
            System.out.println(e);
        }
    }
}