package com.enuminfo.cloud.data.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = TableType.USER_ORDERED_ITEM)
public class UserOrderedItem implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = ColumnType.ID)
	private Long id;

	@Column(name = ColumnType.USER_ORDER)
	private Long userOrder;

	@Column(name = ColumnType.PRODUCT)
	private Long product;

	@Column(name = ColumnType.QUANTITY)
	private Double quantity;

	@Column(name = ColumnType.PRICE)
	private Double price;
}
