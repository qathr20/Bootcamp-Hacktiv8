sesi 10;

utk jalankan xampp phpmyadmin dan adminer
1. Install xampp dan download adminer, link dibawah:
   xampp : https://www.apachefriends.org/download.html
   adminer : https://www.adminer.org/ , pilih adminer 4.8.1(php)
2. Di folder xampp buka folder PhpMyAdmin terus buka file config.inc.php atau jika mau cepat copy path dibawah.
   C:\xampp\phpMyAdmin\config.inc.php
3. Ganti file di line 19 menjadi copy atau copy code ini : $cfg['Servers'][$i]['auth_type'] = 'cookie';
4. Note: File adminer 4.8.1 di rename saja menjadi adminer biar lebih mudah.
5. Terus file adminer di copy ke folder htdocs, path : C:\xampp\htdocs
6. Kemudian buka xampp di chrome : localhost/phpmyadmin
7. di username dibuat id : root , terus login
8. Change password username dan password, biar simpel buat username : root, pass: root
9. Kemudian buka adminer, localhost/adminer
10. Login pakai username dan pass xampp sebelumnya
11. Jika bisa selamat anda berhasil ke tahap selanjutnya


-----------
1. Create database h8_siakad / db_siakad / bfi_siakad
2. Create table tb_mahasiswa / mahasiswa
3. Create field (sesuaikan struktur table)
	> tabel mahasiswa
		id > pk (primary key), type data int  (11)big/int (21), auto increment (yg di db insialisasi primary key nya ID) (kalau di dlm coding, primary key nya nim bkn id), yg di join biasa nya id. (buat ngebantu ngambil identitas)
		nim(nomor induk mahasiswa) type data string (255) / 50 /100
		email (Unik)
		nama_mahasiswa		
		jenis_kelamin > string/varchar 50 / 2 > value data (P,L) . Perempuan/Laki laki (tidak dikecualikan)
					enum(P,L) / Perempuan/Laki-laki > jika diisi "yang lainnya" > ini tidak bisa (sudah dikecualikan)
					int (2) > 0,1 > comment 0=laki-laki, 1=perempuan
4. Insert record / insert data mahasiswa


==================================================================

Config GUI
1. Sesuai modul
2. create table > id > im > email > nama_mahasiswa > jenis_kelamin
3.Database > folder table
4. 
5. insert into tb_mahasiswa value
6. ga pakai public

contoh auto increment :
insert into tb_mahasiswa(nim, email, nama_mahasiswa, jenkel) values("123","arif@gmail.com","Laki-Laki");

yg ini di definisikan berdasarkan last id, cth 5 yg terakhir > (di dalam record/data)
insert into tb_mahasiswa(nim, email, nama_mahasiswa, jenkel) values(1,"123","arif@gmail.com","Laki-Laki");

Lebih simpel
insert into tb_mahasiswa values