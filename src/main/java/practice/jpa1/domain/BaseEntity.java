package practice.jpa1.domain;

import java.time.LocalDateTime;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
public abstract class BaseEntity {

    private String createdBy;

    private LocalDateTime createdDateTime;

    private String lastModifiedBy;

    private LocalDateTime lastModifiedDateTime;

}
