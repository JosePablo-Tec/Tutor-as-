package capaInterfaz;

import capaLogica.Proyecto;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Arrays;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FrmJuego extends javax.swing.JFrame {

    Proyecto proyecto1 = new Proyecto();
    FondoPanel fondo = new FondoPanel();

    Icon icono = new ImageIcon(getClass().getResource("/imagenes/trofeo.png"));
    Icon iconoAviso = new ImageIcon(getClass().getResource("/imagenes/aviso.png"));

    public FrmJuego() {
        this.setContentPane(fondo);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnConfigurarJuego = new javax.swing.JButton();
        jBtnGenerarTableros = new javax.swing.JButton();
        jBtnGenerarFichas = new javax.swing.JButton();
        jBtnReiniciarJuego = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCboSistemaNumerico = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxaImpresion = new javax.swing.JTextArea();
        jBtnSalir = new javax.swing.JButton();
        jLblB = new javax.swing.JLabel();
        jLblI = new javax.swing.JLabel();
        jLblT = new javax.swing.JLabel();
        jLblC = new javax.swing.JLabel();
        jLblO = new javax.swing.JLabel();
        jLblN = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTxaNumerosGenerados = new javax.swing.JTextArea();
        jCboModoJuego = new javax.swing.JComboBox<>();
        jBtnVerificarGane = new javax.swing.JButton();
        jCboElegirTableros = new javax.swing.JComboBox<>();
        jBtnEscogerNumero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jBtnConfigurarJuego.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnConfigurarJuego.setText("Configurar Juego");
        jBtnConfigurarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfigurarJuegoActionPerformed(evt);
            }
        });

        jBtnGenerarTableros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnGenerarTableros.setText("Generar Tableros");
        jBtnGenerarTableros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGenerarTablerosActionPerformed(evt);
            }
        });

        jBtnGenerarFichas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnGenerarFichas.setText("Generar Fichas");
        jBtnGenerarFichas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGenerarFichasActionPerformed(evt);
            }
        });

        jBtnReiniciarJuego.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnReiniciarJuego.setText("Reiniciar Juego");
        jBtnReiniciarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnReiniciarJuegoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setText("ISW BitCon");

        jCboSistemaNumerico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCboSistemaNumerico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboSistemaNumericoActionPerformed(evt);
            }
        });

        jTxaImpresion.setEditable(false);
        jTxaImpresion.setColumns(20);
        jTxaImpresion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxaImpresion.setLineWrap(true);
        jTxaImpresion.setRows(5);
        jTxaImpresion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(jTxaImpresion);

        jBtnSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnSalir.setText("Salir");
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        jLblB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLblB.setText("B");

        jLblI.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLblI.setText("I");

        jLblT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLblT.setText("T");

        jLblC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLblC.setText("C");

        jLblO.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLblO.setText("O");

        jLblN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLblN.setText("N");

        jTxaNumerosGenerados.setEditable(false);
        jTxaNumerosGenerados.setColumns(20);
        jTxaNumerosGenerados.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTxaNumerosGenerados.setLineWrap(true);
        jTxaNumerosGenerados.setRows(5);
        jScrollPane2.setViewportView(jTxaNumerosGenerados);

        jCboModoJuego.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCboModoJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboModoJuegoActionPerformed(evt);
            }
        });

        jBtnVerificarGane.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnVerificarGane.setText("Verificar Gane");
        jBtnVerificarGane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVerificarGaneActionPerformed(evt);
            }
        });

        jCboElegirTableros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCboElegirTableros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboElegirTablerosActionPerformed(evt);
            }
        });

        jBtnEscogerNumero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnEscogerNumero.setText("Escoger Número");
        jBtnEscogerNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEscogerNumeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnReiniciarJuego)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jBtnConfigurarJuego)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCboSistemaNumerico, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLblB)
                                        .addGap(86, 86, 86)
                                        .addComponent(jLblI)
                                        .addGap(104, 104, 104)
                                        .addComponent(jLblT)
                                        .addGap(82, 82, 82)
                                        .addComponent(jLblC)
                                        .addGap(82, 82, 82)
                                        .addComponent(jLblO)
                                        .addGap(101, 101, 101)
                                        .addComponent(jLblN))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jBtnGenerarTableros)
                                                        .addGap(408, 408, 408))
                                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(290, 290, 290)
                                                    .addComponent(jCboModoJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(113, 113, 113)
                                                .addComponent(jBtnGenerarFichas)
                                                .addGap(66, 66, 66)
                                                .addComponent(jBtnEscogerNumero)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jCboElegirTableros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel1))
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jBtnVerificarGane)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnConfigurarJuego)
                        .addComponent(jCboSistemaNumerico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCboModoJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jCboElegirTableros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69)
                .addComponent(jBtnGenerarTableros)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblB)
                    .addComponent(jLblI)
                    .addComponent(jLblT)
                    .addComponent(jLblC)
                    .addComponent(jLblO)
                    .addComponent(jLblN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnGenerarFichas)
                    .addComponent(jBtnEscogerNumero))
                .addGap(18, 18, 18)
                .addComponent(jBtnVerificarGane)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSalir)
                    .addComponent(jBtnReiniciarJuego))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCboSistemaNumericoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboSistemaNumericoActionPerformed
        jCboModoJuego.setVisible(true);
        jCboModoJuego.setVisible(true);
    }//GEN-LAST:event_jCboSistemaNumericoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

