package interviewcake.section_04;

class Problem_01 {
    int findRotationPoint(String[] A) {
        int l = 0, r = A.length - 1;
        if (l > r) {
            return -1;
        }
        String first = A[0];
        int mid = (l + r) >>> 1;
        do {
            String midVal = A[mid];
            if (midVal.compareTo(first) < 0) {
                r = mid - 1;
            } else if (midVal.compareTo(first) > 0) {
                l = mid + 1;
            } else {
                break;
            }
            mid = (l + r) >>> 1;
        } while (r >= l);
        return mid + 1;
    }
}
