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
INSERT INTO `productsinformationdata` VALUES (10,_binary '‰PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0}\0\0\0}\0\0\0\0\âûr\0\0IDATx^\í\ÐA®\ìHDÑ·ÿMWÜºB¾e2Á?kÀ†Œó\ï3Nø‹Áø\'\æ\ÝÏ˜w?c\ÞýŒy÷3\æ\ÝÏ˜w?c\ÞýŒy÷3\æ\ÝÏ˜w?c\ÞýŒy÷3\æ\ÝÏ˜w?c\ÞýŒy÷3\æ\ÝÏ˜w?£ô\î/ˆß¸X‡9e:Ü¿¡4o\é¿q±s\Êt*¸Ci>\Þ\Ò!~\ãb\æ”\éTpÿ†\Ò|¼¥Cü\Æ\Å:\Ì)Ó©\àþ\r¥ù®;ls²s\Êt2ºö|\æÝ—t\íùÌ»/\é\Úó™w_Òµ\çóÒ»37Ö·œ\Ø!\ëdrc}\æJóvsc}Ë‰²N&7\Ög¾¡4ow07Ö·œ\Ø!\ëdrc}\æJóvsc}Ë‰²N&7\Ög¾¡4ow07\ÖgNÖ±œ¬\Ã\ÜXŸù†Ò¼\ÝÁ\ÜXŸ9Y\Çr²sc}\æJóvsc}\æd\Ë\É:Ìõ™o(\Í\ÛÌõ™“u,\'\ë07\Ög¾¡4ow07\Ö\Ï\ä\Æú™\ÜXŸù†Ò¼\ÝÁ\ÜX?“\ëgrc}\æJóvscýLn¬ŸÉõ™o(\Í\ÛÌõ3¹±~&7\Ög¾¡4\ßu‡\í±œ\Ø!\ë0_Õµ\ç3ï¾¤k\Ïg\Þ}I×žÏ¼û’®=Ÿ\Æw\ïbû»ò.Ü¿¡4o\é`û»ò.Ü¿¡4o\é`û»ò.Ü¿¡4o\é`û»ò.Ü¿¡:ÿªø¯+\â®ó\Ó÷Å·\\wý˜Ÿ¾/¾åŠ¸\ë\Çüô}ñ-W\Ä]?¦t_ü×‹u˜;´\Ú1q\æN¦\ÏNQiW¼\ëb\æ\Ä­vLœ¹“\é³ST\Ú\ïºX‡9±C«g\îdú\ì•vÅ».\ÖaN\ì\Ðj\ÇÄ™;™>;E»eþ²s“\éwu’ªóK2w³C\Öan2ý®NRu~I\ænv\È:\ÌM¦\ß\ÕIª\Î/\É\Ü\ÍY‡¹\Éô»:I¥yÞ‘‘™e‡V;{O*³I¥½¼/#3\Ë­v(öžTf“J{y_Ff–Z\íP\ì=©\Ì&•öò¾Œ\Ì,;´Ú¡\Ø{R™M*\í\å}{»l\'sb§Kü\Æ%ö•\æ\ã-—\Ø\Ûe;™;]\â7.±·¨4o¹\Ä\Þ.\ÛÉœ\Ø\é¿q‰½E¥ùx\Ë%öv\ÙN\æ\ÄN—øK\ì-ª\Îÿ\ÏnbžÁYcý®œ2\rm»\ì>\æœ5\Ö\ï\Ê)\Ó\ÙÐ¶\Ë\îcžÁYcý®œ2\rm»\ì>\æœ5\Ö\ï\Ê)\Ó\ÙÐ¹«ÿ9#\Îß‰3O\â|“·ö¶ˆoð$\Îß‰3O\â|“·ö¶ˆoð$\Îß‰3O\â|“·ö¶ˆoð$\Îß‰3O\â|“\Ò\Þxc\Û\Ï<\Ãf39Y‡ù†\Ò<\ï\èbû™g\Øl&\'\ë0\ßPš\ç]l?ó›\Í\äd\æJó¼£‹\ígža³™œ¬\Ã|Ci¾\ëŽ\Ì\ë07•þKJ\ß\èº5³\Ç:\ÌM¥ÿ’\Ò7ºn\Í\ì±sSé¿¤ô®[3{¬\Ã\ÜTú/)}\Ãnen¬\ÏÜ°O±w‰½;•þ†Ò¼\ÝÁ\ÜXŸ¹aŸb\ï{w*ý\r¥y»ƒ¹±>s\Ã>\Å\Þ%ö\îTúJóvsc}\æ†}Š½K\ìÝ©ô7”\æ\í\æ\Æú™œ2\îÉˆó‹JóvscýLN™N÷d\ÄùE¥y»ƒ¹±~&§L\'ƒ{2\âü¢Ò¼\ÝÁ\ÜX?“S¦“Á=q~Qi\Þ\î`n¬\Ï\ÜX\ßróvÿ‹Ò¼\ÝÁ\ÜXŸ¹±¾\å\æ\íþ¥y»ƒ¹±>sc}\Ë\Í\Ûý/Jóvsc}\æ\Æú–›·û_”\æ»\î°=«9±CÖ±œ\Ø)*\í\êº\Éö¬\æ\ÄY\Çrb§¨´«\ë&Û³š;dË‰¢Ò®®›l\ÏjN\ìu,\'vŠJ»\â]2ûW;&\ÎÜ‰3MJ{\ã2ûW;&\ÎÜ‰3MJ{\ã2ûW;&\ÎÜ‰3MJ{\ã2ûW;&\ÎÜ‰3M\Þ\Ú;¾›w?c\ÞýŒy÷3\æ\ÝÏ˜w?c\ÞýŒy÷3\æ\ÝÏ˜w?c\ÞýŒy÷3\æ\ÝÏ˜w?c\ÞýŒy÷3\æ\ÝÏ˜w?c\ÞýŒy÷3\æ\Ý\Ïø›dõºÙ²Ã–\0\0\0\0IEND®B`‚','207010','Bear',99,9,'Beverage','2024-03-29','San Miguel Corp','Digos City','fasdfasd',2312,'2024-03-29 17:35:28','2024-03-29 17:35:28',NULL),(11,_binary '‰PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0}\0\0\0}\0\0\0\0\âûr\0\0¡IDATx^\í\ÐA®\ì:Ñ·ÿMW\ÔŽ[¢HÕ€g˜HÒ´þ}\Æ\rÿb0þó\îwÌ»\ß1\ï~Ç¼ûó\îwÌ»\ß1\ï~Ç¼ûó\îwÌ»\ß1\ï~Ç¼ûó\îwÌ»\ß1\ï~Ç¼ûó\îwÌ»\ßQz÷/ˆ\ßX¬Ãœv:\Ü 4o\é¿±X‡9\ít*¸ÿ@i>\Þ\Ò!~c±s\Ú\éTpÿ\Ò|¼¥Cü\Æb\æ´Ó©\àþ¥ù®;ls²s\Ú\é\ì\è\Úó™wO\é\Úó™wO\é\Úó™wO\é\Úóy\éÝ™\ë[N\ìuvrc}\æJóvsc}Ë‰²\ÎNn¬\Ïü@i\Þ\î`n¬o9±C\Ö\ÙÉõ™(\Í\ÛÌõ-\'v\È:;¹±>ó¥y»ƒ¹±>s²Ž\åd\æ\Æú\Ì”\æ\í\æ\Æú\Ì\É:–“u˜\ë3?Pš·;˜\ë3\'\ëXN\Öan¬\Ïü@i\Þ\î`n¬Ïœ¬c9Y‡¹±>ó¥y»ƒ¹±þNn¬¿“\ë3?Pš·;˜\ë\ï\ä\Æú;¹±>ó¥y»ƒ¹±þNn¬¿“\ë3?Pš·;˜\ë\ï\ä\Æú;¹±>ó¥ù®;l\å\ÄY‡yV×žÏ¼{J×žÏ¼{J×žÏ¼{J×žO\ã»w±ý]y\î?Pš·t°ý]y\î?Pš·t°ý]y\î?Pš·t°ý]y\î?PUü×Œ¸\ë\Çüô}ñ-3\â®ó\Ó÷Å·Ìˆ»~\ÌO\ß\ß2#\îú1¥û\â¿.\ÖaN\ìP¶c\âÌ“>;E¥]ñ®\Å:Ì‰\ÊvLœy²\Óg§¨´+ÞµX‡9±CÙŽ‰3Ovú\ì•vÅ»\ë0\'v(\Û1q\æ\ÉNŸ¢\Ò.»\Éò,\Ûc¹\Éö‰³{I¥y»\Ãò,\Ûc¹\Éö‰³{I¥y»\Ãò,\Ûc¹\Éö‰³{I¥y»\Ãò,\Ûc¹\Éö‰³{I\Õù¯â½‹u,\'v(ö–\Ø{g\ë0?PÿŠ·’u,\'v(ö–\Ø{g\ë0?PÿŠ·’u,\'v(ö–\Ø{g\ë0?PÿŠ·’u,\'v(ö–\Ø{g\ë0?Pÿ?\ÞD±÷\Í27\ìÿ¸¶[\ã,±÷\Í27\ìÿ¸¶[\ã,±÷\Í27\ìÿ¸¶[\ã,±÷\Í27\ìÿ¸Ò­ñ¿ŸÄ™%öž\ìô­SÉ‰Š½¤\Ò|¼\åIœYb\ï\ÉN\ß:•œØ¡\ØK*\Í\Ç[žÄ™%öž\ìô­SÉ‰Š½¤\Ò|¼\åIœYb\ï\ÉN\ß:•œØ¡\ØKªÎ¿j\ç?w:\Ä~V\ÜUÐ¹«\Ý\Î?\ïtˆý¬¸« sW»\Þ\éûYqWA\ç®v;ÿ¼\Ó!ö³â®‚Ò®xWÛ¿““uvr²ó¥y\Þ\Ñ\Åö\ï\ädœ¬\Ãü@ižwt±ý;9Yg\'\'\ë0?Pš\ç]lÿNN\Ö\Ù\É\É:\Ì”\æ»\î\Ø\Ùc\æ¦\ÒI\é]·\î\ì±sSé¿¤ô®[wöX‡¹©ô_RúF×­;{¬\Ã\ÜTú/)}\Ãnen¬Ïœ¬c9±c*ý¥y»ƒ¹±>s²Ž\åÄŽ©ô”\æ\í\æ\Æú\Ì\É:–;¦\Ò?Pš·;˜\ë3\'\ëXN\ì˜Jÿ@i\Þ\î`n¬ŸÍ‰¬¸\ë›8ŸTš·;˜\ëgsb\'+\îú&\Î\'•\æ\í\æ\ÆúÙœ\ØÉŠ»¾‰óI¥y»ƒ¹±~6\'v²\â®o\â|Ri\Þ\î`n¬\Ï<+»\ç\íþJóvsc}\æY\Ù=o÷ÿPš·;˜\ë3\Ï\Ê\îy»ÿ‡Ò¼\ÝÁ\ÜXŸyVv\Ï\Ûý?”\æ»\î°=\Ì\rû{‹u,\'vŠJ»ºn²=\Ì\rû{‹u,\'vŠJ»ºn²=\Ì\rû{‹u,\'vŠJ»ºn²=\Ì\rû{‹u,\'vŠJ»\â]ºös‰3O\âL“\Ò\Þxc‡®ý\Üc\âÌ“8Ó¤´7\ÞØ¡k?÷˜8ó$\Î4)\í7v\è\Ú\Ï=&\Î<‰3M\Þ\Ú;þ6\ï~Ç¼ûó\îwÌ»\ß1\ï~Ç¼ûó\îwÌ»\ß1\ï~Ç¼ûó\îwÌ»\ß1\ï~Ç¼ûó\îwÌ»\ß1\ï~Ç¼ûó\îwÌ»\ßñ?½6zˆP\Ã8\0\0\0\0IEND®B`‚','374330','dasdfasd',232,11,'Beverage','2024-03-29','sdfaasd','sadfs','dsfasdf',23423,'2024-03-29 17:43:09','2024-03-29 17:43:09','2024-03-29 00:00:00'),(12,_binary '‰PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0}\0\0\0}\0\0\0\0\âûr\0\0)IDATx^\í\ÐA#;Ñ¾ÿ¥=+7\ÂDƒRR_^ð-IK>\ã…?k0þó\îoÌ»¿1\ïþÆ¼ûó\îoÌ»¿1\ïþÆ¼ûó\îoÌ»¿1\ïþÆ¼ûó\îoÌ»¿1\ïþÆ¼ûó\îoÌ»¿½ûŸ\Öo|Y‡9U:	\î?Í¯·tX¿ñe\æT\é$¸ÿ@4¿\Þ\ÒaýÆ—u˜S¥“\àþ\ÑüzK‡õ_\ÖaN•N‚ûDó]wTö°cÖ™¯J§¢k\Ïg\Þ}K×žÏ¼û–®=Ÿy÷-]{>—Þ¹±¾\å”t,7\Ög~ š·;˜\ë[NI\Çrc}\æ¢y»ƒ¹±¾\å”t,7\Ög~ š·;˜\ë[NI\Çrc}\æ¢y»ƒ¹±>s²Ž\åd\æ\Æú\ÌDóvsc}\æd\Ë\É:Ìõ™ˆ\æ\í\æ\Æú\Ì\É:–“u˜\ë3?\Í\ÛÌõ™“u,\'\ë07\Ög~ š·;˜\ë37\ÖOrc}\æ¢y»ƒ¹±>scý$7\Ög~ š·;˜\ë37\ÖOrc}\æ¢y»ƒ¹±>scý$7\Ög~ š\ïº\ãö\Ëwu\íùÌ»o\é\Úó™w\ßÒµ\ç3ï¾¥kÏ§ñÝ»\Øþ®¼÷ˆ\æ\×[:\Øþ®¼÷ˆ\æ\×[:\Øþ®¼÷ˆ\æ\×[:\Øþ®¼÷H\ç¯Zÿõk·óƒ~ú¾õ-¿v;?\è§\ï[\ßòk·óƒ~ú¾õ-¿v;?(ºoý\×ÿg·Ÿ¨|‹³\Û?\í\å}f·Ÿ¨|‹³\Û?\í\å}f·Ÿ¨|‹³\Û?\í\å}f·Ÿ¨|‹³\Û?\í­\ÜW\é˜d–*{¬cy(\ÚU¹©\Ò1\É,UöX\ÇòP´«rS¥c’Yªì±Ž\å¡hW\å¦J\Ç$³T\Ùc\ËCm»\ì>\ædËõ™›JŸZ{›\Òù¿\ì&\ædËõ™›JŸZ{›\Òù¿\ì&\ædËõ™›JŸZ{›\Òù¿\ì&\ædËõ™›JŸZ{›¢y»c7¯ø…YZ{›¢y»c7¯ø…YZ{›¢y»c7¯ø…YZ{›¢y»c7¯ø…YZ{›¢y»£’›®þnN\ìP¥S\Í\Û•\Ütõwsb‡*¢h\Þ\î¨ä¦«¿›;T\éEóvG%7]ýÝœØ¡J§(¿ªòŸ\ÖIr²ó\éüU•ÿ´N’“u˜Hç¯ªü§u’œ¬\Ãü@:U\å?­“\äd\æ¢y\ÞÑ¥²\ß:–ö©\Ò	E{y_—\Ê~\ëXnØ§J\'\í\å}]*û­c¹aŸ*P´—÷u©ì·Ž\å†}ªtB\ÑÞ®ûlsªt(\é_}£\ëV\ÛÃœ*Jú—D\ß\èº\Õö0§J‡’þ%\Ñ7ºnµ=Ì©Ò¡¤Iô\r»•¹±¾\åd\Ë\rûd\ËDóvsc}\Ë\É:–ö\É:–ˆ\æ\í\æ\Æú–“u,7\ì“u,?\Í\ÛÌõ-\'\ëXn\Ø\'\ëX~ š·;˜\ë3§J\Ç\ìÎ²Ok/\í²›˜\ë3§J\Ç\ìÎ²Ok/\í²›˜\ë3§J\Ç\ìÎ²Ok/\í²›˜\ë3§J\Ç\ìÎ²Ok/\í²›˜\ë\ß\È\Í\íþ?Dóvscý¹¹\Ýÿ‡h\Þ\î`n¬#7·ûÿ\Í\ÛÌõo\ä\ævÿ¢ù®;lsÃ¾¹\Ý?\í\íº\Ïö07\ì›\Ûý\ÑÞ®ûlsÃ¾¹\Ý?\í\íº\Ïö07\ì›\Ûý\Ñ^\Þ\×\Åö37Ö¿ˆ\æyG\Û\Ï\ÜXÿv~ š\ç]l?scý\Ûùhžwt±ýÌõo\ç\Òùqf\Þýy÷7\æ\Ýß˜wc\Þýy÷7\æ\Ýß˜wc\Þýy÷7\æ\Ýß˜wc\Þýy÷7\æ\Ýß˜wc\Þýy÷7\æ\Ýß˜w\ã9õº \ß.ò\0\0\0\0IEND®B`‚','804158','asds',23,13,'Appliances','2024-03-29','asdfasd','sadfasd','asdfsd',23421,'2024-03-29 17:56:38','2024-03-29 17:56:38','2024-03-29 00:00:00');
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
