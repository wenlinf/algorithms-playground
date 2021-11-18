public class NaiveSearch {
    static int naiveSearch (String longStr, String shortStr){
        int count =0;
        int index = longStr.indexOf(shortStr.charAt(0));
        if(index==-1) return count;
        for (int i = 0; i <longStr.length() ; i++) {
            if (longStr.charAt(i)==shortStr.charAt(0)){
                for (int j = 0; j <shortStr.length() ; j++) {
                    if (shortStr.charAt(j)!=longStr.charAt(i+j)){
                        break;
                    }
                    if (j == shortStr.length()-1) count++;
                }

            }
        }
        return count;
    }

    public static void main(String[] args) {
        int count = naiveSearch("hahaloriehahaldoejhg", "ha");
        System.out.println(count);
    }
}
