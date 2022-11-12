package com.enuminfo.cloud.data.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = TableType.DELIVERY_LOCATION)
public class DeliveryLocation implements Serializable {

	@Id
	@Column(name = ColumnType.ID)
	private Long id;

	@Column(name = ColumnType.USER)
	private Long user;

	@Column(name = ColumnType.VALUE1)
	private String street;

	@Column(name = ColumnType.VALUE2)
	private String landmark1;

	@Column(name = ColumnType.VALUE3)
	private String landmark2;

	@Column(name = ColumnType.LOCATION)
	private Long location;
}
