package com.agilethought.kalahari.utils;

public class Textos {

    public static final String DATOS_ERRONEOS = "Los datos ingresados no son correctos, verificar porfavor";
    public static class Repositorios{
        public static final String ID_INCORRECTO = "El id no es valido";
        public static final String YA_EXISTE = "Ya existe un elemento con el id proporcionado";
        public static final String NO_EXISTE = "No existe un elemento con el id proporcionado";
        public static class Agregar{
            public static final String ERROR = "Error inesperado al agregar";
            public static final String EXITO = "Fue agregado correctamente";
        }
        public static class Actualizar{
            public static final String ERROR = "Error inesperado al actualizar";
            public static final String EXITO = "Fue actualizado correctamente";
        }
        public static class Eliminar{
            public static final String ERROR = "Error inesperado al borrar";
            public static final String EXITO = "Fue borrado correctamente";
            public static final String NO_EXITO = "No pudo ser borrado";
        }
    }
}
