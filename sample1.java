class sample1 {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
    
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        continue;
      }
      System.out.println(i);
    }
    
    for (int i = 10; i > 0; i--) {
      System.out.println(i);
    }
    
    
    int i = 1;
    
    while (i <= 10) {
      System.out.println(i);
      i++;
    }
    
  }
}