-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 09-Jan-2019 às 11:31
-- Versão do servidor: 10.1.37-MariaDB
-- versão do PHP: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `icmbio`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `embarcacao`
--

CREATE TABLE `embarcacao` (
  `codigo_embarcacao` int(11) NOT NULL,
  `nome_embarcacao` varchar(100) NOT NULL,
  `TIE` varchar(100) NOT NULL,
  `nome_proprietario` varchar(100) NOT NULL,
  `numero_passageiros` varchar(15) NOT NULL,
  `Tamanho_embarcacao` varchar(15) NOT NULL,
  `capacidade_passageiros` int(15) NOT NULL,
  `local` varchar(50) NOT NULL,
  `OBS` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `codigo_modalidade` int(11) NOT NULL,
  `est` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `modalidade`
--

CREATE TABLE `modalidade` (
  `nome_modalidade` varchar(100) NOT NULL,
  `codigo_modalidade` int(11) NOT NULL,
  `est` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


-- --------------------------------------------------------

--
-- Estrutura da tabela `saida`
--

CREATE TABLE `saida` (
  `codigo_saida` int(11) NOT NULL,
  `codigo_solicitacao` int(11) NOT NULL,
  `numero_saidas` int(11) NOT NULL,
  `numero_visitantes` int(11) NOT NULL,
  `mes` varchar(30) NOT NULL,
  `ano` varchar(30) NOT NULL,
  `est` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Estrutura da tabela `solicitacao`
--

CREATE TABLE `solicitacao` (
  `codigo_solicitacao` int(11) NOT NULL,
  `numero_processo` varchar(100) NOT NULL,
  `sequencia_anual` varchar(100) NOT NULL,
  `status` varchar(100) NOT NULL,
  `motivo` varchar(200) NOT NULL,
  `codigo_solicitante` int(11) NOT NULL,
  `codigo_embarcacao` int(11) NOT NULL,
  `est` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `solicitante`
--

CREATE TABLE `solicitante` (
  `codigo_solicitante` int(11) NOT NULL,
  `nome` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `beneficiario` varchar(10) NOT NULL,
  `CPF_CNPJ` varchar(100) NOT NULL,
  `telefone` varchar(100) NOT NULL,
  `endereco` varchar(100) NOT NULL,
  `bairro` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `cidade` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `cep` varchar(20) NOT NULL,
  `email` varchar(100) NOT NULL,
  `razao_social` varchar(100) NOT NULL,
  `nome_fantasia` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `responsavel` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `operadora` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `est` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `codigo_usuario` int(11) NOT NULL,
  `login` varchar(100) NOT NULL,
  `senha` varchar(50) NOT NULL,
  `est` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`codigo_usuario`, `login`, `senha`, `est`) VALUES
(3, 'admin', '123', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `embarcacao`
--
ALTER TABLE `embarcacao`
  ADD PRIMARY KEY (`codigo_embarcacao`),
  ADD KEY `codigo_modalidade_fk` (`codigo_modalidade`);

--
-- Indexes for table `modalidade`
--
ALTER TABLE `modalidade`
  ADD PRIMARY KEY (`codigo_modalidade`);

--
-- Indexes for table `saida`
--
ALTER TABLE `saida`
  ADD PRIMARY KEY (`codigo_saida`);

--
-- Indexes for table `solicitacao`
--
ALTER TABLE `solicitacao`
  ADD PRIMARY KEY (`codigo_solicitacao`),
  ADD KEY `codigo_solicitante_fk` (`codigo_solicitante`),
  ADD KEY `codigo_embarcacao_fk` (`codigo_embarcacao`);

--
-- Indexes for table `solicitante`
--
ALTER TABLE `solicitante`
  ADD PRIMARY KEY (`codigo_solicitante`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`codigo_usuario`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `embarcacao`
--
ALTER TABLE `embarcacao`
  MODIFY `codigo_embarcacao` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=309;

--
-- AUTO_INCREMENT for table `modalidade`
--
ALTER TABLE `modalidade`
  MODIFY `codigo_modalidade` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `saida`
--
ALTER TABLE `saida`
  MODIFY `codigo_saida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `solicitacao`
--
ALTER TABLE `solicitacao`
  MODIFY `codigo_solicitacao` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `solicitante`
--
ALTER TABLE `solicitante`
  MODIFY `codigo_solicitante` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=311;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `codigo_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `embarcacao`
--
ALTER TABLE `embarcacao`
  ADD CONSTRAINT `embarcacao_ibfk_1` FOREIGN KEY (`codigo_modalidade`) REFERENCES `modalidade` (`codigo_modalidade`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `solicitacao`
--
ALTER TABLE `solicitacao`
  ADD CONSTRAINT `codigo_embarcacao_fk` FOREIGN KEY (`codigo_embarcacao`) REFERENCES `embarcacao` (`codigo_embarcacao`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `codigo_solicitante_fk` FOREIGN KEY (`codigo_solicitante`) REFERENCES `solicitante` (`codigo_solicitante`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
