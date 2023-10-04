Import java.util.LinkedList;
import java.util.Scanner;

public class Biblioteca {
    private LinkedList<Libro> librosDisponibles = new LinkedList<>();

    public void registrarLibro(Libro libro) {
librosDisponibles.add(libro);
    }
    public Libro buscarLibro(String titulo) {
        Scanner en= new Scanner(System.in);

        Libro[] aux= b.buscar(titulo);
        if (aux != null){
            for (Libro aux1 : aux) {
                System.out.println(aux1.ToString());
            }
        }
        else
        {
            System.out.println("No esxisten libros con ese titulo");
        }
