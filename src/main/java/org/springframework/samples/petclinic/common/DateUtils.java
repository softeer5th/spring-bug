package org.springframework.samples.petclinic.common;

import java.time.LocalDate;

public class DateUtils {
	static public boolean validationDate(LocalDate date){
		LocalDate now = LocalDate.now();
		return date.isAfter(now);
	}
}
