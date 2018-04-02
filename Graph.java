
package JavaBeginer;
import java.awt.*;
import java.util.Scanner;
import javax.swing.*;
public class Graph extends JPanel {
    Scanner sc = new Scanner(System.in);
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        g.drawLine(0, 200, 600, 200);
        g.drawLine(300, 0, 300, 400);
        int n = sc.nextInt();
        double x[] = new double[n];
        double y[] = new double[n];
        for (int a = 0; a < n; a++) {
            x[a] = sc.nextDouble();
        }
        for (int a = 0; a < n; a++) {
            y[a] = sc.nextDouble();
        }
        double max = 0;
        int ii = 0;
        int jj = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                g.setColor(Color.GREEN);
                g.drawLine((int) (x[i] + 300), (int) (-y[i] + 200), (int) (x[j] + 300), (int) (-y[j]) + 200);
                if (max < Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2))) {
                    max = Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2));
                    ii = i;
                    jj = j;
                }
            }
        }
        g.setColor(Color.MAGENTA);
        g.drawLine((int) (x[ii] + 300), (int) (-y[ii] + 200), (int) (x[jj] + 300), (int) (-y[jj]) + 200);
        System.out.println(ii+" "+jj);
    }
}
