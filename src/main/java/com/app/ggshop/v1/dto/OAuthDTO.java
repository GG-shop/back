package com.app.ggshop.v1.dto;


import com.app.ggshop.v1.domain.OAuthVO;
import lombok.*;

import java.security.Provider;

@Getter@Setter @ToString
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
public class OAuthDTO {

    private Long id;
    private Provider provider;

    public OAuthVO toVo(){ return OAuthVO.builder()
            .id(id)
            .provider(provider)
            .build();
    }
}
