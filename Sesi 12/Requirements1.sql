-- Adminer 4.8.1 MySQL 5.5.5-10.4.24-MariaDB dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

DROP TABLE IF EXISTS `tb_album`;
CREATE TABLE `tb_album` (
  `tgl_copyright` date NOT NULL,
  `Format` varchar(5) NOT NULL,
  `id_album` int(10) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id_album`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_album` (`tgl_copyright`, `Format`, `id_album`) VALUES
('2022-06-20',	'CD',	1),
('2022-06-20',	'DVD',	2),
('2022-08-09',	'CM',	7),
('2021-07-08',	'CD',	8),
('2020-03-17',	'DVD',	9),
('2021-06-30',	'CD',	10);

DROP TABLE IF EXISTS `tb_detail_lagu_musisi`;
CREATE TABLE `tb_detail_lagu_musisi` (
  `id_lagu` int(10) NOT NULL,
  `id_lagu_musisi` int(10) NOT NULL AUTO_INCREMENT,
  `id_musisi` int(12) NOT NULL,
  PRIMARY KEY (`id_lagu_musisi`),
  KEY `id_lagu` (`id_lagu`),
  KEY `id_musisi` (`id_musisi`),
  CONSTRAINT `tb_detail_lagu_musisi_ibfk_1` FOREIGN KEY (`id_lagu`) REFERENCES `tb_lagu` (`id_lagu`),
  CONSTRAINT `tb_detail_lagu_musisi_ibfk_2` FOREIGN KEY (`id_lagu_musisi`) REFERENCES `tb_lagu` (`id_lagu`),
  CONSTRAINT `tb_detail_lagu_musisi_ibfk_3` FOREIGN KEY (`id_musisi`) REFERENCES `tb_musisi` (`id_musisi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_detail_lagu_musisi` (`id_lagu`, `id_lagu_musisi`, `id_musisi`) VALUES
(1,	1,	1),
(1,	2,	2),
(2,	3,	1),
(3,	10,	1);

DROP TABLE IF EXISTS `tb_gabung_musik`;
CREATE TABLE `tb_gabung_musik` (
  `id_gabung_musik` int(11) NOT NULL AUTO_INCREMENT,
  `id_musisi` int(12) NOT NULL,
  `id_instrumen` int(10) NOT NULL,
  PRIMARY KEY (`id_gabung_musik`),
  KEY `id_musisi` (`id_musisi`),
  KEY `id_instrumen` (`id_instrumen`),
  CONSTRAINT `tb_gabung_musik_ibfk_1` FOREIGN KEY (`id_musisi`) REFERENCES `tb_musisi` (`id_musisi`),
  CONSTRAINT `tb_gabung_musik_ibfk_2` FOREIGN KEY (`id_instrumen`) REFERENCES `tb_instrumen` (`id_instrumen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_gabung_musik` (`id_gabung_musik`, `id_musisi`, `id_instrumen`) VALUES
(1,	1,	1),
(2,	1,	2),
(3,	1,	3),
(4,	2,	1),
(5,	3,	2),
(6,	2,	3);

DROP TABLE IF EXISTS `tb_instrumen`;
CREATE TABLE `tb_instrumen` (
  `Nama_Musik` varchar(50) NOT NULL,
  `Kunci_Musik` char(5) NOT NULL,
  `id_instrumen` int(10) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id_instrumen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_instrumen` (`Nama_Musik`, `Kunci_Musik`, `id_instrumen`) VALUES
('Gitar',	'A',	1),
('Piano',	'C',	2),
('Drum',	'G',	3),
('Bass',	'B',	4);

DROP TABLE IF EXISTS `tb_lagu`;
CREATE TABLE `tb_lagu` (
  `Judul_lagu` varchar(50) NOT NULL,
  `Pengarang_lagu` varchar(20) NOT NULL,
  `id_lagu` int(10) NOT NULL AUTO_INCREMENT,
  `id_album` int(11) NOT NULL,
  PRIMARY KEY (`id_lagu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_lagu` (`Judul_lagu`, `Pengarang_lagu`, `id_lagu`, `id_album`) VALUES
('tralala',	'Ana',	1,	1),
('bye bye',	'Ani',	2,	2),
('Oh gg',	'Yoona',	3,	1);

DROP TABLE IF EXISTS `tb_musisi`;
CREATE TABLE `tb_musisi` (
  `ssn` int(10) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `no_tlp` int(12) NOT NULL,
  `id_musisi` int(12) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id_musisi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `tb_musisi` (`ssn`, `nama`, `alamat`, `no_tlp`, `id_musisi`) VALUES
(1,	'dhani',	'surabaya',	187,	1),
(2,	'Ariel',	'Bandung',	98,	2),
(3,	'Parto',	'Jakarta',	9898,	3),
(4,	'Taylor',	'Malang',	12345,	4),
(5,	'Selena',	'Bandung',	2346,	5),
(6,	'Billie',	'Nganjuk',	87961,	6),
(7,	'Justin',	'Kanada',	6789,	7),
(8,	'Zayn',	'Lampung',	45678,	8),
(9,	'Harry',	'Medan',	6543,	9),
(10,	'Daniel',	'Magelang',	7654,	10);

-- 2022-06-21 07:12:51
