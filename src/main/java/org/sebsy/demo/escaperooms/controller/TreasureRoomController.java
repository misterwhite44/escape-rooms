package org.sebsy.demo.escaperooms.controller;

import org.sebsy.demo.escaperooms.bll.TreasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TreasureRoomController {

    private final TreasureService treasureService;

    @Autowired
    public TreasureRoomController(TreasureService treasureService) {
        this.treasureService = treasureService;
    }

    public String fin() {
        return treasureService.ouvrir();
    }
}
