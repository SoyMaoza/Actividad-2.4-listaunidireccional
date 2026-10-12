package gui;

import estructura.ListaUnidireccional;
import modelo.Paquete;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;

public class VentanaPrincipal extends javax.swing.JFrame {
    private final ListaUnidireccional lista;
    private final ModeloTabla modeloTabla = new ModeloTabla();

    public VentanaPrincipal() {
        this(new ListaUnidireccional());
    }

    public VentanaPrincipal(ListaUnidireccional lista) {
        this.lista = lista;
        initComponents();
        actualizarVista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelIzquierdo = new javax.swing.JPanel();
        panelDatos = new javax.swing.JPanel();
        lblGuia = new javax.swing.JLabel();
        txtGuia = new javax.swing.JTextField();
        lblDestinatario = new javax.swing.JLabel();
        txtDestinatario = new javax.swing.JTextField();
        lblDestino = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        lblPeso = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        panelPosicion = new javax.swing.JPanel();
        lblPosicion = new javax.swing.JLabel();
        txtPosicion = new javax.swing.JTextField();
        lblBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        panelOperaciones = new javax.swing.JPanel();
        btnInsertarPrincipio = new javax.swing.JButton();
        btnInsertarFinal = new javax.swing.JButton();
        btnInsertarPosicion = new javax.swing.JButton();
        btnRemoverPrincipio = new javax.swing.JButton();
        btnRemoverFinal = new javax.swing.JButton();
        btnRemoverPosicion = new javax.swing.JButton();
        btnMostrarPrincipio = new javax.swing.JButton();
        btnMostrarFinal = new javax.swing.JButton();
        btnMostrarPosicion = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnVaciar = new javax.swing.JButton();
        btnLimpiarCampos = new javax.swing.JButton();
        panelContenido = new javax.swing.JPanel();
        tablaScroll = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        panelInferior = new javax.swing.JPanel();
        lblEnlaces = new javax.swing.JLabel();
        lblTamanio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Paqueteria - TDA Lista Unidireccional");
        setMinimumSize(new java.awt.Dimension(1000, 520));
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        panelIzquierdo.setLayout(new javax.swing.BoxLayout(panelIzquierdo, javax.swing.BoxLayout.Y_AXIS));

        panelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del paquete (record)"));
        panelDatos.setLayout(new java.awt.GridLayout(4, 2, 5, 5));

        lblGuia.setText("Guia (clave):");
        panelDatos.add(lblGuia);

        txtGuia.setColumns(12);
        panelDatos.add(txtGuia);

        lblDestinatario.setText("Destinatario:");
        panelDatos.add(lblDestinatario);

        txtDestinatario.setColumns(12);
        panelDatos.add(txtDestinatario);

        lblDestino.setText("Destino:");
        panelDatos.add(lblDestino);

        txtDestino.setColumns(12);
        panelDatos.add(txtDestino);

        lblPeso.setText("Peso (kg):");
        panelDatos.add(lblPeso);

        txtPeso.setColumns(12);
        panelDatos.add(txtPeso);

        panelIzquierdo.add(panelDatos);

        panelPosicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Posicion y busqueda"));
        panelPosicion.setLayout(new java.awt.GridLayout(2, 2, 5, 5));

        lblPosicion.setText("Posicion (0 = primero):");
        panelPosicion.add(lblPosicion);

        txtPosicion.setColumns(6);
        panelPosicion.add(txtPosicion);

        lblBuscar.setText("Guia a buscar:");
        panelPosicion.add(lblBuscar);

        txtBuscar.setColumns(10);
        panelPosicion.add(txtBuscar);

        panelIzquierdo.add(panelPosicion);

        panelOperaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));
        panelOperaciones.setLayout(new java.awt.GridLayout(4, 3, 5, 5));

        btnInsertarPrincipio.setText("Insertar principio");
        btnInsertarPrincipio.addActionListener(this::btnInsertarPrincipioActionPerformed);
        panelOperaciones.add(btnInsertarPrincipio);

        btnInsertarFinal.setText("Insertar final");
        btnInsertarFinal.addActionListener(this::btnInsertarFinalActionPerformed);
        panelOperaciones.add(btnInsertarFinal);

        btnInsertarPosicion.setText("Insertar posicion");
        btnInsertarPosicion.addActionListener(this::btnInsertarPosicionActionPerformed);
        panelOperaciones.add(btnInsertarPosicion);

        btnRemoverPrincipio.setText("Remover principio");
        btnRemoverPrincipio.addActionListener(this::btnRemoverPrincipioActionPerformed);
        panelOperaciones.add(btnRemoverPrincipio);

        btnRemoverFinal.setText("Remover final");
        btnRemoverFinal.addActionListener(this::btnRemoverFinalActionPerformed);
        panelOperaciones.add(btnRemoverFinal);

        btnRemoverPosicion.setText("Remover posicion");
        btnRemoverPosicion.addActionListener(this::btnRemoverPosicionActionPerformed);
        panelOperaciones.add(btnRemoverPosicion);

        btnMostrarPrincipio.setText("Mostrar principio");
        btnMostrarPrincipio.addActionListener(this::btnMostrarPrincipioActionPerformed);
        panelOperaciones.add(btnMostrarPrincipio);

        btnMostrarFinal.setText("Mostrar final");
        btnMostrarFinal.addActionListener(this::btnMostrarFinalActionPerformed);
        panelOperaciones.add(btnMostrarFinal);

        btnMostrarPosicion.setText("Mostrar posicion");
        btnMostrarPosicion.addActionListener(this::btnMostrarPosicionActionPerformed);
        panelOperaciones.add(btnMostrarPosicion);

        btnBuscar.setText("Buscar por guia");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);
        panelOperaciones.add(btnBuscar);

        btnVaciar.setText("Vaciar lista");
        btnVaciar.addActionListener(this::btnVaciarActionPerformed);
        panelOperaciones.add(btnVaciar);

        btnLimpiarCampos.setText("Limpiar campos");
        btnLimpiarCampos.addActionListener(this::btnLimpiarCamposActionPerformed);
        panelOperaciones.add(btnLimpiarCampos);

        panelIzquierdo.add(panelOperaciones);

        getContentPane().add(panelIzquierdo, java.awt.BorderLayout.WEST);

        panelContenido.setBorder(javax.swing.BorderFactory.createTitledBorder("Contenido de la lista"));
        panelContenido.setLayout(new java.awt.BorderLayout(5, 5));

        tabla.setModel(modeloTabla);
        tabla.setRowHeight(22);
        tablaScroll.setViewportView(tabla);

        panelContenido.add(tablaScroll, java.awt.BorderLayout.CENTER);

        panelInferior.setLayout(new java.awt.GridLayout(2, 1, 5, 5));

        lblEnlaces.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        lblEnlaces.setText(" ");
        panelInferior.add(lblEnlaces);

        lblTamanio.setText(" ");
        panelInferior.add(lblTamanio);

        panelContenido.add(panelInferior, java.awt.BorderLayout.SOUTH);

        getContentPane().add(panelContenido, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarPrincipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarPrincipioActionPerformed
        ejecutar(this::insertarPrincipio);
    }//GEN-LAST:event_btnInsertarPrincipioActionPerformed

    private void btnInsertarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarFinalActionPerformed
        ejecutar(this::insertarFinal);
    }//GEN-LAST:event_btnInsertarFinalActionPerformed

    private void btnInsertarPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarPosicionActionPerformed
        ejecutar(this::insertarPosicion);
    }//GEN-LAST:event_btnInsertarPosicionActionPerformed

    private void btnRemoverPrincipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverPrincipioActionPerformed
        ejecutar(this::removerPrincipio);
    }//GEN-LAST:event_btnRemoverPrincipioActionPerformed

    private void btnRemoverFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverFinalActionPerformed
        ejecutar(this::removerFinal);
    }//GEN-LAST:event_btnRemoverFinalActionPerformed

    private void btnRemoverPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverPosicionActionPerformed
        ejecutar(this::removerPosicion);
    }//GEN-LAST:event_btnRemoverPosicionActionPerformed

    private void btnMostrarPrincipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPrincipioActionPerformed
        ejecutar(this::mostrarPrincipio);
    }//GEN-LAST:event_btnMostrarPrincipioActionPerformed

    private void btnMostrarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarFinalActionPerformed
        ejecutar(this::mostrarFinal);
    }//GEN-LAST:event_btnMostrarFinalActionPerformed

    private void btnMostrarPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPosicionActionPerformed
        ejecutar(this::mostrarPosicion);
    }//GEN-LAST:event_btnMostrarPosicionActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ejecutar(this::buscar);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarActionPerformed
        ejecutar(this::vaciar);
    }//GEN-LAST:event_btnVaciarActionPerformed

    private void btnLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActionPerformed
        ejecutar(this::limpiarCampos);
    }//GEN-LAST:event_btnLimpiarCamposActionPerformed

    private void insertarPrincipio() {
        Paquete p = leerPaquete();
        lista.insertarAlPrincipio(p);
        exito("Paquete " + p.guia() + " insertado al principio.");
    }

    private void insertarFinal() {
        Paquete p = leerPaquete();
        lista.insertarAlFinal(p);
        exito("Paquete " + p.guia() + " insertado al final.");
    }

    private void insertarPosicion() {
        Paquete p = leerPaquete();
        int pos = leerPosicion();
        lista.insertarEnPosicion(pos, p);
        exito("Paquete " + p.guia() + " insertado en la posicion " + pos + ".");
    }

    private void removerPrincipio() {
        exito("Removido del principio:\n" + lista.removerAlPrincipio());
    }

    private void removerFinal() {
        exito("Removido del final:\n" + lista.removerAlFinal());
    }

    private void removerPosicion() {
        int pos = leerPosicion();
        exito("Removido de la posicion " + pos + ":\n" + lista.removerEnPosicion(pos));
    }

    private void mostrarPrincipio() {
        mostrar("Principio", lista.mostrarAlPrincipio(), 0);
    }

    private void mostrarFinal() {
        mostrar("Final", lista.mostrarAlFinal(), lista.getTamanio() - 1);
    }

    private void mostrarPosicion() {
        int pos = leerPosicion();
        mostrar("Posicion " + pos, lista.mostrarEnPosicion(pos), pos);
    }

    private void buscar() {
        String guia = txtBuscar.getText().trim();
        if (guia.isEmpty()) {
            throw new IllegalArgumentException("Escribe la guia que deseas buscar.");
        }
        int pos = lista.buscarPorGuia(guia);
        if (pos == -1) {
            JOptionPane.showMessageDialog(this, "No existe ningun paquete con la guia " + guia.toUpperCase() + ".",
                    "Busqueda sin resultados", JOptionPane.WARNING_MESSAGE);
        } else {
            mostrar("Encontrado", lista.mostrarEnPosicion(pos), pos);
        }
    }

    private void vaciar() {
        lista.vaciar();
        exito("La lista se vacio.");
    }

    private void limpiarCampos() {
        txtGuia.setText("");
        txtDestinatario.setText("");
        txtDestino.setText("");
        txtPeso.setText("");
        txtPosicion.setText("");
        txtBuscar.setText("");
        tabla.clearSelection();
    }

    private Paquete leerPaquete() {
        if (txtGuia.getText().isBlank() || txtDestinatario.getText().isBlank()
                || txtDestino.getText().isBlank() || txtPeso.getText().isBlank()) {
            throw new IllegalArgumentException("Llena todos los datos del paquete.");
        }
        double peso;
        try {
            peso = Double.parseDouble(txtPeso.getText().trim());
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("El peso debe ser un numero (ejemplo: 2.5).");
        }

        return new Paquete(txtGuia.getText(), txtDestinatario.getText(), txtDestino.getText(), peso);
    }

    private int leerPosicion() {
        String texto = txtPosicion.getText().trim();
        if (texto.isEmpty()) {
            throw new IllegalArgumentException("Escribe una posicion.");
        }
        try {
            return Integer.parseInt(texto);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("La posicion debe ser un numero entero.");
        }
    }

    private void ejecutar(Runnable accion) {
        try {
            accion.run();
        } catch (IllegalStateException ex) {
            error("Lista vacia", ex.getMessage());
        } catch (IndexOutOfBoundsException ex) {
            error("Posicion fuera de rango", ex.getMessage());
        } catch (IllegalArgumentException ex) {
            error("Dato invalido", ex.getMessage());
        }
        actualizarVista();
    }

    private void mostrar(String titulo, Paquete p, int pos) {
        tabla.setRowSelectionInterval(pos, pos);
        JOptionPane.showMessageDialog(this,
                "Posicion: " + pos + "\nGuia: " + p.guia() + "\nDestinatario: " + p.destinatario()
                        + "\nDestino: " + p.destino() + "\nPeso: " + p.peso() + " kg",
                titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    private void exito(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Operacion realizada", JOptionPane.INFORMATION_MESSAGE);
    }

    private void error(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
    }

    private void actualizarVista() {
        modeloTabla.fireTableDataChanged();
        lblEnlaces.setText(" " + lista);
        lblTamanio.setText(" Tamanio: " + lista.getTamanio() + (lista.estaVacia() ? "  (lista vacia)" : ""));
    }

    private class ModeloTabla extends AbstractTableModel {
        private final String[] columnas = {"Posicion", "Guia", "Destinatario", "Destino", "Peso (kg)"};

        @Override
        public int getRowCount() {
            return lista.getTamanio();
        }

        @Override
        public int getColumnCount() {
            return columnas.length;
        }

        @Override
        public String getColumnName(int c) {
            return columnas[c];
        }

        @Override
        public Object getValueAt(int fila, int col) {
            Paquete p = lista.mostrarEnPosicion(fila);
            return switch (col) {
                case 0 -> fila;
                case 1 -> p.guia();
                case 2 -> p.destinatario();
                case 3 -> p.destino();
                default -> p.peso();
            };
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnInsertarFinal;
    private javax.swing.JButton btnInsertarPosicion;
    private javax.swing.JButton btnInsertarPrincipio;
    private javax.swing.JButton btnLimpiarCampos;
    private javax.swing.JButton btnMostrarFinal;
    private javax.swing.JButton btnMostrarPosicion;
    private javax.swing.JButton btnMostrarPrincipio;
    private javax.swing.JButton btnRemoverFinal;
    private javax.swing.JButton btnRemoverPosicion;
    private javax.swing.JButton btnRemoverPrincipio;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblDestinatario;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblEnlaces;
    private javax.swing.JLabel lblGuia;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPosicion;
    private javax.swing.JLabel lblTamanio;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelInferior;
    private javax.swing.JPanel panelIzquierdo;
    private javax.swing.JPanel panelOperaciones;
    private javax.swing.JPanel panelPosicion;
    private javax.swing.JTable tabla;
    private javax.swing.JScrollPane tablaScroll;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDestinatario;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtGuia;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPosicion;
    // End of variables declaration//GEN-END:variables
}
