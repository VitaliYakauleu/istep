package Examples;
import javax.swing.*;
import java.awt.*;

public class Squares extends JPanel {

    private final int width = 80;
    private final int height = 80;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setBackground(Color.LIGHT_GRAY);
        g2d.clearRect(1, 1, getParent().getWidth(), getParent().getHeight());

        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if (i+j == 4 )
                   // continue;

                drawRect(g2d,3+j*10,6+i*10,10,10);
            }
        }
        //Изобразить 5х5 квадратов
        //В третьей строке оставить только 3 квадрата
        //Пропустить один средний квадрат
        //Пропустить 3-ю строку
        //Пропустить 3-й столбец
        //В первой строке - 1 квадрат, во 2 - 2 и т.д.
        //Квадраты размещены в шахматном порядке
         //Изобразить только главные диагонали
        //


    }
    public static void drawRect(Graphics2D g2d, int left, int top, int width, int height) {
        g2d.setStroke(new BasicStroke(2));
        g2d.setColor(Color.green);
        g2d.fillRect(left, top, width, height);
        g2d.setColor(Color.gray);
        g2d.drawRect(left, top, width, height);
    }

    public static void main(String[] args) {
        // create frame for Main
        JFrame frame = new JFrame("Squares");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Squares app = new Squares();
        frame.add(app);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}