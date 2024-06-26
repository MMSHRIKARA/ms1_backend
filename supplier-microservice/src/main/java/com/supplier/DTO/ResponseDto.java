package com.supplier.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {
	
	private DrugDTO drug;
	
	private SupplierDTO supplier;

}
