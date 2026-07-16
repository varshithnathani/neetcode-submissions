class Solution {
    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > last) {
                    last = arr[j];
                }
            }
            arr[i] = last;
        }
        return arr;
    }
}
