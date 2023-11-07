-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 07 Nov 2023 pada 04.14
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.2.4

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
-- Struktur dari tabel `data_dokter`
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

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_master`
--

CREATE TABLE `data_master` (
  `id` int(11) NOT NULL,
  `no_rm` varchar(8) NOT NULL,
  `nama1` varchar(25) NOT NULL,
  `nik` varchar(16) NOT NULL,
  `alamat` varchar(25) NOT NULL,
  `ttl` varchar(30) NOT NULL,
  `jenis_kelamin1` varchar(15) NOT NULL,
  `status_pembayaran` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Trigger `data_master`
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
-- Struktur dari tabel `history_datamaster`
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

-- --------------------------------------------------------

--
-- Struktur dari tabel `id_level`
--

CREATE TABLE `id_level` (
  `id` int(2) NOT NULL,
  `role` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `id_level`
--

INSERT INTO `id_level` (`id`, `role`) VALUES
(1, 'owner'),
(2, 'admin');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pasienbaru_sementara`
--

CREATE TABLE `pasienbaru_sementara` (
  `id` int(6) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `nik` varchar(16) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `ttl` varchar(50) NOT NULL,
  `jenis_kelamin` varchar(20) NOT NULL,
  `status_pembayaran` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `rekap_harian`
--

CREATE TABLE `rekap_harian` (
  `id` int(11) NOT NULL,
  `jam` time NOT NULL,
  `tanggal` date NOT NULL,
  `id_dokter` int(6) NOT NULL,
  `id_master` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
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
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `email`, `level`, `token`) VALUES
(1, 'restuuu', 'admin123', 'admin@gmail.com', 1, '');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `data_dokter`
--
ALTER TABLE `data_dokter`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `data_master`
--
ALTER TABLE `data_master`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `history_datamaster`
--
ALTER TABLE `history_datamaster`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `id_level`
--
ALTER TABLE `id_level`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `pasienbaru_sementara`
--
ALTER TABLE `pasienbaru_sementara`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `rekap_harian`
--
ALTER TABLE `rekap_harian`
  ADD PRIMARY KEY (`id`),
  ADD KEY `soso` (`id_master`),
  ADD KEY `soso1` (`id_dokter`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD KEY `saasa` (`level`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `data_dokter`
--
ALTER TABLE `data_dokter`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT untuk tabel `data_master`
--
ALTER TABLE `data_master`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT untuk tabel `history_datamaster`
--
ALTER TABLE `history_datamaster`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;

--
-- AUTO_INCREMENT untuk tabel `rekap_harian`
--
ALTER TABLE `rekap_harian`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=60;

--
-- AUTO_INCREMENT untuk tabel `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `rekap_harian`
--
ALTER TABLE `rekap_harian`
  ADD CONSTRAINT `soso` FOREIGN KEY (`id_master`) REFERENCES `data_master` (`id`),
  ADD CONSTRAINT `soso1` FOREIGN KEY (`id_dokter`) REFERENCES `data_dokter` (`id`);

--
-- Ketidakleluasaan untuk tabel `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `saasa` FOREIGN KEY (`level`) REFERENCES `id_level` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
