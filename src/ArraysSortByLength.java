import java.util.ArrayList;

public class ArraysSortByLength {
    public static void main(String[] args) {
        int[] customers = {3,1,2,5,-1};
        ArrayList<String> sortedCustomers = new ArrayList<>();

        for (int i = 0; i < customers.length; i++) {
            int smallItem = customers[i];
            int smallItemId = i;
            for (int j = i + 1; j < customers.length; j++) {

                if (smallItem > customers[j]) {

                    customers[smallItemId] = customers[j];
                    customers[j] = smallItem;
                    smallItemId = j;


                }
            }

        }
        for (int items : customers) {
            System.out.print(items+",");
        }
    }
}
