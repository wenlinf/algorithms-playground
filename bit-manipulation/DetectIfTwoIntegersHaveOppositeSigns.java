class DetectIfTwoIntegersHaveOppositeSigns {
    private static boolean oppositeSigns(int x, int y) {
      //Time & Space complexity: O(1)
        return (x ^ y) < 0;
    }
}
