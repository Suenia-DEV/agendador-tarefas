package com.suenia.Agendadortarefas.business.mapper;

import com.suenia.Agendadortarefas.business.dto.TarefasDTO;
import com.suenia.Agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "dataEvento" , target = "dataEvento")
    @Mapping(source = "dataCriacao" , target = "dataCriacao")
    TarefasEntity paraTarefaENtity(TarefasDTO dto);

    TarefasDTO paraTarefasDTO (TarefasEntity entity);

    List<TarefasEntity> paraListaTarefasEntity(List<TarefasDTO> dtos);

    List<TarefasDTO> paraListaTarefasDTO(List<TarefasEntity> entity);

}
