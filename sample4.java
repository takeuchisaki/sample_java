class sample4 {
  public static void main(String[] args) {
    int numbers[] = new int[20];
    String add = "";
    String even = "";

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i * 5;
    }

    for (int i = 0; i < numbers.length; i++) {
      int x = numbers[i];
      int mod = x % 2;

      if (i <= 10 && mod == 1) {
        add += x + ",";
      }

      if (i > 10 && mod == 0) {
        even += x + ",";
      }

      // add += i <= 10 && mod == 1 ? x + "," : "";
      // even += i > 10 && mod == 0 ? x + "," : "";
    }

    System.out.println("奇数：" + add);
    System.out.println("偶数：" + even);


  }
}