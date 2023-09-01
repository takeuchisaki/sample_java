class sample8 {
  public static void main(String[] args) {
    int numbers[] = new int[20];
    String oddNumbers = "";
    String evenNumbers = "";
    boolean oddflg = true;
    boolean evenflg = true;
    
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i * 5;
      
      int x = numbers[i];
      int mod = x % 2;
      
      if (i <= 10 && mod == 1) {
        oddNumbers = addToNumbers(oddNumbers, x, oddflg);
        oddflg = false;
      }
      
      if (i > 10 && mod == 0) {
        evenNumbers = addToNumbers(evenNumbers, x, evenflg);
        evenflg = false;
      }
      
    }
    
    System.out.println("奇数：" + oddNumbers);
    System.out.println("偶数：" + evenNumbers);
  }
  
  
  public static String addToNumbers(String numbers, int x, boolean flg) {
    if (flg) {
      numbers += x;
    } else {
      numbers += "," + x;
    }
    return numbers;
  }
}