-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 31, 2023 at 04:25 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_sirssiloam`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_dokter`
--

CREATE TABLE `data_dokter` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `no_hp` varchar(13) NOT NULL,
  `jenis_poli` varchar(25) NOT NULL,
  `jadwal` varchar(50) NOT NULL,
  `jenis_kelamin` varchar(15) NOT NULL,
  `no_antrian` int(3) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_dokter`
--

INSERT INTO `data_dokter` (`id`, `nama`, `no_hp`, `jenis_poli`, `jadwal`, `jenis_kelamin`, `no_antrian`, `tanggal`) VALUES
(1, 'dr. cina', '321321', 'Poli gigi', 'sabtu - minggu 13.00-15.00', 'Laki - Laki', 0, '2023-10-16'),
(2, 'dr pintar', '34242423', 'Poli gigi', 'vfgsdsdfsfsf', 'Perempuan', 0, '2023-10-17'),
(3, 'grgr', '342342', 'Poli mata', '3242342342', 'Laki - Laki', 0, '2023-10-18'),
(4, 'asdawdad', '342234', 'Poli mata', '423424242', 'Perempuan', 0, '2023-10-18'),
(5, 'Dr gagah', '432423432', 'Poli gigi', 'dsadasddsada', 'Laki - Laki', 2, '2023-10-26'),
(6, 'Dr berotot', '003432423423', 'Poli gigi', 'MAKNYUSSS', 'Perempuan', 0, '2023-10-19'),
(7, 'Dr gagah', '432423432', 'Poli gigi', 'dsadasddsada', 'Laki - Laki', 2, '2023-10-19');

-- --------------------------------------------------------

--
-- Table structure for table `data_master`
--

CREATE TABLE `data_master` (
  `id` int(11) NOT NULL,
  `no_rm` varchar(8) NOT NULL,
  `nama1` varchar(25) NOT NULL,
  `nik` int(16) NOT NULL,
  `alamat` varchar(25) NOT NULL,
  `ttl` varchar(30) NOT NULL,
  `jenis_kelamin1` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_master`
--

INSERT INTO `data_master` (`id`, `no_rm`, `nama1`, `nik`, `alamat`, `ttl`, `jenis_kelamin1`) VALUES
(2, '01-00-00', 'sopo', 32020392, 'jl apayaa', 'jember, 23/02/2004', 'Laki - Laki'),
(4, '02-00-00', 'restuuu hmm', 656565656, 'jl apayaa', 'jember, 23/02/2004', 'Laki - Laki'),
(6, '03-00-00', 'Debby', 3424234, 'sriwijaya 4', 'jember ', 'Perempuan'),
(10, '04-00-00', 'galih', 342432423, 'jember slempang', 'ahdwodwaddwaa', 'Laki - Laki'),
(11, '04-00-00', 'galih', 342432423, 'jember slempang', 'ahdwodwaddwaa', 'Laki - Laki'),
(12, '05-00-00', 'bimaaaa', 6575656, 'jawaaaaa', 'banyuwangi', 'Laki - Laki'),
(13, '06-00-00', 'gilang', 453242, 'jl jember', '343242adwadw', 'Laki - Laki'),
(14, '07-00-00', 'gogong', 3242342, 'jwabarat', 'fasafdsadad', 'Perempuan'),
(15, '08-00-00', 'GUNTUR', 3555555, 'SLERAN', 'JAWA TENGAH', 'Laki - Laki'),
(16, '09-00-00', 'fahmihatta', 312312321, 'jl pegangsaan', '21 juni 2009', 'Perempuan'),
(17, '09-00-00', 'fahmihatta', 312312321, 'jl pegangsaan', '21 juni 2009', 'Perempuan'),
(18, '10-00-00', 'jumaidi', 321312321, 'jl pegangsaan no 3', '27 juli', 'Laki - Laki'),
(19, '11-00-00', 'dimas anjay mabar cuaks', 2312312, 'jl komputasi jauh', '4 febuari 1998', 'Laki - Laki'),
(20, '12-00-00', 'facar', 24314, 'ganggngg', '213sdasaadcxz', 'Perempuan'),
(21, '13-00-00', 'farhan', 21312312, 'JL PEGANGSAAN TIMUR', '4 febuari 1998', 'Laki - Laki'),
(22, '14-00-00', 'sassda', 321321, 'saddsa', 'asddsa', 'Perempuan'),
(23, '15-00-00', 'sasasa', 321312321, 'aku', 'sadasda', 'Laki - Laki'),
(24, '16-00-00', 'sadasads', 213312, 'sasdsdadsa', 'saddsasda', 'Laki - Laki'),
(25, '17-00-00', 'sadsadsa', 213321, 'sasdadsa', 'saddsa', 'Laki - Laki');

--
-- Triggers `data_master`
--
DELIMITER $$
CREATE TRIGGER `triggerdelete` AFTER DELETE ON `data_master` FOR EACH ROW BEGIN
    INSERT INTO history_datamaster (`no_rm`, `nama`, `nik`, `alamat`, `ttl`, `jenis_kelamin`)
    VALUES (OLD.no_rm, OLD.nama1, OLD.nik, OLD.alamat, OLD.ttl, OLD.jenis_kelamin1);
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `triggerup` AFTER UPDATE ON `data_master` FOR EACH ROW BEGIN
    INSERT INTO history_datamaster (`no_rm`, `nama`, `nik`, `alamat`, `ttl`, `jenis_kelamin`)
    VALUES (OLD.no_rm, OLD.nama1, OLD.nik, OLD.alamat, OLD.ttl, OLD.jenis_kelamin1);
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `history_datamaster`
--

