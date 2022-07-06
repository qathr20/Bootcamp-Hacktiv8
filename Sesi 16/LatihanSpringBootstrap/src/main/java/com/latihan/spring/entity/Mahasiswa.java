package com.latihan.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
@Table(name = "mahasiswa")
public class Mahasiswa {
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(length = 64)
	private String id;

	@NotNull
	@NotBlank
	@Column(name = "nim", unique = true)
	private String nim;

	@NotNull
	@NotBlank
	@Column(name = "nama")
	private String nama;

	@Column(name = "ipk")
	private float ipk;

	@NotNull
	@NotBlank
	@Column(name = "jurusan")
	private String jurusan;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public float getIpk() {
		return ipk;
	}

	public void setIpk(float ipk) {
		this.ipk = ipk;
	}

	public String getJurusan() {
		return jurusan;
	}

	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}

	
}
