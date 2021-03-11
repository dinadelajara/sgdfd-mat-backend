package pe.edu.unmsm.sgdfd.mat.backend.mantenimientos.service.configuraciontramite;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.unmsm.commons.mantenimiento.mapper.MantenibleMapper;
import pe.edu.unmsm.commons.mantenimiento.service.MantenibleService;
import pe.edu.unmsm.sgdfd.mat.backend.commons.service.MantenibleAuditadoService;
import pe.edu.unmsm.sgdfd.mat.backend.mantenimientos.mapper.ConfiguracionTramiteMapper;
import pe.edu.unmsm.sgdfd.mat.backend.mantenimientos.mapper.CronogramaVigenteMapper;
import pe.edu.unmsm.sgdfd.mat.backend.mantenimientos.mapper.TipoTramiteDestinatarioMapper;
import pe.edu.unmsm.sgdfd.mat.backend.mantenimientos.mapper.TipoTramiteLocalMapper;
import pe.edu.unmsm.sgdfd.mat.backend.mantenimientos.mapper.TipoTramiteRequisitoMapper;
import pe.edu.unmsm.sgdfd.mat.backend.mantenimientos.model.reponse.ConfiguracionTramiteResponse;
import pe.edu.unmsm.sgdfd.mat.backend.mantenimientos.model.request.ConfiguracionTramiteRequest;


/**
 * Ejecuta la lógica asociada a las operaciones
 * de mantenimiento de tramite
 * <p>
 * Esta clase, al ser un servicio {@literal @Service} de mantenimiento,
 * extiende de {@link MantenibleService}, implementa la interface {@link ConfiguracionTramiteService}
 * y delega la función de acceso a la base de datos a la interface 
 * {@link ConfiguracionTramiteMapper} solo para operaciones de mantenimiento. 
 *
 * @author Eric Robladillo
 */
@Service
@Transactional
public class ConfiguracionTramiteServiceImpl extends MantenibleAuditadoService<ConfiguracionTramiteRequest, ConfiguracionTramiteResponse>
				implements ConfiguracionTramiteService{

	@Autowired
	private TipoTramiteLocalMapper tipoTramiteLocalMapper;
	
	@Autowired
	private TipoTramiteRequisitoMapper tipoTramiteRequisitoMapper;
	
	@Autowired
	private CronogramaVigenteMapper cronogramaVigenteMapper;
	
	@Autowired
	private TipoTramiteDestinatarioMapper tipoTramiteDestinatarioMapper;
	
	private ConfiguracionTramiteMapper configuracionTramiteMapper;

	 /**
     * Instancia la interface {@link ConfiguracionTramiteMapper} a partir de la interface 
     * genérica {@link MantenibleMapper}  
     * 
     * @param mapper
     * 			interface genérica para las interfaces mapper de mantenimiento
     */
    public ConfiguracionTramiteServiceImpl(@Qualifier("configuracionTramiteMapper") MantenibleMapper<ConfiguracionTramiteRequest, ConfiguracionTramiteResponse> mapper) {
        super(mapper);
        this.configuracionTramiteMapper = (ConfiguracionTramiteMapper) mapper;
    }
	
	@Override
	public ConfiguracionTramiteResponse buscarPorIdTipoTramiteYCodigoLocal(Integer idTipoTramite,	String codigoLocal) {
		return configuracionTramiteMapper.buscarPorIdTipoTramiteYCodigoLocal(idTipoTramite, codigoLocal);
	}

	
	@Override
	public void registrarTramiteConfiguracion(ConfiguracionTramiteRequest configuracionTramiteRequest){
		
		
	}
	
}
