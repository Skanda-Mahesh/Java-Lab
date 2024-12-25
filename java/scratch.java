class Print<T> {
    T data;
    Print (T data) {
        this.data = data;
    }
    public void print() {
        System.out.println(data);
    }
}

class Main {
    public static void main(String[] args) {
        int a = 5;
        Print<Integer> P1 = new Print<>(a);

        P1.print();
    }
}