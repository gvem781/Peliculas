package com.metaphorce.vista;
import com.metaphorce.modelo.GestorPelicula;
import com.metaphorce.modelo.Pelicula;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de películas
        Pelicula pelicula1 = new Pelicula(1, "Pelicula 1", true);
        Pelicula pelicula2 = new Pelicula(2, "Pelicula 2", false);
        Pelicula pelicula3 = new Pelicula(3, "Pelicula 3", true);

        // Crear un gestor de películas
        GestorPelicula gestorPelicula = new GestorPelicula();

        // Agregar las películas al gestor
        gestorPelicula.agregarPelicula(pelicula1);
        gestorPelicula.agregarPelicula(pelicula2);
        gestorPelicula.agregarPelicula(pelicula3);

        // Eliminar una película
        gestorPelicula.eliminarPelicula(2);

        // Marcar una película como activa
        gestorPelicula.marcarPeliculaComoDisponible(1);

        // Mostrar la lista de películas no disponibles
        List<Pelicula> peliculasNoDisponibles = gestorPelicula.obtenerPeliculasNoDisponibles();
        System.out.println("Películas no disponibles:");
        for (Pelicula pelicula : peliculasNoDisponibles) {
            System.out.println(pelicula.getNombre());
        }
    }
}
