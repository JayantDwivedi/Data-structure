//package InterpolationSearch;
//
//public class InterpolationSearch {
//    // creating a static array
//    static int[] arr = new int[] {10,20,30,40,50,60,70,80,90};
//    // x is the key to find
//    static int interpolationSearch(int x) {
//        int low = 0, high = (arr.length - 1);
//        while (low <= high && x >= arr[low] && x <= arr[high]){
//            if (low == high) {
//                if (arr[low] == x){
//                    return low;
//                }
//                else {
//                    return -1;
//                }
//                int pos = low + (((high - low) / (arr[high] - arr[low])) * (x - arr[low]));
//                if (arr[pos] == x) {
//                    return pos;
//                }
//                if (arr[pos] < x) {
//                    low = pos + 1;
//                }
//                else {
//                   high = pos -1 ;
//                }
//                return -1;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int x = 40;
//        int index = interpolationSearch(x);
//        if (index != -1) {
//            System.out.println("Element found at " + index + " index");
//        }
//        else {
//            System.out.println("Element not found");
//        }
//    }
//}
