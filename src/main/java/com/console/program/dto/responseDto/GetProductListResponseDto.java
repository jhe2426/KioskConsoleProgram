package com.console.program.dto.responseDto;

import java.util.List;

import lombok.Data;

@Data
public class GetProductListResponseDto extends ResponseDto{
       private List<Product> productList;
}


