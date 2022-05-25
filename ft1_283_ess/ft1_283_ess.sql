--01.Tampilkan fullname, jabatan, usia, 
--dan jumlah anak dari masing-masing karyawan saat ini (kalau tidak ada anak tulis 0 (nol) atau "-" saja)
select  concat(a.first_name, ' ',a.last_name) as fullname,
		d."name" as Jabatan,
		count(e.biodata_id) as jumlah_anak 
from biodata a
	 inner join employee b on a.id = b.biodata_id
	 inner join employee_position c on b.id = c.employee_id
	 inner join "position" d on c.position_id = d.id
	 left join "family" e on a.id = e.biodata_id 
--	 where e.status = 'Anak'
group by 1, 2
	 
--02.Tampilkan data biodata yang tidak memiliki posisi kepegawaian
select  concat(a.first_name, ' ',a.last_name) as fullname,
		a.dob as tanggal_lahir,
		a.pob as tempat_lahir,
		a.address,
		a.marital_status
from 	biodata a
		left join employee b on a.id = b.biodata_id 
where   b.id is null


--03.Tampilkan data karyawan beserta gaji yang bekerja pada tahun 2020
select  concat(a.first_name, ' ', a.last_name) as fullname, 
		a.dob as tanggal_lahir,
		a.pob as tempat_lahir,
		a.address,
		a.marital_status,
		b.salary,
		c."period" as tahun
from 	biodata a
		inner join employee b on a.id = b.biodata_id
		inner join employee_leave c on b.id = c.employee_id
		where c.period = '2020'
		
--04.Tampilkan nama-nama pelamar yang tidak diterima sebagai karyawan		
select  concat(a.first_name, ' ',a.last_name) as fullname,
		a.dob as tanggal_lahir,
		a.pob as tempat_lahir,
		a.address,
		a.marital_status 
from 	biodata a
		left join employee b on a.id = b.biodata_id 
where   b.id is null

--05.Hitung ada berapa karyawan yang lahir pada tahun 1991 dan 1992
select  a.first_name 
from 	biodata a
		inner join employee b on a.id = b.biodata_id
where	a.dob = date_part(dayofyear())    

--06.Tampilkan data seperti berikut,
	/*
	Nama Lengkap		Departemen
	
	Raya Indriyani		Sales
	Rere Wulandari		Human Resource
	*/
select 	concat(a.first_name, ' ', a.last_name) as Nama_Lengkap,
		b."name"  
from	biodata a
		where a.id = 1 or a.id = 2
from	department b
		where b.id = 2 or b.id = 3
		
--07.Tampilkan data karyawan yang lahir di Jakarta namun tidak tinggal di Jakarta
select  concat(a.first_name, ' ', a.last_name) as Nama_Lengkap,
		a.dob as tanggal_lahir,
		a.pob as tempat_lahir,
		a.address,
		a.marital_status
from	biodata a
		inner join employee b on a.id = b.biodata_id 
where 	a.pob like '%Jakarta%' and a.address not like '%Jakarta%'

--08.Berapakah jumlah masing-masing karyawan kontrak dan permanen
select  count(status)
from  	employee e
where status = 'Permanen' or status = 'Kontrak'
group by status 
 
--09.Tampilkan data biodata yang tempat lahir dan alamat tinggalnya berada di daerah yang sama
select	concat(a.first_name, ' ', a.last_name) as Nama_Lengkap,
		a.dob as tanggal_lahir,
		a.pob as lahir,
		a.address 
from 	biodata a
where 	a.address  like '%Semerbak%' and a.pob like '%Jakarta%'

--Buatlah kolom ID sebagai primary key pada table biodata
ALTER TABLE public.biodata 
ADD ID int primary key GENERATED ALWAYS AS IDENTITY;

