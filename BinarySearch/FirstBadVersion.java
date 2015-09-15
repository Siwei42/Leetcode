package BinarySearch;
/* The isBadVersion API is defined in the parent class VersionControl.
boolean isBadVersion(int version); */
public class FirstBadVersion {
	public int firstBadVersion(int n) {
        int min = 1, max = n, mid;
        while(min+1 < max){
            mid = min + (max - min) / 2;
            if(isBadVersion(mid))
                max = mid;
            else
                min = mid;
        }
        if(isBadVersion(min))
            return min;
        else
            return max;
    }
}
