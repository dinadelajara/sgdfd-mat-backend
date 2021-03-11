package pe.edu.unmsm.sgdfd.mat.backend.mantenimientos.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import pe.edu.unmsm.commons.mantenimiento.mapper.MantenibleMapper;
import pe.edu.unmsm.sgdfd.mat.backend.mantenimientos.model.reponse.CargoResponse;
import pe.edu.unmsm.sgdfd.mat.backend.mantenimientos.model.reponse.ConfiguracionTramiteResponse;
import pe.edu.unmsm.sgdfd.mat.backend.mantenimientos.model.request.CargoRequest;
import pe.edu.unmsm.sgdfd.mat.backend.mantenimientos.model.request.ConfiguracionTramiteRequest;

@Mapper
public interface ConfiguracionTramiteMapper extends MantenibleMapper<ConfiguracionTramiteRequest, ConfiguracionTramiteResponse>{

	public ConfiguracionTramiteResponse buscarPorIdTipoTramiteYCodigoLocal(@Param("idTipoTramite") Integer idTipoTramite, @Param("codigoLocal")String codigoLocal);
	
	public void registrarTramiteConfiguracion (ConfiguracionTramiteRequest configuracionTramiteRequest);
}
