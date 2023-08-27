class sample2 {
  public static void main(String[] args) {
    int count = 0;
    int sum = 0;
    
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        count++;
        sum += i;
      }
    }
    
    System.out.println("個数：" + count);
    System.out.println("合計：" + sum);
  }
}