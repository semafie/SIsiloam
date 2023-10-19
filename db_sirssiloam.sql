-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 19, 2023 at 02:55 AM
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
(5, 'Dr gagah', '432423432', 'Poli gigi', 'dsadasddsada', 'Laki - Laki', 1, '2023-10-19'),
(6, 'Dr berotot', '003432423423', 'Poli gigi', 'MAKNYUSSS', 'Perempuan', 0, '2023-10-19'),
(7, 'Dr gagah', '432423432', 'Poli gigi', 'dsadasddsada', 'Laki - Laki', 1, '2023-10-19');

-- --------------------------------------------------------

--
-- Table structure for table `data_master`
--

CREATE TABLE `data_master` (
  `id` int(11) NOT NULL,
  `no_rm` varchar(8) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `nik` int(16) NOT NULL,
  `alamat` varchar(25) NOT NULL,
  `ttl` varchar(30) NOT NULL,
  `jenis_kelamin` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_master`
--

INSERT INTO `data_master` (`id`, `no_rm`, `nama`, `nik`, `alamat`, `ttl`, `jenis_kelamin`) VALUES
(2, '01-00-00', 'debbyyyyy', 32020392, 'jl apayaa', 'jember, 23/02/2004', 'Perempuan'),
(4, '02-00-00', 'restuuu', 656565656, 'jl apayaa', 'jember, 23/02/2004', 'Perempuan'),
(6, '03-00-00', 'Debby', 3424234, 'sriwijaya 4', 'jember ', 'Perempuan'),
(10, '04-00-00', 'galih', 342432423, 'jember slempang', 'ahdwodwaddwaa', 'Laki - Laki'),
(11, '04-00-00', 'galih', 342432423, 'jember slempang', 'ahdwodwaddwaa', 'Laki - Laki'),
(12, '05-00-00', 'bimaaaa', 6575656, 'jawaaaaa', 'banyuwangi', 'Laki - Laki'),
(13, '06-00-00', 'gilang', 453242, 'jl jember', '343242adwadw', 'Laki - Laki'),
(14, '07-00-00', 'gogong', 3242342, 'jwabarat', 'fasafdsadad', 'Perempuan');

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
(1, 'gogong', 3242342, 'jwabarat', 'fasafdsadad', 'Perempuan');

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
(3, '01:09:27', '2023-10-19', 5, 6),
(11, '01:22:59', '2023-10-19', 6, 14);

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
-- Indexes for table `id_level`
--
ALTER TABLE `id_level`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `rekap_harian`
--
ALTER TABLE `rekap_harian`
  ADD PRIMARY KEY (`id`),
  ADD KEY `sese` (`id_dokter`),
  ADD KEY `soso` (`id_master`);

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `rekap_harian`
--
ALTER TABLE `rekap_harian`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

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
  ADD CONSTRAINT `sese` FOREIGN KEY (`id_dokter`) REFERENCES `data_dokter` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `soso` FOREIGN KEY (`id_master`) REFERENCES `data_master` (`id`);

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `saasa` FOREIGN KEY (`level`) REFERENCES `id_level` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
