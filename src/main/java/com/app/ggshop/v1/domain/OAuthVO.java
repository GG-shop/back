package com.app.ggshop.v1.domain;


import lombok.*;

import java.security.Provider;

@Getter
@ToString
@EqualsAndHashCode(of="id")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class OAuthVO {
    private  Long id;
    private Provider provider;
}
