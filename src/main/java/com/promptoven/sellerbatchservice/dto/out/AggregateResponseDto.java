package com.promptoven.sellerbatchservice.dto.out;

import com.promptoven.sellerbatchservice.domain.AggregateEntity;
import com.promptoven.sellerbatchservice.vo.out.AggregateResponseVo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class AggregateResponseDto {

    private String memberUuid;

    private Long sellsCount;

    public static AggregateResponseDto toDto(AggregateEntity aggregateEntity) {
        return AggregateResponseDto.builder()
                .memberUuid(aggregateEntity.getMemberUuid())
                .sellsCount(aggregateEntity.getSellsCount())
                .build();
    }

    public static AggregateResponseVo toVo(AggregateResponseDto aggregateResponseDto) {
        return AggregateResponseVo.builder()
                .memberUuid(aggregateResponseDto.getMemberUuid())
                .sellsCount(aggregateResponseDto.getSellsCount())
                .build();
    }
}