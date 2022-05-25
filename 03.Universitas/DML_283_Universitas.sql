insert into tbl_m_agama (kode_agama, deskripsi, is_active, created_by, created_date) values 
	('A001', 'Islam', '1', 'sauki', current_timestamp),
	('A002', 'Kristen', '1', 'sauki', current_timestamp),
	('A003', 'Katolik', '1', 'sauki', current_timestamp),
	('A004', 'Hindu', '1', 'sauki', current_timestamp),
	('A005', 'Budha', '1', 'sauki', current_timestamp)
	
insert into tbl_m_type_dosen (kode_type_dosen, deskripsi, is_active, created_by, created_date) values 
	('T001', 'Tetap', '1', 'sauki', current_timestamp),
	('T002', 'Honorer', '1', 'sauki', current_timestamp),
	('T003', 'Expertise', '1', 'sauki', current_timestamp)

insert into tbl_m_jurusan (kode_jurusan, nama_jurusan, is_active, created_by, created_date) values 
	('J001', 'Teknik Informatika', '1', 'sauki', current_timestamp),
	('J002', 'Management Informatika', '1', 'sauki', current_timestamp),
	('J003', 'Sistem Informasi', '1', 'sauki', current_timestamp),
	('J004', 'Sistem Komputer', '1', 'sauki', current_timestamp),
	('J005', 'Komputer Akuntansi', '1', 'sauki', current_timestamp)
	
insert into tbl_m_dosen (kode_dosen, nama_dosen, id_jurusan_fk, id_type_dosen_fk, is_active, created_by, created_date) values 
	('D001', 'Prof. Dr. Retno Wahyuningsih', 1, 2, '1', 'sauki', current_timestamp),
	('D002', 'Prof. Roy M. Sutikno', 2, 1, '1', 'sauki', current_timestamp),
	('D003', 'Prof. Hendri A. Verburgh', 3, 2, '1', 'sauki', current_timestamp),
	('D004', 'Prof. Risma Suparwata', 4, 2, '1', 'sauki', current_timestamp),
	('D005', 'Prof. Amir Sjarifuddin Madjid, MM, MA', 5, 1, '1', 'sauki', current_timestamp)

insert into tbl_m_mahasiswa (kode_mahasiswa, nama_mahasiswa, alamat, id_agama_fk, id_jurusan_fk, is_active,	created_by, created_date) values 
	('M001', 'Budi Gunawan', 'Jl. Mawar No 3 RT 05 Cicalengka, Bandung', 1, 1, '1', 'sauki', current_timestamp),
	('M002', 'Rinto Raharjo', 'Jl. Kebagusan No 33 RT 04 RW 06, Bandung', 1, 2, '1', 'sauki', current_timestamp),
	('M003', 'Asep Saepudin', 'Jl. Sumatera No 12 RT 02 RW 01, Ciamis', 1, 3, '1', 'sauki', current_timestamp),
	('M004', 'M. Hafif Isbullah', 'Jl. Jawa No 01 RT 01 RW 01, Jakarta Pusat', 2, 1, '1', 'sauki', current_timestamp),
	('M005', 'Cahyono', 'Jl. Niagara No 54 RT 01 RW 09, Surabaya', 3, 2, '1', 'sauki', current_timestamp)

insert into tbl_r_ujian (kode_ujian, nama_ujian, is_active, created_by, created_date) values 
	('U001', 'Algoritma', '1', 'sauki', current_timestamp),
	('U002', 'Aljabar', '1', 'sauki', current_timestamp),
	('U003', 'Statistika', '1', 'sauki', current_timestamp),
	('U004', 'Etika Profesi', '1', 'sauki', current_timestamp),
	('U005', 'Bahasa Inggris', '1', 'sauki', current_timestamp)
	
insert into tbl_t_nilai (id_mahasiswa_fk, id_ujian_fk, nilai, is_active, created_by, created_date) values 
	( 4, 1, 90, '1', 'sauki', current_timestamp),
	( 1, 1, 80, '1', 'sauki', current_timestamp),
	( 2, 3, 85, '1', 'sauki', current_timestamp),
	( 4, 2, 95, '1', 'sauki', current_timestamp),
	( 5, 5, 70, '1', 'sauki', current_timestamp)
	
	
--exam001 Buatlah table-table pada sheet Tables dan simpan Query-nya

	
--exam002 Buatlah query untuk mengubah column Nama_Dosen dengan type data VarChar dengan panjang 200 pada table Dosen
alter table tbl_m_dosen 
alter column nama_dosen TYPE VARCHAR(200);

--exam003 Buatlah query untuk menampilkan data berikut:
		--Kode_Mahasiswa 	Nama_Mahasiswa 		Nama_Jurusan 			Agama
		--M001 			 	Budi Gunawan 		Teknik Informatika 		Islam
select 		kode_mahasiswa,
			nama_mahasiswa,
			nama_jurusan,
			deskripsi
from 		tbl_m_mahasiswa
			join tbl_m_jurusan
			on id_jurusan_fk = id_jurusan_pk
			join tbl_m_agama 
			on id_agama_fk = id_agama_pk
where 		id_mahasiswa_pk = 1

--exam004 Buatlah data untuk jurusan dengan status tidak aktif
insert into tbl_m_jurusan (kode_jurusan, nama_jurusan, is_active, created_by, created_date) values 
	('J006', 'Psikologi', '0', 'sauki', current_timestamp)

