package priv.rdo.example.documentation.webapp.endpoint;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor(access = AccessLevel.PACKAGE)
class RandomResponse {
    private final int nextInt;
    private final String uuid;
}