//-------------------------------- Llenar Los jComboBox --------------------------------// 
        jCboSistemaNumerico.addItem("Decimal");
        jCboSistemaNumerico.addItem("Quinario");
        jCboSistemaNumerico.addItem("Octal");
        jCboSistemaNumerico.addItem("Duodecimal");
        jCboSistemaNumerico.addItem("Hexadecimal");

        jCboSistemaNumerico.setSelectedIndex(-1);
        jCboSistemaNumerico.setVisible(false);

        jCboModoJuego.addItem("Cartón Lleno");
        jCboModoJuego.addItem("Cuatro Esquinas");
        jCboModoJuego.addItem("Diagonal");

        jCboModoJuego.setSelectedIndex(-1);
        jCboModoJuego.setVisible(false);

        jBtnVerificarGane.setVisible(false);
        jCboElegirTableros.setVisible(false);

//-------------------------------- Cambiar los Tableros --------------------------------// 
//        jCboElegirTablero.setVisible(false);
//
//        for (int i = 1000; i <= 1100; i++) {
//            jCboElegirTablero.addItem(i);
//        }
        jTxaImpresion.setText("");
        deshabilitarObjetos();
    }//GEN-LAST:event_formWindowOpened

    private void jBtnConfigurarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfigurarJuegoActionPerformed
        if (jBtnConfigurarJuego.isSelected()) {
            jCboSistemaNumerico.setVisible(true);
            jCboSistemaNumerico.setSelectedIndex(-1);
        } else {
            jCboSistemaNumerico.setVisible(true);
        }

    }//GEN-LAST:event_jBtnConfigurarJuegoActionPerformed

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jBtnGenerarTablerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGenerarTablerosActionPerformed
        proyecto1.llenarTablero();
        jTxaImpresion.setText(proyecto1.toString());

        habilitarObjetos();
        jBtnGenerarTableros.setEnabled(false);
        jCboSistemaNumerico.setEnabled(false);
        jCboModoJuego.setEnabled(false);

//        if (jBtnGenerarTableros.isSelected()) {
//            jCboElegirTablero.setVisible(true);
//        } else {
//            jCboElegirTablero.setVisible(true);
//        }
//-------------------------------- Elegir La Base Númerica Del Juego --------------------------------// 
        int posicion = jCboSistemaNumerico.getSelectedIndex();

        switch (posicion) {
            case 0:
                jTxaImpresion.setText(proyecto1.toString());
                break;
            case 1:
                jTxaImpresion.setText(proyecto1.impresionQuinariaConTachado());
                break;
            case 2:
                jTxaImpresion.setText(proyecto1.impresionOctalConTachado());
                break;
            case 3:
                jTxaImpresion.setText(proyecto1.impresionDuodecimalConTachado());
                break;
            case 4:
                jTxaImpresion.setText(proyecto1.impresionHexadecimalConTachado());
                break;
            default:
                break;
        }

        jCboElegirTableros.setVisible(true);

        //---------------------- Llenar el jComboBox de los tableros ----------------------//
        for (int i = 1; i <= 100; i++) {
            jCboElegirTableros.addItem(i);
        }

    }//GEN-LAST:event_jBtnGenerarTablerosActionPerformed

    private void jBtnGenerarFichasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGenerarFichasActionPerformed

