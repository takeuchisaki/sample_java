class sample4 {
  public static void main(String[] args) {
    int numbers[] = new int[20];
    String add = "";
    String even = "";
    
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i * 5;
      
      int x = numbers[i];
      int mod = x % 2;
      
      if (i <= 10 && mod == 1) {
        if (!add.isEmpty()) {
          add += ",";
        }
        add += x;
      }
      
      if (i > 10 && mod == 0) {
        if (!even.isEmpty()) {
          even += ",";
        }
        even += x;
      }
      
    }
    
    System.out.println("奇数：" + add);
    System.out.println("偶数：" + even);
    
    for (int number: numbers) {
      if (number % 2 == 0) {
        System.out.print(number + ",");
      }
    }
    
  }
}