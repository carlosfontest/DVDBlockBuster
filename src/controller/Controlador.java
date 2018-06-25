package controller;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import model.Cliente;
import model.DVD;
import model.Pelicula;
import view.*;

public class Controlador {
    public static ArrayList<DVD> almacen = new ArrayList<>();
    public static File clientes;
    public static File peliculas;
    public static File dvds;
    public static long alquilados;
    public static long totales;
    //Para guardar en los Archivos De Texto
    private FileWriter fw;
    private BufferedWriter bw;
    private FileReader fr;
    private BufferedReader br;

    public Controlador() throws FileNotFoundException {
        clientes = new File("BaseDeDatos/Clientes.txt");
        peliculas = new File("BaseDeDatos/Peliculas.txt");
        dvds = new File("BaseDeDatos/DVDs.txt");
        
    }
    
    
    public void iniciarPrograma(){
        FramePrincipal principal = new FramePrincipal(this);
        //Login principal = new Login(this);
        principal.setVisible(true);      
        
        //$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$$#$#$#
        this.configurarCalendario(principal);
    }
    
    public void iniciarSesion(Login inicio){
        // Validacion de usuario para acceder al sistema
        
        if(inicio.user.getText().trim().equals("admin") && inicio.pass.getText().equals("admin")){
            // Inicio frame Loading
            Loading loading = new Loading();
            
            Runnable miRunnable = new Runnable(){
            @Override
            public void run(){
                try
                {
                    // Si no hay ningun error carga el juego
                    inicio.dispose();
                    loading.setVisible(true);
                    for (int i = 0; i <= 100; i++) {
                        // Tiempo que tardará la carga
                        Thread.sleep(13);
                        loading.loadingBar.setValue(i);

                        if(i==100){
                            Thread.sleep(1000);
                        }
                    }
                    loading.dispose();
                    abrirPrincipal();
                }catch (InterruptedException e){
                    JOptionPane.showMessageDialog(null, e);
                }
                }
            };
            Thread hilo = new Thread (miRunnable);
            hilo.start();
            
            // Fin frame loading
        }else{
            JOptionPane.showMessageDialog(inicio, "Usuario o contraseña inválidos");
            inicio.user.setText("User");
            inicio.pass.setText("password");
        }
    }
    
    public void abrirPrincipal(){
        // Abre la ventana del JFrame Principal
        FramePrincipal principal = new FramePrincipal(this);
        principal.setVisible(true);
        
        //$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$$#$#$#
        //this.configurarCalendario(principal);
    }
    
    public void iniciarTablas(PanelPrincipal pPri, PanelClientes pClien, PanelPeliculas pPeli){
        // Tamaño de cada columna
        pPri.tablePeliculaCliente.getTableHeader().setReorderingAllowed(false);
        pPri.tablePeliculaCliente.getTableHeader().setResizingAllowed(false);
        pPri.tablePeliculaCliente.getColumnModel().getColumn(0).setPreferredWidth(160);
        pPri.tablePeliculaCliente.getColumnModel().getColumn(1).setPreferredWidth(160);
        pPri.tablePeliculaCliente.getColumnModel().getColumn(2).setPreferredWidth(115);
        pPri.tablePeliculaCliente.getColumnModel().getColumn(3).setPreferredWidth(130);
        pPri.tablePeliculaCliente.getColumnModel().getColumn(4).setPreferredWidth(160);
        pPri.tablePeliculaCliente.getColumnModel().getColumn(5).setPreferredWidth(160);
        // Altura de cada renglón
        pPri.tablePeliculaCliente.setRowHeight(20);
        
        // Tamaño de cada columna
        pClien.tableClientes.getTableHeader().setReorderingAllowed(false);
        pClien.tableClientes.getTableHeader().setResizingAllowed(false);
        pClien.tableClientes.getColumnModel().getColumn(0).setPreferredWidth(140);
        pClien.tableClientes.getColumnModel().getColumn(1).setPreferredWidth(140);
        pClien.tableClientes.getColumnModel().getColumn(2).setPreferredWidth(115);
        pClien.tableClientes.getColumnModel().getColumn(3).setPreferredWidth(60);
        pClien.tableClientes.getColumnModel().getColumn(4).setPreferredWidth(230);
        // Altura de cada renglón
        pClien.tableClientes.setRowHeight(20);
        
        // Tamaño de cada columna
        pPeli.tablePeliculas.getTableHeader().setReorderingAllowed(false);
        pPeli.tablePeliculas.getTableHeader().setResizingAllowed(false);
        pPeli.tablePeliculas.getColumnModel().getColumn(0).setPreferredWidth(160);
        // Altura de cada renglón
        pPeli.tablePeliculas.setRowHeight(20);
    }
    
