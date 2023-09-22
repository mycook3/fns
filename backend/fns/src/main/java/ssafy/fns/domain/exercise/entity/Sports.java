package ssafy.fns.domain.exercise.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import ssafy.fns.global.entity.BaseEntity;

@Entity
@Getter
@NoArgsConstructor
public class Sports extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sports_id")
    private Long id;

    private String sportsName;

    private Long met;

    @OneToOne(mappedBy = "sports", fetch = FetchType.LAZY)
    private Exercise exercise;

    @Builder
    public Sports(String sportsName, Long met) {
        this.sportsName = sportsName;
        this.met = met;
    }
}
