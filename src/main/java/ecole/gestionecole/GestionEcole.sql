DROP TABLE IF EXISTS `schoolinfo`;
CREATE TABLE IF NOT EXISTS `schoolinfo` (
  `SchoolName` varchar(80) DEFAULT NULL,
  `SchoolAddress` varchar(80) DEFAULT NULL,
  `classAvailable` varchar(20) DEFAULT NULL,
  `schoolType` varchar(50) DEFAULT NULL,
  `deoDivision` varchar(50) DEFAULT NULL,
  `municpalCouncil` varchar(50) DEFAULT NULL,
  `policeArea` varchar(50) NOT NULL,
  `postalCode` varchar(10) NOT NULL,
  `gsDivision` varchar(50) NOT NULL,
  `eduZone` varchar(50) NOT NULL,
  `eduDistrict` varchar(50) NOT NULL,
  `adminDistrict` varchar(50) NOT NULL,
  `electorate` varchar(30) NOT NULL,
  `dateOfEstd` date DEFAULT NULL,
  `schoolID` varchar(30) NOT NULL,
  `schoolCensus` varchar(40) NOT NULL,
  `schoolExamId` varchar(30) NOT NULL,
  `totalLandArea` varchar(30) NOT NULL,
  `province` varchar(30) NOT NULL,
  `nameOfPrincipal` varchar(30) NOT NULL,
  `pricipalNo` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

INSERT INTO `schoolinfo` (`SchoolName`, `SchoolAddress`, `classAvailable`, `schoolType`, `deoDivision`, `municpalCouncil`, `policeArea`, `postalCode`, `gsDivision`, `eduZone`, `eduDistrict`, `adminDistrict`, `electorate`, `dateOfEstd`, `schoolID`, `schoolCensus`, `schoolExamId`, `totalLandArea`, `province`, `nameOfPrincipal`, `pricipalNo`) VALUES
('ENSA Marrakech', 'BP 575 Bd Abdelkrim Al Khattabi', '12', 'Engineering School', 'Marrakech', 'Marraekch', 'MArrakech', '32314', 'Marrakech', 'Marrakech', 'Uca university', 'MArrakech', '120', '2000-10-13', '12313', '43525', '34142', '1 Acres', 'Marrakech', 'Mohamed Ait fdil', '0524434745');

DROP TABLE IF EXISTS `students`;
CREATE TABLE IF NOT EXISTS `students` (
  `adNo` int(11) NOT NULL,
  `fullName` varchar(100) DEFAULT NULL,
  `name` varchar(50) NOT NULL,
  `dob` date DEFAULT NULL,
  `doa` date DEFAULT NULL,
  `gender` varchar(15) DEFAULT NULL,
  `grade` varchar(15) DEFAULT NULL,
  `parentName` varchar(60) DEFAULT NULL,
  `nic` char(10) DEFAULT NULL,
  `phone` varchar(13) DEFAULT NULL,
  `address` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`adNo`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
INSERT INTO `students` (`adNo`, `fullName`, `name`, `dob`, `doa`, `gender`, `grade`, `parentName`, `nic`, `phone`, `address`) VALUES (1000, 'Mohamed Ait salman', 'Ait salman', '1998-10-12', '2012-09-23', 'Male', 'Grade 5', 'Brahim', 'C101384600', '0756009284', 'Marrakech'),
(1100, 'Mohamed Ait Brahim', 'Ait Brahim', '1998-10-12', '2012-09-23', 'Male', 'Grade 4', 'Brahim', 'C101384602', '0756009284', 'Agadir'),
(1020, 'Youssef Youssef', 'Ait salman', '1998-10-12', '2012-09-23', 'Male', 'Grade 4', 'Brahim', 'C101334600', '0756009284', 'Marrakech'),
(1222, 'Ahmed Ahmed', 'Ait salman', '1998-10-12', '2012-09-23', 'Male', 'Grade 3', 'Brahim', 'C101384600', '0756009284', 'Marrakech'),
(1300, 'Ayoub Hamzaoui', 'Hamzaoui', '1998-10-12', '2012-09-23', 'Male', 'Grade 1', 'Brahim', 'C101384600', '0756009284', 'Marrakech');

DROP TABLE IF EXISTS `grades`;
CREATE TABLE IF NOT EXISTS `grades` (
  `gradeId` int(10) NOT NULL,
  `grade` varchar(30) NOT NULL,
  `noOfStudents` int(100) DEFAULT NULL,
  PRIMARY KEY (`gradeId`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

INSERT INTO `grades` (`gradeId`, `grade`, `noOfStudents`) VALUES
(1, 'Grade 1', NULL),
(2, 'Grade 2', NULL),
(3, 'Grade 3', NULL),
(4, 'Grade 4', NULL),
(5, 'Grade 5', NULL);



DROP TABLE IF EXISTS `paststudents`;
CREATE TABLE IF NOT EXISTS `paststudents` (
  `adNo` int(11) NOT NULL,
  `fullName` varchar(100) NOT NULL,
  `name` varchar(50) NOT NULL,
  `dob` date NOT NULL,
  `doa` date NOT NULL,
  `gender` varchar(15) NOT NULL,
  `year` varchar(15) DEFAULT NULL,
  `parentName` varchar(60) NOT NULL,
  `nic` char(10) NOT NULL,
  `phone` varchar(13) NOT NULL,
  `address` varchar(150) NOT NULL,
  PRIMARY KEY (`adNo`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

INSERT INTO `paststudents` (`adNo`, `fullName`, `name`, `dob`, `doa`, `gender`, `year`, `parentName`, `nic`, `phone`, `address`) VALUES
(4545, 'Aflaj Ismail', 'Aflah', '1997-08-07', '2002-12-05', 'Male', '2019', 'Ismail', 'C123234200', '0630292034', 'Marrakech'),
(3333, 'Adam Adam', 'Adam', '2001-12-12', '2006-12-10', 'Female', '2018', 'Mahroof', '', '0772185830', ''),
(1535, 'Yassin Ahmed', 'Yassin', '1995-10-08', '2002-08-25', 'Male', '2018', 'Ahmed', 'G141234300', '0719867545', 'Agadir');


DROP TABLE IF EXISTS `leftstudents`;
CREATE TABLE IF NOT EXISTS `leftstudents` (
  `adNo` int(11) NOT NULL,
  `fullName` varchar(100) NOT NULL,
  `name` varchar(50) NOT NULL,
  `dob` date NOT NULL,
  `doa` date NOT NULL,
  `gender` varchar(15) NOT NULL,
  `grade` varchar(15) DEFAULT NULL,
  `parentName` varchar(60) NOT NULL,
  `nic` char(10) NOT NULL,
  `phone` varchar(13) NOT NULL,
  `address` varchar(150) NOT NULL,
  PRIMARY KEY (`adNo`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

INSERT INTO `leftstudents` (`adNo`, `fullName`, `name`, `dob`, `doa`, `gender`, `grade`, `parentName`, `nic`, `phone`, `address`) VALUES
(1919, 'Mohamed Hanan', 'Hanan', '1996-10-12', '2002-08-23', 'Male', 'Grade 3', 'ABderrahman', 'H121212100', '0756009284', 'Marrakech');

DROP TABLE IF EXISTS `staffs`;
CREATE TABLE IF NOT EXISTS `staffs` (
  `empNo` varchar(10) NOT NULL,
  `teacherName` varchar(60) DEFAULT NULL,
  `nic` char(10) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `doa` date DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `email` varchar(30) DEFAULT '-',
  `assumpOfDuties` date DEFAULT NULL,
  `phone` varchar(10) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `incDate` date DEFAULT NULL,
  `prsntGrade` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`empNo`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
INSERT INTO `staffs` (`empNo`, `teacherName`, `nic`, `dob`, `doa`, `gender`, `email`, `assumpOfDuties`, `phone`, `address`, `incDate`, `prsntGrade`) VALUES
('1234', 'Mohamed Mahroof', 'G101010100', '1965-06-22', '1998-02-04', 'Male', 'mahroof@gmail.com', '2014-03-01', '0779557571', 'Marrakech', '2002-05-15', '2'),
('1', 'Nejoui Abderrazak', 'H121212000', '1992-10-14', '2003-10-23', 'Male', 'Nejoui@gmail.com', '2014-03-05', '0775959867', 'Marrakech', '2002-04-06', '3'),
('1122', 'Marea Zrikem', 'G123465000', '1970-04-12', '2000-07-12', 'Female', 'Zrikem@uca.ac.ma', '2016-05-13', '0789878675', 'Marrakech', '2008-12-08', 'A1');


DROP TABLE IF EXISTS `oldstaffs`;
CREATE TABLE IF NOT EXISTS `oldstaffs` (
  `empNo` varchar(10) NOT NULL,
  `teacherName` varchar(60) DEFAULT NULL,
  `nic` char(10) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `doa` date DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `email` varchar(30) DEFAULT '-',
  `assumpOfDuties` date DEFAULT NULL,
  `phone` varchar(10) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `incDate` date DEFAULT NULL,
  `prsntGrade` varchar(10) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;


Dumping data for table `oldstaffs`


INSERT INTO `oldstaffs` (`empNo`, `teacherName`, `nic`, `dob`, `doa`, `gender`, `email`, `assumpOfDuties`, `phone`, `address`, `incDate`, `prsntGrade`) VALUES
('2', 'Yassin Mohamed', '781234578v', '1974-03-02', '2001-10-12', 'Female', 'Yassin@gmail.com', '2015-03-05', '0767878654', 'Marrakech', '2000-12-14', '2'),
('1122', 'Ahmed Mohamed', '702016602v', '1970-05-15', '1980-05-12', 'Female', 'Ahmed@gmail.com', '1996-10-12', '0772185850', 'Marrakech', '2001-03-16', '3');


DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`username`, `password`) VALUES
('admin', 'admin123'),
('teacher', 'teacher123');

DROP TABLE IF EXISTS `exams`;
CREATE TABLE IF NOT EXISTS `exams` (
  `field` varchar(20) NOT NULL,
  `date` varchar(20) NOT NULL,
  `time` varchar(20) NOT NULL,
  `salle` varchar(20) NOT NULL,
  `responsable` varchar(20) NOT NULL,
  `module` varchar(20) NOT NULL,
  `grade` varchar(20) NOT NULL
  
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

INSERT INTO `exams` (`field`, `date` , `time` , `salle` , `responsable` , `module` , `grade`  ) VALUES
('GI', '2023-01-07' , '10:30' , 'salle1' , 'Nejoui' , 'JavaPOO' , '4'),
('GI', '2023-01-06' , '10:30' , 'salle11' , 'Atlas' , 'Crypto' , '4');



COMMIT;