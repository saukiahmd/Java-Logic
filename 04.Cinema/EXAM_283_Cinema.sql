--1	urutkan nama film dan nominasi dari nominasi yg terbesar
select 	nama_film,
		nominasi
from 	tbl_t_film
		order by nama_film, nominasi desc;

--2	tampilkan nama film dan nominasi yg paling banyak mendapatkan nominasi
select 	nama_film,
		nominasi
from 	tbl_t_film
where 	nominasi = (
	 select	 	max(nominasi)
	 from 		tbl_t_film
	 )
	 
--3	tampilkan nama film dan nominasi yg tidak dapat nominasi
select 	nama_film,
		nominasi
from	tbl_t_film
where 	nominasi = 0;

--4	tampilkan nama film dan pendapatan dari yg terkecil
select	nama_film,
		pendapatan
from 	tbl_t_film
		order by pendapatan asc;

--5	tampilkan nama film dan pendapatan yg terbesar
select 	nama_film,
		pendapatan
from 	tbl_t_film
where 	pendapatan = (
	 select	 	max(pendapatan)
	 from 		tbl_t_film
	 )

--6	tampikan nama film dan pendapatan yg terkecil
select 	nama_film,
		pendapatan
from 	tbl_t_film
where 	pendapatan = (
	 select	 	min(pendapatan)
	 from 		tbl_t_film
	 )
	 
--7	tampilkan rata2 pendapatan film keseluruhan
select 	cast(avg(pendapatan) as decimal(18,2)) as rata_rata
from 	tbl_t_film
	 
--8	tampilkan rata2 nominasi film keseluruhan
select 	cast(avg(nominasi) as integer) as rata_rata
from	tbl_t_film

--9	tampilkan nama film yg huruf depannya 'p'
select 	nama_film
from 	tbl_t_film
where	lower(nama_film) like 'p%';

--10 tampilkan nama film yg huruf terakhirnya 'h'
select	nama_film 
from 	tbl_t_film
where 	lower(nama_film) like '%h';

--11 tampilkan nama film yang mengandung huruf 'd'
select	nama_film 
from 	tbl_t_film
where 	lower(nama_film) like '%d%'; 

--12	tampilkan nama film dengan pendapatan terbesar yg mengandung huruf 'o'
select 	nama_film,
		pendapatan
from 	tbl_t_film
where 	pendapatan = (
	 select	 	max(pendapatan)
	 from 		tbl_t_film
	 )and lower(nama_film) like '%o%'

--13	tampilkan nama film dengan pendapatan terkecil yg mengandung huruf 'o'
select 	nama_film,
		pendapatan
from 	tbl_t_film
where 	pendapatan = (
	 select	 	min(pendapatan)
	 from 		tbl_t_film
	 )and lower(nama_film) like '%o%'

	 
--14	tampilkan nama film dan artisnya
select 	a.nama_film,
		b.nama_artis
from 	tbl_t_film a
		inner join tbl_m_artis b
		on a.id_artis_fk = b.id_artis_pk;
	
--15	tampilkan film yg artisnya berasal dari negara hong kong
select 	a.nama_film,
		b.nama_artis,
		c.nama_negara
from 	tbl_t_film a
		inner join tbl_m_artis b 
		on a.id_artis_fk = b.id_artis_pk 
		inner join tbl_m_negara c
		on b.id_negara_fk = c.id_negara_pk
where 	lower(c.nama_negara) like 'hong kong'

--16	tampilkan nama film yg artisnya bukan berasal dr negara 
--		yg tidak mengandung huruf 'o'
select 	nama_film,
		nama_artis,
		nama_negara
from 	tbl_t_film a
		inner join tbl_m_artis b 
		on a.id_artis_fk = b.id_artis_pk 
		inner join tbl_m_negara c
		on b.id_negara_fk = c.id_negara_pk
where 	lower(nama_negara) like '%o%';

select  id_negara_pk
from 	tbl_m_negara
where 	lower(nama_negara) not like '%o%';

select  b.nama_film,
		a.nama_artis		
from 	tbl_m_artis a
		inner join tbl_t_film b on a.id_artis_pk = b.id_artis_fk  
where 	a.id_negara_fk not in (
								select  id_negara_pk
								from 	tbl_m_negara
								where 	lower(nama_negara) not like '%o%'
							);

--17	tampilkan nama film dan artis yg memiliki award terbanyak
select 	a.nama_film,
		b.nama_artis,
		b.award 
from 	tbl_t_film a
		inner join tbl_m_artis b 
		on a.id_artis_fk = b.id_artis_pk
