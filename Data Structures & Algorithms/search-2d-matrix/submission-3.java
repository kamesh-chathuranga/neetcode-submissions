class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        return binarySearch(matrix, target, 0);
    }

    public boolean binarySearch(int[][] matrix, int target, int i) {
        if(i == matrix.length) return false;

        int[] arr = matrix[i];

        int s = 0;
        int e = arr.length - 1;

        if(arr[e] < target) {
            return binarySearch(matrix, target, ++i);
        }

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
