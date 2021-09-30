package com.agilethought.kalahari.repositories;

import com.agilethought.kalahari.models.T000UsuariosEntity;
import com.agilethought.kalahari.models.T013UsuariosRH;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.text.SimpleDateFormat;

public interface UsuarioRHRepository extends CrudRepository <T013UsuariosRH, String>{
    @Query(nativeQuery = true,
            value = "SELECT * FROM T013_USUARIOS_RH WHERE email = :email")
    T013UsuariosRH getUsuarioByEmail( @Param("email") String email);

    @Modifying
    @Query(nativeQuery = true,
            value = "UPDATE T013_USUARIOS_RH SET intentos_fail = intentos_fail +1 WHERE email = :email")
    void aumentoCont(@Param("email")  String email);

    @Modifying
    @Query(nativeQuery = true,
    value = "UPDATE T013_USUARIOS_RH SET fecha_bloqueo = :fecha, disabled = 1 WHERE email = :email")
    void disableUsuario(@Param("email") String email, @Param("fecha") Date fecha);

    @Modifying
    @Query(nativeQuery = true,
            value = "UPDATE T013_USUARIOS_RH SET fecha_bloqueo = null, intentos_fail = 0, disabled = 0 WHERE email = :email")
    void enableUsuariorh(@Param("email") String email);
}
