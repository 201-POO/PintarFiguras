package fig;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author 
 */
public class NewJFrame extends javax.swing.JFrame {

    static List<Figure2D> vector = new CopyOnWriteArrayList<Figure2D>();
    
    public NewJFrame() {
        initComponents();
        llenar_vector();
        setTitle("FIGURAS UTILIZANDO POLIMORFISMO");
    }

    public void llenar_vector() {
        vector.add(new Circle(20,50,200,Color.blue));
        vector.add(new Circle(120,150,100,Color.ORANGE));
        vector.add(new Rectangle(200,250,100,200,Color.ORANGE));
        
        /*
        int N, h, w;
    int i,x,y,r,alto,ancho;
    Color color;
    N=300;
    vector=new Figura[N];
    h= this.getHeight();
    w=this.getWidth();
  
    for(i=0;i<N;i++)
    {
       x=(int)(Math.random()*w);
       y=(int)(Math.random()*h);
       color=new Color((int)(Math.random()*250),(int)(Math.random()*250),(int)(Math.random()*250));
         if( (int)(Math.random()*2)==0)
         {
               r=(int)(Math.random()*30);
               vector[i]=new Circulo(x,y,r,color);
         }
         else
         {
               alto=(int)(Math.random()*30);
               ancho=(int)(Math.random()*30);
               vector[i]=new Rectangulo(x,y,alto,ancho,color);
         }
    }*/
    }

    public void paint(Graphics g) {
        super.paint(g);
        for (Figure2D d : vector) {
            d.pintar(g);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 785, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
