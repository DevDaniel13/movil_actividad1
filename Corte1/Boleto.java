/*
    Descripción: Codigo padre del diagrama UML de Boleto
    Fecha: 09/Mayo/2022
    Nombre: Pimentel Mendoza Marco Daniel
 */
package Corte1;

import java.util.Scanner;

public class Boleto {
    
    private int id;
    private String nombre;
    private int edad;
    private String destino;
    private int viaje;
    private double precio;
    private String fecha;
    
    public Boleto(){
        this.id = 0;
        this.nombre = "";
        this.edad = 0;
        this.destino = "";
        this.viaje = 0;
        this.precio = 0;
        this.fecha = "";
    }
    
    public Boleto(int id, String nombre, int edad, String destino, int viaje, double precio, String fecha){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.destino = destino;
        this.viaje = viaje;
        this.precio = precio;
        this.fecha = fecha;
    }
    
    public Boleto(Boleto Boleto){
        this.id = Boleto.id;
        this.nombre = Boleto.nombre;
        this.edad = Boleto.edad;
        this.destino = Boleto.destino;
        this.viaje = Boleto.viaje;
        this.precio = Boleto.precio;
        this.fecha = Boleto.fecha;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public int getViaje() {
        return viaje;
    }
    public void setViaje(int viaje) {
        this.viaje = viaje;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public void capturarDatos(){
        System.out.println("Captura los siguientes datos:");
        Scanner buffer = new Scanner(System.in);
        System.out.println("\nNo. de Boleto: ");
        this.id = buffer.nextInt();buffer.nextLine();
        System.out.println("\nNombre: ");
        this.nombre = buffer.nextLine();
        System.out.println("\nEdad: ");
        this.edad = buffer.nextInt();buffer.nextLine();
        System.out.println("\nDestino: ");
        this.destino = buffer.nextLine();
        System.out.println("\nTipo de viaje(numero): ");
        this.viaje = buffer.nextInt();
        System.out.println("\nPrecio: ");
        this.precio = buffer.nextDouble();buffer.nextLine();
        System.out.println("\nFecha: ");
        this.fecha = buffer.nextLine();
    }
    public double calcularSubtotal(){
        if(this.getViaje() == 2){
            double subtotal = this.getPrecio()+((this.getPrecio()*0.8));
            return subtotal;
        }else{
            double subtotal = this.getPrecio();
            return subtotal;
        }
    }
    public double calcularImpuesto(){
        double impuesto = this.getPrecio()*0.16;
        return impuesto;
    }
    public double calcularDescuento(){
        if(this.getEdad() >= 60){
            double descuento = this.getPrecio()*0.5;
            return descuento;
        }else{
            double descuento = 0;
            return descuento;
        }
    }
    public double calcularTotal(double subtotal, double impuesto, double descuento){
        double total = (subtotal + impuesto) - descuento;
        return total;
    }
    public void Imprimir(double subtotal, double impuesto, double descuento, double total){
        System.out.println("DATOS DEL BOLETO");
        System.out.println("\nNo. Boleto: "+this.getId());
        System.out.println("\nNombre Cliente: "+this.getNombre());
        System.out.println("\nDestino: "+this.getDestino());
        if(this.getViaje() == 1){
            System.out.println("\nTipo Viaje: "+this.getViaje()+" : Sencillo");
        }
        else{
            System.out.println("\nTipo Viaje: "+this.getViaje()+" : Doble");
        }
        System.out.println("\nPrecio: "+this.getPrecio());
        System.out.println("\nIMPORTE");
        System.out.println("\nSubtotal: "+subtotal);
        System.out.println("\nImpuesto 16% (+): "+impuesto);
        System.out.println("\nDescuento (-): "+descuento);
        System.out.println("\nTotal a pagar: "+total);
    }
    
    
    
}
