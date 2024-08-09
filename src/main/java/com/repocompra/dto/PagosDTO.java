package com.repocompra.dto;

import java.sql.Date;

public interface PagosDTO {

	Long getId();
	int getEstado();
	double getSubtotal();
	double getImpuestos();
	double getTotalpago();
	Date getFechapago();

	
}
