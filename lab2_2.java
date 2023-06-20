//Сравнить время выполнения замены символа "а" на "А" любой строки содержащей >
//1000 символов средствами String и StringBuilder.

public class Lab2_2 {

  public static void main(String[] args) {
    String s =
      "Lorem ipsum dolor sit amet, consectetur adipiscing elit." +
      " Ut sit amet lobortis ligula, at venenatis est. Fusce sollicitudin " +
      "sem ante. Donec nulla odio, tempor nec vulputate et, auctor eu ante." +
      " Ut convallis imperdiet tellus id hendrerit. Pellentesque porttitor elementum pretium." +
      " Pellentesque ut mi molestie, ultrices nibh nec, finibus lorem. Suspendisse ac hendrerit neque." +
      " Nulla dapibus sed nisi a fermentum. Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
      "Praesent nisl lectus, sodales vitae arcu at, efficitur facilisis elit. Cras eu tellus id odio" +
      " mollis viverra ac nec lectus. In sodales augue eget laoreet commodo. Nulla commodo efficitur " +
      "arcu, et aliquet tortor.";

    long start = System.nanoTime();
    System.out.println(s.replace("a", "A"));
    System.out.println(System.nanoTime() - start);

    StringBuilder builder = new StringBuilder(s);
    long start2 = System.nanoTime();
    while (builder.indexOf("a") != -1) {
      builder.replace(builder.indexOf("a"), builder.indexOf("a") + 1, "A");
    }
    System.out.println(builder);
    System.out.println(System.nanoTime() - start2);
  }
}
