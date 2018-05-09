/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.JFileChooser;


/**
 *
 * @author nicanor
 */
public class MainWindow extends javax.swing.JFrame
{
	/**
	 * Creates new form MainWindow
	 */
	public MainWindow()
	{
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroup_url_file = new javax.swing.ButtonGroup();
        jTextField_URL = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox_AUDIO = new javax.swing.JCheckBox();
        jCheckBox_SUBTITLES = new javax.swing.JCheckBox();
        jCheckBox_EmbedSubtitles = new javax.swing.JCheckBox();
        jButton_DESCARGAR = new javax.swing.JButton();
        jButton_SALIR = new javax.swing.JButton();
        jTextField_OUTPUT = new javax.swing.JTextField();
        jButton_SELECTOR = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar_DProgress = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_OUTPUT = new javax.swing.JTextArea();
        jLabel_SPEED = new javax.swing.JLabel();
        jRadioButton_URL = new javax.swing.JRadioButton();
        jRadioButton_FILE = new javax.swing.JRadioButton();
        jButton_SELECTOR_FILE = new javax.swing.JButton();

        buttonGroup_url_file.add(jRadioButton_URL);
        buttonGroup_url_file.add(jRadioButton_FILE);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTextField_URL.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextField_URLActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 10))); // NOI18N

        jCheckBox_AUDIO.setText("Solo audio");
        jCheckBox_AUDIO.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jCheckBox_AUDIOActionPerformed(evt);
            }
        });

        jCheckBox_SUBTITLES.setText("Subtitulos");
        jCheckBox_SUBTITLES.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jCheckBox_SUBTITLESActionPerformed(evt);
            }
        });

        jCheckBox_EmbedSubtitles.setText("Embeber Subtitulos");
        jCheckBox_EmbedSubtitles.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox_AUDIO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(112, 112, 112))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox_SUBTITLES)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox_EmbedSubtitles)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox_AUDIO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox_SUBTITLES)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox_EmbedSubtitles)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton_DESCARGAR.setText("Descargar!");
        jButton_DESCARGAR.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton_DESCARGARActionPerformed(evt);
            }
        });

        jButton_SALIR.setText("Salir");
        jButton_SALIR.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton_SALIRActionPerformed(evt);
            }
        });

        jButton_SELECTOR.setText("Selector");
        jButton_SELECTOR.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton_SELECTORActionPerformed(evt);
            }
        });

        jLabel2.setText("Carpeta de Salida:");

        jScrollPane1.setAutoscrolls(true);

        jTextArea_OUTPUT.setColumns(20);
        jTextArea_OUTPUT.setRows(5);
        jTextArea_OUTPUT.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(jTextArea_OUTPUT);

        jRadioButton_URL.setSelected(true);
        jRadioButton_URL.setText("URL");
        jRadioButton_URL.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jRadioButton_URLActionPerformed(evt);
            }
        });

        jRadioButton_FILE.setText("Archivo de Texto");
        jRadioButton_FILE.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jRadioButton_FILEActionPerformed(evt);
            }
        });

        jButton_SELECTOR_FILE.setText("Selector");
        jButton_SELECTOR_FILE.setEnabled(false);
        jButton_SELECTOR_FILE.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton_SELECTOR_FILEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_SALIR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(jLabel_SPEED)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar_DProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_DESCARGAR))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField_OUTPUT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_SELECTOR))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton_URL)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton_FILE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextField_URL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_SELECTOR_FILE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_URL)
                    .addComponent(jRadioButton_FILE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_URL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_SELECTOR_FILE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_OUTPUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_SELECTOR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_SALIR)
                        .addComponent(jButton_DESCARGAR)
                        .addComponent(jLabel_SPEED))
                    .addComponent(jProgressBar_DProgress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_URLActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jTextField_URLActionPerformed
    {//GEN-HEADEREND:event_jTextField_URLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_URLActionPerformed

    private void jCheckBox_AUDIOActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBox_AUDIOActionPerformed
    {//GEN-HEADEREND:event_jCheckBox_AUDIOActionPerformed
        if(jCheckBox_SUBTITLES.isSelected() && !jCheckBox_EmbedSubtitles.isEnabled())
		{
			jCheckBox_EmbedSubtitles.setEnabled(true);
		}
		else
		{
			jCheckBox_EmbedSubtitles.setEnabled(false);
		}
    }//GEN-LAST:event_jCheckBox_AUDIOActionPerformed

    private void jButton_DESCARGARActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton_DESCARGARActionPerformed
    {//GEN-HEADEREND:event_jButton_DESCARGARActionPerformed
		ArrayList _options = new ArrayList();
		
		_options.add("--newline");
		
		if (jCheckBox_AUDIO.isSelected())
			_options.add("-x");
		if (jCheckBox_SUBTITLES.isSelected())
			_options.add("--all-subs");
		if (jCheckBox_EmbedSubtitles.isEnabled() && jCheckBox_EmbedSubtitles.isSelected() && jCheckBox_SUBTITLES.isSelected())
			_options.add("--embed-subs");
		if (jRadioButton_FILE.isSelected())
			_options.add("-a");
		
		/* 
		 * Run youtube-dl on a different thread to not block the UI check:
		 * https://stackoverflow.com/questions/18088603/how-to-make-calling-a-method-as-a-background-process-in-java?utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa
		 * for more info.
		 */

		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.submit(new Runnable() { public void run() { ytdl.getVideo(jTextField_URL.getText(), _options, jTextField_OUTPUT.getText() + "/%(title)s.%(ext)s", jProgressBar_DProgress, jLabel_SPEED, jTextArea_OUTPUT); } });
    }//GEN-LAST:event_jButton_DESCARGARActionPerformed

    private void jButton_SALIRActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton_SALIRActionPerformed
    {//GEN-HEADEREND:event_jButton_SALIRActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_SALIRActionPerformed

    private void jButton_SELECTORActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton_SELECTORActionPerformed
    {//GEN-HEADEREND:event_jButton_SELECTORActionPerformed
		final JFileChooser fc = new JFileChooser();
		fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fc.showOpenDialog(fc);
		jTextField_OUTPUT.setText(fc.getSelectedFile().getPath());
    }//GEN-LAST:event_jButton_SELECTORActionPerformed

    private void jCheckBox_SUBTITLESActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBox_SUBTITLESActionPerformed
    {//GEN-HEADEREND:event_jCheckBox_SUBTITLESActionPerformed
		jCheckBox_EmbedSubtitles.setEnabled(jCheckBox_SUBTITLES.isSelected() && !jCheckBox_AUDIO.isSelected());
    }//GEN-LAST:event_jCheckBox_SUBTITLESActionPerformed

    private void jRadioButton_URLActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButton_URLActionPerformed
    {//GEN-HEADEREND:event_jRadioButton_URLActionPerformed
        jButton_SELECTOR_FILE.setEnabled(false);
    }//GEN-LAST:event_jRadioButton_URLActionPerformed

    private void jRadioButton_FILEActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButton_FILEActionPerformed
    {//GEN-HEADEREND:event_jRadioButton_FILEActionPerformed
        jButton_SELECTOR_FILE.setEnabled(true);
    }//GEN-LAST:event_jRadioButton_FILEActionPerformed

    private void jButton_SELECTOR_FILEActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton_SELECTOR_FILEActionPerformed
    {//GEN-HEADEREND:event_jButton_SELECTOR_FILEActionPerformed
        final JFileChooser fc = new JFileChooser();
		fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		fc.showOpenDialog(fc);
		jTextField_URL.setText(fc.getSelectedFile().getPath());
    }//GEN-LAST:event_jButton_SELECTOR_FILEActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[])
	{
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try
		{
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
			{
				if ("Nimbus".equals(info.getName()))
				{
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		}
		catch (ClassNotFoundException ex)
		{
			java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (InstantiationException ex)
		{
			java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (IllegalAccessException ex)
		{
			java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (javax.swing.UnsupportedLookAndFeelException ex)
		{
			java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				new MainWindow().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_url_file;
    private javax.swing.JButton jButton_DESCARGAR;
    private javax.swing.JButton jButton_SALIR;
    private javax.swing.JButton jButton_SELECTOR;
    private javax.swing.JButton jButton_SELECTOR_FILE;
    private javax.swing.JCheckBox jCheckBox_AUDIO;
    private javax.swing.JCheckBox jCheckBox_EmbedSubtitles;
    private javax.swing.JCheckBox jCheckBox_SUBTITLES;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_SPEED;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar_DProgress;
    private javax.swing.JRadioButton jRadioButton_FILE;
    private javax.swing.JRadioButton jRadioButton_URL;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_OUTPUT;
    private javax.swing.JTextField jTextField_OUTPUT;
    private javax.swing.JTextField jTextField_URL;
    // End of variables declaration//GEN-END:variables
}
