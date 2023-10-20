package practice.jpa1.type;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum OrderStatus {

    CREATED("생성"),

    RECEIVED("접수"),

    PROCESSING("처리"),

    DONE("완료");

    private final String description;

}
