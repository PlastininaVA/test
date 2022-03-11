package test.rest;

import io.swagger.v3.oas.annotations.Operation;
import test.dto.PromotionDto;
import test.service.ParticipantService;
import test.service.PrizeService;
import test.service.PromotionService;
import test.service.ResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/test")
public class Controller {

    private final ParticipantService participantService;
    private final PrizeService prizeService;
    private final PromotionService promotionService;
    private final ResultService resultService;


    @Operation(summary = "Создание промоакции")
    @PostMapping("/promo")
    public ResponseEntity<Void> createLimit(@RequestBody PromotionDto promotionDto) {
        promotionService.createPromotion(promotionDto);
        return ResponseEntity.ok().build();
    }


}