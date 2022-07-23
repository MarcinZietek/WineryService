package pl.mz.winery_service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.mz.winery_service.model.WineDto;

import java.util.UUID;

/**
 * Created by mz on 23.07.22
 */
@RequestMapping("/api/v1/wine")
@RestController
public class WineController {

    @GetMapping({"/{wineId}"})
    public ResponseEntity<WineDto> getWineById(@PathVariable("wineId") UUID wineId){
        return new ResponseEntity<>(WineDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewWine(@RequestBody WineDto wineDto){
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping({"/{wineId}"})
    public ResponseEntity updateWineId(@PathVariable("wineId") UUID wineId, @RequestBody WineDto wineDto){
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
