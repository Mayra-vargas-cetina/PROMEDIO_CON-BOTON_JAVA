/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readcsv;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static readcsv.CsvParser.promedio1;
import static readcsv.CsvParser.promedio2;
import static readcsv.CsvParser.promedio3;
import static readcsv.CsvParser.promedio4;
import static readcsv.CsvParser.promedio_total;
/**
 *
 * @author Julian
 */
public class interfaz extends javax.swing.JFrame {

    /**
     * Creates new form interfaz
     */
    public static double promedio1, promedio2, promedio3, promedio4, promedio_total; //definicion de variables 
    public interfaz() {
        initComponents();
        //CsvParser myProm = new CsvParser();
        //double promedio_1=myProm.promedio1, promedio_2=myProm.promedio2, promedio_3=myProm.promedio3, promedio_4=myProm.promedio4 ;
        
        double round_promedio1= (double) Math.round(promedio1*100)/100, //Se establece la cantidad de decimales a 2
               round_promedio2= (double) Math.round(promedio2*100)/100,
               round_promedio3= (double) Math.round(promedio3*100)/100,
               round_promedio4= (double) Math.round(promedio4*100)/100,
               round_promediototal= (double) Math.round(promedio_total*100)/100 
                ; 
        
        promedio1s.setText(String.valueOf(round_promedio1)); //Se muestra en los labels el contenido de las variables
        promedio2s.setText(String.valueOf(round_promedio2));
        promedio3s.setText(String.valueOf(round_promedio3));
        promedio4s.setText(String.valueOf(round_promedio4));
        promediofinals.setText("El promedio de las materias es: "+String.valueOf(round_promediototal));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        promedio1s = new javax.swing.JLabel();
        promedio2s = new javax.swing.JLabel();
        promedio3s = new javax.swing.JLabel();
        promedio4s = new javax.swing.JLabel();
        promediofinals = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Calculo de promedio desde un archivo CSV");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Promedio 1: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Promedio 2: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Promedio 3: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Promedio 4: ");

        promedio1s.setText("jLabel6");

        promedio2s.setText("jLabel6");

        promedio3s.setText("jLabel6");

        promedio4s.setText("jLabel6");

        promediofinals.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        promediofinals.setText("jLabel10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(promediofinals, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(promedio2s, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(promedio1s, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(promedio3s, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(promedio4s, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(promedio1s))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(promedio2s))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(promedio3s))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(promedio4s))
                .addGap(32, 32, 32)
                .addComponent(promediofinals, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //interfaz app = new interfaz();
        /* Create and display the form */
        //COMIENZO DE CÓDIGO PARA LEER ARCHIVO Y CALCULAR PROMEDIO (anteriormente presentado)
        
        String fileName= "C:\\Users\\Julian\\Downloads\\PROMEDIO_JAVA-main\\src\\readcsv\\PromedioCSV.csv";
        File file= new File(fileName);

       
        List<List<String>> lines = new ArrayList<>(); //Se crea una lista de 2 dimensiones
        Scanner inputStream;

        try{
            inputStream = new Scanner(file); //Se usa el método inputstream para leer el archivo

            while(inputStream.hasNext()){
                String line= inputStream.next();
                String[] values = line.split(","); // Se delimitan los datos del archivo
                // this adds the currently parsed line to the 2-dimensional string array
                lines.add(Arrays.asList(values)); //Se agregan las lineas del archivo al arreglo de 2 dimensiones
            }

            inputStream.close(); //Se cierra el método para leer el archivo
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        
        
        double notas []=new double[19]; //Definicion de arreglo 
        double suma = 0, suma2 = 0, suma3 = 0, suma4 = 0; /*double promedio1 = 0, promedio2 = 0, promedio3 = 0, promedio4 = 0, promedio_total;*/ //inicializacion de variables 
        
        for (int i = 0; i < lines.size(); i++) { //for para iterar dentro del arreglo de 2 dimensiones
             for (int j = 2 ; j <3; j++) { //Se delimitan las columnas en cada caso
             notas[i] = Double.parseDouble(lines.get(i).get(j));   //se convierten los elementos del archivo csv a Double y se guardan en el arreglo
             suma += notas[i];    //Sumatoria de las notas  
             promedio1=suma/(notas.length); //calculo del promedio
            }
               
             
        
          //for para iterar dentro del arreglo de 2 dimensiones
             for (int j = 3 ; j <4; j++) { //Se delimitan las columnas en cada caso
             notas[i] = Double.parseDouble(lines.get(i).get(j));   //se convierten los elementos del archivo csv a Double y se guardan en el arreglo
             suma2 += notas[i];    //Sumatoria de las notas  
             promedio2=suma2/(notas.length); //calculo del promedio
            }
        
          //for para iterar dentro del arreglo de 2 dimensiones
             for (int j = 4 ; j <5; j++) { //Se delimitan las columnas en cada caso
             notas[i] = Double.parseDouble(lines.get(i).get(j));   //se convierten los elementos del archivo csv a Double y se guardan en el arreglo
             suma3 += notas[i];    //Sumatoria de las notas  
             promedio3=suma3/(notas.length); //calculo del promedio
            }
        
          //for para iterar dentro del arreglo de 2 dimensiones
             for (int j = 5 ; j <6; j++) { //Se delimitan las columnas en cada caso
             notas[i] = Double.parseDouble(lines.get(i).get(j));   //se convierten los elementos del archivo csv a Double y se guardan en el arreglo
             suma4 += notas[i];    //Sumatoria de las notas  
             promedio4=suma4/(notas.length); //calculo del promedio
            }
         }  
        promedio_total=(promedio1+promedio2+promedio3+promedio4)/4;
        
        /*System.out.println("Promedio 1: "+promedio1); 
        System.out.println("Promedio 2: "+promedio2); 
        System.out.println("Promedio 3: "+promedio3); 
        System.out.println("Promedio 4: "+promedio4); 
        
        System.out.println("Promedio total: "+promedio_total); */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel promedio1s;
    private javax.swing.JLabel promedio2s;
    private javax.swing.JLabel promedio3s;
    private javax.swing.JLabel promedio4s;
    private javax.swing.JLabel promediofinals;
    // End of variables declaration//GEN-END:variables
}