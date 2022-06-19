-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 19 Jun 2022 pada 18.11
-- Versi server: 10.4.24-MariaDB
-- Versi PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `account`
--

CREATE TABLE `account` (
  `id` int(11) NOT NULL,
  `username` varchar(30) NOT NULL,
  `jenisKelamin` varchar(10) NOT NULL,
  `alamat` varchar(40) NOT NULL,
  `telepon` varchar(25) NOT NULL,
  `sandi` varchar(25) NOT NULL,
  `role` varchar(5) NOT NULL DEFAULT 'user'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `account`
--

INSERT INTO `account` (`id`, `username`, `jenisKelamin`, `alamat`, `telepon`, `sandi`, `role`) VALUES
(1, 'Admin', '', 'Admin nomor 1', '080908070605', 'admin', 'admin'),
(2, 'User', '', 'User nomor 1', '080908070605', 'user', 'user'),
(8, 'Markson', 'Pria', 'Jl Sewai', '082198994766', 'markson12345', 'user');

-- --------------------------------------------------------

--
-- Struktur dari tabel `daftar`
--

CREATE TABLE `daftar` (
  `nomor` int(5) NOT NULL,
  `username` varchar(25) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `tempatLahir` varchar(10) NOT NULL,
  `tanggalLahir` varchar(35) NOT NULL,
  `kelamin` varchar(15) NOT NULL,
  `alamat` varchar(25) NOT NULL,
  `agama` varchar(15) NOT NULL,
  `statusPernikahan` varchar(20) NOT NULL,
  `pengalaman` varchar(50) NOT NULL,
  `lulusan` varchar(10) NOT NULL,
  `telepon` varchar(25) NOT NULL,
  `namaPerusahaan` varchar(25) NOT NULL,
  `foto` varchar(100) NOT NULL,
  `status` varchar(25) NOT NULL DEFAULT 'Menunggu Konfirmasi'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `daftar`
--

INSERT INTO `daftar` (`nomor`, `username`, `nama`, `tempatLahir`, `tanggalLahir`, `kelamin`, `alamat`, `agama`, `statusPernikahan`, `pengalaman`, `lulusan`, `telepon`, `namaPerusahaan`, `foto`, `status`) VALUES
(29598, 'Markson', 'Markson L DJomie', 'Balikpapan', 'Sat Aug 30 23:47:35 WITA 2003', 'Laki-laki', 'Jl Sewai', 'Kristen', 'Belum menikah', 'Magang', 'SMA', '082198994766', 'PT Telkom Indonesia', 'C:\\Users\\WHOAMI\\Desktop\\IMG-20220619-WA0036.jpg', 'Berkas diinterview');

-- --------------------------------------------------------

--
-- Struktur dari tabel `perusahaan`
--

CREATE TABLE `perusahaan` (
  `id` int(4) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `status` varchar(15) NOT NULL DEFAULT 'Buka',
  `informasi` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `perusahaan`
--

INSERT INTO `perusahaan` (`id`, `nama`, `status`, `informasi`) VALUES
(1523, 'Microsoft', 'Tutup', 'Microsoft merupakan perusahaan yang sangat bagus'),
(3522, 'Asus', 'Buka', 'Perusahaan ini adalah'),
(4325, 'Molto', 'Tutup', 'Molto adalah pewangi baju'),
(5699, 'Apple', 'Buka', 'Perusahaan ini mempunyai beragam teknologi'),
(6647, 'Samsung', 'Tutup', 'Ini perusahaan Samsung'),
(7338, 'PT Telkom Indonesia', 'Pilih...', 'Perusahaan terbesar di Indonesia'),
(7632, 'Coca-cola', 'Buka', 'Perusahaan ini adalah perusahaan minuman dengan branding yang sangat terkenal'),
(9923, 'Nvidia', 'Buka', 'RTX GAMING');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indeks untuk tabel `daftar`
--
ALTER TABLE `daftar`
  ADD PRIMARY KEY (`nomor`);

--
-- Indeks untuk tabel `perusahaan`
--
ALTER TABLE `perusahaan`
  ADD UNIQUE KEY `id` (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `account`
--
ALTER TABLE `account`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
