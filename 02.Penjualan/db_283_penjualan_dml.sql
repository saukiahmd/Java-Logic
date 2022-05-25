insert into tbl_m_pembeli (nama_pembeli, jk, no_telp) values 
	('Yusfi', 'L', '08111111111'),
	( 'Nurul', 'P', '08123456789'),
	( 'Fakhri', 'L', '08999999999')
	
update tbl_m_pembeli 
set alamat = 'jl. Margonda', 
	created_by = 'system', 
	created_on = current_timestamp
where id_pembeli_pk = 1

update tbl_m_pembeli 
set alamat = 'jl. Satrio', 
	created_by = 'system', 
	created_on = current_timestamp
where id_pembeli_pk = 2

update tbl_m_pembeli 
set alamat = 'jl. Langsat', 
	created_by = 'system', 
	created_on = current_timestamp
where id_pembeli_pk = 3

insert into tbl_m_barang (nama_barang, harga, stok, created_by, created_on) values 
	('Kopi CBA', 2000.00, 10, 'system', current_timestamp),
	('Teh Hitam', 1599.99, 25, 'system', current_timestamp),
	('Gula Kita', 5000.00, 15, 'system', current_timestamp),
	('Cangkir', 2599.99, 12, 'system', current_timestamp),
	('Sendok', 3000.00, 15, 'system', current_timestamp)
	
insert into tbl_t_transaksi (id_pembeli_fk, id_barang_fk, tanggal, keterangan, created_by, created_on) values 
	(1, 5, '2022-01-12 21:30:2', '3', 'system', current_timestamp),
	(1, 3, '2022-01-12 21:30:2', '3', 'system', current_timestamp),
	(1, 2, '2022-01-12 21:30:2', '3', 'system', current_timestamp),
	(2, 5, '2022-01-10 07:22:2', '3', 'system', current_timestamp),
	(3, 1, '2022-01-07 13:35:2', '3', 'system', current_timestamp)
	
--exam002	
update tbl_t_transaksi 
set pembayaran  = 'Cash'
where id_transaksi_pk = 1

update tbl_t_transaksi 
set pembayaran  = 'Cash'
where id_transaksi_pk = 2

update tbl_t_transaksi 
set pembayaran  = 'Cash'
where id_transaksi_pk = 3

update tbl_t_transaksi 
set pembayaran  = 'Tunai'
where id_transaksi_pk = 4

update tbl_t_transaksi 
set pembayaran  = 'Tunai'
where id_transaksi_pk = 5

-- exam004
update tbl_m_pembeli
set nama_pembeli = 'Nuzul'
where id_pembeli_pk = 2

--exam012
select nama_barang, stok from tbl_m_barang

