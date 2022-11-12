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
@Table(name = TableType.USER)
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = ColumnType.ID)
	private Long id;

	@Column(name = ColumnType.PASSWORD)
	private String password;

	@Column(name = ColumnType.ACCESS)
	private String access;

	@Column(name = ColumnType.USERNAME)
	private String username;
}
