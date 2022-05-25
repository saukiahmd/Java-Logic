
insert into tbl_m_genre (kode_genre, nama_genre, created_by, created_date) values
	('G001', 'ACTION', 'sauki', current_timestamp),
	('G002', 'HORROR', 'sauki', current_timestamp),
	('G003', 'COMEDY', 'sauki', current_timestamp),
	('GOO4', 'DRAMA', 'sauki', current_timestamp),
	('G005', 'THRILLER', 'sauki', current_timestamp),
	('G006', 'FICTION', 'sauki', current_timestamp)
	
update 		tbl_m_genre
set 		kode_genre = 'G004'
where 		id_genre_pk = 4

insert into tbl_m_negara (kode_negara, nama_negara, created_by, created_date) values 
	('AS', 'AMERIKA SERIKA', 'sauki', current_timestamp),
	('HK', 'HONG KONG', 'sauki', current_timestamp),
	('ID', 'INDONESIA', 'sauki', current_timestamp),
	('IN', 'INDIA', 'sauki', current_timestamp)
	
insert into tbl_m_produser (kode_produser, nama_produser, international, created_by, created_date) values 
	('PD01', 'MARVEL', '1', 'sauki', current_timestamp),
	('PD02', 'HONG KONG CINEMA', '1', 'sauki', current_timestamp),
	('PD03', 'RAPI FILM', '0', 'sauki', current_timestamp),
	('PD04', 'PARKIT FILM', '0', 'sauki', current_timestamp),
	('PD05', 'PARAMOUNT PICTURE', '1', 'sauki', current_timestamp)
	
insert into tbl_m_artis (kode_artis, nama_artis, jenis_kelamin, bayaran, award, id_negara_fk, created_by, created_date) values 
	('A001', 'ROBERT DOWNEY JR', 'L', 1000000000, 2, 1, 'sauki', current_timestamp),
	('A002', 'ANGELINA JOLIE', 'P', 700000000, 1, 1, 'sauki', current_timestamp),
	('A003', 'JACKIE CHAN', 'L', 1200000000, 7, 2, 'sauki', current_timestamp),
	('A004', 'JOE TASLIM', 'L', 350000000, 1, 3, 'sauki', current_timestamp),
	('A005', 'CHELSEA ISLAN', 'P', 300000000, 0, 3, 'sauki', current_timestamp)
	
insert into tbl_t_film (kode_film, nama_film, id_genre_fk, id_artis_fk, id_produser_fk, pendapatan, nominasi, created_by, created_date) values 
	('F001', 'IRON MAN', 1, 1, 1, 2000000000, 3, 'sauki', current_timestamp),
	('F002', 'IRON MAN 2', 1, 1, 1, 1800000000, 2, 'sauki', current_timestamp),
	('F003', 'IRON MAN 3', 1, 1, 1, 1200000000, 0, 'sauki', current_timestamp),
	('F004', 'AVENGER : CIVIL WAR', 1, 1, 1, 2000000000, 1, 'sauki', current_timestamp),
	('F005', 'SPIDERMAN HOME COMING', 1, 1, 1, 1300000000, 0, 'sauki', current_timestamp),
	('F006', 'THE RAID', 1, 4, 3, 800000000, 5, 'sauki', current_timestamp),
	('F007', 'FAST & FURIOUS', 1, 4, 5, 830000000, 2, 'sauki', current_timestamp),
	('F008', 'HABIBIE DAN AINUN', 4, 5, 3, 670000000, 4, 'sauki', current_timestamp),
	('F009', 'POLICE STORY', 1, 3, 2, 700000000, 3, 'sauki', current_timestamp),
	('F010', 'POLICE STORY 2', 1, 3, 2, 710000000, 1, 'sauki', current_timestamp),
	('F011', 'POLICE STORY 3', 1, 3, 2, 615000000, 0, 'sauki', current_timestamp),
	('F012', 'RUSH HOUR', 3, 3, 5, 695000000, 2, 'sauki', current_timestamp),
	('F013', 'KUNGFU PANDA', 3, 3, 5, 923000000, 5, 'sauki', current_timestamp)