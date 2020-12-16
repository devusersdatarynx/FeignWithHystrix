package com.datarynx.feign.hystrix.api.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {

	private Long id;

    private String firstName;

    private String lastName;

    private String gender;

    private String address;
}
