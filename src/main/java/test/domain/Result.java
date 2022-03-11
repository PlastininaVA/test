package test.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tokens")
@Getter
@Setter
@NoArgsConstructor
public class Result {

    @Id
    @GeneratedValue()
    @Column(name = "id")
    private Long id;
    
    @JoinColumn(name = "winner")
    private Long winnerId;

    @JoinColumn(name = "prize")
    private Long prizeId;

    public Result(Long winnerId, Long prizeId) {
        this.winnerId = winnerId;
        this.prizeId = prizeId;
    }
}