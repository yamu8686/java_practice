class main {
  public static void main (String[] args) {
    for (int i = 100; i < 400; i++) {
      if (i % 4 != 0) {
        System.out.println("平年です");
      } else if (i % 100 == 0 && i % 400 != 0) {
        System.out.println("平年です");
      } else {
        System.out.println(i);
      }
    }
  }
}