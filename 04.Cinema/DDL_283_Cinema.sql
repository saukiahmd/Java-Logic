
create table tbl_m_genre (
	id_genre_pk 	integer primary key generated always as identity,
	kode_genre		char(5) not null,
	nama_genre		varchar(50) not null,
	is_active		bit default '1',
	created_by		varchar(30) not null,
	created_date	timestamp not null,
	update_by		varchar(30),
	update_date		timestamp
)

create table tbl_m_negara (
	id_negara_pk	integer primary key generated always as identity,
	kode_negara		char(4) not null,
	nama_negara		varchar(30) not null,
	is_active 		bit default '1',
	created_by		varchar(30) not null,
	created_date	timestamp not null,
	update_by		varchar(30),
	update_date		timestamp
)

create table tbl_m_produser (
	id_produser_pk	integer primary key generated always as identity,
	kode_produser	char(5) not null,
	nama_produser	varchar(50) not null,
	international	bit not null,
	is_active 		bit default '1',
	created_by		varchar(30) not null,
	created_date	timestamp not null,
	update_by		varchar(30),
	update_date		timestamp
)

create table tbl_m_artis (
	id_artis_pk		integer primary key generated always as identity,
	kode_artis		char(5) not null,
	nama_artis		varchar(30) not null,
	jenis_kelamin	varchar(1) not null,
	bayaran			decimal(18,2) not null,
	award			smallint default '0',
	id_negara_fk	int not null,
	is_active		bit default '1',
	created_by		varchar(30) not null,
	created_date	timestamp not null,
	update_by		varchar(30),
	update_date		timestamp
)

create table tbl_t_film (
	id_film_pk		integer primary key generated always as identity,
	kode_film		char(5) not null,
	nama_film		varchar(50) not null,
	id_genre_fk		int not null,
	id_artis_fk		int not null,
	id_produser_fk	int not null,
	pendapatan		decimal(18,2) not null,
	nominasi		smallint default 0,
	is_active 		bit default '1',
	created_by		varchar(30) not null,
	created_date	timestamp not null,
	update_by		varchar(30),
	update_date		timestamp
)

