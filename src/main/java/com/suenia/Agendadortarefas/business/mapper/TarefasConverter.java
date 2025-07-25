package com.suenia.Agendadortarefas.business.mapper;

import com.suenia.Agendadortarefas.business.dto.TarefasDTO;
import com.suenia.Agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaENtity(TarefasDTO dto);

    TarefasDTO paraTarefasDTO (TarefasEntity entity);

}
