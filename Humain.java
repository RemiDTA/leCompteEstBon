
public class Humain extends javax.swing.JDialog {
	
    
    public Humain(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

   private int etape=0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(100, 0, 0));
        jLabel1.setText("Le compte est bon");

        
        int tab[]=new int[7];
        tab[0]=(int)( Math.random()*99+1);
        tab[1]=(int)( Math.random()*99+1);
        tab[2]=(int)( Math.random()*99+1);
        tab[3]=(int)( Math.random()*99+1);
        tab[4]=(int)( Math.random()*99+1);
        tab[5]=(int)( Math.random()*99+1);
        tab[6]=(int)( Math.random()*999+1);
        
        for(int i=0;i<7;i++)
        {
        	for(int j=0;j<7;j++)
        	{
        		if (i!=j && tab[i]==tab[j] && j!=7)
        			{
        				tab[j]=(int)( Math.random()*100);
        			}
        		else
				if (i!=j && tab[i]==tab[j] && j==6)
				{
					tab[j]=(int)( Math.random()*1000);
				}
		}
	}
        	
        
        
        jButton2.setText(""+tab[0]);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText(""+tab[1]);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

       jButton4.setText(""+tab[2]);
       jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText(""+tab[3]);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText(""+tab[4]);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText(""+tab[5]);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText(""+tab[6]);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("+");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("-");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("/");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("*");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton13.setText("Recommencer");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Contre l'ordinateur");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                        .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton13)
                        .addGap(18, 18, 18)
                        .addComponent(jButton14)
                        .addGap(34, 34, 34))))
        );
         jTextArea1.setText("Cliquez sur le resultat pour verifier votre calcul \n");
        pack();
        //initialisation de l'arbre
        a= new Arbre(Integer.parseInt(jButton2.getText()),Integer.parseInt(jButton3.getText()),Integer.parseInt(jButton4.getText()),
	    	    	    Integer.parseInt(jButton5.getText()),
	    	    	    Integer.parseInt(jButton6.getText()),Integer.parseInt(jButton7.getText()));
	    	    a.nbrATrouver(Integer.parseInt(jButton8.getText()));
    }// </editor-fold>//GEN-END:initComponents
   
   
	   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) { 
	   	   operation(jButton2);
	      // String text=jTextArea1.getText();
	       //jTextArea1.setText(text+jButton2.getText());
	   
	    }   
	       private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) { 
	       	        operation(jButton3);
	    }   
	       private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) { 
	       	       operation(jButton4);
	    } 
	    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) { 
	    	    	operation(jButton5);
	    } 
	    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) { 
	    	    operation(jButton6);
	    } 
	    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) { 
	    	    operation(jButton7);
	    } 
	    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) { 
	    	   
	    	    resOrdi= a.parcourLargeur();
	    	    String text=jTextArea1.getText();
	    	    jTextArea1.setText(text+" \n"+"L'ordinateur a trouve comme solution \n "+resOrdi+"\n");
	    	    
	    	    
	    } 
	      private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) { 
	    	    signe(jButton9);
	    } 
	      private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) { 
	    	    signe(jButton10);
	    } 
	      private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) { 
	    	   signe(jButton11);
	    } 
	      private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) { 
	    	    signe(jButton12);
	    } 
	    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) { 
	    	 setVisible(false);
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
		public void run() {
		   new Humain(); 
		}
	  });   
	 } 
	  private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) { 
	    	 setVisible(false);
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
		public void run() {
		   new Ordinateur(); 
		}
	  });   
	 } 
	    
	   	
	    private void operation(javax.swing.JButton jb){
	    	    String textErreur="";
	    	   if(etape==0 || etape==2){   
	    	   	    String text=jTextArea1.getText();
	    	   	    jTextArea1.setText(text+jb.getText());
	    	   	    
	    	   	     if(etape==0){
				    etape=1;
				    chif1= Integer.parseInt(jb.getText());
				    jb.setEnabled(false);
			    }else{
				    etape=0;
				    chif2= Integer.parseInt(jb.getText());
				    if(oper.equals("+")){
				    		 res=chif1+chif2;   
				    }
				    if(oper.equals("-")){
				    	    if(chif1>chif2){
				    		 res=chif1-chif2;   
				    	    }else{
				    	    	  res=chif2-chif1;
				    	    }
				    }if(oper.equals("*")){
				    		 res=chif1*chif2;   
				    }
				    
				    if(oper.equals("/")){
				    	float rf=0;
				    		rf=(float)chif1/chif2;   
					
					res=(int)rf;
					if(res-rf!=0){
						textErreur= "Division impossible si le resultat n'est pas juste, recommencez";
					}
				    }
				    text=jTextArea1.getText();
				    if(textErreur.equals("")){
				    	    jTextArea1.setText(text+" = "+res+"\n");
				    	    jb.setText(""+res);
				    }else{
				    	    jTextArea1.setText(text+"\n"+textErreur);
				    }
			    }
	    	   }
	    }
	    private void signe(javax.swing.JButton jb){
	    	    if(etape==1){
	    	    	String text=jTextArea1.getText();
	    	   	jTextArea1.setText(text+" "+jb.getText()+" ");	
	    	   	oper=jb.getText();
	    	   	etape=2;
	    	    }
	    }
    
    public Humain() {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Humain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Humain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Humain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Humain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               Humain dialog = new Humain(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3; //premiere plaque
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private int chif1=0, chif2=0, res=0;
    private String oper="";
    private String resOrdi="";
    private Arbre a;
    
    
    // End of variables declaration//GEN-END:variables
}
