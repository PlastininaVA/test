package test.domain;

import test.dto.PromotionDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
@Table(name = "Promotion")
public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    private List<Object> prizes;

    private List<Object> participants;

    public Promotion(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Promotion(PromotionDto promotionDto) {
        this.name = promotionDto.name;
        this.description = promotionDto.description;
    }
}