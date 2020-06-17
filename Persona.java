
package colaprac;


public class Persona {
    private String codigo, nombre;
    private int horas, tarifa;
    private double sueldo;

    public void Persona() {

    }

    public void CAlumno(String cod, String nom, int hor, int tarii) {
        this.codigo = cod;
        this.nombre = nom;
        this.horas = hor; 
        this.tarifa = tarii;
        

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHora() {
        return horas;
    }

    public void setHora(int hor) {
        this.horas = hor;
    }
    
    public int getTarifa(){
        return tarifa;
    }
    
    public void setTarifa(int tari){
        this.tarifa = tari;
    }
    
    public double HallarTarifa(){
        return tarifa;
    }


    public double HallarSueldo() {
        double sueldo;
        sueldo = (horas * tarifa);
        return sueldo;
    }

    public void mostrarSueldo() {
        System.out.println("Sueldo:  " + HallarSueldo());
    }

    public String Mostrar() {
        return ("\nCodigo = " + codigo
                + "\nNombre = " + nombre
                + "\nHoras trabajadas = " + horas
                + "\nTarifa = " + tarifa
                + "\nSueldo = " + HallarSueldo());

    }
}

