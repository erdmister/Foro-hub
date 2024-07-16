package challenge.api.forohub.domain.topico.respuesta.validaciones;

import challenge.api.forohub.infra.errores.ValidacionDeIntegridad;
import challenge.api.forohub.domain.topico.TopicoRepository;
import challenge.api.forohub.domain.topico.respuesta.DatosCrearRespuesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicoValido implements ValidadorRespuesta {

    @Autowired
    TopicoRepository topicoRepository;

    @Override
    public void validar(DatosCrearRespuesta datos) {
        if (datos.idTopico() == null || !topicoRepository.existsById(datos.idTopico())) {
            throw new ValidacionDeIntegridad("Topico no encontrado");
        }
    }
}
