-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: inventory_management_data
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `productsinformationdata`
--

DROP TABLE IF EXISTS `productsinformationdata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productsinformationdata` (
  `id` int NOT NULL AUTO_INCREMENT,
  `QRCode` longblob NOT NULL,
  `ProductID` varchar(45) NOT NULL,
  `ProductName` varchar(45) NOT NULL,
  `ProductPrice` double NOT NULL,
  `ProductQuantity` int NOT NULL,
  `Category` varchar(45) NOT NULL,
  `ProductOrderDate` date NOT NULL,
  `SupplierName` varchar(45) NOT NULL,
  `SupplierAddress` varchar(45) NOT NULL,
  `SupplierEmailAddress` varchar(45) NOT NULL,
  `SupplierContactInfo` int NOT NULL,
  `DateCreated` datetime DEFAULT CURRENT_TIMESTAMP,
  `DateUpdated` datetime DEFAULT CURRENT_TIMESTAMP,
  `DateDeleted` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productsinformationdata`
--

LOCK TABLES `productsinformationdata` WRITE;
/*!40000 ALTER TABLE `productsinformationdata` DISABLE KEYS */;
INSERT INTO `productsinformationdata` VALUES (10,_binary '�PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0}\0\0\0}\0\0\0\0\��r\0\0�IDATx^\�\�A�\�HDѷ�MW�ܺB�e2�?k����\�3N����\'\�\�Ϙw?c\���y�3\�\�Ϙw?c\���y�3\�\�Ϙw?c\���y�3\�\�Ϙw?c\���y�3\�\�Ϙw?��\�/�߸X�9e:ܿ�4o\��q�s\�t*�Ci>\�\�!~\�b\�\�Tp��\�|��C�\�\�:\�)ө\��\r���;ls�s\�t2��|\�ݗt\��̻/\�\��w_ҵ\��һ37ַ�\�!\�drc}\�J�vsc}ˉ�N&7\�g��4ow07ַ�\�!\�drc}\�J�vsc}ˉ�N&7\�g��4ow07\�gNֱ��\�\�X���Ҽ\��\�X�9Y\�r�sc}\�J�vsc}\�d\�\�:̍��o(\�\�̍���u,\'\�07\�g��4ow07\�\�\�\���\�X���Ҽ\��\�X?�\�grc}\�J�vsc�Ln��ɍ��o(\�\�̍�3��~&7\�g��4\�u�\�\�!\�0_յ\�3ﾤk\�g\�}Iמϼ���=�\�w\�b���.ܿ�4o\�`���.ܿ�4o\�`���.ܿ�4o\�`���.ܿ�:����+\��\��ŷ\\w����/�劸\�\���}�-W\�]?�t_�׋u�;�\�1q\�N�\�NQiW�\�b\�\��vL���\�ST\�\�X�9�C�g\�d�\��vŻ.\�aN\�\�j\�ę;�>;E��e���s�\�wu���K2w�C\�an2��NRu~I\�nv\�:\�M�\�\�I�\�/\�\�\�Y��\���:I�yޑ��e�V;{O*�I���/#3\��v(��Tf�J{y_Ff�Z\�P\�=�\�&���\�,;�ڡ\�{R�M*\�\�}{�l\'sb�K�\�%��\�\�-�\�\�e;�;]\�7.���4o�\�\�.\�ɜ\�\��q��E��x\�%�v\�N\�\�N���K\�-�\��\�nb��Yc���2�\rm�\�>\��5\�\�\�)\�\�ж\�\�c��Yc���2�\rm�\�>\��5\�\�\�)\�\�й��9#\�߉3O\�|�����o�$\�߉3O\�|�����o�$\�߉3O\�|�����o�$\�߉3O\�|�\�\�xc\�\�<\�f39Y���\�<\�\�b��g\�l&\'\�0\�P�\�]l?��\�\�d\�J󼣋\�g�a����\�|Ci�\�\�\�07��KJ\�\�5�\�:\�M���\�7�n\�\�sS鿤�[3{�\�\�T�/)}\�nen�\�ܰO�w��;���Ҽ\��\�X��a�b\�{w*�\r�y����>s\�>\�\�%�\�T�J�vsc}\�}��K\�ݩ�7�\�\�\�\����2�\�Ɉ�J�vsc�LN�N�d\��E�y����~&�L\'�{2\���Ҽ\��\�X?�S���=q~Qi\�\�`n�\�\�X\�r�v��Ҽ\��\�X����\�\�\���y����>sc}\�\�\��/J�vsc}\�\������_�\�\�=�9�Cֱ�\�)*\�\�\���\�\�Y\�rb����\�&۳�;dˉ��Ү��l\�jN\�u,\'v�J�\�]2�W;&\�܉3MJ{\�2�W;&\�܉3MJ{\�2�W;&\�܉3MJ{\�2�W;&\�܉3M\�\�;��w?c\���y�3\�\�Ϙw?c\���y�3\�\�Ϙw?c\���y�3\�\�Ϙw?c\���y�3\�\�Ϙw?c\���y�3\�\�\���d��ٲÖ\0\0\0\0IEND�B`�','207010','Bear',99,9,'Beverage','2024-03-29','San Miguel Corp','Digos City','fasdfasd',2312,'2024-03-29 17:35:28','2024-03-29 17:35:28',NULL),(11,_binary '�PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0}\0\0\0}\0\0\0\0\��r\0\0�IDATx^\�\�A�\�:ѷ�MW�\��[�HՀg�HҴ�}\�\r�b0��\�w̻\�1\�~Ǽ��\�w̻\�1\�~Ǽ��\�w̻\�1\�~Ǽ��\�w̻\�1\�~Ǽ��\�w̻\�Qz�/�\�X�Üv:\��4o\���X�9\�t*��@i>\�\�!~c�s\�\�Tp��\�|��C�\�b\�ө\�����;ls�s\�\�\�\�\��wO\�\��wO\�\��wO\�\��y\�ݙ\�[N\�uvrc}\�J�vsc}ˉ�\�Nn�\��@i\�\�`n�o9�C\�\�ɍ��(\�\�̍�-\'v\�:;��>��y����>s��\�d\�\��\��\�\�\�\��\�\�:��u�\�3?P��;�\�3\'\�XN\�an�\��@i\�\�`n�Ϝ�c9Y���>��y�����Nn���\�3?P��;�\�\�\�\��;��>��y�����Nn���\�3?P��;�\�\�\�\��;��>����;l�\�\�Y�yVמϼ{Jמϼ{Jמϼ{JמO\�w��]y\�?P���t��]y\�?P���t��]y\�?P���t��]y\�?P�U�׌�\�\���}�-3\��\��ŷ̈�~\�O\�\�2#\��1��\�.\�aN\�P�c\�̓�>;E�]�\�:̉\�vL�y�\�g���+޵X�9�Cَ�3Ov�\��vŻ\�0\'v(\�1q\�\�N���\�.�\��,\�c�\����{I�y�\��,\�c�\����{I�y�\��,\�c�\����{I�y�\��,\�c�\����{I\���⽋u,\'v(��\�{g\�0?P�����u,\'v(��\�{g\�0?P�����u,\'v(��\�{g\�0?P�����u,\'v(��\�{g\�0?P��?\�D���\�27\����[\�,���\�27\����[\�,���\�27\����[\�,���\�27\���ҭ�ę%��\���Sɉ���\�|�\�I�Yb\�\�N\�:��ء\�K*\�\�[�ę%��\���Sɉ���\�|�\�I�Yb\�\�N\�:��ء\�K�οj\�?w:\�~V\�Uй�\�\�?\�t������sW��\�\��YqWA\�v;��\�!��⮂ҮxWۿ��uvr���y\�\�\��\�\�d����\��@i�wt��;9Yg\'\'\�0?P�\�]l�NN\�\�\�\�:\��\�\�\�\�c\�\�I\�]�\�\�sS鿤�[w�X����_R�F׭;{�\�\�T�/)}\�nen�Ϝ�c9�c*��y����>s��\�Ď���\�\�\�\��\�\�:�;�\�?P��;�\�3\'\�XN\�J�@i\�\�`n��͉���\�8�T��;�\�gsb\'+\��&\�\'�\�\�\�\��ٜ\�Ɋ����I�y����~6\'v�\�o\�|Ri\�\�`n�\�<+�\�\��J�vsc}\�Y\�=o��P��;�\�3\�\�\�y���Ҽ\��\�X�yVv\�\��?�\�\�=\�\r�{�u,\'v�J��n�=\�\r�{�u,\'v�J��n�=\�\r�{�u,\'v�J��n�=\�\r�{�u,\'v�J�\�]��s��3O\�L�\�\�xc���\�c\�̓8Ӥ�7\�ءk?��8�$\�4)\�7v\�\�\�=&\�<�3M\�\�;�6\�~Ǽ��\�w̻\�1\�~Ǽ��\�w̻\�1\�~Ǽ��\�w̻\�1\�~Ǽ��\�w̻\�1\�~Ǽ��\�w̻\��?��6z�P\�8\0\0\0\0IEND�B`�','374330','dasdfasd',232,11,'Beverage','2024-03-29','sdfaasd','sadfs','dsfasdf',23423,'2024-03-29 17:43:09','2024-03-29 17:43:09','2024-03-29 00:00:00'),(12,_binary '�PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0}\0\0\0}\0\0\0\0\��r\0\0)IDATx^\�\�A#;Ѿ��=+7\�D�RR_^�-IK>\�?k0��\�o̻�1\��Ƽ��\�o̻�1\��Ƽ��\�o̻�1\��Ƽ��\�o̻�1\��Ƽ��\�o̻����\�o|Y�9U:	\�?ͯ�tX��e\�T\�$��@4�\�\�a�Ɨu�S��\��\��zK��_\�aN�N��D�]wT��c֙�J��k\�g\�}Kמϼ���=�y�-]{>�ޝ���\�t,7\�g~ ��;�\�[NI\�rc}\��y�����\�t,7\�g~ ��;�\�[NI\�rc}\��y����>s��\�d\�\��\�D�vsc}\�d\�\�:̍���\�\�\�\��\�\�:��u�\�3?\�\�̍���u,\'\�07\�g~ ��;�\�37\�Orc}\��y����>sc�$7\�g~ ��;�\�37\�Orc}\��y����>sc�$7\�g~ �\�\��\�wu\��̻o\�\��w\�ҵ\�3ﾥkϧ�ݻ\������\�\�[:\������\�\�[:\������\�\�[:\�����H\�Z��k��~���-�v;?\�\�[\��k��~���-�v;?(�o�\��g���|��\�?\�\�}f���|��\�?\�\�}f���|��\�?\�\�}f���|��\�?\�\�W\�d�*{�cy(\�U��\�1\�,U�X\��P��rS�c�Y�챎\�hW\�J\�$�T\�c\�Cm�\�>\�dˍ���J�Z{�\���\�&\�dˍ���J�Z{�\���\�&\�dˍ���J�Z{�\���\�&\�dˍ���J�Z{��y�c7���YZ{��y�c7���YZ{��y�c7���YZ{��y�c7���YZ{��y������nN\�P�S\�\��\�t�wsb�*��h\�\�䦫��;T\�E�vG%7]�ݜءJ�(����\�Ir��\��U���N��u�H篪��u���\��@:U\�?��\�d\��y\�ѥ�\�:���\�	E{y_�\�~\�XnاJ\'\�\�}]*��c�a�*�P���u�췎\�}�tB\�ޮ�ls�t(\�_}�\�V\�Ü*J��D\�\�\��0�J���%\�7�n�=̩ҡ�I�\r�����\�d\�\r�d\�D�vsc}\�\�:��\�:��\�\�\�\����u,7\�u,?\�\�̍�-\'\�Xn\�\'\�X~ ��;�\�3�J\�\�βOk/\��\�3�J\�\�βOk/\��\�3�J\�\�βOk/\��\�3�J\�\�βOk/\��\�\�\�\�\��?D�vsc���\���h\�\�`n�#7���\�\�̍�o\�\�v����;lsþ�\�?\�\�\��07\�\��\�ޮ�lsþ�\�?\�\�\��07\�\��\�^\�\�\��37ֿ��\�yG\�\�\�X�v~ �\�]l?sc�\���h�wt��̍�o\�\��qf\���y�7\�\�ߘwc\���y�7\�\�ߘwc\���y�7\�\�ߘwc\���y�7\�\�ߘwc\���y�7\�\�ߘw\�9�� \�.�\0\0\0\0IEND�B`�','804158','asds',23,13,'Appliances','2024-03-29','asdfasd','sadfasd','asdfsd',23421,'2024-03-29 17:56:38','2024-03-29 17:56:38','2024-03-29 00:00:00');
/*!40000 ALTER TABLE `productsinformationdata` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-03-29 18:10:33
