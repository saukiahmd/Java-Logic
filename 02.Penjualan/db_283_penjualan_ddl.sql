create table tbl_m_barang(
	id_barang_pk	serial primary key,
	nama_barang		varchar(30),
	harga			decimal(18,2),
	stok			int,
	created_by 		varchar(30),
	created_on		timestamp,
	updated_by		varchar(30),
	updated_on		timestamp
)

create table tbl_m_pembeli(
	id_pembeli_pk 	serial primary key,
	nama_pembeli	varchar(35),
	jk				char(1),
	no_telp			varchar(13),
	alamat			varchar(250),
	created_by 		varchar(30),
	created_on		timestamp,
	updated_by		varchar(30),
	updated_on		timestamp,
	is_active		bit
)

create table tbl_t_transaksi(
	id_transaksi_pk	serial primary key,
	id_pembeli_fk	int,
	id_barang_fk	int,
	tanggal			timestamp,
	keterangan		varchar(350),
	created_by 		varchar(30),
	created_on		timestamp,
	updated_by		varchar(30),
	updated_on		timestamp
)

alter table tbl_m_pembeli 
add constraint unique_no_telp unique (no_telp)

-- 1. rubah nama table 
--      => tblm_barang jadi tbl_m_barang
--      => tblm_pembeli jadi tbl_m_pembeli
--      => tblt_transaksi jadi tbl_t_transaksi

alter table tblm_barang
rename to 	tbl_m_barang

alter table tblm_pembeli
rename to 	tbl_m_pembeli

alter table tblt_transaksi
rename to 	tbl_t_transaksi

--  2. Tambah kolom pembayaran di table tbl_t_transaksi dan isi menjadi Cash atau tunai
alter table tbl_t_transaksi 
add column 	pembayaran varchar(15);

update 		tbl_t_transaksi 
set 		pembayaran  = 'Cash'
where 		id_transaksi_pk = 1

update 		tbl_t_transaksi 
set 		pembayaran  = 'Cash'
where 		id_transaksi_pk = 2

update 		tbl_t_transaksi 
set 		pembayaran  = 'Cash'
where 		id_transaksi_pk = 3

update 		tbl_t_transaksi 
set 		pembayaran  = 'Tunai'
where 		id_transaksi_pk = 4

update 		tbl_t_transaksi 
set 		pembayaran  = 'Tunai'
where 		id_transaksi_pk = 5

--  3. Rubah panjang kolom alamat di table tbl_m_pembeli jadi 100
alter table  tbl_m_pembeli  
alter column alamat TYPE VARCHAR(100);

--  4. Rubah nama Nurul jadi Nuzul
update 		tbl_m_pembeli
set 		nama_pembeli = 'Nuzul'
where 		id_pembeli_pk = 2

--  5. Buatlah index pada kolom nama_pembeli pada table tbl_m_pembeli 
CREATE INDEX nama_index 
ON tbl_m_pembeli  (nama_pembeli);

select * from tbl_m_pembeli where id_pembeli_pk = 1;

--  6. tampilkan nama, tanggal beli dan jumlah hari dari tanggal pembelian
select 		nama_pembeli, 
			date_part('day', current_date - tanggal) as jumlah_hari 
from 		tbl_m_pembeli 
			inner join  tbl_t_transaksi on id_barang_fk = id_pembeli_pk;

--  7. tampilkan nama & tanggal pembelian dengan format tanggal 17 Januari 2021 atau 17 January 2021
select 		nama_pembeli, 
			to_char (tanggal, 'DD Month YYYY') as tanggal 
from 		tbl_t_transaksi
			inner join tbl_m_pembeli on id_pembeli_pk = id_pembeli_fk  

--  8. tampilkan data pembeli yang memiliki nama awalan f dan akhiran i
select *  from tbl_m_pembeli  where lower(nama_pembeli) like 'f%'; -- kata depan

select * from tbl_m_pembeli where lower(nama_pembeli) like '%i'; -- kata belakang

--  9. tampilkan data pembeli yang memiliki nama dengan karakter u setelah karakter pertama
select * from tbl_m_pembeli where lower(nama_pembeli)like '_u%';

--  10.buatlah data baru dengan nama Nana dengan tanggal pembelian 5 desember 2021 dan membeli semua barang
insert into tbl_m_pembeli (nama_pembeli, jk, no_telp) values 
	('Nana', 'P', '083333333')
	
insert into tbl_t_transaksi (id_pembeli_fk, id_barang_fk, tanggal, keterangan, created_by, created_on, pembayaran) values 
	(4, 1, '5-12-2021', '2', 'system', current_timestamp, 'Tunai'),
	(4, 2, '5-12-2021', '3', 'system', current_timestamp, 'Tunai'),
	(4, 3, '5-12-2021', '4', 'system', current_timestamp, 'Tunai'),
	(4, 4, '5-12-2021', '1', 'system', current_timestamp, 'Tunai'),
	(4, 5, '5-12-2021', '5', 'system', current_timestamp, 'Tunai')

--  11.buatlah data baru dengan nama Nina dengan tanggal pembelian 31 desember 2021 dan membeli teh, kopi dan gula lalu pada tanggal 1 januari 2022 membeli sendok
insert into tbl_m_pembeli (nama_pembeli, jk, no_telp) values 
	('Nina', 'P', '083222233')

insert into tbl_t_transaksi (id_pembeli_fk, id_barang_fk, tanggal, keterangan, created_by, created_on, pembayaran) values 
	(5, 2, '12-31-2021', '3', 'system', current_timestamp, 'Cash'),
	(5, 1, '12-31-2021', '4', 'system', current_timestamp, 'Cash'),
	(5, 3, '12-31-2021', '5', 'system', current_timestamp, 'Cash'),
	(5, 5, '01-01-2022', '1', 'system', current_timestamp, 'Tunai')
	
-- 12.tampilkan data barang dan sisa stok
select nama_barang, stok from tbl_m_barang;
	
--  13.tampilkan jumlah pendapatan dalam pertahun
select 	tanggal, 
		sum(harga) over () as jml_bayar 
from 	tbl_t_transaksi 
		inner join tbl_m_barang on id_barang_fk = id_barang_pk
		group by tanggal, harga

--  14. Buatlah contoh penggunaan is null, case when, sub select, drop table
-- is null 
select * from tbl_t_transaksi where updated_by is null

--case when
select harga, 
case 
when harga < 2500 then 'MURAH'
else 'Tidak Murah'
end as hargatext
from tbl_m_barang 

--drop table 
DROP TABLE table_name; 
