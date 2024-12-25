package pkg;
class Obj {
    int var;
    Obj(int var) {
        this.var = var;
    }
}


class Main {
    public static void main(String[] args) {
        Integer references[][] = new Integer[5][];
        for (int i = 0; i<5; i++) {
            references[i] = new Integer[i];
            for (int j = 0; j<i; j++) {
                references[i][j] = j*10;
            }
        }
        for (int i = 0; i < references.length; i++) {
            for (int j = 0; j < references[i].length; j++) {
                System.out.print(references[i][j] + " ");
            }
            System.out.println();
    }
    
}
}