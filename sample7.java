class sample7 {
  public static void main(String[] args) {
    boolean flg = true;

    for (int i = 1; i <= 10; i++) {

      if (flg) {
        System.out.print(i);
        flg = false;
      } else {
        System.out.print("," + i);
      }
    }
  }
}