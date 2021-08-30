package com.agilethought.kalahari.services;

import java.util.ArrayList;

public interface GenericoService<U, V, W> {
    ArrayList <U>obtnerTodo() throws Exception;
    V agregar(U object) throws Exception;
    V eliminar(W id) throws Exception;
    V actualizar(U object) throws Exception;
}
