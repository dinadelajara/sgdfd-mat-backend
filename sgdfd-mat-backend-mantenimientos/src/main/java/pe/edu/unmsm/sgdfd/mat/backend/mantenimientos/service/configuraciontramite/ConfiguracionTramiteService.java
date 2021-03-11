package pe.edu.unmsm.sgdfd.mat.backend.mantenimientos.service.configuraciontramite;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pe.edu.unmsm.commons.mantenimiento.service.MantenibleService;
import pe.edu.unmsm.sgdfd.mat.backend.mantenimientos.model.reponse.ConfiguracionTramiteResponse;
import pe.edu.unmsm.sgdfd.mat.backend.mantenimientos.model.request.ConfiguracionTramiteRequest;


/**
 * Define los métodos asociados a las operaciones de mantenimiento de tramites,
 * los cuales deberán ser implementados.
 * applet and the classes an applet uses 
 * <p>
 * Esta interface extiende de {@link MantenibleService} para poder heredar 
 * los métodos comunes de mantenimiento.
 * 
 * @author Eric Robladillo
 * @see MantenibleService
 * @see ConfiguracionTramiteRequest
 * @see ConfiguracionTramiteResponse
 */
public interface ConfiguracionTramiteService extends MantenibleService<ConfiguracionTramiteRequest, ConfiguracionTramiteResponse>{

	 /**
     * Retorna una lista con todos los tramites buscados por:
     * @param codigoLocal
     * 			codigo del local al que pertenece el tramite
     * 
     * @param idTipoTramite
     * 			id del tipo de tramite
     */
	public ConfiguracionTramiteResponse buscarPorIdTipoTramiteYCodigoLocal(@Param("idTipoTramite") Integer idTipoTramite, @Param("codigoLocal")String codigoLocal);

	/*
	 * 
	 */
	public void registrarTramiteConfiguracion (ConfiguracionTramiteRequest configuracionTramiteRequest);
}