where 	award = (
	 select	 	max(award)
	 from 		tbl_m_artis
	 )
	 

--18	tampilkan nama film dengan artis bayaran terendah
select 	a.nama_film,
		b.nama_artis,
		b.bayaran 
from 	tbl_t_film a
		inner join tbl_m_artis b 
		on a.id_artis_fk = b.id_artis_pk
where 	bayaran = (
	 select	 	min(bayaran)
	 from 		tbl_m_artis
	 )
	 
--19	tampilkan nama artis yg tidak pernah bermain film
select 	a.nama_artis
from	tbl_m_artis a
		left join tbl_t_film b on a.id_artis_pk = b.id_artis_fk  
where   nama_film is null; 

--20	tampilkan nama artis yg paling banyak bermain film
select		a.nama_artis,
			count(b.id_artis_fk) as jumlah_film
from 		tbl_m_artis a 
			inner join tbl_t_film b on a.id_artis_pk = b.id_artis_fk
group by	a.nama_artis 
having count(b.id_artis_fk) = (
								select 		max(t1.jumlah)
								from		(
												select 		a.nama_artis,
												count(b.id_artis_fk) as jumlah
												from 		tbl_m_artis a
															inner join tbl_t_film b on a.id_artis_pk = b.id_artis_fk
												group by	a.nama_artis
											) t1
								)
			

--21	tampilkan nama artis yg bermain film dengan genre drama
select  nama_artis,
		nama_genre
from 	tbl_m_artis a
		inner join tbl_t_film b on a.id_artis_pk = b.id_artis_fk
		inner join tbl_m_genre c on b.id_genre_fk = c.id_genre_pk 
where 	id_genre_fk = 4

--22	tampilkan nama artis yg bermain film dengan genre horror
select  nama_artis,
		nama_genre
from 	tbl_m_artis a
		inner join tbl_t_film b on a.id_artis_pk = b.id_artis_fk
		inner join tbl_m_genre c on b.id_genre_fk = c.id_genre_pk 
where 	id_genre_fk = 2


--23	tampilkan nama film yg dibintangi oleh artis yg huruf depannya 'j'
select  a.nama_film,
		b.nama_artis
from	tbl_t_film a
		inner join tbl_m_artis b on a.id_artis_fk = b.id_artis_pk 
where   lower(b.nama_artis) like 'j%'

--24	tampilkan negara mana yg paling banyak filmnya

--25	tampilkan data negara dengan jumlah filmnya

--26	tampilkan nama produser yg skalanya international
select  nama_produser,
		case 
			 when international = '1' then 'Ya'
			 when international = '0' then 'Tidak'
		end as status_international
from 	tbl_m_produser
where 	international = '1'

--27	tampilkan berapa data produser yg berskala international
select  count(international) as total_data
from 	tbl_m_produser
where 	international = '1'

--28	tampilkan jumlah film dr masing2 produser
select	a.nama_produser,
		b.nama_film
from	tbl_m_produser a
		inner join tbl_t_film b on a.id_produser_pk = b.id_produser_fk
		
--29	tampilkan jumlah nominasi dari masing2 produser
select	a.nama_produser,
		b.nama_film,
		b.nominasi
from	tbl_m_produser a
		inner join tbl_t_film b on a.id_produser_pk = b.id_produser_fk
		
--30	tampilkan jumlah pendapatan produser marvel secara keseluruhan

--31	tampilkan jumlah pendapatan produser yg skalanya tidak international
select	a.nama_produser,
		b.pendapatan,
		case 
			 when international = '1' then 'Ya'
			 when international = '0' then 'Tidak'
		end as status_international
from	tbl_m_produser a
		inner join tbl_t_film b on a.id_produser_pk = b.id_produser_fk 
where   international = '0'		
		
--32	tampilkan produser yg tidak punya film
select 	a.nama_produser
from	tbl_m_produser a
		left join tbl_t_film b on a.id_produser_pk = b.id_produser_fk  
where   nama_film is null; 

--33	tampilkan produser film yg memilik artis termahal
select 	a.nama_produser,
		c.nama_artis,
		c.bayaran 
from 	tbl_m_produser a
		inner join tbl_t_film b on a.id_produser_pk = b.id_produser_fk
		inner join tbl_m_artis c on b.id_artis_fk = c.id_artis_pk
where 	bayaran = (
	 select	 	max(bayaran)
	 from 		tbl_m_artis
	 )



--34	tampilkan produser yg memiliki banyak artis

--35	tampilkan produser yg memliki sedikit artis

--36	buat view menampilkan nama film, nama genre, nama artis dan nama produser dan  negaranya
	--	create view vw_namaview
