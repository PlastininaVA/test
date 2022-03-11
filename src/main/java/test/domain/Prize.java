package test.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@NoArgsConstructor
@Data
@Entity
@Table(name = "prize")
public class Prize {

    @Id
    @GeneratedValue()
    @Column(name = "id")
    private Long id;

    @Column(name = "description")
    private String description;

    public Prize(String description) {
        this.description = description;
    }

}