    public void abrirPanelPrincipal(PanelPrincipal pPrin, PanelClientes pClien, PanelPeliculas pPeli, FramePrincipal frame){
        this.setColor(frame.botonPrincipal); 
        frame.indicador1.setOpaque(true);
        this.resetColor(new JPanel[]{frame.botonClientes, frame.botonPeliculas}, new JPanel[]{frame.indicador2, frame.indicador3});
        
        pPrin.setVisible(true);
        pPeli.setVisible(false);
        pClien.setVisible(false);
    }
    
    public void abrirPanelClientes(PanelPrincipal pPrin, PanelClientes pClien, PanelPeliculas pPeli, FramePrincipal frame){
        this.setColor(frame.botonClientes); 
        frame.indicador2.setOpaque(true);
        this.resetColor(new JPanel[]{frame.botonPrincipal, frame.botonPeliculas}, new JPanel[]{frame.indicador1, frame.indicador3});
        
        pPrin.setVisible(false);
        pPeli.setVisible(false);
        pClien.setVisible(true);
    }
    
    public void abrirPanelPeliculas(PanelPrincipal pPrin, PanelClientes pClien, PanelPeliculas pPeli, FramePrincipal frame){
        this.setColor(frame.botonPeliculas); 
        frame.indicador3.setOpaque(true);
        this.resetColor(new JPanel[]{frame.botonPrincipal, frame.botonClientes}, new JPanel[]{frame.indicador1, frame.indicador2});
        
        pPrin.setVisible(false);
        pPeli.setVisible(true);
        pClien.setVisible(false);
    }
    
    public void minimizar(JFrame frame){
        frame.setState(frame.ICONIFIED);
    }
    
    public void cerrar(JFrame frame){        
        //Cerramos el programa
        try {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "¿Desea cerrar el sistema?", "Salir", dialogButton);
            if(result == 0){
                System.exit(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, e);
        }
    }
    
    public void mostrarInfo(JFrame frame){
        Icon icono = new ImageIcon(getClass().getResource("../images/logoCFRQ.png"));
        JOptionPane.showMessageDialog(frame, "Software elaborado por Carlos Fontes y Rafael Quintero\n "
            + "Proyecto N° 2 - Organización del Computador - UNIMET\n                       ©CF&RQ - DVDBlockBuster\n "
            + "                               2 de Julio de 2018", "Información", JOptionPane.INFORMATION_MESSAGE, icono);
    }
    
    public void limpiarSeleccion(JTable tabla, JToggleButton boton){
        tabla.clearSelection();
        boton.requestFocus();
    }
    
    public void mostrarValorSlider(PanelPeliculas panel){
        panel.labelSliderStock.setText(String.valueOf(panel.sliderStock.getValue()));
    }
    
    public void validarSoloNumeros(KeyEvent evt, JFrame frame){
        char validar = evt.getKeyChar();
        
        if(!Character.isDigit(validar)){
            frame.getToolkit().beep();
            evt.consume();
        }
    }
    
