package controller;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.*;
import model.Cliente;
import model.DVD;
import model.Pelicula;
import view.*;

public class Controlador {
    //Archivos de texto
    public static File clientes;
    public static File peliculas;
    public static File dvds;
    //Variables para saber el estado del almacen de DVDs
    public static long alquilados;
    public static long totales;
    //Indexs de los archivos de texto
    public ArrayList<Cliente> indexCedula;
    public ArrayList<Pelicula> indexTitulo;
    public ArrayList<Pelicula> indexGenero;
    public ArrayList<Pelicula> indexRating;
    public ArrayList<DVD> indexID;
    //Para guardar en los Archivos De Texto
    private FileWriter fw;
    private BufferedWriter bw;
    private FileReader fr;
    private BufferedReader br;
    //Bandera para evitar que se repitan procesos del inicio
    private boolean flag = false;

    public Controlador() throws FileNotFoundException {
        clientes = new File("BaseDeDatos/Clientes.txt");
        peliculas = new File("BaseDeDatos/Peliculas.txt");
        dvds = new File("BaseDeDatos/DVDs.txt");
        
        //Inicializamos los index
        indexCedula = new ArrayList<>();
        indexTitulo = new ArrayList<>();
        indexGenero = new ArrayList<>();
        indexRating = new ArrayList<>();
        indexID = new ArrayList<>();
        
        this.totales = 0;
        this.alquilados = 0;
                
        
        
    }
    
    
    public void iniciarPrograma(){
        FramePrincipal principal = new FramePrincipal(this);
        //Login principal = new Login(this);
        principal.setVisible(true);      
        
        //$#$#$#$#$#$#$#$#$#$#$#$#$#$#$#$$#$#$#
        this.configurarCalendario(principal);
        //Cargamos los index
        this.cargarIndexCedula(principal);
        this.cargarIndexPeliculas(principal);
        this.cargarIndexID(principal);
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
        //this.cargarIndexCedula(principal);
        //this.cargarIndexPeliculas(principal);
        //this.cargarIndexID(principal);
        
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
    
    public void alquilar(PanelPrincipal panel, FramePrincipal frame){
        
        if( String.valueOf(panel.comboClientes.getSelectedItem()).equals("Seleccione") ){
            JOptionPane.showMessageDialog(panel, "Seleccione a un cliente para alquilar", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(!String.valueOf(panel.tablePeliculaCliente.getValueAt(0, 3)).equals("No Aplica")){
            JOptionPane.showMessageDialog(panel, "Ya este cliente tiene una pelicula", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(panel.calendario.getDate() == null){
            JOptionPane.showMessageDialog(panel, "Seleccione una fecha de devolución", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Guardamos la fecha
        Date devolucion = panel.calendario.getDate();
        
        //Pedimos la pelicula que alquilar
        String[] pelicula = new String[indexTitulo.size()];
        
        for (int i = 0; i < indexTitulo.size(); i++) {
            pelicula[i] = indexTitulo.get(i).getTitulo();
        }
        
        
        String peliculaEscogida = (String)JOptionPane.showInputDialog(panel, "   Elija la pelicula que desee alquilar", "Selección Película", JOptionPane.QUESTION_MESSAGE, null, pelicula, pelicula[0]);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        
        //Validaciones de stock de DVDs
        if(indexID.size() == 0 ){
            JOptionPane.showMessageDialog(panel, "No se ha quemado ningún DVD", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        DVD dvd;
        
        for (int i = 0; i < indexID.size(); i++){
            try {
                dvd = busquedaID(indexID.get(i).getID());
                System.out.println("escogiste: " + peliculaEscogida + " pero este id tiene " + dvd.getPelicula().getTitulo());
                if(dvd.getPelicula().getTitulo().equals(peliculaEscogida)){
                    if(dvd.getFechaAlquiler() == null){
                        //Actualizamos el DVD
                        dvd.setFechaAlquiler(new Date());
                        dvd.setFechaDevolucion(devolucion);
                        dvd.getPelicula().alquilarPelicula();
                        this.alquilados++;
                        
                        
                        //Modificamos el archivo de peliculas
                        long RRN = indexID.get(i).getRRN();
                        
                        fr = new FileReader(dvds);
                        br = new BufferedReader(fr);
                        fw = new FileWriter(dvds, true);
                        bw = new BufferedWriter(fw);

                        for (int j = 0; j < RRN; j++) {
                            br.readLine();
                        }
                        
                        String infoA = br.readLine();
                        String[] infoAux = infoA.split("#");
                        String fechaAlquiler = sdf.format(dvd.getFechaAlquiler());
                        String fechaDevolucion = sdf.format(dvd.getFechaDevolucion());
                        
                        infoAux[1]= fechaAlquiler;
                        infoAux[2] = fechaDevolucion;
                        String infoN = infoAux[0] + "#" + infoAux[1] + "#" + infoAux[2] + "#" + infoAux[3];

                        
                        modificarArchivo(dvds, infoA, infoN);

                        
                        //Modificamos el archivo de peliculas
                        
                        RRN = this.busquedaRRNTitulo(peliculaEscogida);
                        
                        fr = new FileReader(peliculas);
                        br = new BufferedReader(fr);
                        fw = new FileWriter(peliculas, true);
                        bw = new BufferedWriter(fw);

                        for (int j = 0; j < RRN; j++) {
                            br.readLine();
                        }
                        
                        infoA = br.readLine();
                        infoAux = infoA.split("#");
                        infoAux[5] = String.valueOf(dvd.getPelicula().getStock());
                        infoN = infoAux[0] + "#" + infoAux[1] + "#" + infoAux[2] + "#" + infoAux[3] + "#" + infoAux[4] + "#" + infoAux[5];
                        
                        modificarArchivo(peliculas, infoA, infoN);
                        
                        //Actualizamos la tabla
                        
                        cargarIndexPeliculas(frame);
                        
                        //Modificamos el ID del DVD en el archivo del cliente
                        
                        RRN = busquedaRRNCedula(Long.parseLong(String.valueOf(panel.comboClientes.getSelectedItem())));
                        
                        fr = new FileReader(clientes);
                        br = new BufferedReader(fr);
                        fw = new FileWriter(clientes, true);
                        bw = new BufferedWriter(fw);

                        for (int j = 0; j < RRN; j++) {
                            br.readLine();
                        }
                        infoA = br.readLine();
                        infoAux = infoA.split("#");
                        infoAux[3] = String.valueOf(dvd.getID());
                        infoN = infoAux[0] + "#" + infoAux[1] + "#" + infoAux[2] + "#" + infoAux[3];
                        
                        modificarArchivo(clientes, infoA, infoN);
                        
                        //Reiniciamos tabla cliente
                        
                        cargarIndexCedula(frame);
                        
                        //Reiniciamos tabla principal
                        this.buscarClienteEnArchivo(panel);
                        
                        return;
                    }
                }
            } catch (Exception e) {
            }
        }
        
        //Fecha de devolución próxima
        devolucion = new Date();
        devolucion = sumarDiasAFecha(devolucion, 9);
        
        long idDVD = 0;
        
        for (int i = 0; i < indexID.size(); i++) {
            if(busquedaID(indexID.get(i).getID()).getFechaDevolucion() != null && devolucion.after(busquedaID(indexID.get(i).getID()).getFechaDevolucion())){
                devolucion = busquedaID(indexID.get(i).getID()).getFechaDevolucion();
                idDVD = indexID.get(i).getID();
            }
        }
        
        //JAJA conseguiste el Easter Egg 
        String cliente = "Carlushi el chupa conchushi";
        
        for (int i = 0; i < frame.pClientes.tableClientes.getRowCount(); i++) {
            if(String.valueOf(frame.pClientes.tableClientes.getValueAt(i, 3)).contains(String.valueOf(idDVD))){
                cliente = String.valueOf(frame.pClientes.tableClientes.getValueAt(i, 0))+ " " + String.valueOf(frame.pClientes.tableClientes.getValueAt(i, 1));
                break;
            }
        }
        
        String fecha = sdf.format(devolucion);
        
        JOptionPane.showMessageDialog(panel, "No hay DVDs disponible, el más próximo lo tiene: " + cliente + " y lo entregará en la fecha: " + fecha , "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    
  
    public void devolver(PanelPrincipal panel, FramePrincipal frame){
        if( String.valueOf(panel.comboClientes.getSelectedItem()).equals("Seleccione") ){
            JOptionPane.showMessageDialog(panel, "Seleccione a un cliente para devolver", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(String.valueOf(panel.tablePeliculaCliente.getValueAt(0, 3)).equals("No Aplica")){
            JOptionPane.showMessageDialog(panel, "Este cliente no tiene una pelicula", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Reestablecemos los contadores y la fecha a null
        
        this.alquilados--;
        
        long id = Long.parseLong(String.valueOf(panel.tablePeliculaCliente.getValueAt(0, 3)));
        
        long cedula = Long.parseLong(String.valueOf(panel.tablePeliculaCliente.getValueAt(0, 2)));
        
        DVD dvd = busquedaID(id);
        
        dvd.getPelicula().devolverPelicula();
        
        String peliculaEscogida = busquedaID(id).getPelicula().getTitulo();
        
        int i=0;
        
        for (int j = 0; j < indexID.size(); j++) {
            if(indexID.get(j).getID() == id){
                indexID.get(j).setFechaAlquiler(null);
                indexID.get(j).setFechaDevolucion(null);
                i = j;
            }
        }
        
        try {
            //Modificamos el archivo de peliculas
            long RRN = indexID.get(i).getRRN();

            fr = new FileReader(dvds);
            br = new BufferedReader(fr);
            fw = new FileWriter(dvds, true);
            bw = new BufferedWriter(fw);

            for (int j = 0; j < RRN; j++) {
                br.readLine();
            }

            String infoA = br.readLine();
            String[] infoAux = infoA.split("#");
            String fechaAlquiler = "0";
            String fechaDevolucion = "0";

            infoAux[1]= fechaAlquiler;
            infoAux[2] = fechaDevolucion;
            String infoN = infoAux[0] + "#" + infoAux[1] + "#" + infoAux[2] + "#" + infoAux[3];


            modificarArchivo(dvds, infoA, infoN);
            
            //Modificamos el archivo de peliculas
                        
            RRN = this.busquedaRRNTitulo(peliculaEscogida);

            fr = new FileReader(peliculas);
            br = new BufferedReader(fr);
            fw = new FileWriter(peliculas, true);
            bw = new BufferedWriter(fw);

            for (int j = 0; j < RRN; j++) {
                br.readLine();
            }

            infoA = br.readLine();
            infoAux = infoA.split("#");
            infoAux[5] = String.valueOf(dvd.getPelicula().getStock());
            infoN = infoAux[0] + "#" + infoAux[1] + "#" + infoAux[2] + "#" + infoAux[3] + "#" + infoAux[4] + "#" + infoAux[5];

            modificarArchivo(peliculas, infoA, infoN);
            
            //Actualizamos la tabla
            
            cargarIndexPeliculas(frame);
            
            //Modificamos el ID del DVD en el archivo del cliente
                        
            RRN = busquedaRRNCedula(cedula);

            fr = new FileReader(clientes);
            br = new BufferedReader(fr);
            fw = new FileWriter(clientes, true);
            bw = new BufferedWriter(fw);

            for (int j = 0; j < RRN; j++) {
                br.readLine();
            }
            infoA = br.readLine();
            infoAux = infoA.split("#");
            infoAux[3] = "0";
            infoN = infoAux[0] + "#" + infoAux[1] + "#" + infoAux[2] + "#" + infoAux[3];

            modificarArchivo(clientes, infoA, infoN);
            
            //Reiniciamos tabla cliente
                        
            cargarIndexCedula(frame);

            //Reiniciamos tabla principal
            this.buscarClienteEnArchivo(panel);

            return;
            
        } catch (Exception e) {
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
    
    public void buscarClienteC(PanelClientes panel){
        // Se verifica si se ingresó alguna cédula
        if(panel.textFieldCedulaC.getText().equals("Cédula")){
            JOptionPane.showMessageDialog(panel, "Ingrese la cédula del Cliente que desee buscar", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Se verifica si la cédula ingresada pertenece al de algun Cliente
        String cedulaBuscar = String.valueOf(panel.textFieldCedulaC.getText());
        for (int i = 0; i < panel.tableClientes.getRowCount(); i++) {
            if(String.valueOf(panel.tableClientes.getValueAt(i, 2)).contains(cedulaBuscar)){
                panel.tableClientes.changeSelection(i, 2, false, false);
                panel.textFieldCedulaC.setText("Cédula");
                return;
            }
        }
        
       JOptionPane.showMessageDialog(panel, "La Cédula que ingresó no pertenece a la de ningún Cliente", "Error", JOptionPane.ERROR_MESSAGE);
       panel.textFieldCedulaC.setText("Cédula"); 
        
    }
    
    public void buscarClienteEnArchivo(PanelPrincipal panel){
        DefaultTableModel modelo = (DefaultTableModel) panel.tablePeliculaCliente.getModel();
        
        modelo.setRowCount(0);
        
        String cedula = String.valueOf(panel.comboClientes.getSelectedItem());
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        if(!cedula.equals("Seleccione")){
            long cedulaN = Long.parseLong(cedula);
            Cliente cliente = busquedaCedula(cedulaN);
            if(cliente.getID() != 0){
                DVD dvd = busquedaID(cliente.getID());
                modelo.addRow(new Object[]{
                    cliente.getNombre(), cliente.getApellido(), cliente.getCedula(), cliente.getID(),sdf.format(dvd.getFechaAlquiler()), sdf.format(dvd.getFechaDevolucion())
                });
            }else{
                modelo.addRow(new Object[]{
                    cliente.getNombre(), cliente.getApellido(), cliente.getCedula(), "No Aplica","No Aplica", "No Aplica"
                });
            }
            
            
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
        if( !(busquedaCedula(cedula) == null) ){
            JOptionPane.showMessageDialog(panel, "La cedula que ingresó ya pertenece a la de un Cliente", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Pedimos el nombre
        String nombre = JOptionPane.showInputDialog("     Ingrese el nombre del cliente\n        (No más de 20 caracteres)");
        nombre = nombre.toUpperCase();
        nombre = nombre.trim();
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
        apellido = apellido.toUpperCase();
        apellido = apellido.trim();
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
            fw = new FileWriter(clientes, true);
            bw = new BufferedWriter(fw);
            fr = new FileReader(clientes);
            br = new BufferedReader(fr);
            long n = 0;
            if(!(br.read() == -1)){
                bw.newLine();
            }
            bw.write(cedula + "#" + nombre + "#" + apellido + "#" + n );
            //Agregamos y ordenamos el Cliente al IndexCedula
            while ( br.readLine() != null ) {n++;}
            Cliente cliente = new Cliente(n, cedula);
            this.indexCedula.add(cliente);
            //Ordenamos el index por cedula
            Collections.sort(indexCedula, new Comparator<Cliente>() {
                @Override public int compare(Cliente c1, Cliente c2) {
                    return (int) (c1.getCedula() - c2.getCedula());}});
            //----------------------------------------------------------------
            bw.close();
            fw.close();
            fr.close();
            br.close();
            
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
        long RRN = this.busquedaRRNCedula(Long.parseLong(cedula));
        
        try {
            fr = new FileReader(clientes);
            br = new BufferedReader(fr);
            fw = new FileWriter(clientes, true);
            bw = new BufferedWriter(fw);
            
            for (int i = 0; i < RRN; i++) {
                br.readLine();
            }
            String infoA = br.readLine();
            String[] infoAux = infoA.split("#");
            infoAux[0] = "-1";
            String infoN = infoAux[0] + "#" + infoAux[1] + "#" + infoAux[2] + "#" + infoAux[3];
            
            modificarArchivo(clientes, infoA, infoN);
            
            fr.close();
            br.close();
            bw.close();
            fw.close();
            
            int x=-1;
            for (int i = 0; i < indexCedula.size(); i++) {
                if(Long.parseLong(cedula) == indexCedula.get(i).getCedula()){
                    x = i;
                }
            }
            if(x != -1){
            indexCedula.remove(x);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    
    public void editarCliente(PanelClientes panel, FramePrincipal frame){
        DefaultTableModel modelo = (DefaultTableModel) panel.tableClientes.getModel();
        //Se valida si se seleccionó alguna fila
        if(panel.tableClientes.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(panel, "Seleccione el cliente que desea eliminar", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String modificar = String.valueOf(panel.comboEditarCliente.getSelectedItem());
        String cedula = String.valueOf(modelo.getValueAt(panel.tableClientes.getSelectedRow(), 2));
        long RRN = this.busquedaRRNCedula(Long.parseLong(cedula));
        
        if(modificar.equals("Seleccione")){
            JOptionPane.showMessageDialog(panel, "Seleccione que desea modificar", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(modificar.equals("Nombre")){
            String nombreViejo = String.valueOf( modelo.getValueAt(panel.tableClientes.getSelectedRow(), 0) );
            nombreViejo = nombreViejo.toUpperCase();
            nombreViejo = nombreViejo.trim();
            String nombreNuevo = (String)JOptionPane.showInputDialog(panel, "Escriba el nuevo nombre del cliente", "Modificación Nombre", JOptionPane.QUESTION_MESSAGE);
            nombreNuevo = nombreNuevo.toUpperCase();
            nombreNuevo = nombreNuevo.trim();
            if(nombreNuevo.length() > 20 || nombreNuevo.length() == 0){
                JOptionPane.showMessageDialog(panel, "Ingrese el nombre del cliente siguiendo las instrucciones", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            panel.tableClientes.setValueAt(nombreNuevo, panel.tableClientes.getSelectedRow(), 0);
            panel.tableClientes.clearSelection();
            panel.comboEditarCliente.setSelectedIndex(0);
            // Modificar el nombre del cliente en el archivo de texto

            try {
                fr = new FileReader(clientes);
                br = new BufferedReader(fr);
                fw = new FileWriter(clientes, true);
                bw = new BufferedWriter(fw);

                for (int i = 0; i < RRN; i++) {
                    br.readLine();
                }
                String infoA = br.readLine();
                String[] infoAux = infoA.split("#");
                infoAux[1] = nombreNuevo;
                String infoN = infoAux[0] + "#" + infoAux[1] + "#" + infoAux[2] + "#" + infoAux[3];

                modificarArchivo(clientes, infoA, infoN);

                fr.close();
                br.close();
                bw.close();
                fw.close();

                int x=-1;
                for (int i = 0; i < indexCedula.size(); i++) {
                    if(Long.parseLong(cedula) == indexCedula.get(i).getCedula()){
                        x = i;
                    }
                }
                if(x != -1){
                indexCedula.get(x).setNombre(nombreNuevo);
                }

            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else if(modificar.equals("Apellido")){
            String apellidoViejo = String.valueOf( modelo.getValueAt(panel.tableClientes.getSelectedRow(), 1) );
            apellidoViejo = apellidoViejo.toUpperCase();
            apellidoViejo = apellidoViejo.trim();
            String apellidoNuevo = (String)JOptionPane.showInputDialog(panel, "Escriba el nuevo apellido del cliente", "Modificación Apellido", JOptionPane.QUESTION_MESSAGE);
            apellidoNuevo = apellidoNuevo.toUpperCase();
            apellidoNuevo = apellidoNuevo.trim();
            if(apellidoNuevo.length() > 20 || apellidoNuevo.length() == 0){
                JOptionPane.showMessageDialog(panel, "Ingrese el nombre del cliente siguiendo las instrucciones", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            panel.tableClientes.setValueAt(apellidoNuevo, panel.tableClientes.getSelectedRow(), 1);
            panel.tableClientes.clearSelection();
            panel.comboEditarCliente.setSelectedIndex(0);
            // Modificar el apellido del cliente en el archivo de texto
            try {
                fr = new FileReader(clientes);
                br = new BufferedReader(fr);
                fw = new FileWriter(clientes, true);
                bw = new BufferedWriter(fw);

                for (int i = 0; i < RRN; i++) {
                    br.readLine();
                }
                String infoA = br.readLine();
                String[] infoAux = infoA.split("#");
                infoAux[2] = apellidoNuevo;
                String infoN = infoAux[0] + "#" + infoAux[1] + "#" + infoAux[2] + "#" + infoAux[3];

                modificarArchivo(clientes, infoA, infoN);

                fr.close();
                br.close();
                bw.close();
                fw.close();

                int x=-1;
                for (int i = 0; i < indexCedula.size(); i++) {
                    if(Long.parseLong(cedula) == indexCedula.get(i).getCedula()){
                        x = i;
                    }
                }
                if(x != -1){
                indexCedula.get(x).setApellido(apellidoNuevo);
                }

            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        frame.pPrincipal.comboClientes.setSelectedIndex(0);
    }
    
    public void agregarPelicula(PanelPeliculas panel, FramePrincipal frame){        
        //Pedimos el título
        String titulo = "";
        try {
            titulo = JOptionPane.showInputDialog("     Ingrese el título de la película\n        (No más de 30 caracteres)");
            titulo = titulo.toUpperCase();
            titulo = titulo.trim();
        } catch (Exception e) {
            return;
        }
        
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
        String genero = "";
        
        try {
            genero = (String)JOptionPane.showInputDialog(panel, "   Elija el género de la Película", "Selección Género", JOptionPane.QUESTION_MESSAGE, null, generos, generos[0]);
            genero = genero.toUpperCase();
            genero = genero.trim();
        } catch (Exception e) {
            return;
        }
        
        
        //Pedimos el Rating
        String[] ratings = {"1", "2", "3", "4", "5"};
        String rating = "";
        
        try {
            rating = String.valueOf(JOptionPane.showInputDialog(panel, "   Elija el rating de la Película", "Selección Rating", JOptionPane.QUESTION_MESSAGE, null, ratings, ratings[0]));
            if(rating.equals("null")){
                return;
            }
        } catch (Exception e) {
            return;
        }
        
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
        String descripcion = "";
        do{
            flag1 = false;
            try {
                descripcion = JOptionPane.showInputDialog("     Ingrese una breve descripcion de la película\n        (No más de 60 caracteres)");
                descripcion = descripcion.toUpperCase();
                descripcion = descripcion.trim();
                if(descripcion.length() > 60 || descripcion.length() == 0){
                    flag1 = true;
                    JOptionPane.showMessageDialog(panel, "Ingrese la descripcion de la película siguiendo las instrucciones", "Error", JOptionPane.ERROR_MESSAGE);
                }else if(descripcion.equals("")){
                    JOptionPane.showMessageDialog(panel, "Ingrese la descripcion de la película", "Error", JOptionPane.ERROR_MESSAGE);
                    flag1 = true;
                }
            } catch (Exception e) {
                System.out.println("ERROR");
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
        long lNumeroLineas = 0;
        try {
            fw = new FileWriter(peliculas, true);
            bw = new BufferedWriter(fw);
            fr = new FileReader(peliculas);
            br = new BufferedReader(fr);
            if(!(br.read() == -1)){
                bw.newLine();
            }
            bw.write(titulo + "#" + genero + "#" + rating + "#" + precio + "#" + descripcion + "#0" );
            
            while (br.readLine() != null) {
                lNumeroLineas++;
            }
            
            bw.close();
            fw.close();
            fr.close();
            br.close();
        } catch (Exception e) {
        }
        
        System.out.println("Lineas: " + lNumeroLineas + " y titulo: " + titulo);
        
        //La metemos en IndexTitulo
        indexTitulo.add(new Pelicula((int)lNumeroLineas, titulo));
        
        //Ordenamos el ArrayList
        Collections.sort(indexTitulo);
        
        indexGenero.add(new Pelicula(lNumeroLineas, genero));
        
        Collections.sort(indexGenero, comparatorGenero);
        indexRating.add(new Pelicula(lNumeroLineas, rating));
        Collections.sort(indexRating, new Comparator<Pelicula>() {
                @Override public int compare(Pelicula c1, Pelicula c2) {
                    return (int) (c1.getRating()- c2.getRating());}});
        return;
    }
    
    public void eliminarPelicula(PanelPeliculas panel, FramePrincipal frame){
        DefaultTableModel modelo = (DefaultTableModel) panel.tablePeliculas.getModel();
        //Se valida si se seleccionó alguna fila
        if(panel.tablePeliculas.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(panel, "Seleccione la película que desea eliminar", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String titulo = String.valueOf( modelo.getValueAt(panel.tablePeliculas.getSelectedRow(), 0) );
        titulo = titulo.toUpperCase();
        titulo = titulo.trim();
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
       
        
        //Se eliminan los dvds del archivo de texto
        
        DVD aux;
        
        long[] RRNs = new long[(busquedaTitulo(titulo)).getStock()];
        
        int j=0;
        
        for (int i = 0; i < indexID.size(); i++) {
            if((busquedaID(indexID.get(i).getID()).getPelicula().getTitulo().equals(titulo))){
                RRNs[j] = indexID.get(i).getRRN();
                j++;
            }
        }
        
        //Se eliminan todos los DVDs de esa película que estan en el arrayList
        
        for (int i = 0; i < indexID.size(); i++) {
            aux = busquedaID(indexID.get(i).getID());
            if(aux.getPelicula().getTitulo().equals(titulo)){
                indexID.remove(i);
                this.totales--;
                i--;
            }
        }
        
        for (int i = 0; i < RRNs.length; i++) {
            System.out.println(RRNs[i]);           
        }
        
        for (int i = 0; i < RRNs.length; i++) {
            
            try {
                fr = new FileReader(dvds);
                br = new BufferedReader(fr);
                fw = new FileWriter(dvds, true);
                bw = new BufferedWriter(fw);

                for (int r = 0; r < RRNs[i]; r++) {
                    br.readLine();
                }

                String infoA = br.readLine();
                String[] infoAux = infoA.split("#");
                infoAux[0] = "-1";
                String infoN = infoAux[0] + "#" + infoAux[1] + "#" + infoAux[2] + "#" + infoAux[3];

                modificarArchivo(dvds, infoA, infoN);
                
            } catch (Exception e) {
            }
            
        }
        
        //Se elimina la película de la tabla de películas
        modelo.removeRow(panel.tablePeliculas.getSelectedRow());
        
        //Se elimina la película del archivo de texto
        
        long RRN = this.busquedaRRNTitulo(titulo);
        
        try {
            fr = new FileReader(peliculas);
            br = new BufferedReader(fr);
            fw = new FileWriter(peliculas, true);
            bw = new BufferedWriter(fw);
            
            for (int i = 0; i < RRN; i++) {
                br.readLine();
            }
            
            String infoA = br.readLine();
            String[] infoAux = infoA.split("#");
            infoAux[0] = "-1";
            String infoN = infoAux[0] + "#" + infoAux[1] + "#" + infoAux[2] + "#" + infoAux[3] + "#" + infoAux[4] + "#" + infoAux[5];
            
            modificarArchivo(peliculas, infoA, infoN);
            
            fr.close();
            br.close();
            bw.close();
            fw.close();
            
            ((DefaultTableModel)panel.tablePeliculas.getModel()).setRowCount(0);
            
            indexGenero = new ArrayList<>();
            indexRating = new ArrayList<>();
            indexTitulo = new ArrayList<>();
            
            cargarIndexPeliculas(frame);
            
        } catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void editarPelicula(PanelPeliculas panel){
        DefaultTableModel modelo = (DefaultTableModel) panel.tablePeliculas.getModel();
        //Se valida si se seleccionó alguna fila
        if(panel.tablePeliculas.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(panel, "Seleccione la película que desee modificar", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        long RRN = busquedaRRNTitulo(String.valueOf( modelo.getValueAt(panel.tablePeliculas.getSelectedRow(), 0) ));
        
        String modificar = String.valueOf(panel.comboEditarPelicula.getSelectedItem());
        if(modificar.equals("Seleccione")){
            JOptionPane.showMessageDialog(panel, "Seleccione que desea modificar", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(modificar.equals("Título")){
            String nombreViejo = String.valueOf( modelo.getValueAt(panel.tablePeliculas.getSelectedRow(), 0) );
            nombreViejo = nombreViejo.toUpperCase();
            nombreViejo = nombreViejo.trim();
            String nombreNuevo = (String)JOptionPane.showInputDialog(panel, "Escriba el nuevo título de la película\n        (No más de 30 caracteres)", "Modificación Título", JOptionPane.QUESTION_MESSAGE);
            nombreNuevo = nombreNuevo.toUpperCase();
            nombreNuevo = nombreNuevo.trim();
            if(nombreNuevo.length() > 30 || nombreNuevo.length() == 0){
                JOptionPane.showMessageDialog(panel, "Ingrese el título de la película siguiendo las instrucciones", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            panel.tablePeliculas.setValueAt(nombreNuevo, panel.tablePeliculas.getSelectedRow(), 0);
            panel.tablePeliculas.clearSelection();
            panel.comboEditarPelicula.setSelectedIndex(0);
            // Modificar el título de la película en el archivo de texto
            
            try {
                fr = new FileReader(peliculas);
                br = new BufferedReader(fr);
                fw = new FileWriter(peliculas, true);
                bw = new BufferedWriter(fw);

                for (int i = 0; i < RRN; i++) {
                    br.readLine();
                }
                String infoA = br.readLine();
                String[] infoAux = infoA.split("#");
                infoAux[0] = nombreNuevo;
                String infoN = infoAux[0] + "#" + infoAux[1] + "#" + infoAux[2] + "#" + infoAux[3] + "#" + infoAux[4] + "#" + infoAux[5];

                modificarArchivo(peliculas, infoA, infoN);

                fr.close();
                br.close();
                bw.close();
                fw.close();

                int x=-1;
                for (int i = 0; i < indexTitulo.size(); i++) {
                    if(infoAux[0].equals(indexTitulo.get(i).getTitulo())){
                        x = i;
                    }
                }
                if(x != -1){
                indexTitulo.get(x).setTitulo(nombreNuevo);
                }

            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //Modificamos los DVDs en los archivos de texto
        
            DVD aux;

            int j=0;
            
            System.out.println(indexID.size() + " Tamaño del IndexID");
            
            for (int i = 0; i < indexID.size(); i++) {
                System.out.println("En la i numero: " + (i+1) + "/" + indexID.size() + " el titulo es: " + busquedaID(indexID.get(i).getID()).getPelicula().getTitulo());
                if((busquedaID(indexID.get(i).getID()).getPelicula().getTitulo().equals(nombreNuevo))){
                    System.out.println("gottiiitt");
                    j++;
                }
            }
            
            long[] RRNs = new long[j];
            
            j = 0;
            
            for (int i = 0; i < indexID.size(); i++) {
                if((busquedaID(indexID.get(i).getID()).getPelicula().getTitulo().equals(nombreNuevo))){
                    RRNs[j] = indexID.get(i).getRRN();
                    j++;
                }
            }
            
            System.out.println("Conseguimos los siguientes resultados");
            
            for (int i = 0; i < RRNs.length; i++) {
                System.out.println(RRNs[i]);           
            }

            for (int i = 0; i < RRNs.length; i++) {

                try {
                    fr = new FileReader(dvds);
                    br = new BufferedReader(fr);
                    fw = new FileWriter(dvds, true);
                    bw = new BufferedWriter(fw);

                    for (int r = 0; r < RRNs[i]; r++) {
                        br.readLine();
                    }

                    String infoA = br.readLine();
                    String[] infoAux = infoA.split("#");
                    infoAux[3] = nombreNuevo;
                    String infoN = infoAux[0] + "#" + infoAux[1] + "#" + infoAux[2] + "#" + infoAux[3];

                    modificarArchivo(dvds, infoA, infoN);

                } catch (Exception e) {
                }

            }
            
            
            
        }else if(modificar.equals("Género")){
            String[] generos = {"Acción", "Amor", "Suspenso", "Aventura", "Terror", "Comedia"};
            String generoViejo = String.valueOf( modelo.getValueAt(panel.tablePeliculas.getSelectedRow(), 1) );
            generoViejo = generoViejo.toUpperCase();
            generoViejo = generoViejo.trim();
            String generoNuevo = (String)JOptionPane.showInputDialog(panel, "   Elija el género de la Película", "Selección Género", JOptionPane.QUESTION_MESSAGE, null, generos, generos[0]);
            generoNuevo = generoNuevo.toUpperCase();
            generoNuevo = generoNuevo.trim();
            panel.tablePeliculas.setValueAt(generoNuevo, panel.tablePeliculas.getSelectedRow(), 1);
            panel.tablePeliculas.clearSelection();
            panel.comboEditarPelicula.setSelectedIndex(0);
            // Modificar el apellido del cliente en el archivo de texto
            
            try {
                fr = new FileReader(peliculas);
                br = new BufferedReader(fr);
                fw = new FileWriter(peliculas, true);
                bw = new BufferedWriter(fw);

                for (int i = 0; i < RRN; i++) {
                    br.readLine();
                }
                String infoA = br.readLine();
                String[] infoAux = infoA.split("#");
                infoAux[1] = generoNuevo;
                String infoN = infoAux[0] + "#" + infoAux[1] + "#" + infoAux[2] + "#" + infoAux[3] + "#" + infoAux[4] + "#" + infoAux[5];

                modificarArchivo(peliculas, infoA, infoN);

                fr.close();
                br.close();
                bw.close();
                fw.close();

                int x=-1;
                for (int i = 0; i < indexGenero.size(); i++) {
                    if(infoAux[1].equals(indexGenero.get(i).getGenero())){
                        x = i;
                    }
                }
                if(x != -1){
                indexGenero.get(x).setGenero(generoNuevo);
                }

            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
            
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
            try {
                fr = new FileReader(peliculas);
                br = new BufferedReader(fr);
                fw = new FileWriter(peliculas, true);
                bw = new BufferedWriter(fw);

                for (int i = 0; i < RRN; i++) {
                    br.readLine();
                }
                String infoA = br.readLine();
                String[] infoAux = infoA.split("#");
                infoAux[3] = precioNuevo;
                String infoN = infoAux[0] + "#" + infoAux[1] + "#" + infoAux[2] + "#" + infoAux[3] + "#" + infoAux[4] + "#" + infoAux[5];

                modificarArchivo(peliculas, infoA, infoN);

                fr.close();
                br.close();
                bw.close();
                fw.close();

            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else if(modificar.equals("Rating")){
            String[] ratings = {"1", "2", "3", "4", "5"};
            String ratingNuevo = (String)JOptionPane.showInputDialog(panel, "   Elija el rating de la Película", "Selección Rating", JOptionPane.QUESTION_MESSAGE, null, ratings, ratings[0]);
            String ratingViejo = String.valueOf( modelo.getValueAt(panel.tablePeliculas.getSelectedRow(), 2) );
            
            panel.tablePeliculas.setValueAt(ratingNuevo, panel.tablePeliculas.getSelectedRow(), 2);
            panel.tablePeliculas.clearSelection();
            panel.comboEditarPelicula.setSelectedIndex(0);
            // Modificar el apellido del cliente en el archivo de texto
            
            try {
                fr = new FileReader(peliculas);
                br = new BufferedReader(fr);
                fw = new FileWriter(peliculas, true);
                bw = new BufferedWriter(fw);

                for (int i = 0; i < RRN; i++) {
                    br.readLine();
                }
                String infoA = br.readLine();
                String[] infoAux = infoA.split("#");
                infoAux[1] = ratingNuevo;
                String infoN = infoAux[0] + "#" + infoAux[1] + "#" + infoAux[2] + "#" + infoAux[3] + "#" + infoAux[4] + "#" + infoAux[5];

                modificarArchivo(peliculas, infoA, infoN);

                fr.close();
                br.close();
                bw.close();
                fw.close();

                int x=-1;
                for (int i = 0; i < indexRating.size(); i++) {
                    if(Integer.parseInt(infoAux[2]) == indexRating.get(i).getRating()){
                        x = i;
                    }
                }
                if(x != -1){
                indexRating.get(x).setRating(Integer.parseInt(ratingNuevo));
                }

            } catch (IOException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
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
        tituloBuscar = tituloBuscar.toUpperCase();
        tituloBuscar = tituloBuscar.trim();
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
        tituloPelicula = tituloPelicula.toUpperCase();
        tituloPelicula = tituloPelicula.trim();
        int cant = panel.sliderStock.getValue();
        
        //Modificamos la tabla con el nuevo Stock
        int stock = Integer.parseInt(String.valueOf(panel.tablePeliculas.getValueAt(panel.tablePeliculas.getSelectedRow(), 4)));
        int nuevoStock = stock + cant;
        panel.tablePeliculas.setValueAt(nuevoStock, panel.tablePeliculas.getSelectedRow(), 4);
        
        
        //Modificamos el archivo de texto de Peliculas con el nuevo stock
        
        long RRN = this.busquedaRRNTitulo(tituloPelicula);
        
        try {
            fr = new FileReader(peliculas);
            br = new BufferedReader(fr);
            fw = new FileWriter(peliculas, true);
            bw = new BufferedWriter(fw);
            
            for (int i = 0; i < RRN; i++) {
                br.readLine();
            }
            String infoA = br.readLine();
            String[] infoAux = infoA.split("#");
            infoAux[5] = String.valueOf(nuevoStock);
            String infoN = infoAux[0] + "#" + infoAux[1] + "#" + infoAux[2] + "#" + infoAux[3] + "#" + infoAux[4] + "#" + infoAux[5];
            
            modificarArchivo(peliculas, infoA, infoN);
            
            fr.close();
            br.close();
            bw.close();
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        panel.tablePeliculas.clearSelection();
        panel.sliderStock.setValue(0);
        
        //Agregar al archivo de texto DVDs los nuevos DVDs
        for (int i = 0; i < cant; i++) {
            try {
                fw = new FileWriter(dvds, true);
                bw = new BufferedWriter(fw);
                fr = new FileReader(dvds);
                br = new BufferedReader(fr);
                if(!(br.read() == -1)){
                    bw.newLine();
                }
                DVD dvdAux = new DVD( this.busquedaTitulo(tituloPelicula) );
                bw.write(dvdAux.getID() + "#" + "0" + "#" + "0" + "#" + tituloPelicula);
                this.totales++;
                bw.close();
                fw.close();
                fr.close();
                br.close();
                
                indexID.add(new DVD((Long)this.totales, this.totales));
                
            } catch (Exception e) {
            }
        }
        
        //Una vez listo el nuevo ArrayList de stock, lo ordenamos
        Collections.sort(indexID, new Comparator<DVD>() {
                @Override public int compare(DVD c1, DVD c2) {
                    return (int) (c1.getID()- c2.getID());}});
    }
    
    public void verDescripcion(PanelPeliculas panel){
        //Se valida si se seleccionó alguna fila
        if(panel.tablePeliculas.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(panel, "Seleccione la película a la que le desea ver la descripción", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String titulo = String.valueOf(panel.tablePeliculas.getValueAt(panel.tablePeliculas.getSelectedRow(), 0));
        titulo = titulo.toUpperCase();
        titulo = titulo.trim();
        //Buscar cual es la película que se desea ver la descripcion en el archivo de texto y mostrarla en un JOption
        JOptionPane.showMessageDialog(panel, busquedaTitulo(titulo).getDescripcion(), "Descripción", JOptionPane.INFORMATION_MESSAGE);
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
    
    public void mostrarGenero(PanelPeliculas panel, FramePrincipal frame){
        if( String.valueOf(panel.comboBuscarGenero.getSelectedItem()).equals("Seleccione") ){
            ((DefaultTableModel)panel.tablePeliculas.getModel()).setRowCount(0);
            this.cargarIndexPeliculas(frame);
            return;
        }
        
        ArrayList<String> filas = new ArrayList<>();
        String linea = "";
        for (int i = 0; i < panel.tablePeliculas.getRowCount(); i++) {
            if(String.valueOf(panel.tablePeliculas.getValueAt(i, 1)).equals( String.valueOf(panel.comboBuscarGenero.getSelectedItem()).toUpperCase() )){
                linea = String.valueOf(panel.tablePeliculas.getValueAt(i, 0)) + "#" + String.valueOf(panel.tablePeliculas.getValueAt(i, 1)) + "#" + 
                        String.valueOf(panel.tablePeliculas.getValueAt(i, 2)) + "#" + String.valueOf(panel.tablePeliculas.getValueAt(i, 3)) + "#" +
                        String.valueOf(panel.tablePeliculas.getValueAt(i, 4));
                filas.add(linea);
            }
        }
        if(filas == null){
           return; 
        }
        
        ((DefaultTableModel)panel.tablePeliculas.getModel()).setRowCount(0);
        
        String[] l;
        for (int i = 0; i < filas.size(); i++) {
            l = filas.get(i).split("#");
            ((DefaultTableModel)panel.tablePeliculas.getModel()).addRow(new Object[]{
                            l[0], l[1], l[2], l[3], l[4]});
            
        }
        
    }
    
    public void mostrarRating(PanelPeliculas panel, FramePrincipal frame){
        if( String.valueOf(panel.comboBuscarRating.getSelectedItem()).equals("Seleccione") ){
            ((DefaultTableModel)panel.tablePeliculas.getModel()).setRowCount(0);
            this.cargarIndexPeliculas(frame);
            return;
        }
        
        ArrayList<String> filas = new ArrayList<>();
        String linea = "";
        for (int i = 0; i < panel.tablePeliculas.getRowCount(); i++) {
            if(String.valueOf(panel.tablePeliculas.getValueAt(i, 2)).equals( String.valueOf(panel.comboBuscarRating.getSelectedItem()) )){
                linea = String.valueOf(panel.tablePeliculas.getValueAt(i, 0)) + "#" + String.valueOf(panel.tablePeliculas.getValueAt(i, 1)) + "#" + 
                        String.valueOf(panel.tablePeliculas.getValueAt(i, 2)) + "#" + String.valueOf(panel.tablePeliculas.getValueAt(i, 3)) + "#" +
                        String.valueOf(panel.tablePeliculas.getValueAt(i, 4));
                filas.add(linea);
            }
        }
        if(filas == null){
           return; 
        }
        
        ((DefaultTableModel)panel.tablePeliculas.getModel()).setRowCount(0);
        
        String[] l;
        for (int i = 0; i < filas.size(); i++) {
            l = filas.get(i).split("#");
            ((DefaultTableModel)panel.tablePeliculas.getModel()).addRow(new Object[]{
                            l[0], l[1], l[2], l[3], l[4]});
            
        }
        
    }
    
    
    
    public void modificarArchivo(File FficheroAntiguo,String Satigualinea,String Snuevalinea){        
        /*Obtengo un numero aleatorio*/
        Random numaleatorio= new Random(3816L); 
        /*Creo un nombre para el nuevo fichero apartir del
         *numero aleatorio*/
        String SnombFichNuev=FficheroAntiguo.getParent()+"/auxiliar"+String.valueOf(Math.abs(numaleatorio.nextInt()))+".txt";
        /*Crea un objeto File para el fichero nuevo*/
        File FficheroNuevo=new File(SnombFichNuev);
        try {
            /*Si existe el fichero inical*/
            if(FficheroAntiguo.exists()){
                /*Abro un flujo de lectura*/
                BufferedReader Fleo= new BufferedReader(new FileReader(FficheroAntiguo));
                String Slinea;
                /*Recorro el fichero de texto linea a linea*/
                int cantLineas = 0;
                int lineaActual = 0;
                while((Slinea=Fleo.readLine())!=null) {
                    cantLineas++;
                }
                
                Fleo.close();
                BufferedReader Flee= new BufferedReader(new FileReader(FficheroAntiguo));
                
                while((Slinea=Flee.readLine())!=null) { 
                    lineaActual++;
                    /*Si la lia obtenida es igual al la bucada
                     *para modificar*/
                    if (Slinea.toUpperCase().trim().equals(Satigualinea.toUpperCase().trim())) {
                       /*Escribo la nueva linea en vez de la que tenia*/
                       if(lineaActual == cantLineas){
                        escribirArchivo(FficheroNuevo,Snuevalinea, true);
                       }else{
                           escribirArchivo(FficheroNuevo,Snuevalinea, false);
                       }
                    }else{
                        /*Escribo la linea antigua*/
                         if(lineaActual == cantLineas){
                        escribirArchivo(FficheroNuevo,Slinea, true);
                       }else{
                           escribirArchivo(FficheroNuevo,Slinea, false);
                       }
                    }   
                    
                }
                /*Obtengo el nombre del fichero inicial*/
                String SnomAntiguo=FficheroAntiguo.getName();
                /*Cierro el flujo de lectura*/
                Flee.close();
                bw.close();
                fw.close();
                br.close();
                fr.close();
                /*Borro el fichero inicial*/
                borrarArchivo(FficheroAntiguo);
                /*renombro el nuevo fichero con el nombre del 
                *fichero inicial*/
                FficheroNuevo.renameTo(FficheroAntiguo);
                
            }else{
                System.out.println("Fichero No Existe");
            }
        } catch (Exception ex) {
            /*Captura un posible error y le imprime en pantalla*/ 
             System.out.println(ex.getMessage());
        }
    }
    
    public void escribirArchivo(File Ffichero,String SCadena, boolean ult){
      try {
              //Si no Existe el fichero lo crea
               if(!Ffichero.exists()){
                   Ffichero.createNewFile();
               }
              /*Abre un Flujo de escritura,sobre el fichero con codificacion utf-8. 
               *Además  en el pedazo de sentencia "FileOutputStream(Ffichero,true)",
               *true es por si existe el fichero seguir añadiendo texto y no borrar lo que tenia*/
              BufferedWriter Fescribe=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Ffichero,true), "utf-8"));
              /*Escribe en el fichero la cadena que recibe la función. 
               *el string "\r\n" significa salto de linea*/
              if(!ult){
                Fescribe.write(SCadena + "\r\n"); 
              }else{
                  Fescribe.write(SCadena);
              }  
              
              //Cierra el flujo de escritura
              Fescribe.close();
           } catch (Exception ex) {
              //Captura un posible error le imprime en pantalla 
              System.out.println(ex.getMessage());
           } 
    }
    
    
    public void borrarArchivo(File Ffichero){
         
        try {
             /*Si existe el fichero*/
             if(Ffichero.exists()){
               /*Borra el fichero*/
               Ffichero.delete(); 
               //System.out.println("Fichero Borrado con Exito");
             }
         } catch (Exception ex) {
             /*Captura un posible error y le imprime en pantalla*/ 
              System.out.println(ex.getMessage());
         }
        
        
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
    
    public Cliente busquedaCedula(long cedula){
        long RRN = busquedaRRNCedula(cedula);
        Cliente cliente = null;
        
        if(RRN == -1){return cliente;}
        
        try {
            fr = new FileReader(clientes);
            br = new BufferedReader(fr);
            
            for (int i = 0; i < RRN; i++) {
                br.readLine();
            }
            String[] info = br.readLine().split("#");
            cliente = new Cliente(Long.parseLong(info[0]), info[1], info[2], Long.parseLong(info[3]), RRN);
            
            fr.close();
            br.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cliente;
    }
    public long busquedaRRNCedula(long cedula){
        int low = 0;
        int high = indexCedula.size()-1;
        int mid = -1;
        long cur = 0;
        boolean targetFound = false;

        while(high >= low){         
            mid = (high + low)/2;
            
            cur = indexCedula.get(mid).getCedula();

            if(cedula < cur){
                high = mid - 1;
            }
            else if(cedula == cur){
                targetFound = true;
                break;
            }
            else{
                low = mid + 1;
            }
        }
        
        if(targetFound == true){
            return indexCedula.get(mid).getRRN(); 
        }
        else{
            return -1;
        }
    }
    
    
    
    
    
    public Pelicula busquedaTitulo(String titulo){
        long RRN = busquedaRRNTitulo(titulo);
        
        Pelicula pelicula = null;
        
        if(RRN == -1){return pelicula;}
        
        try {
            fr = new FileReader(peliculas);
            br = new BufferedReader(fr);
            
            for (int i = 0; i < RRN; i++) {
                br.readLine();
            }
            String[] info = br.readLine().split("#");
            pelicula = new Pelicula(info[0], info[1], info[4], Integer.parseInt(info[3]), Integer.parseInt(info[2]), Integer.parseInt(info[5]), RRN);
            
            fr.close();
            br.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return pelicula;
        
    }
    public long busquedaRRNTitulo(String titulo){
        int low = 0;
        int high = indexTitulo.size()-1;
        int mid = -1;
        String cur = "";
        boolean targetFound = false;

        while(high >= low){         
            mid = (high + low)/2;
            
            cur = indexTitulo.get(mid).getTitulo();

            if(titulo.compareTo(cur) < 0){
                high = mid - 1;
            }
            else if(titulo.equals(cur)){
                targetFound = true;
                break;
            }
            else{
                low = mid + 1;
            }
        }
        
        if(targetFound == true){
            return indexTitulo.get(mid).getRRN(); 
        }
        else{
            return -1;
        }
    }
    
    
    
    
    
    public Pelicula[] busquedaGenero(String genero){
        long RRN = busquedaRRNGenero(genero);
        
        Pelicula[] pelicula = null;
        
        if(RRN == -1){return pelicula;}
        
        try {
            fr = new FileReader(peliculas);
            br = new BufferedReader(fr);
            
            for (int i = 0; i < RRN; i++) {
                br.readLine();
            }
            String[] info = br.readLine().split("#");
            
            fr.close();
            br.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return pelicula;
    }
    public long busquedaRRNGenero(String genero){
        int low = 0;
        int high = indexGenero.size()-1;
        int mid = -1;
        String cur = "";
        boolean targetFound = false;

        while(high >= low){         
            mid = (high + low)/2;
            
            cur = indexGenero.get(mid).getTitulo();

            if(genero.compareTo(cur) < 0){
                high = mid - 1;
            }
            else if(genero.equals(cur)){
                targetFound = true;
                break;
            }
            else{
                low = mid + 1;
            }
        }
        
        if(targetFound == true){
            return indexGenero.get(mid).getRRN(); 
        }
        else{
            return -1;
        }
    }
    
    
    
    
    public Pelicula[] busquedaRating(String genero){
        long RRN = busquedaRRNGenero(genero);
        
        Pelicula[] pelicula = null;
        
        if(RRN == -1){return pelicula;}
        
        try {
            fr = new FileReader(peliculas);
            br = new BufferedReader(fr);
            
            for (int i = 0; i < RRN; i++) {
                br.readLine();
            }
            String[] info = br.readLine().split("#");
            
            fr.close();
            br.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return pelicula;
    }
    public long busquedaRRNRating(String rating){
        int low = 0;
        int high = indexRating.size()-1;
        int mid = -1;
        String cur = "";
        boolean targetFound = false;

        while(high >= low){         
            mid = (high + low)/2;
            
            cur = indexRating.get(mid).getTitulo();

            if(rating.compareTo(cur) < 0){
                high = mid - 1;
            }
            else if(rating.equals(cur)){
                targetFound = true;
                break;
            }
            else{
                low = mid + 1;
            }
        }
        
        if(targetFound == true){
            return indexGenero.get(mid).getRRN(); 
        }
        else{
            return -1;
        }
    }
    
    
    
    
    public DVD busquedaID(long ID){
        long RRN = busquedaRRNID(ID);
        
        DVD dvd = null;
        
        if(RRN == -1){return dvd;}
        
        try {
            //Se declaran nuevos, para que no interrumpan en otros métodos
            fr = new FileReader(dvds);
            br = new BufferedReader(fr);
            
            for (int i = 0; i < RRN; i++) {
                br.readLine();
            }
            String[] info = br.readLine().split("#");
            
            String fechaA = info[1];
            String fechaD = info[2];
            Date fechaAlquiler = null;
            Date fechaDevolucion = null;
            
            SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
            try {
                fechaAlquiler = formatoDelTexto.parse(fechaA);
                fechaDevolucion = formatoDelTexto.parse(fechaD);
            } catch (Exception e) {
                
            }
            
            fr.close();
            br.close();
            
            dvd = new DVD(Long.parseLong(info[0]), fechaAlquiler, fechaDevolucion, busquedaTitulo(info[3]), RRN);
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return dvd;
        
    }
    
    public long busquedaRRNID(long ID){
        int low = 0;
        int high = indexID.size()-1;
        int mid = -1;
        long cur = 0;
        boolean targetFound = false;

        while(high >= low){         
            mid = (high + low)/2;
            
            cur = indexID.get(mid).getID();

            if(ID < cur){
                high = mid - 1;
            }
            else if(ID == cur){
                targetFound = true;
                break;
            }
            else{
                low = mid + 1;
            }
        }
        
        if(targetFound == true){
            return indexID.get(mid).getRRN(); 
        }
        else{
            return -1;
        }

    }
    
    
    public void cargarIndexCedula(FramePrincipal frame){
        
        //Reiniciamos la tabla por si se llama después de abierto
        DefaultTableModel modelo = (DefaultTableModel) frame.pClientes.tableClientes.getModel();
        modelo.setRowCount(0);
        
        long cedula = 0;
        long RRN = 0;
        String linea = "";
        
        try {
            //Abrimos readers auxiliares, porque estarán abiertos dentro de un while
            FileReader fr1 = new FileReader(clientes);
            BufferedReader br1 = new BufferedReader(fr1);
                               
            while ( (linea = br1.readLine()) != null ) {  
                String info[] = linea.split("#");
                
                if(!info[0].equals("-1")){
                    //Cargamos la tabla
                    String titulo = "No Aplica";
                    
                    if(!(info[3].equals("0")) && flag){
                        titulo = busquedaID(Long.parseLong(info[3])).getPelicula().getTitulo();
                    }
                    modelo.addRow(new Object[]{
                            info[1], info[2], info[0], info[3], titulo});
                    
                    cedula = Long.parseLong(info[0]);
                    if(!flag){
                        frame.pPrincipal.comboClientes.addItem(String.valueOf(cedula));
                    }
                    Cliente cliente = new Cliente(RRN, cedula);
                    indexCedula.add(cliente);
                }   
                RRN++;
            }
            
            flag = true;
            
            fr1.close();
            br1.close();
            
            //Ordenamos el indice de cedulas
            Collections.sort(indexCedula, new Comparator<Cliente>() {
                @Override public int compare(Cliente c1, Cliente c2) {
                    return (int) (c1.getCedula() - c2.getCedula());}});
            
            
        } catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cargarIndexPeliculas(FramePrincipal frame){
        
        //Reiniciamos la tabla, en caso de volver a ser llamada la funcion
        ((DefaultTableModel)frame.pPeliculas.tablePeliculas.getModel()).setRowCount(0);
        
        String genero = "";
        String titulo = "";
        long RRN = 0;
        String linea = "";
        
        try {
            //Abrimos readers auxiliares, porque estarán abiertos dentro de un while
            FileReader fr1 = new FileReader(peliculas);
            BufferedReader br1 = new BufferedReader(fr1);
            
            while ( (linea = br1.readLine()) != null ) {   
                String info[] = linea.split("#");  
                if(!info[0].equals("-1")){
                    titulo = info[0];
                    genero = info[1];
                    
                    DefaultTableModel modelo = (DefaultTableModel) frame.pPeliculas.tablePeliculas.getModel();
                    modelo.addRow(new Object[]{
                            info[0], info[1], info[2], info[3] + " $", info[5]});
                    
                    Pelicula pelGenero = new Pelicula(RRN, genero);
                    Pelicula pelTitulo = new Pelicula((int)RRN, titulo);
                    indexGenero.add(pelGenero);
                    indexTitulo.add(pelTitulo);
                }   
                RRN++;
            }
            
            //Cerramos los readers
            fr1.close();
            br1.close();
            
            //Ordenamos el indice de generos
            Collections.sort(indexGenero, comparatorGenero);
            
            //Ordenamos el indice de titulos
            Collections.sort(indexTitulo);
            
            
        } catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void cargarIndexID(FramePrincipal frame){
        long ID = 0;
        long RRN = 0;
        String linea = "";
        
        try {
            
            fr = new FileReader(dvds);
            br = new BufferedReader(fr);
            
            while ( (linea = br.readLine()) != null ) {         
                String info[] = linea.split("#");  
                if(!info[0].equals("-1")){
                   
                    ID = Long.parseLong(info[0]);
                    DVD dvd = new DVD(RRN, ID);
                    indexID.add(dvd);
                }   
                
                RRN++;
                this.totales = indexID.size();
            }
            
            //Ordenamos el indice de IDs
            Collections.sort(indexID, new Comparator<DVD>() {
                @Override public int compare(DVD c1, DVD c2) {
                    return (int) (c1.getID()- c2.getID());}});
            
            fr.close();
            br.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    Comparator<Pelicula> comparatorGenero = new Comparator<Pelicula>() {
        public int compare( Pelicula a, Pelicula b ) {
            int resultado = a.getGenero().compareTo(b.getGenero());
            return resultado;}};
   
        
}

