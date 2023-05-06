package com.altercode.classlock.controller;

import com.altercode.classlock.dto.OptionDTO;
import com.altercode.classlock.entity.Question;
import com.altercode.classlock.service.OptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/option")
public class OptionController {

    @Autowired
    private OptionService optionService;

    @GetMapping("/question/{question}")
    public ResponseEntity<List<OptionDTO>> findOptionByQuestion(@PathVariable Question question) {
        List<OptionDTO> list = optionService.findOptionByQuestion(question);
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OptionDTO> findOptionById(@PathVariable Long id) {
        OptionDTO find = optionService.findOptionById(id);
        return ResponseEntity.ok(find);
    }

    @PostMapping("/add")
    public ResponseEntity<OptionDTO> saveOption(@RequestBody OptionDTO dto) {
        OptionDTO add = optionService.saveOption(dto);
        return new ResponseEntity<>(add, HttpStatus.CREATED);
    }

    @PutMapping("/edit")
    public ResponseEntity<OptionDTO> updateOption(@RequestBody OptionDTO dto) {
        OptionDTO update = optionService.updateOption(dto);
        return new ResponseEntity<>(update, HttpStatus.OK);
    }
}
