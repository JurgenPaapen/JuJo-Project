

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `clockyourhours`
--

-- --------------------------------------------------------

--
-- Table structure for table `Client`
--

CREATE TABLE `Client` (
                        `ID` int(10) NOT NULL,
                        `CompanyName` varchar(255) NOT NULL,
                        `Address` varchar(255) NOT NULL,
                        `ZipCode` varchar(255) NOT NULL,
                        `City` varchar(255) NOT NULL,
                        `Country` varchar(255) NOT NULL,
                        `Email` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Client`
--

INSERT INTO `Client` (`ID`, `CompanyName`, `Address`, `ZipCode`, `City`, `Country`, `Email`) VALUES
(1, 'Jansen Bouw', 'Mary Zeldenrustlaan 165', '5122CH', 'Rijen', 'Netherlands', 'joostoomen@hotmail.com'),
(2, 'fritsen Bouw', 'Mary Kees 165', '8765GB', 'Groningen', 'Netherlands', 'fritsen@hotmail.com'),
(3, 'Paapen Elektra', 'Mary truus 165', '4876PL', 'Kaatsheuvel', 'Netherlands', 'Paapen@hotmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `Project`
--

CREATE TABLE `Project` (
                         `ID` int(10) NOT NULL,
                         `ProjectName` varchar(255) NOT NULL,
                         `ClientID` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Project`
--

INSERT INTO `Project` (`ID`, `ProjectName`, `ClientID`) VALUES
(1, 'dakkapel', 1),
(2, 'tuinhuis', 1),
(3, 'keuken', 2),
(4, 'kozijnen', 2),
(5, 'domotica', 3),
(6, 'meterkast', 3);

-- --------------------------------------------------------

--
-- Table structure for table `Project_Task`
--

CREATE TABLE `Project_Task` (
                              `ProjectID` int(10) NOT NULL,
                              `TaskID` int(10) NOT NULL,
                              `TimesStamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                              `Duration` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Task`
--

CREATE TABLE `Task` (
                      `ID` int(10) NOT NULL,
                      `TaskName` varchar(255) NOT NULL,
                      `CostPerHour` int(10) NOT NULL,
                      `ProjectID2` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Task`
--

INSERT INTO `Task` (`ID`, `TaskName`, `CostPerHour`, `ProjectID2`) VALUES
(1, 'opbouw', 25, 1),
(2, 'afwerking', 45, 1),
(3, 'grondwerk', 25, 2),
(4, 'opbouw', 45, 2),
(5, 'afwerking', 35, 3),
(6, 'inmeten', 35, 3),
(7, 'inmeten', 95, 4),
(8, 'plaatsen', 65, 4),
(9, 'voorlichting', 125, 5),
(10, 'hulp op afstand', 90, 5),
(11, 'hoofdschakelaar omzeilen', 85, 6),
(12, 'wietplantage aanleggen', 145, 6);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Client`
--
ALTER TABLE `Client`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `ID` (`ID`);

--
-- Indexes for table `Project`
--
ALTER TABLE `Project`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FKProject552187` (`ClientID`);

--
-- Indexes for table `Project_Task`
--
ALTER TABLE `Project_Task`
  ADD PRIMARY KEY (`ProjectID`,`TaskID`),
  ADD KEY `ProjectID` (`ProjectID`),
  ADD KEY `TaskID` (`TaskID`),
  ADD KEY `TimesStamp` (`TimesStamp`);

--
-- Indexes for table `Task`
--
ALTER TABLE `Task`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FKTask417980` (`ProjectID2`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Client`
--
ALTER TABLE `Client`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `Project`
--
ALTER TABLE `Project`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `Task`
--
ALTER TABLE `Task`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;


--
-- Constraints for table `Project`
--
ALTER TABLE `Project`
  ADD CONSTRAINT `FKProject552187` FOREIGN KEY (`ClientID`) REFERENCES `Client` (`ID`);

--
-- Constraints for table `Project_Task`
--
ALTER TABLE `Project_Task`
  ADD CONSTRAINT `FKProject_Ta470152` FOREIGN KEY (`TaskID`) REFERENCES `Task` (`ID`),
  ADD CONSTRAINT `FKProject_Ta552452` FOREIGN KEY (`ProjectID`) REFERENCES `Project` (`ID`);

--
-- Constraints for table `Task`
--
ALTER TABLE `Task`
  ADD CONSTRAINT `FKTask417980` FOREIGN KEY (`ProjectID2`) REFERENCES `Project` (`ID`);

CREATE TABLE `serialized_java_objects` (
                                         `serialized_id` int(11) NOT NULL auto_increment,
                                         `object_name` varchar(20) default NULL,
                                         `serialized_object` blob,
                                         PRIMARY KEY (`serialized_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;