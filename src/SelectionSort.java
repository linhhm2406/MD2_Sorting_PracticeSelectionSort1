public class SelectionSort {

    public void selectionSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            double min = list[i];
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (min > list[j]) {
                    min = list[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
    }

    public void displayList (double[] list){
        for (double element: list) {
            System.out.print(element+" ");
        }
    }
}
