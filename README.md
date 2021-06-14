# E-Healthcare
Simple E-Healthcare web application made with Spring MVC, Thymeleaf, Bootstrap and Hibernate.

# Preview

![Dashboard](https://i.imgur.com/4XjDIrF.png)
![Patients](https://i.imgur.com/al5mcXo.png)
![Find patients](https://i.imgur.com/Kj8JcEt.png)

# Database

```
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `healthcare`
--

-- --------------------------------------------------------

--
-- Table structure for table `doctors`
--

CREATE TABLE `doctors` (
  `id` int(11) NOT NULL,
  `firstName` text NOT NULL,
  `lastName` text NOT NULL,
  `title` text NOT NULL,
  `age` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctors`
--

INSERT INTO `doctors` (`id`, `firstName`, `lastName`, `title`, `age`) VALUES
(1, 'Harvey', 'Montana', 'Family doctor', 31),
(2, 'asds', 'adsad', 'dasd', 43),
(3, 'asdas', 'dsada', 'dasda', 3),
(4, 'asdsa', 'dsad', 'dasda', 3),
(5, 'sfdsfd', 'dfsfsd', 'fsdfsd', 43);

-- --------------------------------------------------------

--
-- Table structure for table `patients`
--

CREATE TABLE `patients` (
  `id` int(11) NOT NULL,
  `firstName` text NOT NULL,
  `lastName` text NOT NULL,
  `SSN` text NOT NULL,
  `phoneNumber` text NOT NULL,
  `description` text NOT NULL,
  `age` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patients`
--

INSERT INTO `patients` (`id`, `firstName`, `lastName`, `SSN`, `phoneNumber`, `description`, `age`) VALUES
(1, 'Michael', 'Meira', '432432453', '435432543', 'problems with...', 22),
(2, 'da', 'sdsad', 'dasdsa', 'dsadadsd', 'asdadsad', 33),
(3, 'Jess', 'Apple', '12412414', '1412123323', 'dasdasdasdsadsddadasdsadasdsadasdasdasdasdsadsadsad', 12);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `doctors`
--
ALTER TABLE `doctors`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `patients`
--
ALTER TABLE `patients`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `doctors`
--
ALTER TABLE `doctors`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `patients`
--
ALTER TABLE `patients`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

```
