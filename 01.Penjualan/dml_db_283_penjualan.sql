insert into tblm_barang(
	nama_barang,
	harga,
	stok
) values 
	('minyak', 7000, 5), 
	('sabun', 3000, 3)
	
INSERT INTO tblm_pembeli(
	nama_pembeli,
	jk,
	no_telp,
	alamat
) VALUES
	('sauki', 2, 81234567, 'jln. pondok labu'),
	('fahri', 3, 82345678, 'jln. pondok cabe'),
	
	
INSERT INTO tblt_transaksi(
	id_barang_fk,
	id_pembeli_fk,
	tanggal,
	keterangan
) VALUES
	(1, 2, '2022-03-10', 'terima kasih')
	
		
INSERT INTO tblm_pembeli(
	nama_pembeli,
	jk,
	no_telp,
	alamat
) VALUES	
	('dono', 'p', 628333344, 'jln. cipete')
	
	
INSERT INTO tblt_transaksi(
	id_barang_fk,
	id_pembeli_fk,
	tanggal,
	keterangan
) VALUES
	(2, 1, '2022-03-10', 'terima kasih')
	
insert into tblm_barang(
	nama_barang,
	harga,
	stok
) values 
	('susu', 10000, 6),
	('terigu', 8000, 3)