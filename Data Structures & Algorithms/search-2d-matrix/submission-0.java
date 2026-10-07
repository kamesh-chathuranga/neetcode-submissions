class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        for(int[] arr : matrix) {
            boolean found = binarySearch(arr, target);

            if(found) {
                return true;
            }
        }

        return false;
    }

    public boolean binarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while(s <= e) {
            int mid = s + (e - s) / 2;

            if(arr[mid] < target) {
                s = mid + 1;
            } else if(arr[mid] > target) {
                e = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
