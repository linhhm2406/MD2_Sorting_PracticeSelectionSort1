public class Main {
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.displayList(list);
        System.out.println();
        selectionSort.selectionSort(list);
        selectionSort.displayList(list);
    }
}
