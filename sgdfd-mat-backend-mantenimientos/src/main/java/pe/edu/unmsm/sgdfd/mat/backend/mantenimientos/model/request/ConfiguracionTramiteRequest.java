package pe.edu.unmsm.sgdfd.mat.backend.mantenimientos.model.request;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.edu.unmsm.sgdfd.mat.backend.mantenimientos.model.reponse.CronogramaVigenteResponse;
import pe.edu.unmsm.sgdfd.mat.backend.mantenimientos.model.reponse.DestinatariosResponse;
import pe.edu.unmsm.sgdfd.mat.backend.mantenimientos.model.reponse.RequisitoResponse;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConfiguracionTramiteRequest {

	private Integer idTipoTramite;
	private Integer codigoLocal;
	private String estado;
	private String descripcion;
	private List<RequisitoResponse> listaRequisitos;
	private List<CronogramaVigenteResponse> listaCronogramas;
	private List<DestinatariosResponse> listaDestinatarios;
}
