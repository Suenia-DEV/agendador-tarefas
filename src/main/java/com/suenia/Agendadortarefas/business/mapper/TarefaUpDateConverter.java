package com.suenia.Agendadortarefas.business.mapper;

import com.suenia.Agendadortarefas.business.dto.TarefasDTO;
import com.suenia.Agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TarefaUpDateConverter {

    void upDateTarefas(TarefasDTO dto, @MappingTarget TarefasEntity entity);
}
