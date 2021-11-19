package com.backend.vueshop_server.domain.dto.respDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RespDto<T> {
    private int code;
    private String msg;
    private T data;
}
