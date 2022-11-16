package com.project.financial.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExportDto {
    private String riskAversionStatus; //투자 성향
    private Integer stk_cd; //종목 코드
    private String stk_nm; //종목명
}