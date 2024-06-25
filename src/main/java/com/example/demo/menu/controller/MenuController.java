package com.example.demo.menu.controller;

import com.example.demo.menu.dto.MenuSaveDto;
import com.example.demo.menu.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu") // 부가적으로 다른 url을 부여해주는 어노테이션
@RequiredArgsConstructor // 생성자 생략
public class MenuController {
    private final MenuService menuService;

    @PostMapping
    public Long menuSave(@RequestBody MenuSaveDto menuSaveDto) {
        return menuService.saveMenu(menuSaveDto);
    }

    //rest api 메소드는 5가지
    // get -> 값을 가져옴 - 화면 기준으로 말하는 거라서 서버는 데이터를 전송해줌
    // post -> 값을 입력함 - 서버에 값을 전송
    // delete -> 값 삭제 요청 - 서버에게 특정 데이터를 삭제하도록 함
    // "patch", put -> 값 수정
}