--exam005 Buatlah data baru untuk mahasiswa dengan jurusan yang baru dibuat
insert into tbl_m_mahasiswa (kode_mahasiswa, nama_mahasiswa, alamat, id_agama_fk, id_jurusan_fk, is_active, created_by, created_date) values 
	('M006', 'Ahmad Sauqi', 'Jl H. Abdul Majid No 6, Jakarta Selatan', 1, 0, '1', 'sauki', current_timestamp)
	
update 		tbl_m_mahasiswa
set 		id_jurusan_fk  = 6
where 		id_mahasiswa_pk = 6
	

--exam006 Buatlah query untuk menampilkan data mahasiswa yang mengambil jurusan dengan Status Jurusan = Non Aktif 
select 		b.kode_mahasiswa, 
			b.nama_mahasiswa,
			a.nama_jurusan,
			a.is_active,
			case 
				 when a.is_active = '1' then 'Aktif'
				 when a.is_active = '0' then 'Tidak Aktif'
			end as status_jurusan,
			case 
				 when a.is_active = '1' then 'Aktif'
				 else 'Non-Aktif'
			end as status_jurusan2
from		tbl_m_jurusan a
			join tbl_m_mahasiswa b
			on a.id_jurusan_pk = b.id_jurusan_fk
where 		a.is_active = '0'

--exam007  Buatlah query untuk menampilkan data mahasiswa dengan nilai diatas 80 untuk ujian dengan status ujian = Aktif 
select 		b.kode_mahasiswa,
			b.nama_mahasiswa,
			c.nama_ujian,
			a.nilai
from		tbl_t_nilai a
			join tbl_m_mahasiswa b
			on a.id_mahasiswa_fk = b.id_mahasiswa_pk
			join tbl_r_ujian c
			on a.id_ujian_fk = c.id_ujian_pk 
where		c.is_active = '1' and a.nilai > 80

--exam008 Buatlah query untuk menampilkan data jurusan yang mengandung kata 'sistem'.
select 		* 
from 		tbl_m_jurusan 
where 		lower(nama_jurusan) like '%sistem%';

--exam009 Buatlah query untuk menampilkan mahasiswa yang mengambil ujian lebih dari 1.
select 		b.nama_mahasiswa,
			count(c.nama_ujian) as jml_ujian
from		tbl_t_nilai a
			inner join tbl_m_mahasiswa b
			on a.id_mahasiswa_fk = b.id_mahasiswa_pk
			inner join tbl_r_ujian c 
			on a.id_ujian_fk = c.id_ujian_pk
group by 	b.nama_mahasiswa 
having 		count(b.nama_mahasiswa) > 1
			
--exam010 Buatlah query untuk menampilkan data seperti berikut:
		--Kode_Mahasiswa 	nama_mahasiswa		nama_jurusan		agama	nama_dosen 	 					status_jurusan  	deskripsi
		--M001				Budi Gunawan		Teknik Informatika	Islam	Prof. Dr. Retno Wahyuningsih	Aktif				Honorer
select 		a.kode_mahasiswa ,
			a.nama_mahasiswa,
			b.nama_jurusan,
			c.deskripsi as agama,
			d.nama_dosen,
			case 
				 when c.is_active = '1' then 'Aktif'
				 else 'Non-Aktif'
			end as status_jurusan,
			e.deskripsi
from 		tbl_m_mahasiswa a
			inner join tbl_m_jurusan b 
			on a.id_jurusan_fk  = b.id_jurusan_pk 
			inner join tbl_m_agama c 
			on a.id_agama_fk = c.id_agama_pk
			inner join tbl_m_dosen d 
			on b.id_jurusan_pk = d.id_jurusan_fk
			inner join tbl_m_type_dosen e
			on d.id_type_dosen_fk  = e.id_type_dosen_pk 
where 		a.id_mahasiswa_pk = 1

--exam011 Buatlah query untuk create view dengan menggunakan data pada no.10, beserta query untuk mengeksekusi view tersebut
create view vw_mahasiswa
as 
select 		a.kode_mahasiswa ,
			a.nama_mahasiswa,
			b.nama_jurusan,
			c.deskripsi as agama,
			d.nama_dosen,
			case 
				 when c.is_active = '1' then 'Aktif'
				 else 'Non-Aktif'
			end as status_jurusan,
			e.deskripsi
from 		tbl_m_mahasiswa a
			inner join tbl_m_jurusan b 
			on a.id_jurusan_fk  = b.id_jurusan_pk 
			inner join tbl_m_agama c 
			on a.id_agama_fk = c.id_agama_pk
			inner join tbl_m_dosen d 
			on b.id_jurusan_pk = d.id_jurusan_fk
			inner join tbl_m_type_dosen e
			on d.id_type_dosen_fk  = e.id_type_dosen_pk 
where 		a.id_mahasiswa_pk = 1

-- memanggil view 
select * from vw_mahasiswa

--exam012 Buatlah query untuk menampilkan data mahasiswa beserta nilainya (mahasiswa yang tidak punya nilai juga di tampilkan)
select 		a.nama_mahasiswa,
			c.nama_ujian,
			b.nilai
from		tbl_m_mahasiswa a
			left join tbl_t_nilai b
			on a.id_mahasiswa_pk = b.id_mahasiswa_fk 
			left join tbl_r_ujian c
			on b.id_ujian_fk  = c.id_ujian_pk 