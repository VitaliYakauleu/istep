package Examples;

public class MexicanWave {
    public static void main(String[] args) throws InterruptedException {
        String s = "hello";
        System.out.print(s);

        int index = 0;
        while (true) {


            Thread.sleep(500);
            for (int i = 0; i < 5; i++) {
                System.out.print("\b");
                Thread.sleep(500);

            }
            StringBuilder sb = new StringBuilder(s);
            Character c = sb.charAt(index);
            sb.setCharAt(index,c.toString().toUpperCase().charAt(0));
            System.out.print(sb);
            index++;
            if (index==5) index = 0;

        }



    }

}
