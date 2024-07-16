package challenge.api.forohub.domain.topico.respuesta.validaciones;

import challenge.api.forohub.domain.topico.respuesta.DatosCrearRespuesta;
import challenge.api.forohub.domain.usuario.UsuarioRepository;
import challenge.api.forohub.infra.errores.ValidacionDeIntegridad;
import challenge.api.forohub.domain.topico.TopicoRepository;
import challenge.api.forohub.domain.topico.respuesta.RespuestaRepository;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RespuestaValida implements ValidadorRespuesta {

    @Autowired
    RespuestaRepository respuestaRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    TopicoRepository topicoRepository;

    @Override
    public void validar(DatosCrearRespuesta datos) {
        if (datos.mensaje() == null) {
            throw new ValidacionDeIntegridad("mensaje no encontrado");
        }

        if (respuestaRepository.existsByTopicoAndMensajeAndAutorRespuesta(
                topicoRepository.getReferenceById(datos.idTopico()),
                datos.mensaje(),
                usuarioRepository.getReferenceById(datos.idAutor()))) {
            throw new ValidationException("Ya existe una respuesta igual para el topico");
        }
    }
}
