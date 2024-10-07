package sep29;

public class ForLoop {
    public static void main(String[] args) {
        for(int i = 1; i<100; i++){
            if(i % 7 == 0 ){
                System.out.println("Angad");
                continue;
            }

            System.out.println(i);
        }
    }
}
