-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-11-2019 a las 17:16:53
-- Versión del servidor: 10.1.9-MariaDB
-- Versión de PHP: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto11`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administracion`
--

CREATE TABLE `administracion` (
  `idAdministracion` int(11) NOT NULL,
  `adminnombre` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE `alumno` (
  `idAlumno` int(11) NOT NULL,
  `Alumnonombre` varchar(45) NOT NULL,
  `Direccion` varchar(40) NOT NULL,
  `Numerotel` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`idAlumno`, `Alumnonombre`, `Direccion`, `Numerotel`) VALUES
(1, 'alejandra', 'sur', '3030'),
(2, 'franc', 'sur', '5656');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `directivo`
--

CREATE TABLE `directivo` (
  `idDirectivo` int(11) NOT NULL,
  `nombredirectivo` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE `materia` (
  `idMateria` int(11) NOT NULL,
  `Materianombre` varchar(45) DEFAULT NULL,
  `idProfesor` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`idMateria`, `Materianombre`, `idProfesor`) VALUES
(1, 'danza', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesor`
--

CREATE TABLE `profesor` (
  `idProfesor` int(11) NOT NULL,
  `profnombre` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `profesor`
--

INSERT INTO `profesor` (`idProfesor`, `profnombre`) VALUES
(1, 'carlos'),
(2, 'pedro');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `salon`
--

CREATE TABLE `salon` (
  `idSalon` int(11) NOT NULL,
  `idAlumno` int(11) NOT NULL,
  `idMateria` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `salon`
--

INSERT INTO `salon` (`idSalon`, `idAlumno`, `idMateria`) VALUES
(1, 1, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administracion`
--
ALTER TABLE `administracion`
  ADD PRIMARY KEY (`idAdministracion`);

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`idAlumno`);

--
-- Indices de la tabla `directivo`
--
ALTER TABLE `directivo`
  ADD PRIMARY KEY (`idDirectivo`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`idMateria`),
  ADD KEY `idProfesor_idx` (`idProfesor`);

--
-- Indices de la tabla `profesor`
--
ALTER TABLE `profesor`
  ADD PRIMARY KEY (`idProfesor`);

--
-- Indices de la tabla `salon`
--
ALTER TABLE `salon`
  ADD PRIMARY KEY (`idSalon`),
  ADD KEY `idMateria_idx` (`idMateria`),
  ADD KEY `idAlumno_idx` (`idAlumno`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `administracion`
--
ALTER TABLE `administracion`
  MODIFY `idAdministracion` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `alumno`
--
ALTER TABLE `alumno`
  MODIFY `idAlumno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `directivo`
--
ALTER TABLE `directivo`
  MODIFY `idDirectivo` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `materia`
--
ALTER TABLE `materia`
  MODIFY `idMateria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `profesor`
--
ALTER TABLE `profesor`
  MODIFY `idProfesor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `salon`
--
ALTER TABLE `salon`
  MODIFY `idSalon` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `materia`
--
ALTER TABLE `materia`
  ADD CONSTRAINT `idProfesor` FOREIGN KEY (`idProfesor`) REFERENCES `profesor` (`idProfesor`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `salon`
--
ALTER TABLE `salon`
  ADD CONSTRAINT `idAlumno` FOREIGN KEY (`idAlumno`) REFERENCES `alumno` (`idAlumno`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `idMateria` FOREIGN KEY (`idMateria`) REFERENCES `materia` (`idMateria`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
