class sample8 {
  public static void main(String[] args) {
    int numbers[] = new int[20];
    String oddNumbers = "";
    String evenNumbers = "";
    boolean flg = true;
    
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i * 5;
      
      int x = numbers[i];
      int mod = x % 2;
      
      if (i <= 10 && mod == 1) {
        if (flg) {
          oddNumbers += x;
          flg = false;
        } else {
          oddNumbers += "," + x;
        }
      }
      
      if (i > 10 && mod == 0) {
        if (flg) {
          evenNumbers += x;
          flg = false;
        } else {
          evenNumbers += "," + x;
        }
      }
      
      // if (i <= 10 && mod == 1) {
      //   oddNumbers = addToNumbers(oddNumbers, x);
      // }
      
      // if (i > 10 && mod == 0) {
      //   evenNumbers = addToNumbers(evenNumbers, x);
      // }
        
    }
    
    System.out.println("奇数：" + oddNumbers);
    System.out.println("偶数：" + evenNumbers);
  }
  
  // public static String addToNumbers(String numbers, int x) {
  //   if (!numbers.isEmpty()) {
  //         numbers += ",";
  //       }
  //       return numbers + x;
  // }
  
  // public static String addToNumbers(String numbers, int x) {
  //   if (flg) {
  //         oddNumbers += x;
  //         flg = false;
  //       } else {
  //         oddNumbers += "," + x;
  //       }
}