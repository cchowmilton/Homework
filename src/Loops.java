public class Loops {
    public static void main(String[] args) {
        Loops myHomework = new Loops();
    }

    public Loops() {
        countUp();
        countByThrees();
        countDown();
    }//end of loops method

    static void countUp(){
        System.out.println();
        for(int i=1; i<=5; i=i+1){
            System.out.println(i);
        }

    }
    static void countByThrees(){
        System.out.println();
        for(int i=1; i<=5; i++){
            System.out.print(3*i + " ");
        }
    }
    static void countDown(){
        System.out.println();
        for(int i=10; i>=1; i=i-1){
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println("Happy Loop Year!");
    }
}//end of loops class
