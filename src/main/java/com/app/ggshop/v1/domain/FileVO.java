package com.app.ggshop.v1.domain;

import lombok.*;

@Getter @ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class FileVO {
    private Long id;
    private String fileName;
    private String fileSize;
    private String filePath;
    private String fileStatus;
}
