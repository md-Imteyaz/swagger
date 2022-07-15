package com.swagger.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Book implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3505491615422746128L;
	@Id
	@GeneratedValue
	@ApiModelProperty(value = "autogenerated id")
	private int bookId;

	@ApiModelProperty(value = "this is book name")

	private String bookName;

	@ApiModelProperty(value = "this is book price")

	private double price;

}