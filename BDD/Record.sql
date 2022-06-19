-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: May 21, 2022 at 01:11 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Crawler`
--

-- --------------------------------------------------------

--
-- Table structure for table `Record`
--

CREATE TABLE `Record` (
  `RecordID` int(11) NOT NULL,
  `URL` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Record`
--

INSERT INTO `Record` (`RecordID`, `URL`) VALUES
(1, 'https://www.univ-sba.dz/fse/'),
(2, 'https://www.univ-sba.dz/fse/#kingster-mobile-menu'),
(3, 'https://www.univ-sba.dz/fse/departements/'),
(4, 'https://www.univ-sba.dz/fse/departements/departement-de-informatique/'),
(5, 'https://www.univ-sba.dz/fse/departements/departement-materiaux-et-developpement-durable/'),
(6, 'https://www.univ-sba.dz/fse/departements/departement-des-mathematiques/'),
(7, 'https://www.univ-sba.dz/fse/departements/departement-de-probabilites-statistique/'),
(8, 'https://www.univ-sba.dz/fse/departements/departement-de-chimie/'),
(9, 'https://www.univ-sba.dz/fse/departements/departement-de-physique/'),
(10, 'https://www.univ-sba.dz/fse/graduation/'),
(11, 'https://www.univ-sba.dz/fse/vice-decanat-graduation/'),
(12, 'https://www.univ-sba.dz/fse/graduation/domaines-de-formation/'),
(13, 'https://www.univ-sba.dz/fse/graduation/licences-et-masters/'),
(14, 'https://www.univ-sba.dz/fse/informatique/canevas-licence-master/'),
(15, 'https://www.univ-sba.dz/fse/le-catalogue-des-memoires/'),
(16, 'https://www.univ-sba.dz/fse/reglementation/reglementation/'),
(17, 'https://www.univ-sba.dz/fse/p-graduation/'),
(18, 'https://www.univ-sba.dz/fse/vice-decanat-post-graduation/'),
(19, 'https://www.univ-sba.dz/fse/p-graduation/concours-de-doctorat/'),
(20, 'https://www.univ-sba.dz/fse/p-graduation/diplome/'),
(21, 'https://www.univ-sba.dz/fse/p-graduation/habilitation/'),
(22, 'https://www.univ-sba.dz/fse/p-graduation/inscription-et-reinscription/'),
(23, 'https://www.univ-sba.dz/fse/p-graduation/inscription-et-reinscription/doctorat-en-science/'),
(24, 'https://www.univ-sba.dz/fse/p-graduation/inscription-et-reinscription/doctorat-lmd/'),
(25, 'https://www.univ-sba.dz/fse/p-graduation/soutenance/'),
(26, 'https://www.univ-sba.dz/fse/polycopie-2/'),
(27, 'https://www.univ-sba.dz/fse/conseil-scientifique-de-la-faculte/'),
(28, 'https://www.univ-sba.dz/fse/travaux-besoins-materiels-avis-de-consultations/'),
(29, 'https://www.univ-sba.dz/fse/contacts/'),
(30, 'https://www.univ-sba.dz/fse/wp-content/uploads/2022/05/Mme-MADJDOUB-Fatima-zohra-تعزية.pdf'),
(31, 'https://www.univ-sba.dz/fse/8mai1954/'),
(32, 'https://www.univ-sba.dz/fse/aid_travailleur/'),
(33, 'https://www.univ-sba.dz/fse/non-classe/mot-du-doyen/'),
(34, 'https://fse.univ-sba.dz/les-nouvelles/'),
(35, 'https://www.univ-sba.dz/fse/2022/04/08/'),
(36, 'https://www.univ-sba.dz/fse/acrivites-culturelles-et-sportives-et-scientifiques/club-badrat-khayr/'),
(37, 'https://www.univ-sba.dz/fse/2022/02/28/'),
(38, 'https://www.univ-sba.dz/fse/concours-recrutements/proces-verbal-de-deliberation-final-du-concours-de-doctorat-au-titre-de-lannee-universitaire-2021-2022/'),
(39, 'https://www.univ-sba.dz/fse/2022/02/13/'),
(40, 'https://www.univ-sba.dz/fse/travaux-et-besoin-materiels-2021-2022/avis-dattribution-provisoire-5/'),
(41, 'https://www.univ-sba.dz/fse/2022/02/06/'),
(42, 'https://www.univ-sba.dz/fse/non-classe/%d8%aa%d9%83%d8%b1%d9%8a%d9%85-%d8%a7%d9%84%d8%a8%d8%b1%d9%88%d9%81%d9%8a%d8%b3%d9%8a%d9%88-%d8%b9%d9%88%d8%b1%d8%a7%d9%82/'),
(43, 'https://www.univ-sba.dz/fse/covid-19/%d9%85%d8%b0%d9%83%d8%b1%d8%a9-%d8%a7%d9%84%d8%b3%d9%8a%d8%af-%d8%a7%d9%84%d8%a3%d9%85%d9%8a%d9%86-%d8%a7%d9%84%d8%b9%d8%a7%d9%85-%d8%b1%d9%82%d9%85-160-%d8%a7%d9%84%d9%85%d8%a4%d8%b1%d8%ae%d8%a9/'),
(44, 'https://www.univ-sba.dz/fse/2022/01/22/'),
(45, 'https://www.univ-sba.dz/fse/non-classe/tenue-pour-lagent-de-securite-faculte-des-sciences-exactes/'),
(46, 'https://www.univ-sba.dz/fse/categories/bourses/'),
(47, 'https://www.univ-sba.dz/fse/categories/clubs-scientifiques/'),
(48, 'https://www.univ-sba.dz/fse/categories/alumni/'),
(49, 'https://www.univ-sba.dz/fse/reglementation/canevas-licence-master/'),
(50, 'http://www.diplomes.uqam.ca/'),
(51, 'https://www.univ-sba.dz/fse/presentation-de-la-faculte/'),
(52, 'https://youtu.be/udtjgHlOnK4'),
(53, 'https://www.univ-sba.dz/fse/protegez-vous/'),
(54, 'https://www.univ-sba.dz/fse/categories/concours-recrutements/'),
(55, 'https://www.univ-sba.dz/fse/categories/acrivites-culturelles-et-sportives-et-scientifiques'),
(56, 'https://www.univ-sba.dz/fse/supports-pedagogiques/'),
(57, 'http://rdoc.univ-sba.dz/'),
(58, 'https://www.univ-sba.dz'),
(59, 'http://www.cerist.dz'),
(60, 'https://www.pnst.cerist.dz/'),
(61, 'https://www.sndl.cerist.dz/'),
(62, 'https://www.univ-sba.dz/fse/events/'),
(63, 'https://www.univ-sba.dz/fse/conseil-scientifique/'),
(64, 'https://www.univ-sba.dz/fse/owncloud'),
(65, 'https://www.facebook.com/UDLFSE'),
(66, 'https://www.univ-sba.dz/fse/#');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Record`
--
ALTER TABLE `Record`
  ADD PRIMARY KEY (`RecordID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Record`
--
ALTER TABLE `Record`
  MODIFY `RecordID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=67;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
