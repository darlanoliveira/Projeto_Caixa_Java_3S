-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 11-Jun-2018 às 05:36
-- Versão do servidor: 10.1.28-MariaDB
-- PHP Version: 5.6.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `caixa`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_funcionario`
--

CREATE TABLE `tb_funcionario` (
  `id_func` int(11) NOT NULL,
  `nome_func` varchar(50) NOT NULL,
  `cpf_func` varchar(50) NOT NULL,
  `email_func` varchar(50) NOT NULL,
  `senha_func` varchar(50) NOT NULL,
  `cargo_func` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tb_funcionario`
--

INSERT INTO `tb_funcionario` (`id_func`, `nome_func`, `cpf_func`, `email_func`, `senha_func`, `cargo_func`) VALUES
(1, 'wen', 'wen', 'wen', 'wen', 'wen'),
(2, 'Wendell', '123321', 'wendell@hormai.com', '123', 'Funcionario'),
(3, 'Wendell Tufano', '46736497884', 'wendell@hotmail.com', '123', 'Funcionario'),
(4, 'Pablo Tufano', '46736497884', 'pablo@hotmail.com', '123', 'Gerente'),
(5, 'Wendell', 'wendell', 'wendell', '123', 'Gerente'),
(6, 'Lontra', '123', 'Lontra@hotmil.com', '123', 'Funcionario'),
(7, 'Darlan Alves', '123', 'Darlan@hotmail.com', '123', 'Gerente'),
(8, 'Dunha', '12312312313', 'dunha@gmail.com', '123', 'gerente');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_pedido`
--

CREATE TABLE `tb_pedido` (
  `id_prato` int(4) NOT NULL,
  `nome_prato` varchar(100) NOT NULL,
  `valor_prato` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tb_pedido`
--

INSERT INTO `tb_pedido` (`id_prato`, `nome_prato`, `valor_prato`) VALUES
(1, 'Escolha um prato', 0),
(2, 'Filé com Fritas', 10),
(3, 'Hamburger', 5),
(4, 'Lasanha', 15);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_funcionario`
--
ALTER TABLE `tb_funcionario`
  ADD PRIMARY KEY (`id_func`);

--
-- Indexes for table `tb_pedido`
--
ALTER TABLE `tb_pedido`
  ADD PRIMARY KEY (`id_prato`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_funcionario`
--
ALTER TABLE `tb_funcionario`
  MODIFY `id_func` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `tb_pedido`
--
ALTER TABLE `tb_pedido`
  MODIFY `id_prato` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
