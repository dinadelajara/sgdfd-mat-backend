package pe.edu.unmsm.sgdfd.mat.backend.mantenimientos.model.reponse;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConfiguracionTramiteResponse {

//	private Integer idConfiguracionTramite;
	private Integer idTipoTramite;
	private Integer codigoLocal;
	private String estado;
	private String informacionAdicionalHtml;
	private List<RequisitoResponse> listaRequisitos;
	private List<CronogramaVigenteResponse> listaCronogramas;
	private List<DestinatariosResponse> listaDestinatarios;
	
}
