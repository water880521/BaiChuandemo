DROP TABLE IF EXISTS `ybctest`.`users`;
CREATE TABLE  `ybctest`.`users` (
  `id` varchar(50) NOT NULL default '',
  `name` varchar(50) NOT NULL default '',
  `password` varchar(50) NOT NULL default '',
  `description` varchar(100) NOT NULL default '',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;