/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ide;

import Analisis.graphik.*;
import Analisis.terminal.*;
import Analisis.haskell.*;
import Reportes.Arbol;
import Reportes.ErroresGraphik;
import Reportes.ErroresHaskell;
import com.sun.glass.events.KeyEvent;
import fabrica.*;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import semanticos.EjecutarArbol;
import semanticos.Semantico;

/**
 *
 * @author Adrian
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        taConsola = new javax.swing.JTextArea();
        tfEntradaConsola = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        taEntrada = new javax.swing.JTextArea();
        bEjecutar = new javax.swing.JButton();
        bCargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        taConsola.setBackground(new java.awt.Color(0, 0, 0));
        taConsola.setColumns(20);
        taConsola.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        taConsola.setForeground(new java.awt.Color(255, 153, 0));
        taConsola.setRows(5);
        jScrollPane1.setViewportView(taConsola);

        tfEntradaConsola.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfEntradaConsola.setName(""); // NOI18N
        tfEntradaConsola.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfEntradaConsolaKeyPressed(evt);
            }
        });

        taEntrada.setColumns(20);
        taEntrada.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        taEntrada.setRows(5);
        taEntrada.setText("importar Nodo.gk?  \nincluir_HK FormCuadraticaPositiva?\nincluir_HK FormCuadraticaNegativa?\nincluir_HK Permutacion?\nincluir_HK FuncionPolinomial1?  \nALS objeto : publico { \n\tvar entero a:publico?\n\tvacio inicio(){\n\t\ta = 4?\n\t\timprimir(\"permutación:  \" + llamar Permutacion_gk((10*2 - 14), a))? \n\t\ta = 3?\n\t\tvar decimal x = ((18/2)^2) - (15 - a)?\n\t\tllamar FuncionPolinomial1(x,y)? \n\t\tllamar creacion_nodos()?\n\t}\n\tcadena FormCuadraticaPositiva(){\n\t\ta = (5*2)^2 - 4?\n\t\tvar entero b = 3?\n\t\tvar entero c = 8?\n\t\timprimir(llamarHK FormCuadraticaPositiva(a, b, c))?\n\t\tretornar \"Primer función ejecutada con éxito\"?\n\t}\n\tcadena FormCuadraticaNegativa():privado{\n\t\tvar decimal arreglo[3] = {96, 3, 8}?\n\t\timprimir(llamarHK FormCuadraticaNegativa(arreglo[0], arreglo[1], arreglo[2]))?\n\t\tretornar \"Segunda función ejecutada con éxito\"?\n\t}\n\tvacio FuncionPolinomial1(entero valor_entrada){\n\t\tvar entero arreglo[5]?\n\t\tvar int i?\n\t\tPara(i=0: i<5: i++){\n\t\t\tarreglo[i] = llamarHK FuncionPolinomial1(valor_entrada * i)?\n\t\t\timprimir(\"polinomial: \" + arreglo[i])?\n\t\t}\n\t} \n\tentero Permutacion_gk(entero n, entero r){\n\t\tMientras(r>0){\n\t\t\timprimir(\"Factorial: \" + llamarHK Permuctacion(n,r))?\n\t\t\tr = r - 1?\n\t\t}\n\t}\n\tvoid creacion_nodos(){\n\t\tvar Nodo nod1 = nuevo Nodo()?\n\t\tnod1.nombre = \"primero\"?\n\t\tnod1.numero = 1?\n\t\tllamar nod1.cambiar_bandera()?  \n\t\tvar Nodo nod2 = nuevo Nodo()?\n\t\tnod2.nombre = \"segundo\"?\n\t\tnod2.numero = 2?\n\t\tSi(nod1.bandera == nod2.bandera)\n\t\t{\n\t\t\timprimir(\"las banderas son iguales para los nodos \" + nod1.nombre + \" \" + nod2.nombre)?\n\t\t}\n\t\tSino\n\t\t{\n\t\t\timprimir(\"las banderas son diferentes para los nodos \" + nod1.nombre + \" \" + nod2.nombre)?\n\t\t}\n\t\timprimir(\"Se creó un nodo con éxito\")?\n\t}\n}");
        jScrollPane2.setViewportView(taEntrada);

        bEjecutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/play.png"))); // NOI18N
        bEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEjecutarActionPerformed(evt);
            }
        });

        bCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargar.png"))); // NOI18N
        bCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1364, Short.MAX_VALUE)
                    .addComponent(tfEntradaConsola)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bEjecutar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCargar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEntradaConsola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1406, 870));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfEntradaConsolaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEntradaConsolaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            taConsola.append(">" + tfEntradaConsola.getText() + "\n");
            String texto = tfEntradaConsola.getText();
            LexicoHaskellTerminal lhaskell = new LexicoHaskellTerminal(new BufferedReader(new StringReader(texto)));
            SintacticoHaskellTerminal shaskell = new SintacticoHaskellTerminal(lhaskell);
            Nodo raiz = new Nodo();
            try {
                shaskell.parse();
                raiz = shaskell.raiz;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            tfEntradaConsola.setText("");
            if(ErroresHaskell.contErrores > 0)
                ErroresHaskell.generarErrores();
            else
            {
                if(raiz != null)
                {
                    Arbol.getGrafo(raiz);
                    Arbol.dibujar();
                }
                else
                    System.out.println("La raiz de haskel terminal es nula");
            }
        }
    }//GEN-LAST:event_tfEntradaConsolaKeyPressed

    private void bCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCargarActionPerformed
        String texto = taEntrada.getText();
        LexicoHaskell lhaskell = new LexicoHaskell(new BufferedReader(new StringReader(texto)));
        SintacticoHaskell shaskell = new SintacticoHaskell(lhaskell);
        Nodo raiz = new Nodo();
        try {
            shaskell.parse();
            raiz = shaskell.raiz;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        if(ErroresHaskell.contErrores > 0)
            ErroresHaskell.generarErrores();
        if(raiz != null)
        {
            Arbol.getGrafo(raiz);
            Arbol.dibujar();
            //Semantico.ejecutarValor(raiz);
        }
        else
            System.out.println("La raiz de haskel terminal es nula");
    }//GEN-LAST:event_bCargarActionPerformed

    private void bEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEjecutarActionPerformed
        String texto = taEntrada.getText();
        LexicoGraphik lgraphik = new LexicoGraphik(new BufferedReader(new StringReader(texto)));
        SintacticoGraphik sgraphik = new SintacticoGraphik(lgraphik);
        Nodo raiz = new Nodo();
        try {
            sgraphik.parse();
            raiz = sgraphik.raiz;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        ErroresGraphik.generarErrores();
        if(raiz != null)
        {
            Arbol.getGrafo(raiz);
            Arbol.dibujar();
            EjecutarArbol.ejecutar(raiz);
            //Semantico.ejecutarValor(raiz);
        }
        else
            System.out.println("La raiz de graphik terminal es nula");
    }//GEN-LAST:event_bEjecutarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCargar;
    private javax.swing.JButton bEjecutar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea taConsola;
    private javax.swing.JTextArea taEntrada;
    private javax.swing.JTextField tfEntradaConsola;
    // End of variables declaration//GEN-END:variables
}
