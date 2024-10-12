package com.upiiz.categorias.services;

import com.upiiz.categorias.models.Categoria;
import com.upiiz.categorias.repository.CategoriasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// Se crea una instancia de esta clase

@Service
public class CategoriasService {
    // Requerimos el REPO (Datos - Listado) - Categorías
    // Requiero "INYECTAR" el servicio

    CategoriasRepository categoriasRepository;

    // Constructor - Cuando crea la instancia le pasa el repositorio
    public CategoriasService(CategoriasRepository categoriasRepository) {
        this.categoriasRepository = categoriasRepository;
    }

    // GET - Todas
    public List<Categoria> getAllCategorias() {
        return categoriasRepository.obtenerTodas();
    }

    // GET - Categoría por ID
    public Categoria getCategoriaById(Long id) {
        return categoriasRepository.obtenerPorId(id);
    }

    // POST - Crea categorias
    public Categoria createCategoria(Categoria categoria) {
        return categoriasRepository.guardar(categoria);
    }

    // PUT - Actuaizar categoria
    public Categoria updateCategoria(Categoria categoria) {
        return categoriasRepository.actualizar(categoria);
    }

    // DELETE - Eliminar categoria
    public void deleteCategoria(Long id) {
        categoriasRepository.eliminar(id);
    }

}
