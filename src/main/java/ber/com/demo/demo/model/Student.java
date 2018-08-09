package ber.com.demo.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(of = { "id", "name" })
@Builder
public class Student {

	private Long id;
	private String name;
	private String branch;
	private int percentage;
	private int phone;
	private String email;
}
