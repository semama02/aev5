-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-12-2021 a las 19:20:33
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `aev05`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `llibres`
--

CREATE TABLE `llibres` (
  `identificador` int(11) NOT NULL,
  `titol` varchar(35) NOT NULL,
  `autor` varchar(35) NOT NULL,
  `any_naixement` varchar(35) NOT NULL,
  `any_publicacio` varchar(35) NOT NULL,
  `editorial` varchar(35) NOT NULL,
  `num_pags` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `llibres`
--

INSERT INTO `llibres` (`identificador`, `titol`, `autor`, `any_naixement`, `any_publicacio`, `editorial`, `num_pags`) VALUES
(2, 'El juego de Ender', 'Orson Scott Card', '1951', '1977', 'Ediciones B', '509'),
(3, 'Lazarillo de Tormes', 'Anónimo', 'N.C', '1554', 'Clásicos Populares', '150'),
(4, 'Las uvas de la ira', 'John Steinbeck', '1902', '1939', 'Alianza', '619'),
(5, 'Watchmen', 'Alan Moore', '1953', '1980', 'ECC', '416'),
(6, 'La hoguera de las vanidades', 'Tom Wolfe', '1930', '1980', 'Anagrama', '636'),
(7, 'La familia de Pascual Duarte', 'Camilo José Cela', '1916', '1942', 'Destino', '165'),
(8, 'El señor de las moscas', 'William Golding', '1911', '1972', 'Alianza', '236'),
(9, 'La ciudad de los prodigios', 'Eduardo Mendoza', '1943', '1986', 'Seix Barral', '541'),
(10, 'Ensayo sobre la ceguera', 'José Saramago', '1922', '1995', 'Santillana', '439'),
(11, 'Los surcos del azar', 'Paco Roca', '1969', '2013', 'Astiberri', '349'),
(12, 'Ghosts of Spain', 'Giles Tremlett', '1962', '2006', 'Faber & Faber', '468'),
(13, 'Sidi', 'Arturo Pérez Reverte', '1951', '2019', 'Penguin', '369'),
(14, 'Dune', 'Frank Herbert', '1920', '1965', 'Acervo', '741'),
(15, 'El señor de los anillos', 'J.R.R. Tolkien', '1890', '1950', 'Minotauro', '1392'),
(16, 'El juego de Ender', 'Orson Scott Card', '1951', '1977', 'Ediciones B', '509'),
(17, 'Lazarillo de Tormes', 'Anónimo', 'N.C', '1554', 'Clásicos Populares', '150'),
(18, 'Las uvas de la ira', 'John Steinbeck', '1902', '1939', 'Alianza', '619'),
(19, 'Watchmen', 'Alan Moore', '1953', '1980', 'ECC', '416'),
(20, 'La hoguera de las vanidades', 'Tom Wolfe', '1930', '1980', 'Anagrama', '636'),
(21, 'La familia de Pascual Duarte', 'Camilo José Cela', '1916', '1942', 'Destino', '165'),
(22, 'El señor de las moscas', 'William Golding', '1911', '1972', 'Alianza', '236'),
(23, 'La ciudad de los prodigios', 'Eduardo Mendoza', '1943', '1986', 'Seix Barral', '541'),
(24, 'Ensayo sobre la ceguera', 'José Saramago', '1922', '1995', 'Santillana', '439'),
(25, 'Los surcos del azar', 'Paco Roca', '1969', '2013', 'Astiberri', '349'),
(26, 'Ghosts of Spain', 'Giles Tremlett', '1962', '2006', 'Faber & Faber', '468'),
(27, 'Sidi', 'Arturo Pérez Reverte', '1951', '2019', 'Penguin', '369'),
(28, 'Dune', 'Frank Herbert', '1920', '1965', 'Acervo', '741'),
(30, '190', 'a', 'a', 'a', 'a', 'a'),
(31, '190', 'asd', 'asd', 'asd', 'sad', '213'),
(32, 'asd', 'asd', 'asd', 'asd', '12', '12'),
(33, 'asd', 'asd', 'asd', 'asd', 'asd', '123'),
(34, 'asd', 'asd', 'asd', 'asd', 'asd', '12345');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `llibres`
--
ALTER TABLE `llibres`
  ADD PRIMARY KEY (`identificador`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `llibres`
--
ALTER TABLE `llibres`
  MODIFY `identificador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
