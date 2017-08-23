public class CountByThrees {

    public static void main(String args[]){

        for (int start = 3; start <= 300 ; start++)
        {
            if (start  % 30 == 0){
                System.out.println(start);
            }
            else {
                System.out.print(start + " ");
            }

        }
    }
}
