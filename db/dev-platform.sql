/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50730
 Source Host           : localhost:3306
 Source Schema         : dev-platform

 Target Server Type    : MySQL
 Target Server Version : 50730
 File Encoding         : 65001

 Date: 14/06/2020 23:26:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for column_info
-- ----------------------------
DROP TABLE IF EXISTS `column_info`;
CREATE TABLE `column_info` (
  `id` bigint(20) NOT NULL COMMENT '自增主键',
  `db_id` bigint(20) NOT NULL,
  `table_name` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `type` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `java_type` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `is_null` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `default_value` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `create_user` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `modify_user` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `yn` int(255) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci COMMENT='列信息';

-- ----------------------------
-- Table structure for db_info
-- ----------------------------
DROP TABLE IF EXISTS `db_info`;
CREATE TABLE `db_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `name` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `type` int(255) NOT NULL,
  `host` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `port` int(11) NOT NULL,
  `user_name` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `password` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `create_user` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `modify_user` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `yn` int(255) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci COMMENT='数据库信息';

-- ----------------------------
-- Table structure for project_info
-- ----------------------------
DROP TABLE IF EXISTS `project_info`;
CREATE TABLE `project_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `name_encrypted` varchar(255) COLLATE utf8_croatian_ci DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `create_user` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `modify_user` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `yn` int(255) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci COMMENT='项目信息';

-- ----------------------------
-- Table structure for table_group
-- ----------------------------
DROP TABLE IF EXISTS `table_group`;
CREATE TABLE `table_group` (
  `id` bigint(20) NOT NULL COMMENT '自增主键',
  `pid` bigint(20) NOT NULL,
  `name` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `create_user` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `modify_user` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `yn` int(255) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci COMMENT='表分组';

-- ----------------------------
-- Table structure for table_info
-- ----------------------------
DROP TABLE IF EXISTS `table_info`;
CREATE TABLE `table_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `name` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `schema` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `catalog` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `create_user` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `modify_user` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `yn` int(255) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci COMMENT='表信息';

SET FOREIGN_KEY_CHECKS = 1;
