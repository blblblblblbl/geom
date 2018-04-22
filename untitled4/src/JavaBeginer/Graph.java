
package JavaBeginer;

import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

public class Graph extends JPanel {
    Scanner sc = new Scanner(System.in);

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
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
                g.drawLine((int) (x[i] + this.getWidth() / 2), (int) (-y[i] + this.getHeight() / 2), (int) (x[j] + this.getWidth() / 2), (int) (-y[j]) + this.getHeight() / 2);
                if (max < Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2))) {
                    max = Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2));
                    ii = i;
                    jj = j;
                }
            }
        }
        g.setColor(Color.MAGENTA);
        g.drawLine((int) (x[ii] + this.getWidth() / 2), (int) (-y[ii] + this.getHeight() / 2), (int) (x[jj] + this.getWidth() / 2), (int) (-y[jj]) + this.getHeight() / 2);
        System.out.println(ii + " " + jj);
        System.out.println(max);
        g.setColor(Color.BLACK);
        g.drawLine(0, this.getHeight() / 2, this.getWidth(), this.getHeight() / 2);
        g.drawLine(this.getWidth() / 2, 0, this.getWidth() / 2, this.getHeight());
        int dx = 5;
        g.drawLine(this.getWidth() / 2, 0, 2 * dx + this.getWidth() / 2, 2 * dx);
        g.drawLine(this.getWidth() / 2, 0, this.getWidth() / 2 - 2 * dx, 2 * dx);
        g.drawLine(this.getWidth(), this.getHeight() / 2, this.getWidth() - 2 * dx, this.getHeight() / 2 - 2 * dx);
        g.drawLine(this.getWidth(), this.getHeight() / 2, this.getWidth() - 2 * dx, this.getHeight() / 2 + 2 * dx);
        g.drawLine(100, this.getHeight() / 2 - dx, 100, this.getHeight() / 2 + dx);
        g.drawLine(200, this.getHeight() / 2 - dx, 200, this.getHeight() / 2 + dx);
        g.drawLine(400, this.getHeight() / 2 - dx, 400, this.getHeight() / 2 + dx);
        g.drawLine(500, this.getHeight() / 2 - dx, 500, this.getHeight() / 2 + dx);
        g.drawLine(this.getWidth() / 2 - dx, 100, this.getWidth() / 2 + dx, 100);
        g.drawLine(this.getWidth() / 2 - dx, 200, this.getWidth() / 2 + dx, 200);
        g.drawLine(this.getWidth() / 2 - dx, 400, this.getWidth() / 2 + dx, 400);
        g.drawLine(this.getWidth() / 2 - dx, 500, this.getWidth() / 2 + dx, 500);
        g.drawString("Y", this.getWidth() / 2 - 4 * dx, 4 * dx);
        g.drawString("X", this.getWidth() - 4 * dx, this.getHeight() / 2 - 4 * dx);

        g.drawString("0", this.getWidth() / 2 + 4 * dx, this.getHeight() / 2 + 4 * dx);
        g.drawString("100", 400, this.getHeight() / 2 + 4 * dx);
        g.drawString("200", 500, this.getHeight() / 2 + 4 * dx);
        g.drawString("-100", 200, this.getHeight() / 2 + 4 * dx);
        g.drawString("-200", 100, this.getHeight() / 2 + 4 * dx);
        g.drawString("100", this.getWidth() / 2 + 4 * dx, 200);
        g.drawString("200", this.getWidth() / 2 + 4 * dx, 100);
        g.drawString("-100", this.getWidth() / 2 + 4 * dx, 400);
        g.drawString("-200", this.getWidth() / 2 + 4 * dx, 500);


    }
}
