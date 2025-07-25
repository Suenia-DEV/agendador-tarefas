package com.suenia.Agendadortarefas.business;

import com.suenia.Agendadortarefas.business.dto.TarefasDTO;
import com.suenia.Agendadortarefas.business.mapper.TarefasConverter;
import com.suenia.Agendadortarefas.infrastructure.entity.TarefasEntity;
import com.suenia.Agendadortarefas.infrastructure.enums.StatusNotificacaoEnum;
import com.suenia.Agendadortarefas.infrastructure.repository.TarefasRepository;
import com.suenia.Agendadortarefas.infrastructure.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor

public class TarefasService {
    private final  TarefasRepository tarefasRepository;
    private final TarefasConverter tarefaConverter;
    private final JwtUtil jwtUtil;

    public TarefasDTO gravarTarefa(String token,TarefasDTO dto) {

        String email = jwtUtil.extractUsername(token.substring(7));

        dto.setDataCriacao(LocalDateTime.now());
        dto.setStatusNotificacaoEnum(StatusNotificacaoEnum.PENDENTE);
        dto.setEmailUsuario(email);
        TarefasEntity entity = tarefaConverter.paraTarefaENtity(dto);
        return tarefaConverter.paraTarefasDTO(tarefasRepository.save(entity));
    }

}
