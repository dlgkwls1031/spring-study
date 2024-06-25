package com.example.demo.menu.service;


import com.example.demo.menu.dto.MenuSaveDto;
import com.example.demo.menu.entity.MenuEntity;
import com.example.demo.menu.repository.MenuRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MenuService {
    private final MenuRepository menuRepository;

    @Transactional
    public Long saveMenu(MenuSaveDto menuSaveDto){
        MenuEntity menuEntity = menuRepository.save(MenuEntity.builder()
                .name(menuSaveDto.getName())
                .price(menuSaveDto.getPrice())
                .build());
        return menuEntity.getMenuId();
    }
}