CREATE TABLE `history_datamaster` (
  `id` int(11) NOT NULL,
  `no_rm` varchar(50) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `nik` int(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `ttl` varchar(50) NOT NULL,
  `jenis_kelamin` varchar(50) NOT NULL,
  `status` varchar(20) NOT NULL,
  `nama_user` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `history_datamaster`
--

INSERT INTO `history_datamaster` (`id`, `no_rm`, `nama`, `nik`, `alamat`, `ttl`, `jenis_kelamin`, `status`, `nama_user`) VALUES
(1, '01-00-00', 'debbyyyyy', 32020392, 'jl apayaa', 'jember, 23/02/2004', 'Perempuan', '', ''),
(2, '01-00-00', 'debby', 32020392, 'jl apayaa', 'jember, 23/02/2004', 'Perempuan', '', ''),
(3, '01-00-00', 'sopo ae wes', 32020392, 'jl apayaa', 'jember, 23/02/2004', 'Perempuan', 'Di Delete', 'zahro'),
(4, '02-00-00', 'restuuu', 656565656, 'jl apayaa', 'jember, 23/02/2004', 'Perempuan', '', ''),
(5, '01-00-00', 'sopo yo', 32020392, 'jl apayaa', 'jember, 23/02/2004', 'Perempuan', '', ''),
(6, '01-00-00', 'sopo yoas', 32020392, 'jl apayaa', 'jember, 23/02/2004', 'Perempuan', '', ''),
(7, '01-00-00', 'sopo yoassdsd', 32020392, 'jl apayaa', 'jember, 23/02/2004', 'Perempuan', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `id_level`
--

CREATE TABLE `id_level` (
  `id` int(2) NOT NULL,
  `role` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `id_level`
--

INSERT INTO `id_level` (`id`, `role`) VALUES
(1, 'owner'),
(2, 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `pasienbaru_sementara`
--

CREATE TABLE `pasienbaru_sementara` (
  `id` int(6) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `nik` int(16) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `ttl` varchar(50) NOT NULL,
  `jenis_kelamin` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pasienbaru_sementara`
--

INSERT INTO `pasienbaru_sementara` (`id`, `nama`, `nik`, `alamat`, `ttl`, `jenis_kelamin`) VALUES
(1, 'sadsadsa', 213321, 'sasdadsa', 'saddsa', 'Laki - Laki');

-- --------------------------------------------------------

--
-- Table structure for table `rekap_harian`
--

CREATE TABLE `rekap_harian` (
  `id` int(11) NOT NULL,
  `jam` time NOT NULL,
  `tanggal` date NOT NULL,
  `id_dokter` int(6) NOT NULL,
  `id_master` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `rekap_harian`
--

INSERT INTO `rekap_harian` (`id`, `jam`, `tanggal`, `id_dokter`, `id_master`) VALUES
(11, '01:22:59', '2023-10-19', 6, 14),
(12, '11:10:46', '2023-10-19', 1, 15),
(28, '16:34:02', '2023-10-24', 5, 16),
(29, '16:34:05', '2023-10-24', 5, 16),
(30, '16:41:22', '2023-10-24', 7, 18),
(31, '16:43:08', '2023-10-24', 5, 19),
(32, '16:44:43', '2023-10-24', 5, 20),
(33, '10:45:08', '2023-10-26', 5, 21),
(34, '10:45:58', '2023-10-26', 5, 22),
(35, '10:52:17', '2023-10-26', 5, 23),
(36, '10:53:02', '2023-10-26', 5, 24),
(37, '10:54:37', '2023-10-26', 5, 25);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `level` int(2) NOT NULL,
  `token` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `email`, `level`, `token`) VALUES
(1, 'restuuu', 'keoyo', 'debbyazzahra05@gmail.com', 1, ''),
(2, 'fefefe', 'caacacac', 'ngedate yuk', 2, ''),
(3, 'zahro', 'dauss', 'firdaaa', 2, ''),
(4, 'farhan', 'frahan 112', 'asasas', 2, ''),
(5, 'debby chan', 'zahro chan', 'firda chan , daus chan', 2, '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_dokter`
--
ALTER TABLE `data_dokter`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `data_master`
--
ALTER TABLE `data_master`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `history_datamaster`
--
ALTER TABLE `history_datamaster`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `id_level`
--
ALTER TABLE `id_level`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `rekap_harian`
--
ALTER TABLE `rekap_harian`
  ADD PRIMARY KEY (`id`),
  ADD KEY `soso` (`id_master`),
  ADD KEY `soso1` (`id_dokter`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD KEY `saasa` (`level`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data_dokter`
--
ALTER TABLE `data_dokter`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `data_master`
--
ALTER TABLE `data_master`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `history_datamaster`
--
ALTER TABLE `history_datamaster`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `rekap_harian`
--
ALTER TABLE `rekap_harian`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `rekap_harian`
--
ALTER TABLE `rekap_harian`
  ADD CONSTRAINT `soso` FOREIGN KEY (`id_master`) REFERENCES `data_master` (`id`),
  ADD CONSTRAINT `soso1` FOREIGN KEY (`id_dokter`) REFERENCES `data_dokter` (`id`);

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `saasa` FOREIGN KEY (`level`) REFERENCES `id_level` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
