CREATE TABLE tblm_barang(
	id_barang_pk 	serial PRIMARY KEY,
	nama_barang 	varchar(20),
	harga			int,
	stok			int
)

CREATE TABLE tblm_pembeli(
	id_pembeli_pk	serial PRIMARY KEY,
	nama_pembeli	varchar(30),
	jk				char(1),
	no_telp			char(14),
	alamat 			varchar(50),
)

CREATE TABLE tblt_transaksi(
	id_transaksi_pk serial PRIMARY KEY,
	id_barang_fk	int,
	id_pembeli_fk		int,
	tanggal			date,
	keterangan		varchar(100)
)


--merubah nama kolom
alter table tblt_transaksi
rename column id_pembeli_pk to id_pembeli_fk

--merubah nama tabel
alter table tblm_barang
rename to tbm_barang

--menambah kolom baru untuk created_by
alter table tblm_barang 
add column created_by varchar(30);


--menambahkan default valuee column created by
alter table tblm_barang
alter column created_by set default 'batch283';

--menambah properties not null (tidak boleh kosong) dengan syarat data sebelumnya tidak ada yang kosong juga
alter table tblm_barang
alter column created_by set not null 'batch283';

--menambah kolom baru lebih dari 1 kolom 
alter table tblm_barang 
add column created_dt timestamp,
add column update_by varchar(30),
add column update_dt timestamp

alter table tblm_barang
add column is_active bit

alter table tblm_pembeli  
add column created_by varchar(30),
add column created_dt timestamp,
add column update_by varchar(30),
add column update_dt timestamp,
add column is_active bit

alter table tblt_transaksi   
add column created_by varchar(30),
add column created_dt timestamp,
add column update_by varchar(30),
add column update_dt timestamp,
add column is_active bit