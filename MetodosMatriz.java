import java.util.Scanner;

public class MetodosMatriz {
    Scanner sc = new Scanner(System.in);

    public ObjMatriz[][] LlenarMatriz(ObjMatriz[][] m)
    {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ObjMatriz o = new ObjMatriz();
                System.out.println("ingrese el nombre del producto: ");
                o.setNombre(sc.next());
                System.out.println("Ingrese el codigo del producto:");
                o.setCodigo(sc.nextInt());
                System.out.println("Ingrese el precio del producto: ");
                o.setPrecio(sc.nextDouble());
                



                m[i][j] = o;
            }
        }
        return m;
    }

    public void MostrarMatriz(ObjMatriz[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j]!=null) {
                    
                  System.out.println("Nombre: " + m[i][j].getNombre());
                  System.out.println("Codigo: " + m[i][j].getCodigo());
                  System.out.println("Precio: " + m[i][j].getPrecio());
                  System.out.println("-----------------------------------------");
                }  
            }
        }
    }

    
}
