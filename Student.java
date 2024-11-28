import java.util.Scanner;

class Student {
    String name;
    String USN;
    int credits[] = new int[20]; // Ask ma'am about dynamic mem allocation like C How to do in classes

    int marks[] = new int[20];  // If i did the mem alloc inside the func, it would be only in function scope
    int i = 0;

    void getd() {
        Scanner sx = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sx.next();
        System.out.println("Enter USN: ");
        USN = sx.next();
        System.out.println("Enter number of Credits : ");
        credits[i] = sx.nextInt();
        System.out.println("Enter number of marks scored: ");
        marks[i] = sx.nextInt();
        i++;
        sx.close();
    }

    float calc_SGPA() {
        int credits_count = 0;
        int sum = 0;
        for (int c = 0; c<i; c++) {
            sum += credits[c] * marks[c];
            credits_count += credits[c]; 
        }

        return sum/credits_count;
    }

    void putd() {
        System.out.println("name: ");
        System.out.println("USN:  ");

        for (int c = 0; c<i; c++) {
            System.out.println("Marks: " + marks[c] + "  Credits: " + credits[c]);
        }

    }

    

}


class Main {
    public static void main(String[] args) {
        boolean flag = false;
        int input;

        Student s1 = new Student();


        while (flag == false) {
            Scanner sx = new Scanner(System.in);
            System.out.println("1:New input \n 2: Display values \n 3: Calc SGPA \n 4:Exit ");
            input = sx.nextInt();


            switch (input) {
                case 1:
                    s1.getd();
                    break;
                case 2:
                    s1.calc_SGPA();
                    break;
                case 3:
                    s1.putd();
                    break;
                case 4:
                    flag = true;

            }
        sx.close();
        }
        
    }

}