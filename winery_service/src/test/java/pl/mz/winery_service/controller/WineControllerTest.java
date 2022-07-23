package pl.mz.winery_service.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import pl.mz.winery_service.model.WineDto;

import java.util.UUID;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(WineController.class)
class WineControllerTest {

    @Autowired
    MockMvc mockMvc;
    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getWineById() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/wine/" + UUID.randomUUID().toString()).accept((MediaType.APPLICATION_JSON)))
                .andExpect(status().isOk());
    }

    @Test
    void saveNewWine() throws Exception {
        WineDto wineDto = WineDto.builder().build();
        String wineDtoJson = objectMapper.writeValueAsString(wineDto);
        mockMvc.perform(MockMvcRequestBuilders.post("/api/v1/wine/")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(wineDtoJson))
                .andExpect(status().isCreated());
    }

    @Test
    void updateWineId() throws Exception {
        WineDto wineDto = WineDto.builder().build();
        String wineDtoJson = objectMapper.writeValueAsString(wineDto);
        mockMvc.perform(MockMvcRequestBuilders.put("/api/v1/wine/" + UUID.randomUUID().toString())
                .contentType(MediaType.APPLICATION_JSON)
                .content(wineDtoJson))
                .andExpect(status().isNoContent());
    }
}