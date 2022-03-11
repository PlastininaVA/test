package test.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
@Table(name = "prize")
public class Participant {

    @Id
    @GeneratedValue()
    @Column(name = "id")
    private Long id;

    @Column(name = "description")
    private String name;

    public Participant(String name) {
        this.name = name;
    }

}