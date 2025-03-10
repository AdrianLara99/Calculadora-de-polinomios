
package calculadora;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Simon Alberto Lopez Higuera
 */
public class V2 extends javax.swing.JFrame {
    poli p1=new poli();
    poli p2=new poli();
    poli p3=new poli();
    poli s=new poli();
    boolean ll=false;
    
   


    /** Creates new form V1 */
    public V2() {
        initComponents();
        
    }
   

    public void llenar()
    {
        
        if(ll==false)
        {
            /**
             * Tomo la informacion de los cuadros de testo y las guardo en las variables
             * donde n1 son los coeficientes del polinomio 1
             */
            String n1=txtN1.getText();
            String e1=txtE1.getText();
            String n2=txtN2.getText();
            String e2=txtE2.getText();
            String n3=txtN3.getText();
            String e3=txtE3.getText();
            
            String m="";
            
            
            //Agrego los ecponentes y coeficientes al polinomio 1
            if(p1.addExp(e1)==true && p1.addNum(n1)==true){
                //es una var que uso para imprimi los polinomios
                    m=p1.toString();
                    //Agrego los ecponentes y coeficientes al polinomio 2
                    if(p2.addExp(e2)==true && p2.addNum(n2)==true){
                        //es una var que uso para imprimi los polinomios
                        m=m+"\n"+p2.toString();
                        //Agrego los ecponentes y coeficientes al polinomio 2
                        if(p3.addExp(e3)==true && p3.addNum(n3)==true){
                            //es una var que uso para imprimi los polinomios
                            m=m+"\n"+p3.toString();
                            //imprimo los polinomios 
                            print(m);
                            //esta var la uso para sabkr quk los polinomio stan bn
                            ll=true;      
                        }
                        else
                            JOptionPane.showMessageDialog(null, "error en el polimio 3");
                     
                    }
                    else
                    JOptionPane.showMessageDialog(null, "error en el polimio 2");
                       
                }
                
            else
            JOptionPane.showMessageDialog(null, "error en el polimio 1");
                   
            
            
        }
      
        
    }
    public void print(String m)
    {
        txtMsn.setText(txtMsn.getText()+"\n"+m);

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        txtN1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtE1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtN2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtE2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtN3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtE3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMsn = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtN1.setText("1 4 5");
        txtN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtN1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(txtN1);
        txtN1.setBounds(220, 100, 200, 30);

        jLabel1.setText("Coefficient");
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(220, 70, 80, 14);

        txtE1.setText("2 1 0");
        jLayeredPane1.add(txtE1);
        txtE1.setBounds(490, 100, 200, 30);

        jLabel2.setText("Exponents");
        jLayeredPane1.add(jLabel2);
        jLabel2.setBounds(490, 70, 80, 14);

        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Polinomio 1"));
        jLayeredPane1.add(jLabel3);
        jLabel3.setBounds(200, 50, 540, 110);

        jLabel5.setText("Coefficient");
        jLayeredPane1.add(jLabel5);
        jLabel5.setBounds(220, 190, 80, 14);

        txtN2.setText("2 2 5 7");
        jLayeredPane1.add(txtN2);
        txtN2.setBounds(220, 220, 200, 30);

        jLabel6.setText("Exponents");
        jLayeredPane1.add(jLabel6);
        jLabel6.setBounds(490, 190, 80, 14);

        txtE2.setText("0 4 6 9");
        txtE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtE2ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(txtE2);
        txtE2.setBounds(490, 220, 200, 30);

        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Polinomio 2"));
        jLayeredPane1.add(jLabel4);
        jLabel4.setBounds(200, 170, 540, 110);

        jLabel8.setText("Coefficient");
        jLayeredPane1.add(jLabel8);
        jLabel8.setBounds(220, 310, 80, 14);

        txtN3.setText("1 5 8");
        jLayeredPane1.add(txtN3);
        txtN3.setBounds(220, 340, 200, 30);

        jLabel9.setText("Exponents");
        jLayeredPane1.add(jLabel9);
        jLabel9.setBounds(490, 310, 80, 14);

        txtE3.setText("2 0 1");
        jLayeredPane1.add(txtE3);
        txtE3.setBounds(490, 340, 200, 30);

        jLabel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Polinomio 3"));
        jLayeredPane1.add(jLabel7);
        jLabel7.setBounds(200, 290, 540, 110);

        txtMsn.setColumns(20);
        txtMsn.setRows(5);
        jScrollPane1.setViewportView(txtMsn);

        jLayeredPane1.add(jScrollPane1);
        jScrollPane1.setBounds(200, 410, 540, 150);

        jButton3.setText("Add");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton3);
        jButton3.setBounds(320, 570, 90, 23);

        jButton5.setText("Return");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton5);
        jButton5.setBounds(460, 570, 110, 23);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jLayeredPane1.add(jLabel10);
        jLabel10.setBounds(0, 0, 800, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Me ordena los polinomio y me devuelve un string con esta informacion
     * @return
     */
    public String ordenar()
    {
        llenar();
        String msn="Ordenados: \n";
        p1.ord();
        msn=msn+p1.toString();
        p2.ord();
        msn=msn+"\n"+p2.toString();
        p3.ord();
        msn=msn+"\n"+p3.toString();
        return msn;

    }
    private void txtN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtN1ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        txtMsn.setText("la suma de los polinomios"+"\n");
        compl();
        String numS="",eS="";
        for (int i = 0; i < p1.exp.size(); i++)
        {
            float n1,n2,n3,su;
            n1=(Float)p1.num.get(i);
            n2=(Float)p2.num.get(i);
            n3=(Float)p3.num.get(i);
            su=n1+n2+n3;
            numS=numS+" "+su;
            eS=eS+" "+i;
        }
        numS=numS.substring(1);
        eS=eS.substring(1);
        s.addExp(eS);
        s.addNum(numS);
        print(s.toString());
        
    }//GEN-LAST:event_jButton3MouseClicked
    //esta funcion me completa  los polinomio, es decir, si el pol tiene 1x^2+8x^4 esta funcion me la llena asi:
    // 0x^0+0x^1+1x^2+0x^3+8x^4

    public String compl()
    {
        llenar();
        String msn="Completados: \n";
        
        ordenar();
        //esto lo hago para saber cual es el polinomio de mayor grado
        LinkedList grados=new LinkedList();
        grados.add(Collections.max(p1.exp));
        grados.add(Collections.max(p2.exp));
        grados.add(Collections.max(p3.exp));
        //M es el mayor exp de los tres pol
        int m=(Integer)Collections.max(grados);
        p1.completar(m);
        msn=msn+"\n"+p1.toString();
        p2.completar(m);
        msn=msn+"\n"+p2.toString();
        p3.completar(m);
        msn=msn+"\n"+p3.toString();
        return msn;

    }
private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jButton3ActionPerformed

private void txtE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtE2ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtE2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new Inicio().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtE1;
    private javax.swing.JTextField txtE2;
    private javax.swing.JTextField txtE3;
    private javax.swing.JTextArea txtMsn;
    private javax.swing.JTextField txtN1;
    private javax.swing.JTextField txtN2;
    private javax.swing.JTextField txtN3;
    // End of variables declaration//GEN-END:variables

}
