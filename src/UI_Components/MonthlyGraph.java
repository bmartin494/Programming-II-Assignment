/**
 * This is the class for creating the monthly report graph, utilised by clicking the graph button on the simulation panel.
 * This will hold all the necessary methods that are required to draw and populate the graph.
 * It requires the instantiation of both the transList and newAccount objects from the SimulatorJFrame and CreateAccountJFrame
 * classes respectively. This allows it to access all the required variables and lists to create the report.
 * Created by: Ben Martin
 * Last Edited: 2/12/18
 */
package UI_Components;

/**
 *
 * @author ben.martin
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import bankassignment.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;


public class MonthlyGraph extends JPanel {

    //variable declaration
    private int width = 800;
    private int heigth = 400;
    private int padding = 25;
    private int labelPadding = 25;
    private Color lineColor = new Color(44, 102, 230, 180);
    private Color pointColor = new Color(100, 100, 100, 180);
    private Color gridColor = new Color(200, 200, 200, 200);
    private static final Stroke graphStroke = new BasicStroke(3f);
    private int xAxisNotchHeight = 4;
    private int numberYDivisions = 10;
    private List<Double> monthlyBalances;
    private static TransactionList graphValues = SimulatorJFrame.transList;
    private static Account newAccount = CreateAccountJFrame.newAccount;
    
    public MonthlyGraph(List<Double> monthlyBalances) {
        this.monthlyBalances = monthlyBalances;
    }

    //this is declaring the drawing components for the panel
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // setting the X axis using the number of transactions that have occurred
        // and the y axis by taking the highest and lowest values recorded and dividing by 10
        double xScale = ((double) getWidth() - (2 * padding) - labelPadding) / (monthlyBalances.size() - 1);
        double yScale = ((double) getHeight() - 2 * padding - labelPadding) / (getMaxValue() - getMinValue());

        List<Point> graphPoints = new ArrayList<>();
        for (int i = 0; i < monthlyBalances.size(); i++) {
            int x1 = (int) (i * xScale + padding + labelPadding);
            int y1 = (int) ((getMaxValue() - monthlyBalances.get(i)) * yScale + padding);
            graphPoints.add(new Point(x1, y1));
        }

        // draw white background
        g2.setColor(Color.WHITE);
        g2.fillRect(padding + labelPadding, padding, getWidth() - (2 * padding) - labelPadding, getHeight() - 2 * padding - labelPadding);
        g2.setColor(Color.BLACK);

        // create hatch marks and grid lines for y axis.
        for (int i = 0; i < numberYDivisions + 1; i++) {
            int x0 = padding + labelPadding;
            int x1 = xAxisNotchHeight + padding + labelPadding;
            int y0 = getHeight() - ((i * (getHeight() - padding * 2 - labelPadding)) / numberYDivisions + padding + labelPadding);
            int y1 = y0;
            if (monthlyBalances.size() > 0) {
                g2.setColor(gridColor);
                g2.drawLine(padding + labelPadding + 1 + xAxisNotchHeight, y0, getWidth() - padding, y1);
                g2.setColor(Color.BLACK);
                String yLabel = ((int) ((getMinValue() + (getMaxValue() - getMinValue()) * ((i * 1.0) / numberYDivisions)) * 100)) / 100.0 + "";
                FontMetrics metrics = g2.getFontMetrics();
                int labelWidth = metrics.stringWidth(yLabel);
                g2.drawString(yLabel, x0 - labelWidth - 5, y0 + (metrics.getHeight() / 2) - 3);
            }
            g2.drawLine(x0, y0, x1, y1);
        }

        // create hatch marks and grid lines for x axis.
        for (int i = 0; i < monthlyBalances.size(); i++) {
            if (monthlyBalances.size() > 1) {
                int x0 = i * (getWidth() - padding * 2 - labelPadding) / (monthlyBalances.size() - 1) + padding + labelPadding;
                int x1 = x0;
                int y0 = getHeight() - padding - labelPadding;
                int y1 = y0 - xAxisNotchHeight;
                if ((i % ((int) ((monthlyBalances.size() / 20.0)) + 1)) == 0) {
                    g2.setColor(gridColor);
                    g2.drawLine(x0, getHeight() - padding - labelPadding - 1 - xAxisNotchHeight, x1, padding);
                    g2.setColor(Color.BLACK);
                    String xLabel = i + "";
                    FontMetrics metrics = g2.getFontMetrics();
                    int labelWidth = metrics.stringWidth(xLabel);
                    g2.drawString(xLabel, x0 - labelWidth / 2, y0 + metrics.getHeight() + 3);
                }
                g2.drawLine(x0, y0, x1, y1);
            }
        }

        // drawing x and y axes 
        g2.drawLine(padding + labelPadding, getHeight() - padding - labelPadding, padding + labelPadding, padding);
        g2.drawLine(padding + labelPadding, getHeight() - padding - labelPadding, getWidth() - padding, getHeight() - padding - labelPadding);

        Stroke oldStroke = g2.getStroke();
        g2.setColor(lineColor);
        g2.setStroke(graphStroke);
        for (int i = 0; i < graphPoints.size() - 1; i++) {
            int x1 = graphPoints.get(i).x;
            int y1 = graphPoints.get(i).y;
            int x2 = graphPoints.get(i + 1).x;
            int y2 = graphPoints.get(i + 1).y;
            g2.drawLine(x1, y1, x2, y2);
        }

        g2.setStroke(oldStroke);
        g2.setColor(pointColor);
        for (int i = 0; i < graphPoints.size(); i++) {
            int x = graphPoints.get(i).x - xAxisNotchHeight / 2;
            int y = graphPoints.get(i).y - xAxisNotchHeight / 2;
            int ovalW = xAxisNotchHeight;
            int ovalH = xAxisNotchHeight;
            g2.fillOval(x, y, ovalW, ovalH);
        }
    }

//    @Override
//    public Dimension getPreferredSize() {
//        return new Dimension(width, heigth);
//    }
    private double getMinValue() {
        //sets the min score to the largest possible double to begin the comparison
        double minValue = Double.MAX_VALUE;
        for (Double value : monthlyBalances) {
            minValue = Math.min(minValue, value);
        }
        return minValue;
    }

    private double getMaxValue() {
        //sets the max score to the smallest possible double to begin the comparison
        double maxValue = Double.MIN_VALUE;
        for (Double value : monthlyBalances) {
            maxValue = Math.max(maxValue, value);
        }
        return maxValue;
    }

    //this is the method that actually populates the graph panel with points from a list that is populated from the  
    //transList in the SimulatorJFrame class
    private static void createAndShowGui() {
        List<Double> monthlyBalances = new ArrayList<>();
        int maxDataPoints = graphValues.transList.size();
        
        monthlyBalances.add((double) newAccount.getInitialDeposit());
        
        for (int i = 0; i < maxDataPoints; i++) {
        double balancePopulator = graphValues.transList.get(i).getNewBalance();
        monthlyBalances.add(balancePopulator);
        }
        
        MainPanel mainPanel = new MainPanel(monthlyBalances);
        mainPanel.setPreferredSize(new Dimension(800, 600));
        JFrame frame = new JFrame("Monthly Graph");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    //this is the method that actually gets called when the graph button is clicked on the SimulatorJFrame panel 
    //to create the graph panel
    public static void drawGraph() {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            createAndShowGui();
         }
      });
   }
    
    //Main changes underneath to the basic panel that add graph and axis titles
    static class MainPanel extends JPanel {

        public MainPanel(List<Double> monthlyBalances) {

            setLayout(new BorderLayout());

            JLabel title = new JLabel("Monthly Account Balance Graph");
            title.setFont(new Font("Arial", Font.BOLD, 25));
            title.setHorizontalAlignment(JLabel.CENTER);

            JPanel MonthlyGraph = new MonthlyGraph(monthlyBalances);

            VerticalPanel vertPanel = new VerticalPanel();

            HorizontalPanel horiPanel = new HorizontalPanel();

            add(title, BorderLayout.NORTH);
            add(horiPanel, BorderLayout.SOUTH);
            add(vertPanel, BorderLayout.WEST);
            add(MonthlyGraph, BorderLayout.CENTER);    

        }

        //this is the panel at the left of the graph that displays the y axis title
        class VerticalPanel extends JPanel {

            public VerticalPanel() {
                setPreferredSize(new Dimension(35, 0));
            }

            @Override
            public void paintComponent(Graphics g) {

                super.paintComponent(g);

                Graphics2D gg = (Graphics2D) g;
                gg.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                Font font = new Font("Arial", Font.PLAIN, 15);

                String string = "Balance (£)";

                FontMetrics metrics = g.getFontMetrics(font);
                int width = metrics.stringWidth(string);
                int height = metrics.getHeight();

                gg.setFont(font);

                drawRotate(gg, getWidth(), (getHeight() + width) / 2, 270, string);
            }

            public void drawRotate(Graphics2D gg, double x, double y, int angle, String text) {
                gg.translate((float) x, (float) y);
                gg.rotate(Math.toRadians(angle));
                gg.drawString(text, 0, 0);
                gg.rotate(-Math.toRadians(angle));
                gg.translate(-(float) x, -(float) y);
            }

        }

        //this is the panel at the bottom of the graph that displays the x axis title
        class HorizontalPanel extends JPanel {

            public HorizontalPanel() {
                setPreferredSize(new Dimension(0, 35));
                
            }

            @Override
            public void paintComponent(Graphics g) {

                super.paintComponent(g);

                Graphics2D gg = (Graphics2D) g;
                gg.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                Font font = new Font("Arial", Font.PLAIN, 15);

                String string = "Month from starting account";

                FontMetrics metrics = g.getFontMetrics(font);
                int width = metrics.stringWidth(string);
                int height = metrics.getHeight();

                gg.setFont(font);

                gg.drawString(string, (getWidth() - width) / 2, 11);
                
            }
            
        }

    }

}