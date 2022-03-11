package test.dto;


import test.domain.Promotion;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PromotionDto {

    public String name;
    public String description;

    public PromotionDto(Promotion promotion){
        name = promotion.getName();
        description = promotion.getDescription();
    }
}
