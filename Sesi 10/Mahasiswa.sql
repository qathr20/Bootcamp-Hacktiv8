-- Adminer 4.8.1 MySQL 5.5.5-10.4.24-MariaDB dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

DROP TABLE IF EXISTS `tb_mahasiswa`;
CREATE TABLE `tb_mahasiswa` (
  `Nim` int(12) NOT NULL AUTO_INCREMENT,
  `Nama Mahsiswa` varchar(20) NOT NULL,
  `Alamat` varchar(20) NOT NULL,
  `Tgl_lahir` date NOT NULL,
  PRIMARY KEY (`Nim`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_mahasiswa` (`Nim`, `Nama Mahsiswa`, `Alamat`, `Tgl_lahir`) VALUES
(18034,	'Yoona',	'Seoul',	'2022-05-30'),
(18035,	'Daniel',	'Busan',	'2022-06-07'),
(18036,	'Krystal',	'California',	'2022-04-08'),
(18037,	'Suzy',	'Kanada',	'2022-03-12'),
(18038,	'Raffi',	'Malang',	'2022-06-27'),
(18039,	'Winter',	'Gresik',	'2022-09-11');

DROP TABLE IF EXISTS `tb_matakuliah`;
CREATE TABLE `tb_matakuliah` (
  `id_matakuliah` int(10) NOT NULL AUTO_INCREMENT,
  `nama_matakuliah` varchar(20) NOT NULL,
  `sks_matakuliah` int(10) NOT NULL,
  PRIMARY KEY (`id_matakuliah`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_matakuliah` (`id_matakuliah`, `nama_matakuliah`, `sks_matakuliah`) VALUES
(1,	'Bahasa Korea',	3),
(2,	'Bahasa Indonesia',	4),
(3,	'Bahasa India',	2),
(4,	'Bahasa Inggris',	4),
(5,	'Bahasa China',	3),
(6,	'Bahasa Jepang',	2);

DROP TABLE IF EXISTS `tb_nilai`;
CREATE TABLE `tb_nilai` (
  `id_matakuliah` int(10) NOT NULL,
  `Nim` int(12) NOT NULL,
  `nilai` int(11) NOT NULL,
  KEY `id_matakuliah` (`id_matakuliah`),
  KEY `Nim` (`Nim`),
  CONSTRAINT `tb_nilai_ibfk_1` FOREIGN KEY (`id_matakuliah`) REFERENCES `tb_matakuliah` (`id_matakuliah`),
  CONSTRAINT `tb_nilai_ibfk_2` FOREIGN KEY (`Nim`) REFERENCES `tb_mahasiswa` (`Nim`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_nilai` (`id_matakuliah`, `Nim`, `nilai`) VALUES
(1,	18034,	75),
(2,	18035,	80),
(3,	18036,	85),
(4,	18037,	90),
(1,	18034,	70);

-- 2022-06-22 14:33:30
