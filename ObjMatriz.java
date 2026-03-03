public class ObjMatriz {
    private String Nombre;
    private int Codigo;
    private double Precio;

    public ObjMatriz(String nombre, int codigo, double precio) {
        Nombre = nombre;
        Codigo = codigo;
        Precio = precio;
    }
    

    public ObjMatriz() {
    }


    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int codigo) {
        Codigo = codigo;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double precio) {
        Precio = precio;
    }

    
}
