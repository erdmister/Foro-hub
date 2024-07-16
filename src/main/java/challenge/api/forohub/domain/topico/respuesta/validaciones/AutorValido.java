package challenge.api.forohub.domain.topico.respuesta.validaciones;

import challenge.api.forohub.domain.usuario.UsuarioRepository;
import challenge.api.forohub.infra.errores.ValidacionDeIntegridad;
import challenge.api.forohub.domain.topico.respuesta.DatosCrearRespuesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutorValido implements ValidadorRespuesta {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public void validar(DatosCrearRespuesta datos) {
        if (datos.idAutor() == null || !usuarioRepository.existsById(datos.idAutor())) {
            throw new ValidacionDeIntegridad("Autor no encontrado");
        }
    }
}
