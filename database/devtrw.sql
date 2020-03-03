-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 03, 2020 at 02:24 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `devtrw`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `user` varchar(15) NOT NULL,
  `pass` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`user`, `pass`) VALUES
('admin1', 'wildat'),
('admin', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `detail`
--

CREATE TABLE `detail` (
  `kode_sewa` varchar(10) NOT NULL,
  `no` varchar(10) NOT NULL,
  `hargafas` int(11) NOT NULL,
  `ket` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `fasilitas`
--

CREATE TABLE `fasilitas` (
  `kd_fasilitas` varchar(4) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `harga_barang` int(11) NOT NULL,
  `keterangan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `fasilitas`
--

INSERT INTO `fasilitas` (`kd_fasilitas`, `nama_barang`, `harga_barang`, `keterangan`) VALUES
('01', 'Layar', 165000, '120 x 120 CM'),
('02', 'Sound System 2.000 W', 1320000, '2000 WATT'),
('03', 'Tenda Plampang Flapo', 19000, 'Per Meter'),
('04', 'Tenda Dekorasi', 55000, 'Per Meter'),
('05', 'Panggung Flapon', 55000, 'Per Meter'),
('06', 'Kursi Lipat', 5500, 'Per Unit'),
('07', 'Kursi Futura', 8250, 'Per Unit'),
('08', 'Kursi Futura Sarung', 13750, 'Per Unit'),
('09', 'Meja', 22000, 'Ukuran 1 x 1'),
('10', 'Meja Cover', 33000, 'Ukuran 1 x 1'),
('11', 'Listrik 1.500 WATT', 165000, '1500 WATT'),
('12', 'AC / PK', 825000, '5 PK'),
('13', 'Orgen Tunggal', 2750000, 'Sound+Penyanyi+Pemain'),
('14', 'Generator 60.000 WAT', 2750000, 'Per Unit'),
('15', 'Cooling Fan', 550000, 'Per Unit');

-- --------------------------------------------------------

--
-- Table structure for table `pemesanan`
--

CREATE TABLE `pemesanan` (
  `kode_sewa` varchar(10) NOT NULL,
  `tanggal` date NOT NULL,
  `kode_ruang` varchar(10) NOT NULL,
  `harga` int(11) NOT NULL,
  `waktu` varchar(10) NOT NULL,
  `id_penyewa` varchar(10) NOT NULL,
  `nama_penyewa` varchar(150) NOT NULL,
  `notelp` varchar(12) NOT NULL,
  `bayar` int(11) NOT NULL,
  `status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pemesanan`
--

INSERT INTO `pemesanan` (`kode_sewa`, `tanggal`, `kode_ruang`, `harga`, `waktu`, `id_penyewa`, `nama_penyewa`, `notelp`, `bayar`, `status`) VALUES
('SW0001', '2020-03-03', 'G005', 3330000, 'Malam', 'P0001', 'dasda', '13131', 900000, 'Belum Lunas'),
('SW0002', '2020-03-03', 'G002', 1320000, 'Siang', 'P0002', 'lolo', '23234532', 900000, 'Belum Lunas'),
('SW0003', '2020-03-03', 'G005', 3330000, 'Siang', 'P0003', 'sadasd', '123123', 100000, 'Belum Lunas'),
('SW0004', '2020-03-03', 'G004', 3330000, 'Malam', 'P0004', 'pororo', '928217', 900000, 'Belum Lunas'),
('SW0005', '2020-03-03', 'G002', 1320000, 'Malam', 'P0005', 'jdkaw', '90128', 900000, 'Belum Lunas'),
('SW0006', '2020-03-03', 'G004', 3330000, 'Siang', 'P0006', 'awdjkjad', '90290', 90000, 'Belum Lunas'),
('SW0007', '2020-03-12', 'G004', 3330000, 'Siang', 'P0007', 'nlknskjan', '89123981', 900000, 'Belum Lunas'),
('SW0008', '2020-03-20', 'G004', 3330000, 'Malam', 'P0008', 'asdkj', '09102', 9000, 'Belum Lunas'),
('SW0009', '2020-03-28', 'G005', 3330000, 'Malam', 'P0009', 'kjsancjkas', '9812371', 90000, 'Belum Lunas'),
('SW0010', '2020-03-28', 'G005', 3330000, 'Malam', 'P0009', 'kjsancjkas', '9812371', 90000, 'Belum Lunas'),
('SW0011', '2020-03-27', 'G004', 3330000, 'Malam', 'P0010', 'alksmvlasmkl', '90123810', 90000, 'Belum Lunas'),
('SW0012', '2020-03-27', 'G004', 3330000, 'Malam', 'P0010', 'alksmvlasmkl', '90123810', 90000, 'Belum Lunas'),
('SW0013', '2020-03-13', 'G001', 2750000, 'Malam', 'P0011', 'klmlksa', '9090', 90000, 'Belum Lunas'),
('SW0014', '2020-03-17', 'G004', 3330000, 'Malam', 'P0012', 'akslcmakls', '1029310', 90000, 'Belum Lunas'),
('SW0015', '2020-03-13', 'G001', 2750000, 'Siang', 'P0013', 'kjlk', 'l9090', 9000, 'Belum Lunas'),
('SW0016', '2020-03-19', 'G004', 3330000, 'Siang', 'P0014', 'kasmalksvmal', '0192', 90000, 'Belum Lunas'),
('SW0017', '2020-03-23', 'G005', 3330000, 'Malam', 'P0015', 'ioawid', 'ioi', 90909, 'Belum Lunas'),
('SW0018', '2020-06-09', 'G005', 3330000, 'Malam', 'P0016', 'ikmasklca', '909', 90000, 'Belum Lunas'),
('SW0019', '2020-03-21', 'G005', 3330000, 'Malam', 'P0017', 'klmlkm', '1892', 90000, 'Belum Lunas'),
('SW0020', '2020-03-12', 'G005', 3330000, 'Malam', 'P0018', 'skdkj', '8080', 90000, 'Belum Lunas'),
('SW0021', '2020-03-03', 'G001', 2750000, 'Malam', 'P0019', 'jgjhgj', '9898', 8999, 'Belum Lunas'),
('SW0022', '2020-03-13', 'G004', 3330000, 'Malam', 'P0020', 'klmlk', 'klamslka', 90000, 'Belum Lunas'),
('SW0023', '2020-03-11', 'G004', 3330000, 'Malam', 'P0021', 'klamsvlamslk', 'alkasmvlk', 90000, 'Belum Lunas');

-- --------------------------------------------------------

--
-- Table structure for table `pesan_fasilitas`
--

CREATE TABLE `pesan_fasilitas` (
  `no` varchar(10) NOT NULL,
  `kode_sewa` varchar(10) NOT NULL,
  `kd_fasilitas` varchar(10) NOT NULL,
  `qty` int(11) NOT NULL,
  `subtot` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pesan_fasilitas`
--

INSERT INTO `pesan_fasilitas` (`no`, `kode_sewa`, `kd_fasilitas`, `qty`, `subtot`) VALUES
('NO0002', 'SW0003', '12', 6, 4950000),
('NO0003', 'SW0004', '11', 1, 165000),
('NO0004', 'SW0005', '12', 4, 3300000),
('NO0005', 'SW0010', '08', 2, 27500),
('NO0006', 'SW0010', '12', 4, 3300000),
('NO0007', 'SW0017', '10', 2, 66000),
('NO0008', 'SW0017', '14', 3, 8250000),
('NO0009', 'SW0020', '14', 2, 5500000),
('NO0010', 'SW0021', '13', 3, 8250000),
('NO0011', 'SW0022', '13', 2, 5500000),
('NO0012', 'SW0023', '15', 3, 1650000),
('NO0013', 'SW0023', '09', 7, 154000);

-- --------------------------------------------------------

--
-- Table structure for table `ruang`
--

CREATE TABLE `ruang` (
  `kode_ruang` varchar(10) NOT NULL,
  `nama_ruang` varchar(50) NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ruang`
--

INSERT INTO `ruang` (`kode_ruang`, `nama_ruang`, `harga`) VALUES
('G001', 'Ki Hajar Dewantoro', 2750000),
('G002', 'Kartini I', 1320000),
('G003', 'Kartini II', 1320000),
('G004', 'R.H. Agus Salim', 3330000),
('G005', 'Sudirman', 3330000),
('G006', 'Pandansari', 13750000),
('G007', 'Sarbini', 9350000),
('G008', 'Puspitasari', 5500000),
('G009', 'Mawardi I', 1100000),
('G010', 'Parang Kusumo', 330000),
('S001', 'Areal Tunas I', 440000),
('S002', 'Nusa Indah (S. Tenis)', 440000),
('S003', 'Ruang Kana I', 440000),
('S004', 'Ruang Kana II', 440000),
('S005', 'Ruang Soka', 660000),
('S006', 'Ruang Seruni', 880000),
('S007', 'R. Anggrek Bulan', 880000),
('S008', 'Saung Tulip', 220000),
('S009', 'R. Jepang', 1650000),
('S010', 'R. Alamanda', 880000),
('S011', 'R. Kaktus', 880000),
('S012', 'R. Puspitasari', 880000),
('S013', 'Saung Siaga', 330000),
('S014', 'Saung Penegak', 330000),
('S015', 'Saung Penggalang', 330000),
('S016', 'Saung Tunas I', 330000),
('S017', 'Saung Tunas II', 330000),
('S018', 'Saung Diskusi', 880000),
('S019', 'Plaza Ged. Pandansari', 1650000),
('S020', 'Health Center', 880000),
('T001', 'Wisma', 1320000),
('T002', 'Kamar', 330000),
('T003', 'Wisma Pelatih', 1320000),
('T004', 'Asrama Sedap Malam', 220000),
('T005', 'Asrama Kenanga', 220000),
('T006', 'Sekar Purbo I', 385000),
('T007', 'Sekar Purbo II', 385000),
('T008', 'Rumah Belanda', 385000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `detail`
--
ALTER TABLE `detail`
  ADD KEY `kode_sewa` (`kode_sewa`),
  ADD KEY `detail_ibfk_3` (`no`);

--
-- Indexes for table `fasilitas`
--
ALTER TABLE `fasilitas`
  ADD PRIMARY KEY (`kd_fasilitas`);

--
-- Indexes for table `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD PRIMARY KEY (`kode_sewa`),
  ADD KEY `kode_ruang` (`kode_ruang`);

--
-- Indexes for table `pesan_fasilitas`
--
ALTER TABLE `pesan_fasilitas`
  ADD PRIMARY KEY (`no`),
  ADD KEY `kd_fasilitas` (`kd_fasilitas`),
  ADD KEY `kode_sewa` (`kode_sewa`);

--
-- Indexes for table `ruang`
--
ALTER TABLE `ruang`
  ADD PRIMARY KEY (`kode_ruang`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `detail`
--
ALTER TABLE `detail`
  ADD CONSTRAINT `detail_ibfk_2` FOREIGN KEY (`kode_sewa`) REFERENCES `pemesanan` (`kode_sewa`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `detail_ibfk_3` FOREIGN KEY (`no`) REFERENCES `pesan_fasilitas` (`no`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD CONSTRAINT `pemesanan_ibfk_1` FOREIGN KEY (`kode_ruang`) REFERENCES `ruang` (`kode_ruang`);

--
-- Constraints for table `pesan_fasilitas`
--
ALTER TABLE `pesan_fasilitas`
  ADD CONSTRAINT `pesan_fasilitas_ibfk_1` FOREIGN KEY (`kd_fasilitas`) REFERENCES `fasilitas` (`kd_fasilitas`),
  ADD CONSTRAINT `pesan_fasilitas_ibfk_2` FOREIGN KEY (`kode_sewa`) REFERENCES `pemesanan` (`kode_sewa`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
