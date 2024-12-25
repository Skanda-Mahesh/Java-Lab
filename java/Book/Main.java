import java.util.Scanner;

class Book {
    String name;
    String author;
    float price;
    int no_pages;

    Book() {
        name = "";
        author = "";
        price = 0;
        no_pages = 0;
    }

    Book(String name, String author, float price, int no_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.no_pages = no_pages;
    }

    void getd() {
        Scanner sx = new Scanner(System.in);
        System.out.println("Please enter the book information in the format\n 1:Book name \n 2: Author \n 3: Price \n 4: no_pages:  ");
        name = sx.nextLine();
        author = sx.nextLine();
        price = sx.nextFloat();
        no_pages = sx.nextInt();


    }

    void putd() {
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Price:" + price);
        System.out.println("Number of pages: " + no_pages);        

    }
    
    public String tostring() {
        return (name + " \n " + author + " \n " + price + "\n" + no_pages + "\n");
    }
}


class Main {
    
    public static void main(String[] args) {
        Scanner sx = new Scanner(System.in);
        boolean flag = false;
        int input = 0;
        int size = 0;
        System.out.println("Enter number of books: ");
        size = sx.nextInt();
        int i = 0;

        Book obj[] = new Book[size]; 



        while (flag == false) {
           
            System.out.println("1:Create new object \n 2: Display values \n 3:Exit ");
            input = sx.nextInt();

            switch (input) {
                case 1:
                    obj[i] = new Book();
                    obj[i].getd();
                    i++;
                    break;
                case 2:
                    for (int c = 0; c<i; c++) {
                        obj[c].putd();
                    }
                    
                    break;
                case 3:
                    flag = true;

            }
}
    }


}





