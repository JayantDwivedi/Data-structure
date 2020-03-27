package BinarySearch;

public class BinarySearch {

    public BinarySearch(int element,int[]arr)
    {
        int lowerBound = 0;
        int upperBound = arr.length - 1;
       int midBound;

        while (upperBound == lowerBound)
        {
            midBound = (lowerBound + upperBound) / 2;

            if(element < arr[midBound])
            {
                upperBound = midBound - 1;
            }
            else
            {
                lowerBound = midBound + 1;
            }
        }


    }
}
