/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50726
Source Host           : localhost:3306
Source Database       : blogs

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2019-08-06 00:08:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `id` varchar(8) NOT NULL COMMENT '主键',
  `permission_name` varchar(255) DEFAULT NULL COMMENT '权限名称',
  `valid` varchar(1) NOT NULL COMMENT '有效标识',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permission
-- ----------------------------

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` varchar(8) NOT NULL COMMENT '主键',
  `role_name` varchar(255) DEFAULT NULL COMMENT '角色名',
  `valid` varchar(1) NOT NULL COMMENT '有效标识',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('hto35z6q', 'admin', '1');
INSERT INTO `role` VALUES ('hy35gn9s', 'user', '1');
INSERT INTO `role` VALUES ('k9l2b2a0', 'member', '1');

-- ----------------------------
-- Table structure for role_permission
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission` (
  `id` varchar(8) NOT NULL COMMENT '主键',
  `permission_id` varchar(8) NOT NULL COMMENT '权限id',
  `role_id` varchar(8) NOT NULL COMMENT '角色id',
  `valid` varchar(1) NOT NULL COMMENT '有效标识',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_permission
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(8) NOT NULL COMMENT '主键',
  `user_name` varchar(50) NOT NULL COMMENT '用户名',
  `password` varchar(50) NOT NULL COMMENT '密码',
  `gender` varchar(1) NOT NULL DEFAULT '1' COMMENT '性别',
  `nick_name` varchar(50) DEFAULT NULL COMMENT '昵称',
  `phone` varchar(11) DEFAULT NULL COMMENT '手机号',
  `qq_num` varchar(20) DEFAULT NULL COMMENT 'QQ号',
  `wechat_num` varchar(50) DEFAULT NULL COMMENT '微信号',
  `motto` varchar(255) DEFAULT NULL COMMENT '座右铭',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `valid` varchar(1) NOT NULL COMMENT '有效标识(0:未激活;1:已激活;2:禁用)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('045173b9', 'dtdhehe', 'dtdhehe', '1', '劳资shi东', '15892055087', '474786105', 'xd474786105', '有你东哥在，世界充满爱', 'dtdhehe@sina.com', '1');
INSERT INTO `user` VALUES ('16a3611a', 'yanghuiyun', 'yhy96921', '1', '屎芸', '15892088730', '1579475437', '15892088730', null, null, '1');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` varchar(8) NOT NULL COMMENT '用户角色表',
  `user_id` varchar(8) NOT NULL COMMENT '用户id',
  `role_id` varchar(8) NOT NULL COMMENT '角色id',
  `valid` varchar(1) NOT NULL COMMENT '有效标识',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('bm58hc0x', '045173b9', 'hto35z6q', '1');
INSERT INTO `user_role` VALUES ('eils94h7', '045173b9', 'hy35gn9s', '1');
INSERT INTO `user_role` VALUES ('owgs64nx', '045173b9', 'k9l2b2a0', '1');
INSERT INTO `user_role` VALUES ('pguslx8x', '16a3611a', 'k9l2b2a0', '1');
