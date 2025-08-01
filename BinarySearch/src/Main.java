

public class Main {

    public static void main(String[] args) {
        int[] array = new int[1000000];
        int target = 2828;

        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }

        int index = binaryS(array, target);
        System.out.println(index);
    }

    public static int binaryS(int[] array, int target) {

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int value = array[mid];

            if (target == value) {
                return mid;
            } else if (target > value) left = mid + 1;

              else if (target < value) right = mid - 1;
              else return mid;
        }

        return -1;
    }

}
