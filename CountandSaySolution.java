public class CountandSaySolution {
    public static void main(String[] args){
        System.out.println(new CountandSaySolution().countAndSay(4));
    }

    public String countAndSay(int n) {
      StringBuilder s1 = new StringBuilder("1");
      StringBuilder s2 = new StringBuilder();
      for (int i = 1; i < n; i++) {
        int j = 0;
        int len = s1.length();
        while (j < len) {
          int count = 1;
          char c = s1.charAt(j);
          while (j < len - 1 && s1.charAt(j + 1) == s1.charAt(j)) {
            count++;
            j++;
          }
          s2.append(count + "");
          s2.append(c);
          if (j == len - 1) {
            break;
          }
          j++;
        }
        s1 = s2;
        s2 = new StringBuilder();
      }
      return s1.toString();
    }
}
