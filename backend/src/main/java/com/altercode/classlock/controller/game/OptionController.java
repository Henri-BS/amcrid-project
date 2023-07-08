package com.altercode.classlock.controller.game;

import com.altercode.classlock.dto.game.OptionDTO;
import com.altercode.classlock.entity.game.Question;
import com.altercode.classlock.service.game.OptionService;
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

    @GetMapping("/list-by-question/{question}")
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

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT, reason = "A alternativa foi deletada")
    public void deleteOption(@PathVariable Long id) {
        this.optionService.deleteOption(id);
    }
}
