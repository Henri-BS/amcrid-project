package com.altercode.classlock.service;

import com.altercode.classlock.dto.OptionDTO;
import com.altercode.classlock.entity.Option;
import com.altercode.classlock.entity.Question;
import com.altercode.classlock.repository.OptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OptionService {

    @Autowired
    private OptionRepository optionRepository;


    public List<OptionDTO> findOptionByQuestion(Question question) {
        List<Option> list = optionRepository.findOptionByQuestion(question);
        return list.stream().map(OptionDTO::new).collect(Collectors.toList());
    }

    public OptionDTO findOptionById(Long id) {
        Option find = optionRepository.findById(id).orElseThrow();
        return new OptionDTO(find);
    }
}