//-------------------------------- Mostrar y Tachar Los Números Generados --------------------------------// 
        int salieron = proyecto1.mostrarNumerosGenerados();
        jTxaNumerosGenerados.append("\nNúmeros que han salido:\n" + salieron + "\n");
        proyecto1.tacharNumero(salieron);

        int index = (int) jCboElegirTableros.getSelectedItem();

        int posicion = jCboSistemaNumerico.getSelectedIndex();

        switch (posicion) {
            case 0:
                jTxaImpresion.setText(proyecto1.tableroToString(index));
                break;
            case 1:
                jTxaImpresion.setText(proyecto1.tableroToStringQuinario(index));
                break;
            case 2:
                jTxaImpresion.setText(proyecto1.tableroToStringOctal(index));
                break;
            case 3:
                jTxaImpresion.setText(proyecto1.tableroToStringDuodecimal(index));
                break;
            case 4:
                jTxaImpresion.setText(proyecto1.tableroToStringHexadecimal(index));
                break;
            default:
                break;
        }

        // actualizarInterfaz();
//-------------------------------- Elegir Modo de Juego --------------------------------//  
        boolean ganador = proyecto1.verificarCartonLleno();
        boolean ganador2 = proyecto1.verificarCuatroEquinas();
        boolean ganador3 = proyecto1.verificarDiagonales();
        String modoJuego = (String) jCboModoJuego.getSelectedItem();

        switch (modoJuego) {
            case "Cartón Lleno":
                if (ganador) {
                    JOptionPane.showMessageDialog(this, "Ganaste en el modo Cartón Lleno\n"
                            + Arrays.toString(proyecto1.getGanadores()), "¡Felicidades!", JOptionPane.INFORMATION_MESSAGE, icono);
                    jBtnGenerarFichas.setEnabled(false);
                    jBtnEscogerNumero.setEnabled(false);
                    jBtnVerificarGane.setVisible(true);
                }
                break;

            case "Cuatro Esquinas":
                if (ganador2) {
                    JOptionPane.showMessageDialog(this, "¡Felicidades! Ganaste en el modo 4 Esquinas\n"
                            + Arrays.toString(proyecto1.getGanadores()), "¡Felicidades!", JOptionPane.INFORMATION_MESSAGE, icono);

                    jBtnGenerarFichas.setEnabled(false);
                    jBtnEscogerNumero.setEnabled(false);
                    jBtnVerificarGane.setVisible(true);
                }
                break;

            case "Diagonal":
                if (ganador3) {
                    JOptionPane.showMessageDialog(this, "Ganaste en el modo Diagonal\n"
                            + Arrays.toString(proyecto1.getGanadores()), "¡Felicidades!", JOptionPane.INFORMATION_MESSAGE, icono);
                    jBtnGenerarFichas.setEnabled(false);
                    jBtnEscogerNumero.setEnabled(false);
                    jBtnVerificarGane.setVisible(true);
                }
                break;

            default:
                break;
        }
    }//GEN-LAST:event_jBtnGenerarFichasActionPerformed

    private void jBtnReiniciarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnReiniciarJuegoActionPerformed

