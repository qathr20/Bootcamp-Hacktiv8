-- Adminer 4.8.1 MySQL 5.5.5-10.4.24-MariaDB dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `DNumber` int(11) NOT NULL,
  `DName` varchar(15) NOT NULL,
  `MgrSSN` char(9) NOT NULL,
  `MgrStartDate` date DEFAULT NULL,
  PRIMARY KEY (`DNumber`),
  UNIQUE KEY `Dept_DName_Unique` (`DName`),
  KEY `Dept_MgrSSN_FK` (`MgrSSN`),
  CONSTRAINT `Dept_MgrSSN_FK` FOREIGN KEY (`MgrSSN`) REFERENCES `employee` (`SSN`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `department` (`DNumber`, `DName`, `MgrSSN`, `MgrStartDate`) VALUES
(1,	'Produksi',	'E01',	'2010-01-01'),
(2,	'HRD',	'E02',	'2011-02-02'),
(3,	'Sales & Marketi',	'E03',	'2012-03-03'),
(4,	'IT',	'E04',	'2013-04-04'),
(5,	'Keuangan',	'E05',	'2014-05-05'),
(6,	'Jaminan Kualita',	'E06',	'2015-06-06'),
(7,	'Riset',	'E07',	'2016-07-07');

DROP TABLE IF EXISTS `dependent`;
CREATE TABLE `dependent` (
  `ESSN` char(9) NOT NULL,
  `Dependent_Name` varchar(15) NOT NULL,
  `Sex` char(1) DEFAULT NULL,
  `BDate` date DEFAULT NULL,
  `Relationship` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`ESSN`,`Dependent_Name`),
  CONSTRAINT `Dependent_ESSN_FK` FOREIGN KEY (`ESSN`) REFERENCES `employee` (`SSN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `dependent` (`ESSN`, `Dependent_Name`, `Sex`, `BDate`, `Relationship`) VALUES
('E01',	'Zio',	'L',	NULL,	'anak'),
('E02',	'Rasya',	'L',	NULL,	'Anak'),
('E03',	'Riffa',	'P',	NULL,	'Istri'),
('E04',	'Justin',	'L',	NULL,	'Suami'),
('E05',	'Markus',	'L',	NULL,	'anak'),
('E06',	'Kevin',	'L',	NULL,	'Suami'),
('E07',	'Garda',	'L',	NULL,	'Suami'),
('E08',	'Raisa',	'P',	NULL,	'Istri'),
('E09',	'Nada',	'P',	NULL,	'Istri'),
('E10',	'Shena',	'P',	NULL,	'Anak');

DROP TABLE IF EXISTS `dept_locations`;
CREATE TABLE `dept_locations` (
  `DNum` int(11) NOT NULL,
  `DLocation` varchar(15) NOT NULL,
  PRIMARY KEY (`DNum`,`DLocation`),
  CONSTRAINT `DLoc_DNum_FK` FOREIGN KEY (`DNum`) REFERENCES `department` (`DNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `dept_locations` (`DNum`, `DLocation`) VALUES
(1,	'Cagar Budaya'),
(2,	'Cagar Alam'),
(3,	'Cagar Seni'),
(4,	'Cagar Selo'),
(5,	'Cagar Satwa'),
(6,	'Cagar Arjuna'),
(7,	'Cagar Khatulist');

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `SSN` char(9) NOT NULL,
  `FName` varchar(15) NOT NULL,
  `MName` char(1) DEFAULT NULL,
  `LName` varchar(15) NOT NULL,
  `BDate` date DEFAULT NULL,
  `Address` varchar(30) DEFAULT NULL,
  `Sex` char(1) DEFAULT NULL,
  `Salary` decimal(10,2) DEFAULT NULL,
  `SuperSSN` char(9) DEFAULT NULL,
  `DNum` int(11) NOT NULL,
  PRIMARY KEY (`SSN`),
  KEY `Employee_SuperSSN_FK` (`SuperSSN`),
  CONSTRAINT `Employee_SuperSSN_FK` FOREIGN KEY (`SuperSSN`) REFERENCES `employee` (`SSN`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `employee` (`SSN`, `FName`, `MName`, `LName`, `BDate`, `Address`, `Sex`, `Salary`, `SuperSSN`, `DNum`) VALUES
('E01',	'Daniel',	NULL,	'Kang',	NULL,	'Malang',	'L',	3500000.00,	NULL,	1),
('E02',	'Fatur',	NULL,	'Samudra',	NULL,	NULL,	'L',	4000000.00,	NULL,	2),
('E03',	'Raffi',	NULL,	'Motret',	NULL,	'Bandung',	'L',	5000000.00,	NULL,	3),
('E04',	'Rona',	NULL,	'Melati',	NULL,	'Surabaya',	'P',	3500000.00,	NULL,	4),
('E05',	'Agung',	NULL,	'Jaya',	NULL,	'Banten',	'L',	6000000.00,	NULL,	5),
('E06',	'Adin',	NULL,	'Dara',	NULL,	'Bogor',	'P',	4500000.00,	NULL,	6),
('E07',	'Nei',	NULL,	'Salma',	NULL,	'Bekasi',	'P',	3500000.00,	NULL,	7),
('E08',	'Revan',	NULL,	'Jovan',	NULL,	'Bengkulu',	'L',	500000.00,	NULL,	8),
('E09',	'Rozan',	NULL,	'Malik',	NULL,	'Jogja',	'L',	3000000.00,	NULL,	9),
('E10',	'Yoona',	NULL,	'Lim',	NULL,	'Sidoarjo',	'P',	4500000.00,	NULL,	10);

DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `PNumber` int(11) NOT NULL,
  `PName` varchar(15) NOT NULL,
  `PLocation` varchar(15) DEFAULT NULL,
  `DNum` int(11) NOT NULL,
  PRIMARY KEY (`PNumber`),
  UNIQUE KEY `Project_PName_Unique` (`PName`),
  KEY `Project_DNum_FK` (`DNum`),
  CONSTRAINT `Project_DNum_FK` FOREIGN KEY (`DNum`) REFERENCES `department` (`DNumber`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `project` (`PNumber`, `PName`, `PLocation`, `DNum`) VALUES
(1,	'Lalala',	'Bandung',	1),
(2,	'Yeyeye',	'Bogor',	2),
(3,	'Dubidu',	'Bekasi',	3),
(4,	'Tralala',	'Medan',	4),
(5,	'Doremi',	'Malang',	5),
(6,	'Abcde',	'Surabaya',	6),
(7,	'Huhuhaha',	'Jakarta',	7);

DROP TABLE IF EXISTS `works_on`;
CREATE TABLE `works_on` (
  `ESSN` char(9) NOT NULL,
  `PNum` int(11) NOT NULL,
  `Hours` decimal(3,1) NOT NULL,
  PRIMARY KEY (`ESSN`,`PNum`),
  KEY `Works_PNum_FK` (`PNum`),
  CONSTRAINT `Works_ESSN_FK` FOREIGN KEY (`ESSN`) REFERENCES `employee` (`SSN`) ON DELETE CASCADE,
  CONSTRAINT `Works_PNum_FK` FOREIGN KEY (`PNum`) REFERENCES `project` (`PNumber`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `works_on` (`ESSN`, `PNum`, `Hours`) VALUES
('E01',	1,	80.0),
('E02',	1,	90.0),
('E03',	2,	70.0),
('E03',	7,	89.0),
('E04',	2,	78.0),
('E05',	3,	89.0),
('E05',	4,	69.0),
('E06',	2,	79.0),
('E06',	4,	90.0),
('E07',	6,	98.0),
('E08',	4,	78.0),
('E09',	5,	86.0),
('E10',	2,	56.0),
('E10',	6,	56.0);

-- 2022-06-26 07:10:24
