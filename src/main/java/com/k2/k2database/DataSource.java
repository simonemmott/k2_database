package com.k2.k2database;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DataSource {
	
	private String url;
	private String username;
	private String password;

}
