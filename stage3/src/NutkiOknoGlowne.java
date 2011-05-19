
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.neuroph.contrib.imgrec.ImageRecognitionPlugin;
import org.neuroph.core.NeuralNetwork;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NutkiOknoGlowne.java
 *
 * Created on 2011-05-17, 23:01:57
 */

/**
 *
 * @author Kasia
 */
public class NutkiOknoGlowne extends javax.swing.JFrame {

    /** Creates new form NutkiOknoGlowne */
    String imgPath = null;
    String recognizedValue;
    double recognizedValueRate;

    String recognizedHeight;
    double recognizedHeightRate;

    public NutkiOknoGlowne() {
        this.recognizedValue = null;
        this.recognizedValueRate = 0;
        
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NutkiOknoGlowne.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(NutkiOknoGlowne.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(NutkiOknoGlowne.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(NutkiOknoGlowne.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        imgLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        imgLabelR = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        recognizeValueButton = new javax.swing.JButton();
        recognizeHeight = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        heightLabel = new javax.swing.JLabel();
        valueRateLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        infoArea = new javax.swing.JTextArea();
        heightRateLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imgLabel.setBackground(new java.awt.Color(204, 0, 0));
        imgLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        imgLabel.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel1.setText("Note to recognize:");

        imgLabelR.setBackground(new java.awt.Color(204, 0, 0));
        imgLabelR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        imgLabelR.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel2.setText("Recognized note:");

        recognizeValueButton.setText("Recognize value");
        recognizeValueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recognizeValueButtonActionPerformed(evt);
            }
        });

        recognizeHeight.setText("Recognize height");
        recognizeHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recognizeHeightActionPerformed(evt);
            }
        });

        valueLabel.setText("Value: osemka");

        heightLabel.setText("Height: C");

        valueRateLabel.setText("Rate: 0");

        jLabel3.setText("Info:");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        infoArea.setColumns(20);
        infoArea.setRows(5);
        jScrollPane2.setViewportView(infoArea);

        heightRateLabel.setText("Rate: 0");

        jMenu1.setText("File");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Open File");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenuItem2.getAccessibleContext().setAccessibleName("openFile");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Quit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem1.setText("Info");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(recognizeValueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recognizeHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(imgLabelR, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(valueLabel)
                            .addComponent(valueRateLabel)
                            .addComponent(heightLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(heightRateLabel)))
                .addContainerGap(93, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(458, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(recognizeValueButton)
                        .addGap(6, 6, 6)
                        .addComponent(recognizeHeight))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addComponent(imgLabelR, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(valueLabel)
                        .addGap(6, 6, 6)
                        .addComponent(valueRateLabel)
                        .addGap(6, 6, 6)
                        .addComponent(heightLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(heightRateLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JFileChooser chooser = new JFileChooser(".");
        
        ExampleFileFilter filter = new ExampleFileFilter();
        filter.addExtension("jpg");
        filter.addExtension("gif");
        filter.addExtension("png");
        filter.setDescription("JPG & GIF Images");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(jMenu1);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            /*System.out.println("You chose to open this file: " +
            chooser.getSelectedFile().getAbsolutePath());*/
            imgPath = chooser.getSelectedFile().getAbsolutePath();
        }

        try
        {
          // Read from a file
          File FileToRead = new File(imgPath);
          //Recognize file as image
          Image Picture = ImageIO.read(FileToRead);
          //Show the image inside the label
          imgLabel.setIcon(new ImageIcon(Picture));
        }
        catch (Exception e)
        {
          //Display a message if something goes wrong
          JOptionPane.showMessageDialog( null, e.toString() );
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void recognizeValueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recognizeValueButtonActionPerformed
        NeuralNetwork mynet = NeuralNetwork.load("netonline.nnet"); // load trained neural network saved with easyNeurons
        // get the image recognition plugin from neural network
        ImageRecognitionPlugin imageRecognition = (ImageRecognitionPlugin)mynet.getPlugin(ImageRecognitionPlugin.IMG_REC_PLUGIN_NAME); // get the image recognition plugin from neural network

        try {
            HashMap <String, Double> output = imageRecognition.recognizeImage(new File(imgPath));
            //System.out.println(output.toString());
            infoArea.append(output.toString()+"\n");

            List newOutput = GetOutput.SortOutput(output);

            this.recognizedValue = newOutput.get(0).toString();
            this.recognizedValueRate = Double.parseDouble(newOutput.get(1).toString());

            this.valueLabel.setText("Value: " + this.recognizedValue);
            this.valueRateLabel.setText("Rate: " + this.recognizedValueRate);

        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
        
        try
        {
          String fileName = this.recognizedValue + ".png";
          File FileToRead = new File(fileName);
          Image Picture = ImageIO.read(FileToRead);
          imgLabelR.setIcon(new ImageIcon(Picture));
        }
        catch (Exception e)
        {
          JOptionPane.showMessageDialog( null, "No file loaded" );
        }

    }//GEN-LAST:event_recognizeValueButtonActionPerformed

    private void recognizeHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recognizeHeightActionPerformed
        // TODO add your handling code here:
        NeuralNetwork mynet = NeuralNetwork.load("height.nnet"); // load trained neural network saved with easyNeurons
        // get the image recognition plugin from neural network
        ImageRecognitionPlugin imageRecognition = (ImageRecognitionPlugin)mynet.getPlugin(ImageRecognitionPlugin.IMG_REC_PLUGIN_NAME); // get the image recognition plugin from neural network

        try {
            HashMap <String, Double> output = imageRecognition.recognizeImage(new File(imgPath));
            //System.out.println(output.toString());
            infoArea.append(output.toString()+"\n");

            List newOutput = GetOutput.SortOutput(output);

            this.recognizedHeight = newOutput.get(0).toString();
            this.recognizedHeightRate = Double.parseDouble(newOutput.get(1).toString());

            this.heightLabel.setText("Value: " + this.recognizedHeight);
            this.heightRateLabel.setText("Rate: " + this.recognizedHeightRate);

        } catch(IOException ioe) {
            ioe.printStackTrace();
        }

        try
        {
          String fileName = this.recognizedHeight + ".png";
          File FileToRead = new File(fileName);
          Image Picture = ImageIO.read(FileToRead);
          imgLabelR.setIcon(new ImageIcon(Picture));
        }
        catch (Exception e)
        {
          JOptionPane.showMessageDialog( null, "No file loaded" );
        }

    }//GEN-LAST:event_recognizeHeightActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NutkiOknoGlowne().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel heightLabel;
    private javax.swing.JLabel heightRateLabel;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JLabel imgLabelR;
    private javax.swing.JTextArea infoArea;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton recognizeHeight;
    private javax.swing.JButton recognizeValueButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JLabel valueRateLabel;
    // End of variables declaration//GEN-END:variables

}
