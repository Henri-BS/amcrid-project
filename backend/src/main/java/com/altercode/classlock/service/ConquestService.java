package com.altercode.classlock.service;

import com.altercode.classlock.dto.ConquestDTO;
import com.altercode.classlock.entity.Badge;
import com.altercode.classlock.entity.Conquest;
import com.altercode.classlock.entity.User;
import com.altercode.classlock.entity.UserBadge;
import com.altercode.classlock.repository.ConquestRepository;
import com.altercode.classlock.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ConquestService {

    @Autowired
    private ConquestRepository conquestRepository;

    @Autowired
    private UserRepository userRepository;

    public ConquestDTO findByUser(User user) {
        Conquest find =  conquestRepository.findByUser(user);
        return new ConquestDTO(find);
    }

    public Page<ConquestDTO> findAllConquests(Pageable pageable) {
        Page<Conquest> result = conquestRepository.findAll(pageable);
        return result.map(ConquestDTO::new);
    }

    public ConquestDTO findConquestById(Long id) {
        return conquestRepository.findConquestById(id);
    }

    public ConquestDTO updateConquestValues(ConquestDTO dto, User user){
        Conquest conquest = conquestRepository.findByUser(user);

        int sum = 0;
        for(UserBadge b: conquest.getUser().getUserBadges()) {
            sum = sum + b.getBadge().getXp();
        }
        conquest.setTotalXp(sum);
        conquest.setUser(user);
        conquest.setTotalBadges(user.getUserBadges().size());

        return new ConquestDTO(conquestRepository.save(conquest));
    }
}