    public void buscarClienteP(PanelPrincipal panel){
        // Se verifica si se ingresó alguna cédula
        if(panel.textFieldCedulaP.getText().equals("Cédula del cliente")){
            JOptionPane.showMessageDialog(panel, "Ingrese la cédula del Cliente que desee buscar", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Se selecciona el cliente buscado en el ComboBox
        for (int i = 0; i < panel.comboClientes.getItemCount(); i++) {
            if(String.valueOf(panel.comboClientes.getItemAt(i)).contains(String.valueOf(panel.textFieldCedulaP.getText())) ){
                panel.comboClientes.setSelectedIndex(i);
                panel.textFieldCedulaP.setText("Cédula del cliente");
                return;
            }
        }
        
        JOptionPane.showMessageDialog(panel, "La Cédula que ingresó no pertenece a la de ningún Cliente", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void buscarClienteEnArchivo(PanelPrincipal panel){
        DefaultTableModel modelo = (DefaultTableModel) panel.tablePeliculaCliente.getModel();
        
        String cedula = String.valueOf(panel.comboClientes.getSelectedItem());
        if(!cedula.equals("Seleccione")){
            
            // BUSCAR CLIENTE EN EL ARCHIVO Y PONERLO EN LA TABLA
            // ##
            // ##
            // ##
            // ##
            // ##
            // ##
            // ##
            // ##
            
            
        }else{
            if(panel.tablePeliculaCliente.getRowCount() != 0){
                modelo.removeRow(0);
            }
        }
    }
    
    public void agregarCliente(PanelClientes panel, FramePrincipal frame){
        // Variables auxiliares para poder validar todo de manera correcta
        boolean flag1, flag2;
        
        // Validamos la cédula
        long cedula = 0;
        do{
            flag1 = flag2 = false;
            try {
                    cedula = Integer.parseInt(JOptionPane.showInputDialog(panel, "        Ingrese la cédula del cliente\n          (De 1 millon a 30millones)", "Ingrese cédula", JOptionPane.QUESTION_MESSAGE));
                    if(!String.valueOf(cedula).matches("[0-9]*$")){
                        JOptionPane.showMessageDialog(panel, "Ingresó una cédula inválida\n  (No ingrese ni letras ni símbolos)", "Error", JOptionPane.ERROR_MESSAGE);
                        flag1= true;
                    }
                    if(cedula < 1000000 || cedula > 30000000){
                        JOptionPane.showMessageDialog(panel, "Ingresó un número inválido\n  (De 1 millon a 30millones)", "Error", JOptionPane.ERROR_MESSAGE);
                        flag2 = true;
                    }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(panel, "Ingresó un número inválido\n  (De 1 millon a 30millones)", "Error", JOptionPane.ERROR_MESSAGE);
                flag1 = true;
            }
        }while(flag1 == true || flag2 == true);
        
        //Se valida que el cliente no exista
        // ##
        // ##
        // ##
        // ##
        // ##
        // ##
        // ##
        // ##
        
        //Pedimos el nombre
        String nombre = JOptionPane.showInputDialog("     Ingrese el nombre del cliente\n        (No más de 20 caracteres)");
        try {
            if(nombre.length() > 20 || nombre.length() == 0){
                JOptionPane.showMessageDialog(panel, "Ingrese el nombre del cliente siguiendo las instrucciones", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(panel, "Ingrese el nombre del cliente siguiendo las instrucciones", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Pedimos el apellido
        String apellido = JOptionPane.showInputDialog("     Ingrese el apellido del cliente\n        (No más de 20 caracteres)");
        try {
            if(apellido.length() > 20 || apellido.length() == 0){
                JOptionPane.showMessageDialog(panel, "Ingrese el apellido del cliente siguiendo las instrucciones", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(panel, "Ingrese el apellido del cliente siguiendo las instrucciones", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Se añade el cliente a la tabla de clientes
        DefaultTableModel modelo = (DefaultTableModel) panel.tableClientes.getModel();
        
        modelo.addRow(new Object[]{
            nombre, apellido, cedula, 0, "No Aplica"
        });
        
        //Se añade el nuevo cliente al comboBox de clientes
        frame.pPrincipal.comboClientes.addItem(String.valueOf(cedula));
        
        //Se añade al archivo de clientes
        try {
            if(clientes.exists()){
                fw = new FileWriter(clientes);
                bw = 
            }else{
                
            }
        } catch (Exception e) {
        }
        
    }
    
    public void eliminarCliente(PanelClientes panel, FramePrincipal frame){
        DefaultTableModel modelo = (DefaultTableModel) panel.tableClientes.getModel();
        //Se valida si se seleccionó alguna fila
        if(panel.tableClientes.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(panel, "Seleccione el cliente que desea eliminar", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Se verifica que el cliente no tenga nignun DVD para poder eliminarlo
        String ID = String.valueOf( modelo.getValueAt(panel.tableClientes.getSelectedRow(), 3) );
        if(!ID.equals("0")){
            JOptionPane.showMessageDialog(panel, "No se puede eliminar un cliente con un DVD en su poder", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String cedula = String.valueOf( modelo.getValueAt(panel.tableClientes.getSelectedRow(), 2) );
        
        //Se elimina el cliente a la tabla de clientes
        modelo.removeRow(panel.tableClientes.getSelectedRow());
        
        //Se elimina el cliente al comboBox de clientes
        for (int i = 0; i < frame.pPrincipal.comboClientes.getItemCount(); i++) {
            if(cedula.equals(frame.pPrincipal.comboClientes.getItemAt(i))){
                frame.pPrincipal.comboClientes.removeItemAt(i);
            }
        }
        
        //Se elimina el cliente del archivo de texto
        // ##
        // ##
        // ##
        // ##
        // ##
        // ##
        // ##
        // ##
        
    }
    
    public void editarCliente(PanelClientes panel){
        DefaultTableModel modelo = (DefaultTableModel) panel.tableClientes.getModel();
        //Se valida si se seleccionó alguna fila
        if(panel.tableClientes.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(panel, "Seleccione el cliente que desea eliminar", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String modificar = String.valueOf(panel.comboEditarCliente.getSelectedItem());
        if(modificar.equals("Seleccione")){
            JOptionPane.showMessageDialog(panel, "Seleccione que desea modificar", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(modificar.equals("Nombre")){
            String nombreViejo = String.valueOf( modelo.getValueAt(panel.tableClientes.getSelectedRow(), 0) );
            String nombreNuevo = (String)JOptionPane.showInputDialog(panel, "Escriba el nuevo nombre del cliente", "Modificación Nombre", JOptionPane.QUESTION_MESSAGE);
            if(nombreNuevo.length() > 20 || nombreNuevo.length() == 0){
                JOptionPane.showMessageDialog(panel, "Ingrese el nombre del cliente siguiendo las instrucciones", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            panel.tableClientes.setValueAt(nombreNuevo, panel.tableClientes.getSelectedRow(), 0);
            panel.tableClientes.clearSelection();
            panel.comboEditarCliente.setSelectedIndex(0);
            // Modificar el nombre del cliente en el archivo de texto
            // ##
            // ##
            // ##
            // ##
            // ##
            // ##
            // ##
            // ##
        }else if(modificar.equals("Apellido")){
            String apellidoViejo = String.valueOf( modelo.getValueAt(panel.tableClientes.getSelectedRow(), 1) );
            String apellidoNuevo = (String)JOptionPane.showInputDialog(panel, "Escriba el nuevo apellido del cliente", "Modificación Apellido", JOptionPane.QUESTION_MESSAGE);
            if(apellidoNuevo.length() > 20 || apellidoNuevo.length() == 0){
                JOptionPane.showMessageDialog(panel, "Ingrese el nombre del cliente siguiendo las instrucciones", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            panel.tableClientes.setValueAt(apellidoNuevo, panel.tableClientes.getSelectedRow(), 1);
            panel.tableClientes.clearSelection();
            panel.comboEditarCliente.setSelectedIndex(0);
            // Modificar el apellido del cliente en el archivo de texto
            // ##
            // ##
            // ##
            // ##
            // ##
            // ##
            // ##
            // ##
        }
        
    }
    
    public void agregarPelicula(PanelPeliculas panel, FramePrincipal frame){        
        //Pedimos el título
        String titulo = JOptionPane.showInputDialog("     Ingrese el título de la película\n        (No más de 30 caracteres)");
        try {
            if(titulo.length() > 30 || titulo.length() == 0){
                JOptionPane.showMessageDialog(panel, "Ingrese el título de la película siguiendo las instrucciones", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(panel, "Ingrese el título de la película siguiendo las instrucciones", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Se verifica si el título de la película ya pertenece a alguna otra, si pertenece no se crea
        for (int i = 0; i < panel.tablePeliculas.getRowCount(); i++) {
            if(titulo.equals(panel.tablePeliculas.getValueAt(i, 0))){
                JOptionPane.showMessageDialog(panel, "El título que ingresó ya existe para una película", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        //Pedimos el género
        String[] generos = {"Acción", "Amor", "Suspenso", "Aventura", "Terror", "Comedia"};
        String genero = (String)JOptionPane.showInputDialog(panel, "   Elija el género de la Película", "Selección Género", JOptionPane.QUESTION_MESSAGE, null, generos, generos[0]);
        
        //Pedimos el Rating
        String[] ratings = {"1", "2", "3", "4", "5"};
        String rating = (String)JOptionPane.showInputDialog(panel, "   Elija el rating de la Película", "Selección Rating", JOptionPane.QUESTION_MESSAGE, null, ratings, ratings[0]);
        
        //Pedimos el precio
        boolean flag1, flag2;
        
        String precio;
        do{
            flag1 = flag2 = false;
            try {
                    precio = JOptionPane.showInputDialog(panel, "      Ingrese el precio de la película\n          (Solo numeros enteros)", "Ingrese cédula", JOptionPane.QUESTION_MESSAGE);
                    if(!String.valueOf(precio).matches("[0-9]*$")){
                        JOptionPane.showMessageDialog(panel, "      Ingresó un número inválido\n  (No ingrese ni letras ni símbolos)", "Error", JOptionPane.ERROR_MESSAGE);
                        flag1= true;
                    }
                    else if(Long.parseLong(precio) < 0 || Long.parseLong(precio) >30000000 ){
                        JOptionPane.showMessageDialog(panel, "      Ingresó un número inválido\n  (De 0 a 30millones)", "Error", JOptionPane.ERROR_MESSAGE);
                        flag2 = true;
                    }
            } catch (Exception e) {
                return;
            }
        }while(flag1 == true || flag2 == true);

        //Pedimos la descripción de la Película
        do{
            flag1 = false;
            try {
                String descripcion = JOptionPane.showInputDialog("     Ingrese una breve descripcion de la película\n        (No más de 20 caracteres)");
                if(titulo.length() > 20 || titulo.length() == 0){
                    flag1 = true;
                    JOptionPane.showMessageDialog(panel, "Ingrese la descripcion de la película siguiendo las instrucciones", "Error", JOptionPane.ERROR_MESSAGE);
                }else if(descripcion.equals("")){
                    JOptionPane.showMessageDialog(panel, "Ingrese la descripcion de la película", "Error", JOptionPane.ERROR_MESSAGE);
                    flag1 = true;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(panel, "Ingrese la descripcion de la película siguiendo las instrucciones", "Error", JOptionPane.ERROR_MESSAGE);
                flag1 = true;
            } 
        }while(flag1 == true);
        //Se añade la película a la tabla de películas
        DefaultTableModel modelo = (DefaultTableModel) panel.tablePeliculas.getModel();
        
        modelo.addRow(new Object[]{
            titulo, genero, rating, precio + " $", 0
        });
        
        //Se añade al archivo de películas
        // ##
        // ##
        // ##
        // ##
        // ##
        // ##
        // ##
        // ##
        
    }
    
    public void eliminarPelicula(PanelPeliculas panel, FramePrincipal frame){
        DefaultTableModel modelo = (DefaultTableModel) panel.tablePeliculas.getModel();
        //Se valida si se seleccionó alguna fila
        if(panel.tablePeliculas.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(panel, "Seleccione la película que desea eliminar", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String titulo = String.valueOf( modelo.getValueAt(panel.tablePeliculas.getSelectedRow(), 0) );
        
        //Se verifica si algun cliente tiene esa película, si alguien la tiene no se puede eliminar
        for (int i = 0; i < frame.pClientes.tableClientes.getRowCount(); i++) {
            if(titulo.equals(frame.pClientes.tableClientes.getValueAt(i, 4))){
                JOptionPane.showMessageDialog(panel, "Actualmente esa Película la tiene el cliente: \n" + 
                    frame.pClientes.tableClientes.getValueAt(i, 0) + " " +  frame.pClientes.tableClientes.getValueAt(i, 1) + " | CI: " + 
                    frame.pClientes.tableClientes.getValueAt(i, 2)    , 
                    "Error", JOptionPane.ERROR_MESSAGE);
                    return;
            }
        }
        
        
        //Se eliminan todos los DVDs de esa película que estan en el arrayList
        // ##
        // ##
        // ##
        // ##
        // ##
        // ##
        // ##
        // ##
        
        //Se elimina la película de la tabla de películas
        modelo.removeRow(panel.tablePeliculas.getSelectedRow());
        
        //Se elimina la película del archivo de texto
        // ##
        // ##
        // ##
        // ##
        // ##
        // ##
        // ##
        // ##
    }
    
    public void editarPelicula(PanelPeliculas panel){
        DefaultTableModel modelo = (DefaultTableModel) panel.tablePeliculas.getModel();
        //Se valida si se seleccionó alguna fila
        if(panel.tablePeliculas.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(panel, "Seleccione la película que desee modificar", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String modificar = String.valueOf(panel.comboEditarPelicula.getSelectedItem());
        if(modificar.equals("Seleccione")){
            JOptionPane.showMessageDialog(panel, "Seleccione que desea modificar", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(modificar.equals("Título")){
            String nombreViejo = String.valueOf( modelo.getValueAt(panel.tablePeliculas.getSelectedRow(), 0) );
            String nombreNuevo = (String)JOptionPane.showInputDialog(panel, "Escriba el nuevo título de la película\n        (No más de 30 caracteres)", "Modificación Título", JOptionPane.QUESTION_MESSAGE);
            if(nombreNuevo.length() > 30 || nombreNuevo.length() == 0){
                JOptionPane.showMessageDialog(panel, "Ingrese el título de la película siguiendo las instrucciones", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            panel.tablePeliculas.setValueAt(nombreNuevo, panel.tablePeliculas.getSelectedRow(), 0);
            panel.tablePeliculas.clearSelection();
            panel.comboEditarPelicula.setSelectedIndex(0);
            // Modificar el título de la película en el archivo de texto
            // ##
            // ##
            // ##
            // ##
            // ##
            // ##
            // ##
            // ##
        }else if(modificar.equals("Género")){
            String[] generos = {"Acción", "Amor", "Suspenso", "Aventura", "Terror", "Comedia"};
            String generoViejo = String.valueOf( modelo.getValueAt(panel.tablePeliculas.getSelectedRow(), 1) );
            String generoNuevo = (String)JOptionPane.showInputDialog(panel, "   Elija el género de la Película", "Selección Género", JOptionPane.QUESTION_MESSAGE, null, generos, generos[0]);
            panel.tablePeliculas.setValueAt(generoNuevo, panel.tablePeliculas.getSelectedRow(), 1);
            panel.tablePeliculas.clearSelection();
            panel.comboEditarPelicula.setSelectedIndex(0);
            // Modificar el apellido del cliente en el archivo de texto
            // ##
            // ##
            // ##
            // ##
            // ##
            // ##
            // ##
            // ##
        }else if(modificar.equals("Precio")){
            String precioViejo = String.valueOf( modelo.getValueAt(panel.tablePeliculas.getSelectedRow(), 3) );
            
            boolean flag1, flag2;
        
            String precioNuevo;
            do{
                flag1 = flag2 = false;
                try {
                        precioNuevo = JOptionPane.showInputDialog(panel, "      Ingrese el precio de la película\n          (Solo numeros enteros)", "Ingrese cédula", JOptionPane.QUESTION_MESSAGE);
                        if(!String.valueOf(precioNuevo).matches("[0-9]*$")){
                            JOptionPane.showMessageDialog(panel, "      Ingresó un número inválido\n  (No ingrese ni letras ni símbolos)", "Error", JOptionPane.ERROR_MESSAGE);
                            flag1= true;
                        }
                        else if(Long.parseLong(precioNuevo) < 0 || Long.parseLong(precioNuevo) >30000000 ){
                            JOptionPane.showMessageDialog(panel, "      Ingresó un número inválido\n  (De 0 a 30millones)", "Error", JOptionPane.ERROR_MESSAGE);
                            flag2 = true;
                        }
                } catch (Exception e) {
                    return;
                }
            }while(flag1 == true || flag2 == true);
            
            
            panel.tablePeliculas.setValueAt(precioNuevo + " $", panel.tablePeliculas.getSelectedRow(), 3);
            panel.tablePeliculas.clearSelection();
            panel.comboEditarPelicula.setSelectedIndex(0);
            // Modificar el apellido del cliente en el archivo de texto
            // ##
            // ##
            // ##
            // ##
            // ##
            // ##
            // ##
            // ##
        }else if(modificar.equals("Rating")){
            String[] ratings = {"1", "2", "3", "4", "5"};
            String ratingNuevo = (String)JOptionPane.showInputDialog(panel, "   Elija el rating de la Película", "Selección Rating", JOptionPane.QUESTION_MESSAGE, null, ratings, ratings[0]);
            String ratingViejo = String.valueOf( modelo.getValueAt(panel.tablePeliculas.getSelectedRow(), 2) );
            
            panel.tablePeliculas.setValueAt(ratingNuevo, panel.tablePeliculas.getSelectedRow(), 2);
            panel.tablePeliculas.clearSelection();
            panel.comboEditarPelicula.setSelectedIndex(0);
            // Modificar el apellido del cliente en el archivo de texto
            // ##
            // ##
            // ##
            // ##
            // ##
            // ##
            // ##
            // ##
        }
        
    }
    
    public void buscarPelicula(PanelPeliculas panel){
        // Se verifica si se ingresó algun título
        if(panel.textFieldCedulaP.getText().equals("Título")){
            JOptionPane.showMessageDialog(panel, "Ingrese el Título de la película que desee buscar", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Se verifica si el título ingresado pertenece a alguna película
        String tituloBuscar = String.valueOf(panel.textFieldCedulaP.getText());
        for (int i = 0; i < panel.tablePeliculas.getRowCount(); i++) {
            if(String.valueOf(panel.tablePeliculas.getValueAt(i, 0)).contains(tituloBuscar)){
                panel.tablePeliculas.changeSelection(i, 1, false, false);
                panel.textFieldCedulaP.setText("Título");
                return;
            }
        }
        
       JOptionPane.showMessageDialog(panel, "El Título ingresó no pertenece al de ninguna película", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void aumentarStock(PanelPeliculas panel){
        //Se valida que se haya seleccionado un numero en el slider
        if(panel.sliderStock.getValue() == 0){
            JOptionPane.showMessageDialog(panel, "Seleccione cuantos DVDs desea agregar al Stock", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Se valida si se seleccionó alguna fila
        if(panel.tablePeliculas.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(panel, "Seleccione la película a la que le desea agregar Stock", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String tituloPelicula = String.valueOf(panel.tablePeliculas.getValueAt(panel.tablePeliculas.getSelectedRow(), 0));
        
        //Modificamos la tabla con el nuevo Stock
        int stock = Integer.parseInt(String.valueOf(panel.tablePeliculas.getValueAt(panel.tablePeliculas.getSelectedRow(), 4)));
        int nuevoStock = stock + panel.sliderStock.getValue();
        panel.tablePeliculas.setValueAt(nuevoStock, panel.tablePeliculas.getSelectedRow(), 4);
        
        panel.tablePeliculas.clearSelection();
        panel.sliderStock.setValue(0);
        
        //Buscar en el archivo de texto cual es la película que hay que agregarle a los DVDs nuevos
        // ##
        // ##
        // ##
        // ##
        // ##
        // ##
        // ##
        // ##
        
        //Crear la cantidad deseada de nuevos DVDs (Sabiendo ya que pelicula hay que agregarle) y agregarlos al array de DVDS
        
        
        
    }
    
    public void verDescripcion(PanelPeliculas panel){
        //Se valida si se seleccionó alguna fila
        if(panel.tablePeliculas.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(panel, "Seleccione la película a la que le desea ver la descripción", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String titulo = String.valueOf(panel.tablePeliculas.getValueAt(panel.tablePeliculas.getSelectedRow(), 0));
        
        //Buscar cual es la película que se desea ver la descripcion en el archivo de texto y mostrarla en un JOption
        // ##
        // ##
        // ##
        // ##
        // ##
        // ##
        // ##
        // ##
    }
    
    public void configurarCalendario(FramePrincipal frame){
        Date date = new Date();
        frame.pPrincipal.calendario.setMaxSelectableDate( sumarDiasAFecha(date,9) );
        frame.pPrincipal.calendario.setMinSelectableDate( sumarDiasAFecha(date,1) );
    }
    
    public  Date sumarDiasAFecha(Date fecha, int dias){
        if (dias==0) return fecha;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha); 
        calendar.add(Calendar.DAY_OF_YEAR, dias);  
        return calendar.getTime(); 
    }
    
    
    
    //--------------------Métodos para cambiar el color a los botones de los paneles--------------------
    private void setColor(JPanel panel){
        panel.setBackground(new Color(48,24,30)); //Color SI seleccionado
    }
    
    private void resetColor(JPanel [] boton, JPanel [] indicadores){
        for (JPanel boton1 : boton) {
            boton1.setBackground(new Color(70,24,30)); //Color NO seleccionado
        }
        for (JPanel indicadore : indicadores) {
            indicadore.setOpaque(false);           
        }
    }
    
    //--------------------Métodos para el manejo de archivos de texto--------------------
    
    public Cliente busquedaBinariaCedula(long rrn){
        

    }
    
    public Pelicula busquedaBinariaTitulo(long rrn){
        

    }
    
    public Pelicula busquedaBinariaGenero(long rrn){
        

    }
    
    public DVD busquedaBinariaID(long rrn){
        

    }
        
}

