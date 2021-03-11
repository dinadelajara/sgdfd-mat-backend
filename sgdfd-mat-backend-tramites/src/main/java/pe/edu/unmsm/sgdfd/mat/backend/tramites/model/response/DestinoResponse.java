package pe.edu.unmsm.sgdfd.mat.backend.tramites.model.response;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DestinoResponse {

	private String idItem;                      
    private String anio;                          
    private String numeroEmision;                           
    private String codigoDependencia;           
    private String codigoEmpleado;             
    private String codigoPrioridad;                      
    private Date fechaDerivacion;
    private String estado; 
}
