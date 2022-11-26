public class SelectSortTest {
    public static void main(String[] args) {
        int[] data = {3,1,6,2,5};
        for (int i=0; i<data.length; i++) {
            int min = i;
            for (int j=i+1; j<data.length; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
    
            if (min != i) {
                int temp = data[i];
                data[i] = data[min];
                data[min] = temp;
            }
        }
        for (int i=0; i<data.length; i++) {
            System.out.println(data[i]);
        }
    }
}