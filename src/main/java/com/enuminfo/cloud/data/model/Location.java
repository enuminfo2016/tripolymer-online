package com.enuminfo.cloud.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.enuminfo.cloud.data.ColumnType;
import com.enuminfo.cloud.data.TableType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = false)
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
@Entity
@Table(name = TableType.COUNTRY)
public class Location extends Base {

	@Column(name = ColumnType.NAME)
	private String name;

	@Column(name = ColumnType.PIN)
	private Long pin;

	@Column(name = ColumnType.CITY)
	private String city;

	@Column(name = ColumnType.STATE)
	private String state;

	@Column(name = ColumnType.COUNTRY)
	private Long country;
}