//        jCboElegirTableros.removeAllItems();
//        for (int i = 1; i <= 100; i++) {
//            jCboElegirTableros.addItem(i);
//        }
        jTxaImpresion.setText("");
        jTxaNumerosGenerados.setText("");
        jCboSistemaNumerico.setEnabled(true);
        jCboModoJuego.setEnabled(true);
        jBtnGenerarTableros.setEnabled(true);
        jBtnVerificarGane.setVisible(false);
        jCboElegirTableros.setVisible(false);
        jBtnGenerarFichas.setEnabled(false);
        jBtnEscogerNumero.setEnabled(false);

    }//GEN-LAST:event_jBtnReiniciarJuegoActionPerformed

    private void jCboModoJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboModoJuegoActionPerformed
        jBtnGenerarTableros.setEnabled(true);
    }//GEN-LAST:event_jCboModoJuegoActionPerformed

    private void jBtnVerificarGaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVerificarGaneActionPerformed

        String modoJuego = (String) jCboModoJuego.getSelectedItem();

        switch (modoJuego) {
            case "Cartón Lleno":
                JOptionPane.showMessageDialog(this, "Ganaste en el modo Cartón Lleno"
                        + Arrays.toString(proyecto1.getGanadores()), "¡Felicidades!", JOptionPane.INFORMATION_MESSAGE, icono);
                break;
            case "Cuatro Esquinas":
                JOptionPane.showMessageDialog(this, "¡Felicidades! Ganaste en el modo 4 Esquinas\n"
                        + Arrays.toString(proyecto1.getGanadores()), "¡Felicidades!", JOptionPane.INFORMATION_MESSAGE, icono);
                break;

            case "Diagonal":
                JOptionPane.showMessageDialog(this, "Ganaste en el modo Diagonal\n"
                        + Arrays.toString(proyecto1.getGanadores()), "¡Felicidades!", JOptionPane.INFORMATION_MESSAGE, icono);
                break;
            default:
                break;
        }

    }//GEN-LAST:event_jBtnVerificarGaneActionPerformed

    private void jCboElegirTablerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboElegirTablerosActionPerformed

        int index = (int) jCboElegirTableros.getSelectedItem();

        int posicion = jCboSistemaNumerico.getSelectedIndex();

        switch (posicion) {
            case 0:
                jTxaImpresion.setText(proyecto1.tableroToString(index));
                break;
            case 1:
                jTxaImpresion.setText(proyecto1.tableroToStringQuinario(index));
                break;
            case 2:
                jTxaImpresion.setText(proyecto1.tableroToStringOctal(index));
                break;
            case 3:
                jTxaImpresion.setText(proyecto1.tableroToStringDuodecimal(index));
                break;
            case 4:
                jTxaImpresion.setText(proyecto1.tableroToStringHexadecimal(index));
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jCboElegirTablerosActionPerformed

    private void jBtnEscogerNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEscogerNumeroActionPerformed
        try {
            int numeroGenerados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número a tachar:"));
            proyecto1.tacharNumero(numeroGenerados);

            if (numeroGenerados >= 1 && numeroGenerados <= 90) {
                jTxaNumerosGenerados.append("\nNúmeros que han salido:\n" + numeroGenerados + "\n");
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido entre 1 y 90.", "Error", JOptionPane.ERROR_MESSAGE, iconoAviso);
            }

            actualizarInterfaz();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE, iconoAviso);
            return;
        }
    }//GEN-LAST:event_jBtnEscogerNumeroActionPerformed

    private void actualizarInterfaz() {
        int index = (int) jCboElegirTableros.getSelectedItem();
        int posicion = jCboSistemaNumerico.getSelectedIndex();

        switch (posicion) {
            case 0:
                jTxaImpresion.setText(proyecto1.tableroToString(index));
                break;
            case 1:
                jTxaImpresion.setText(proyecto1.tableroToStringQuinario(index));
                break;
            case 2:
                jTxaImpresion.setText(proyecto1.tableroToStringOctal(index));
                break;
            case 3:
                jTxaImpresion.setText(proyecto1.tableroToStringDuodecimal(index));
                break;
            case 4:
                jTxaImpresion.setText(proyecto1.tableroToStringHexadecimal(index));
                break;
            default:
                break;
        }
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
            java.util.logging.Logger.getLogger(FrmJuego.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmJuego.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmJuego().setVisible(true);
            }
        });
    }

    private void habilitarObjetos() {
        jBtnGenerarTableros.setEnabled(true);
        jBtnGenerarFichas.setEnabled(true);
        jBtnReiniciarJuego.setEnabled(true);
        jBtnEscogerNumero.setEnabled(true);
    }

    private void deshabilitarObjetos() {
        jBtnGenerarTableros.setEnabled(false);
        jBtnGenerarFichas.setEnabled(false);
        jBtnEscogerNumero.setEnabled(false);
        jBtnReiniciarJuego.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnConfigurarJuego;
    private javax.swing.JButton jBtnEscogerNumero;
    private javax.swing.JButton jBtnGenerarFichas;
    private javax.swing.JButton jBtnGenerarTableros;
    private javax.swing.JButton jBtnReiniciarJuego;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JButton jBtnVerificarGane;
    private javax.swing.JComboBox<Integer> jCboElegirTableros;
    private javax.swing.JComboBox<String> jCboModoJuego;
    private javax.swing.JComboBox<String> jCboSistemaNumerico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLblB;
    private javax.swing.JLabel jLblC;
    private javax.swing.JLabel jLblI;
    private javax.swing.JLabel jLblN;
    private javax.swing.JLabel jLblO;
    private javax.swing.JLabel jLblT;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTxaImpresion;
    private javax.swing.JTextArea jTxaNumerosGenerados;
    // End of variables declaration//GEN-END:variables

//-------------------------------- CODIGO PARA COLOCAR FONDO EN EL FRAME --------------------------------//
    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondoPP.jpg")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }
}
