--1. Tampilkan employee id, fullname, salary_lama, dan salary_baru. 
--   Dimana salary baru itu sebesar 10% dari salary lama dan ditampilkan dengan kolom alias Gaji Baru
select  	b.id,
			concat(a.first_name, a.last_name) as fullname,
			b.salary as salary_lama,
			(b.salary*10/100)+b.salary as gaji_baru 
from		biodata a
			inner join employee b on b.biodata_id = a.id 
			group by (b.id, a.first_name, a.last_name, b.salary);

--2. Buatkan query untuk menampilkan data karyawan yang belum pernah melakukan perjalanan dinas
select  	concat(a.first_name, ' ', a.last_name) as nama_lengkap,
			a.dob,
			a.pob,
			a.address
from		biodata a
			inner join employee b on b.biodata_id = a.id
			left join travel_request c on c.employee_id = b.biodata_id
			where c.employee_id is null;


--3. Tampilkan nama lengkap karyawan, jenis cuti, alasan cuti, durasi cuti, 
--	 dan nomor telepon yang bisa dihubungi untuk masing-masing karyawan yang mengajukan cuti
select 		concat(a.first_name, ' ', a.last_name) as nama_lengkap,
	   		e.type,
	   		c.reason,
	   		(c.end_date-c.start_date) +1 as durasi_cuti,
	   		d.type,
	   		string_agg(d.contact, ', ') as no_telp -- row menjadi 1 string
from   		biodata a
	   		inner join employee b 		on b.biodata_id = a.id 
	   		inner join leave_request c  on c.employee_id = b.biodata_id
	   		inner join contact_person d on d.biodata_id = a.id
	   		inner join leave e 			on e.id = c.leave_id
where 		d.type like '%PHONE%'
		  	group by 1, 2, 3, 4, 5 -- urutan kolom

--4. Tampilkan nama-nama pelamar yang tidak diterima sebagai karyawan
select  	concat(a.first_name, ' ', a.last_name) as fullname 
from 		biodata a
			left join employee b 		on b.biodata_id = a.id  
where 		b.biodata_id is null

--5. Buatlah table position dengan kolom id (int & primary key), name (varchar(50))
CREATE TABLE public.position (
	id 		integer primary key generated always as identity,
	name 	varchar(50)
);

--6. Isi data di table position sebagai berikut Direktur, General Manager, Manager, Staff
insert 
into public.position 
	(name) 
values	
	('Direktur'),
	('General Manager'),
	('Manager'),
	('Staff')

--7. Buatlah table referensi position dengan employ dan 
-- 	 berikan nama table "employee_position serta kolom id (int & primary key), employee_id (int), position_id (int)
CREATE TABLE public.employee_position (
	id 				integer primary key generated always as identity,
	employee_id 	int,
	position_id 	int
);
	
--8. Isi data di table employee_position dengan 
--   data sebagai berikut : Rere sebagai staff. Raya sebagai general manager, Cintya sebagai Manager
insert 
into public.employee_position 
	(employee_id, 
	 position_id) 
values	
	(2, 4),
	(1, 2),
	(4, 3)


--9. buatlah index untuk kolom nama depan, nama belakang.
CREATE INDEX index_nama_depan ON public.biodata (first_name);
CREATE INDEX index_nama_belakang ON public.biodata (last_name);

--10. Tampilkan fullname, salary ditambah 20% kenaikan salary khusus untuk staff dan manager
select  	concat(a.first_name, a.last_name) as fullname,
			b.salary as salary_lama,
			(b.salary*20/100)+b.salary as total_kenaikan_gaji,
			d.name
from		biodata a
			inner join employee b 			on b.biodata_id = a.id 
			inner join employee_position c  on c.employee_id = b.biodata_id
			inner join position d 			on d.id = c.position_id
where 		d.name = 'Manager' or d.name = 'Staff'
			group by 1, 2, 3, 4 
	
--11. Tampilkan nama karyawan, jenis perjalanan dinas, tanggal perjalanan dinas, 
--	 dan total pengeluarannya selama perjalanan dinas tersebut
select  	concat(a.first_name, ' ', a.last_name),
			e.name,
			c.start_date,
			c.end_date,
			sum(d.item_cost) + e.travel_fee as total_pengeluaran
from		biodata a
			inner join employee b 			on a.id = b.biodata_id
			inner join travel_request c 	on c.employee_id = b.biodata_id
			inner join travel_settlement d 	on d.travel_request_id = c.id 
			inner join travel_type e 		on e.id = c.travel_type_id
			group by 1, 2, 3, 4, e.travel_fee 
		
--12. Tampilkan data karyawan yang sudah menikah dan memiliki anak lebih dari 1
--skip

--13. Tampilkan data lengkap karyawan permanen yang mendapatkan gaji dibawah 13 juta dan di atas 15 juta
select  	concat(a.first_name,' ' , a.last_name) as fullname,
			a.dob,
			a.pob,
			a.address,
			b.status,
			b.salary
from		biodata a
			inner join employee b 			on a.id = b.biodata_id 
where 		b.status like '%Permanen%' and b.salary < 13000000 or b.salary > 15000000;

--14. Tampilkan alasan cuti yang paling sering diajukan karyawan
select 	a.reason,
		count(a.reason) as jumlah
from	leave_request a
		group by 1
having	count(a.reason) = ( select max(t1.jumlah)
							from ( select count(reason) as jumlah
								   from leave_request
								   group by reason)t1
						   )
		
	
--15. Tampilkan nama lengkap karyawan, posisinya dan total kuota cuti reguler yang pernah didapatkan
select  	concat(a.first_name, ' ', a.last_name),
			d.name,
			sum(e.regular_quota) as total
from 		biodata a
			left join employee b 			on b.biodata_id = a.id
			left join employee_position c   on c.employee_id = b.biodata_id
			inner join position d 			on d.id = c.position_id
			inner join employee_leave e 	on b.biodata_id  = e.employee_id 
			group by (a.first_name, a.last_name,d.name, e.regular_quota)