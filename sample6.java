class sample6 {
  public static void main(String[] args) {
    int addCount = 0;
    int addSum = 0;
    int evenCount = 0;
    int evenSum = 0;
    
    
    for (int i = 0; i <= 10; i++) {
      if (i % 2 != 0) {
        addCount++;
        addSum += i;
      }
      
      if (i % 2 == 0) {
        evenCount++;
        evenSum += i;
      }
    }
    
    answer(addCount, addSum);
    answer(evenCount, evenSum);
  }
  
  public static void answer(int count, int sum) {
    System.out.println("個数：" + count);
    System.out.println("合計：" + sum);
  }
}