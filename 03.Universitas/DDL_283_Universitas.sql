create database db_283_universitas

create table tbl_m_agama(
	id_agama_pk 	integer primary key generated always as identity,
	kode_agama 		char(5) not null,
	deskripsi		varchar(20) not null,
	is_active		bit,
	created_by		varchar(50) not null,
	created_date	timestamp not null,
	update_by		varchar(50),
	update_date		timestamp
)

create table tbl_m_type_dosen(
	id_type_dosen_pk 	integer primary key generated always as identity,
	kode_type_dosen		char(5) not null,
	deskripsi 			varchar(20) not null,
	is_active 			bit,
	created_by 			varchar(50) not null,
	created_date		timestamp not null,
	update_by 			varchar(50),
	update_date 		timestamp
)

create table tbl_m_jurusan(
	id_jurusan_pk		integer primary key generated always as identity,
	kode_jurusan		char(5) not null,
	nama_jurusan		varchar(50) not null,
	is_active 			bit,
	created_by 			varchar(50) not null,
	created_date 		timestamp not null,
	update_by 			varchar(50),
	update_date			timestamp
)

create table tbl_m_dosen(
	id_dosen_pk 		integer primary key generated always as identity,
	kode_dosen			char(5) not null,
	nama_dosen			varchar(100) not null,
	id_jurusan_fk		int not null,
	id_type_dosen_fk	int not null,
	is_active 			bit,
	created_by 			varchar(50) not null,
	created_date 		timestamp not null,
	update_by			varchar(50),
	update_date			timestamp 
)

create table tbl_m_mahasiswa(
	id_mahasiswa_pk		integer primary key generated always as identity,
	kode_mahasiswa		char(5) not null,
	nama_mahasiswa		varchar(100) not null,
	alamat				varchar(200) not null,
	id_agama_fk			int	not null,
	id_jurusan_fk 		int not null,
	is_active 			bit,
	created_by 			varchar(50) not null,
	created_date 	    timestamp not null,
	update_by 			varchar(50),
	update_date 		timestamp
)

create table tbl_r_ujian(
	id_ujian_pk			integer primary key generated always as identity,
	kode_ujian			char(5) not null,
	nama_ujian			varchar(50) not null,
	is_active 			bit,
	created_by 			varchar(50) not null,
	created_date 		timestamp not null,
	update_by 			varchar(50),
	update_date 		timestamp 
)

create table tbl_t_nilai(
	id_nilai_pk			integer primary key generated always as identity,
	id_mahasiswa_fk		int not null,
	id_ujian_fk			int not null,
	nilai				decimal(8,2) not null,
	is_active 			bit,
	created_by 			varchar(50) not NULL,
	created_date		timestamp not null,
	update_by 			varchar(50),
	update_date 		timestamp 
)

