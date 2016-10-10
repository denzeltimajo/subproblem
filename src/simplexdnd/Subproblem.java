/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplexdnd;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import java.util.Stack;
/**
 *
 * @author denzel
 */
public class Subproblem extends javax.swing.JFrame {
    private JTextField[][] jMatrix;
    private JButton jSolution;
    int MAXROW=0;
    int MAXCOLUMN=0;
    int MAXDISPLAY=0;
    boolean allow=false;
    int[] FA;
    int[] FA2;
    /**
     * Creates new form SimplexAlgorithm
     */
    public Subproblem() {
        initComponents();
        initComponents2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents2(){
        jSolution= new javax.swing.JButton();
        jSolution.setBackground(new java.awt.Color(204, 204, 204));
        jSolution.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jSolution.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/111.jpg"))); // NOI18N
        panel.add(jSolution, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 589, 170, 50));
        jSolution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SolutionActionPerformed(evt);
            }
        });
        jSolution.setVisible(false);
     

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tmaxCt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tmaxBi = new javax.swing.JTextField();
        createTableau = new javax.swing.JButton();
        scroller = new javax.swing.JScrollPane();
        jPanel = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        display = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Subproblem");
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Enter no. of objective function:");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 240, 20));

        tmaxCt.setSelectionColor(new java.awt.Color(126, 0, 1));
        panel.add(tmaxCt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 180, 30));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Enter no. of constants:");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 210, 20));

        tmaxBi.setSelectionColor(new java.awt.Color(126, 0, 1));
        panel.add(tmaxBi, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 180, 30));

        createTableau.setBackground(new java.awt.Color(204, 204, 204));
        createTableau.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        createTableau.setForeground(new java.awt.Color(51, 0, 51));
        createTableau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/5.jpg"))); // NOI18N
        createTableau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createTableauActionPerformed(evt);
            }
        });
        panel.add(createTableau, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 160, 80));

        scroller.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jPanel.setBackground(new java.awt.Color(153, 0, 0));
        jPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jPanel.setLayout(new java.awt.GridLayout(1, 0));
        scroller.setViewportView(jPanel);
        jPanel.getAccessibleContext().setAccessibleDescription("");

        panel.add(scroller, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 390, 290));

        jScrollPane.setBorder(null);

        display.setBackground(new java.awt.Color(153, 0, 0));
        display.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        display.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        display.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane.setViewportView(display);

        panel.add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 500, 390));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 590, 170, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/8.jpg"))); // NOI18N
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 670));

        getContentPane().add(panel);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createTableauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createTableauActionPerformed
        
        // TODO add your handling code here:
        //Remove past matrix
        for(int column=0;column<MAXCOLUMN;column++){
            for(int row=0;row<MAXROW;row++){
                jPanel.remove(jMatrix[column][row]);
            }
        }
        //Initialize new matrix
        if(tmaxCt.getText().isEmpty() || tmaxBi.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Invalid input","ERROR",JOptionPane.ERROR_MESSAGE);
            jSolution.setVisible(false);
            MAXROW=MAXCOLUMN=0;
            panel.setVisible(false);
            panel.setVisible(true);
       }
        else if(Integer.parseInt(tmaxCt.getText())+1>3 && Integer.parseInt(tmaxBi.getText())+1>1){
            MAXROW=Integer.parseInt(tmaxCt.getText())+1;
            MAXCOLUMN=Integer.parseInt(tmaxBi.getText())+1;
            //MATRIX-make textfields
            jPanel.setLayout(new java.awt.GridLayout(MAXCOLUMN, MAXROW));
            jMatrix=new JTextField[MAXCOLUMN][MAXROW];

            for(int column=0 ;column<MAXCOLUMN;column++){
                for(int row=0;row<MAXROW;row++){ 
                    jMatrix[column][row]=new JTextField();
                    jMatrix[column][row].setText("0");
                    if(column==0 && row==0){
                        jMatrix[column][row].setBorder(BorderFactory.createMatteBorder(0,0,1,1,Color.black));
                    }else if(column==0){
                        jMatrix[column][row].setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.black));
                    }else if(row==0){
                        jMatrix[column][row].setBorder(BorderFactory.createMatteBorder(0,0,0,1,Color.black));
                    }else{
                        jMatrix[column][row].setBorder(null);
                    }
                    jMatrix[column][row].setText("0");
                    jMatrix[column][row].setVisible(true);
                    jMatrix[column][row].setColumns(5);
                    jMatrix[column][row].setHorizontalAlignment(javax.swing.JTextField.CENTER);  
                    jPanel.add(jMatrix[column][row]);
                }
            }
            jSolution.setVisible(true);
            panel.remove(jLabel4);
          
            panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1011, 672));
            getContentPane().setVisible(false);
            getContentPane().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"Invalid input","ERROR",JOptionPane.ERROR_MESSAGE);
            jSolution.setVisible(false);
            MAXROW=MAXCOLUMN=0;
            panel.setVisible(false);
            panel.setVisible(true);
        }
    }//GEN-LAST:event_createTableauActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        tmaxCt.setText("");
        tmaxBi.setText("");
        panel.remove(display);
        panel.remove(jScrollPane);
        panel.remove(scroller);
        panel.remove(jPanel);
        display=new JPanel();
        jPanel=new JPanel();
        jScrollPane=new JScrollPane();
        scroller=new JScrollPane();
        
        scroller.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        jPanel.setBackground(new java.awt.Color(153, 0, 0));
        jPanel.setLayout(new java.awt.GridLayout(1, 0));
        scroller.setViewportView(jPanel);

        panel.add(scroller, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 390, 290));
        
        jScrollPane.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));

        display.setBackground(new java.awt.Color(153, 0, 0));
        display.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane.setViewportView(display);

        panel.add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 500, 390));
        panel.remove(jLabel4);
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1011, 672));
        
        getContentPane().setVisible(false);
        getContentPane().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void displayClear(){
        panel.remove(display);

        display=new JPanel();
        display.setBackground(new java.awt.Color(153, 0, 0));
        display.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
      
        
        getContentPane().setVisible(false);
        getContentPane().setVisible(true);
        
        display.setVisible(false);
        display.setVisible(true);
    }
    
    public boolean checkcanonical(float[][] matrix){
        String[] text=new String[MAXROW];
        String[] identity=new String[MAXCOLUMN-1];
        for(int column=0;column<MAXCOLUMN-1;column++){
            String text2=new String();
            text2="";
            for(int row=0;row<MAXCOLUMN-1;row++){
                if(column==row){
                    text2+=" 1.0";
                }else{
                    text2+=" 0.0";
                }
            }
            identity[column]=text2;
        }
        /*Formula for checking if canonical form*/
        int checker=0;
        for(int row=1; row<MAXROW;row++){
            text[row]="";
            for(int column=1;column<MAXCOLUMN;column++){
                text[row]+=" "+matrix[column][row];
            }
            for(int column=0;column<MAXCOLUMN-1;column++){
                if(identity[column].equals(text[row])){
                    FA[checker]=row;
                    FA2[checker]=column+1;
                    checker++;
                    identity[column]=" ";
                }
            }
        }
        if(checker==MAXCOLUMN-1){
            //formula for checking if leftmost side have negative numbers.
            for(int column=1;column<MAXCOLUMN;column++){
                if(matrix[column][0]<0){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
        
    }
    
    public boolean checkoptimal(float[][] matrix){
        for(int row=1;row<MAXROW;row++){
            if(matrix[0][row]<0){
                return false;
            }
        }
        return true;
    }
    
    public boolean checkunbounded(float[][] matrix){
        for(int row=1;row<MAXROW;row++){
            int cnt=0;
            for(int column=0;column<MAXCOLUMN;column++,cnt++){
                if(matrix[column][row]>0){
                    break;
                }
            }
            if(cnt==MAXCOLUMN){
                return true;
            }
        }
        return false;
    }
    
    public boolean checkinfeasibility1(float[][] matrix){
        for(int column=1;column<MAXCOLUMN;column++){
            int cnt=0;
            for(int row=0;row<MAXROW;row++,cnt++){
                if(matrix[column][row]>=0){
                    break;
                }
            }
            if(cnt==MAXROW){
                return true;
            }
        }
        return false;
    }
    
    public boolean checkinfeasibility2(float[][] matrix){
        for(int column=1;column<MAXCOLUMN;column++){
            int cnt=0;
            for(int row=0;row<MAXROW;row++,cnt++){
                if(row==0){
                    if(matrix[column][0]==0){
                        break;
                    }
                }else{
                    if(matrix[column][row]!=0){
                        break;
                    }
                }
            }
            if(cnt==MAXROW){
                return true;
            }
        }
        return false;
    }
    
    public void display(float[][] matrix,int pivotcolumn,int pivotrow){
        
        /*Add tableaus*/
        DecimalFormat dec=new DecimalFormat("0.00");
        JPanel tableaus=new JPanel();
        tableaus.setBorder(javax.swing.BorderFactory.createMatteBorder(2,2,2,2,new java.awt.Color(0, 0, 0)));
        
        JScrollPane scrollers=new JScrollPane();
        scrollers.setViewportView(tableaus);
        display.add(scrollers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, MAXDISPLAY, 302, 139));
        MAXDISPLAY+=200;
        
        /*Make textfields*/
        tableaus.setLayout(new java.awt.GridLayout(MAXCOLUMN, MAXROW));
        JTextField[][] matrices=new JTextField[MAXCOLUMN][MAXROW];
        
        for(int column=0 ;column<MAXCOLUMN;column++){
            for(int row=0;row<MAXROW;row++){ 
                matrices[column][row]=new JTextField();
                matrices[column][row].setText(""+dec.format(matrix[column][row]));
                
                if(column==0 && row==0){
                    matrices[column][row].setBorder(BorderFactory.createMatteBorder(0,0,2,2,Color.black));
                }else if(column==0){
                    matrices[column][row].setBorder(BorderFactory.createMatteBorder(0,0,2,0,Color.black));
                }else if(row==0){
                    matrices[column][row].setBorder(BorderFactory.createMatteBorder(0,0,0,2,Color.black));
                }else{
                    matrices[column][row].setBorder(null);
                }
                if(column==pivotcolumn && row==pivotrow){
                    matrices[column][row].setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.red));
                }
                matrices[column][row].setVisible(true);
                matrices[column][row].setColumns(5);
                matrices[column][row].setHorizontalAlignment(javax.swing.JTextField.CENTER);  
                tableaus.add(matrices[column][row]);
            }
        }
        
        /*For BUG FIX*/
        panel.setVisible(false);
        panel.setVisible(true);
    }
    
    public void display(float[][] matrix){
       
        /*Add tableaus*/
        DecimalFormat dec=new DecimalFormat("0.00");
        JPanel tableaus=new JPanel();
        tableaus.setBorder(javax.swing.BorderFactory.createMatteBorder(2,2,2,2,new java.awt.Color(0, 0, 0)));
        
        JScrollPane scrollers=new JScrollPane();
        scrollers.setViewportView(tableaus);
        display.add(scrollers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, MAXDISPLAY, 302, 139));
        MAXDISPLAY+=200;
        
        /*Make textfields*/
        tableaus.setLayout(new java.awt.GridLayout(MAXCOLUMN, MAXROW));
        JTextField[][] matrices=new JTextField[MAXCOLUMN][MAXROW];
        
        for(int column=0 ;column<MAXCOLUMN;column++){
            for(int row=0;row<MAXROW;row++){ 
                matrices[column][row]=new JTextField();
                matrices[column][row].setText(""+dec.format(matrix[column][row]));
                if(column==0 && row==0){
                    matrices[column][row].setBorder(BorderFactory.createMatteBorder(0,0,2,2,Color.black));
                }else if(column==0){
                    matrices[column][row].setBorder(BorderFactory.createMatteBorder(0,0,2,0,Color.black));
                }else if(row==0){
                    matrices[column][row].setBorder(BorderFactory.createMatteBorder(0,0,0,2,Color.black));
                }else{
                    matrices[column][row].setBorder(null);
                }
                matrices[column][row].setVisible(true);
                matrices[column][row].setColumns(5);
                matrices[column][row].setHorizontalAlignment(javax.swing.JTextField.CENTER);  
                tableaus.add(matrices[column][row]);
            }
        }
        
        /*For BUG FIX*/
        panel.setVisible(false);
        panel.setVisible(true);
    }
    
    public void displaydivide(float[][] matrix,int pivotcolumn,int pivotrow){
        /*Add tableaus*/
        JPanel tableaus=new JPanel();
        tableaus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        
        JScrollPane scrollers=new JScrollPane();
        scrollers.setViewportView(tableaus);
        display.add(scrollers, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, MAXDISPLAY, 150, 139));
        
        tableaus.setLayout(new java.awt.GridLayout(MAXCOLUMN, 1));
        JTextField[][] matrices=new JTextField[MAXCOLUMN][1];
        
        for(int column=0;column<MAXCOLUMN;column++){
            matrices[column][0]=new JTextField();
            if(column!=pivotcolumn){
                matrices[column][0].setText("");
            }else{
                matrices[column][0].setText("1/("+(matrix[pivotcolumn][pivotrow])+")R"+column);
            }
            matrices[column][0].setVisible(true);
            matrices[column][0].setColumns(5);
            matrices[column][0].setHorizontalAlignment(javax.swing.JTextField.CENTER);  
            tableaus.add(matrices[column][0]);
        }
    }
    
    public void displaysubtract(float[][] matrix,int pivotcolumn,int pivotrow){
        /*Add tableaus*/
        JPanel tableaus=new JPanel();
        tableaus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        
        JScrollPane scrollers=new JScrollPane();
        scrollers.setViewportView(tableaus);
        display.add(scrollers, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, MAXDISPLAY, 150, 139));
        
        tableaus.setLayout(new java.awt.GridLayout(MAXCOLUMN, 1));
        JTextField[][] matrices=new JTextField[MAXCOLUMN][1];
        
        for(int column=0;column<MAXCOLUMN;column++){
            matrices[column][0]=new JTextField();
            if(column!=pivotcolumn){
                if(column==0){
                    matrices[column][0].setText("Rz - ("+matrix[column][pivotrow]+")R"+pivotcolumn);
                }else{
                    matrices[column][0].setText("R"+column+" - ("+matrix[column][pivotrow]+")R"+pivotcolumn);
                }
            }else{
                matrices[column][0].setText("");
            }
            matrices[column][0].setVisible(true);
            matrices[column][0].setColumns(5);
            matrices[column][0].setHorizontalAlignment(javax.swing.JTextField.CENTER);  
            tableaus.add(matrices[column][0]);
        }
    }
    
    public void displayFA(float[][] matrix){
        DecimalFormat dec=new DecimalFormat("0.00");
        /*Add tableaus*/
        JPanel tableaus=new JPanel();
        tableaus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        
        JScrollPane scrollers=new JScrollPane();
        scrollers.setViewportView(tableaus);
        display.add(scrollers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, MAXDISPLAY, 150, 139));
        
        tableaus.setLayout(new java.awt.GridLayout(MAXROW, 1));
        JTextField[][] matrices=new JTextField[MAXROW][2];
        /*Optimal Solution*/
        for(int row=0;row<MAXROW;row++){
            matrices[row][0]=new JTextField();
            if(row!=0){
                int cnt;
                for(cnt=0;cnt<MAXCOLUMN-1;cnt++){
                    if(row==FA[cnt]){
                        matrices[row][0].setText(""+dec.format(matrix[FA2[cnt]][0]));
                        break;
                    }
                }
                if(cnt==MAXCOLUMN-1){
                    matrices[row][0].setText("0");
                }
            }else{
                matrices[row][0].setText("Xf");
            }
            matrices[row][0].setVisible(true);
            matrices[row][0].setColumns(5);
            matrices[row][0].setHorizontalAlignment(javax.swing.JTextField.CENTER);  
            tableaus.add(matrices[row][0]);
        }
        /*Optimal Answer*/
        tableaus=new JPanel();
        tableaus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        scrollers=new JScrollPane();
        scrollers.setViewportView(tableaus);
        display.add(scrollers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, MAXDISPLAY+175, 150, 50));
        tableaus.setLayout(new java.awt.GridLayout(1, 2));
        matrices[0][1]=new JTextField();
        matrices[0][1].setText("Z(Xf)");
        matrices[0][1].setVisible(true);
        matrices[0][1].setColumns(5);
        matrices[0][1].setHorizontalAlignment(javax.swing.JTextField.CENTER);  
        tableaus.add(matrices[0][1]);
        matrices[1][1]=new JTextField();
        matrices[1][1].setText(dec.format(matrix[0][0]));
        matrices[1][1].setVisible(true);
        matrices[1][1].setColumns(5);
        matrices[1][1].setHorizontalAlignment(javax.swing.JTextField.CENTER);  
        tableaus.add(matrices[1][1]);
    }
    
    private void SolutionActionPerformed(java.awt.event.ActionEvent evt) {
        MAXDISPLAY=0;
        float[][] matrix=new float[MAXCOLUMN][MAXROW];
        FA = new int[MAXCOLUMN-1];
        FA2 = new int[MAXCOLUMN-1];
        //jTextArea.setText("");
        for(int column=0 ;column<MAXCOLUMN;column++){
            for(int row=0;row<MAXROW;row++){ 
                matrix[column][row]=Float.parseFloat(jMatrix[column][row].getText());   
            }
        }
        //displayClear();
        if(checkcanonical(matrix)==true && checkoptimal(matrix)==true){
            JOptionPane.showMessageDialog(null, "The tableau is already in its optimal form.");
            displayFA(matrix);
        }else if(checkinfeasibility1(matrix)==true){
            JOptionPane.showMessageDialog(null, "The tableau is infeasible.");
        }else if(checkinfeasibility2(matrix)==true){
            JOptionPane.showMessageDialog(null, "The tableau is infeasible.");
        }else if(checkunbounded(matrix)==true){
            JOptionPane.showMessageDialog(null, "The tableau is unbounded.");
            displayFA(matrix);
        }else if(checkcanonical(matrix)==true){
            /*Initialize*/
            
            panel.remove(display);
            panel.remove(jScrollPane);
            display=new JPanel();
            jScrollPane=new JScrollPane();

            jScrollPane.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

            display.setBackground(new java.awt.Color(153, 0, 0));
            display.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            display.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
            display.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
            jScrollPane.setViewportView(display);

            panel.add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 500, 390));
            panel.remove(jLabel4);
            panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1011, 672));
            MAXDISPLAY=0;
            /*Start solving*/
            while(checkoptimal(matrix)==false){
                
                /*Finding the pivot index*/
                /*Step 1: Finding the most negative lowest index*/
                float mostNegative=matrix[0][1];
                int pivotrow=1;
                for(int row=2;row<MAXROW;row++){
                    if(matrix[0][row]<mostNegative){
                        mostNegative=matrix[0][row];
                        pivotrow=row;
                    }
                }
                /*Step 2: Finding the lowest positive ratio*/
                int pivotcolumn=1;
                int tempcolumn=1;
                float lowestRatio=matrix[tempcolumn][0]/matrix[tempcolumn][pivotrow];
                while(lowestRatio<=0){
                    tempcolumn++;
                    pivotcolumn++;
                    lowestRatio=matrix[tempcolumn][0]/matrix[tempcolumn][pivotrow];
                }
                for(int column=tempcolumn+1;column<MAXCOLUMN;column++){
                    if(matrix[column][0]/matrix[column][pivotrow]<lowestRatio && matrix[column][pivotrow]>0){
                        lowestRatio=matrix[column][0]/matrix[column][pivotrow];
                        pivotcolumn=column;
                    }
                }
                displaydivide(matrix, pivotcolumn, pivotrow);
                display(matrix,pivotcolumn,pivotrow);
                /*Step 3: Divide row by pivot*/
                float divider=matrix[pivotcolumn][pivotrow];
                for(int row=0;row<MAXROW;row++){
                    matrix[pivotcolumn][row]=matrix[pivotcolumn][row]/divider;
                }
                displaysubtract(matrix, pivotcolumn, pivotrow);
                display(matrix);
                
                /*Step 4: Sweep*/
                for(int column=0;column<MAXCOLUMN;column++){
                    if(pivotcolumn!=column){
                        float var=-matrix[column][pivotrow];
                        for(int row=0;row<MAXROW;row++){
                            matrix[column][row]=matrix[column][row]+(var*matrix[pivotcolumn][row]);
                        }
                    }
                }
                //ian
                display(matrix);
                if(checkcanonical(matrix)==true && checkoptimal(matrix)==true){
                    JOptionPane.showMessageDialog(null, "The tableau is optimal.");
                    displayFA(matrix);
                    break;
                }else if(checkinfeasibility1(matrix)==true){
                    JOptionPane.showMessageDialog(null, "The tableau is infeasible.");
                    break;
                }else if(checkinfeasibility2(matrix)==true){
                    JOptionPane.showMessageDialog(null, "The tableau is infeasible.");
                    break;
                }else if(checkcanonical(matrix) && checkunbounded(matrix)==true){
                    JOptionPane.showMessageDialog(null, "The tableau is unbounded.");
                    displayFA(matrix);
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "Done.");
        }else{
            SubProblem(matrix);
           //JOptionPane.showMessageDialog(null, "The tableau is not in canonical form.");
        }
        jScrollPane.setVisible(false);
        jScrollPane.setVisible(true);
        display.setVisible(false);
        display.setVisible(true);
    }
    
    public void SubProblem(float matrix[][]){
        //matrix[column][row]
        //Step 1: Swap Rows
        matrix=SwapRows(matrix);
        float[][] mex =new float[MAXCOLUMN][MAXROW];
        display(matrix);
        while(checkoptimal(matrix)==false || checkcanonical(matrix)==false){
                int c=0;
                //float[][] matrix=new float[MAXCOLUMN][MAXROW];
                //Step 2: Simplex
                for(int x=1;x<MAXCOLUMN;x++){
                    if(matrix[x][0]<0){
                        c=x;
                    }
                }
                /*Finding the pivot index*/
                /*Step 1: Finding the most negative lowest index*/
                float mostNegative=matrix[c][1];
                int pivotrow=1;
                for(int row=2;row<MAXROW;row++){
                    if(matrix[c][row]<mostNegative){
                        mostNegative=matrix[c][row];
                        pivotrow=row;
                    }
                }
                /*Step 2: Finding the lowest positive ratio*/
                int pivotcolumn=c+1;
                int tempcolumn=c+1;
                float lowestRatio=matrix[tempcolumn][0]/matrix[tempcolumn][pivotrow];
                while(lowestRatio<=0){
                    if(tempcolumn<MAXCOLUMN-1 || pivotcolumn<MAXCOLUMN-1){
                        tempcolumn++;
                        pivotcolumn++;
                        lowestRatio=matrix[tempcolumn][0]/matrix[tempcolumn][pivotrow];
                    }else{
                        JOptionPane.showMessageDialog(null, "Other methods are needed to solve this problem.");
                        break;
                    }
                }
                for(int column=tempcolumn+1;column<MAXCOLUMN;column++){
                    if(matrix[column][0]/matrix[column][pivotrow]<lowestRatio && matrix[column][pivotrow]>0){
                        lowestRatio=matrix[column][0]/matrix[column][pivotrow];
                        pivotcolumn=column;
                    }
                }
                displaydivide(matrix, pivotcolumn, pivotrow);
                display(matrix,pivotcolumn,pivotrow);
                /*Step 3: Divide row by pivot*/
                float divider=matrix[pivotcolumn][pivotrow];
                for(int row=0;row<MAXROW;row++){
                    matrix[pivotcolumn][row]=matrix[pivotcolumn][row]/divider;
                }
                displaysubtract(matrix, pivotcolumn, pivotrow);
                display(matrix);
                
                /*Step 4: Sweep*/
                for(int column=0;column<MAXCOLUMN;column++){
                    if(pivotcolumn!=column){
                        float var=-matrix[column][pivotrow];
                        for(int row=0;row<MAXROW;row++){
                            matrix[column][row]=matrix[column][row]+(var*matrix[pivotcolumn][row]);
                        }
                    }
                }
                display(matrix);
                if(checkcanonical(matrix)==true && checkoptimal(matrix)==true){
                    JOptionPane.showMessageDialog(null, "The tableau is optimal.");
                    displayFA(matrix);
                    break;
                }else if(checkinfeasibility1(matrix)==true){
                    JOptionPane.showMessageDialog(null, "The tableau is infeasible.");
                    break;
                }else if(checkinfeasibility2(matrix)==true){
                    JOptionPane.showMessageDialog(null, "The tableau is infeasible.");
                    break;
                }else if(checkcanonical(matrix) && checkunbounded(matrix)==true){
                    JOptionPane.showMessageDialog(null, "The tableau is unbounded.");
                    displayFA(matrix);
                    break;
                }
                if(mex==matrix){
                    JOptionPane.showMessageDialog(null, "The tableau is unbounded.");
                    displayFA(matrix);
                    break;                  
                }
                mex=matrix;
            }
    }
    
    private float[][] SwapRows(float m[][]){
        float[][] mex =new float[MAXCOLUMN][MAXROW];
        int c=0;
        int p=0;
        
        Stack positiveInt= new Stack();
        for(int column=0 ;column<MAXCOLUMN;column++){
            if(0<m[column][0] && column>0){
                positiveInt.add(m[column]); 
                p++;
            }else{
                mex[c]=m[column]; 
                c++;
            }
        }        
        
        int minindex,i,j;
        float[] tempf;
        for(i=1;i<c-1;i++){
            minindex=i;
            for(j=i+1;j<c;j++){      
                if(mex[minindex][0]>mex[j][0]){
                    minindex =j;
                    if(minindex!=i){
                        tempf=mex[i];
                        mex[i]=mex[minindex];
                        mex[minindex]=tempf;
                    }
                }
            }
            
        }
        c=MAXCOLUMN-1;
        for(int column=p ;column>0;column--){
            mex[c]=(float[])positiveInt.pop();
            c--;
        }
        return mex;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Subproblem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Subproblem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Subproblem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Subproblem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Subproblem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createTableau;
    private javax.swing.JPanel display;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane scroller;
    private javax.swing.JTextField tmaxBi;
    private javax.swing.JTextField tmaxCt;
    // End of variables declaration//GEN-END:variables
}
