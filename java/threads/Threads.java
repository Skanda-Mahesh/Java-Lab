class CollegeName extends Thread {
    public void run() {
        try {
            while (true) {


                System.out.println("BMS College of Engineering");
                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}

class DepartmentName extends Thread {
    public void run() {
        try {
            while (true) {


                System.out.println("CSE");
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}


class Main {
    public static void main(String[] args) {
        CollegeName c = new CollegeName();
        DepartmentName d = new DepartmentName();

        System.out.println("Printing college name then department name with delay: \n");

            c.start();
            d.start();
    }
}
