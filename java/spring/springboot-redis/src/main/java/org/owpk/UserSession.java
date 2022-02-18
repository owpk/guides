package org.owpk;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

/**
 * @author Vorobyev Vyacheslav
 */

@RedisHash("session")
@Getter
@Setter
@AllArgsConstructor
@ToString
public class UserSession {

    @Id
    private String refreshTokenUUID;
    private String login;
    private Long userId;
    private String accessToken;
    private Integer count;
    private String fingerprint;

    public UserSession() {
        count = 0;
        incrementCount();
    }

    public void incrementCount() {
        count++;
    }
}
