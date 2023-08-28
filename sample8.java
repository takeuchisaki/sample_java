class sample8 {
  public static void main(String[] args) {
    int numbers[] = new int[20];
    String oddNumbers = "";
    String evenNumbers = "";
    
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i * 5;
      
      int x = numbers[i];
      int mod = x % 2;
      
      if (i <= 10 && mod == 1) {
        oddNumbers = addToNumbers(oddNumbers, x);
      }
      
      if (i > 10 && mod == 0) {
        evenNumbers = addToNumbers(evenNumbers, x);
      }
        
    }
    
    System.out.println("奇数：" + oddNumbers);
    System.out.println("偶数：" + evenNumbers);
  }
  
  public static String addToNumbers(String numbers, int x) {
    if (!numbers.isEmpty()) {
          numbers += ",";
        }
        return numbers + x;
  }
}