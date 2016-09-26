CREATE DATABASE auth;

USE auth;

CREATE TABLE auth_user(
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '编号id',
  name VARCHAR(64) NOT NULL COMMENT '用户名',
  pwd VARCHAR(64) NOT NULL COMMENT '密码',
  create_time TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
  update_time TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '更新时间',
  PRIMARY KEY (id)
) ENGINE = InnoDB AUTO_INCREMENT = 1000 DEFAULT CHARSET = utf8 COMMENT '用户表';

CREATE TABLE auth_role(
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '编号id',
  name VARCHAR(64) NOT NULL  COMMENT '角色名',
  create_time TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
  update_time TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '更新时间',
  PRIMARY KEY (id)
) ENGINE = InnoDB AUTO_INCREMENT = 1000 DEFAULT CHARSET = utf8 COMMENT '角色表';

CREATE TABLE auth_function(
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '编号id',
  name VARCHAR(64) NOT NULL COMMENT '功能名称',
  parent_id BIGINT COMMENT '功能父id',
  url VARCHAR(128) COMMENT '跳转url',
  serial_num INT COMMENT '序号',
  accordion int COMMENT '是否是顶级菜单',
  create_time TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
  update_time TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '更新时间',
  PRIMARY KEY (id)
) ENGINE = InnoDB AUTO_INCREMENT = 1000 DEFAULT CHARSET = utf8 COMMENT '功能表';

CREATE TABLE auth_user_role(
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '编号id',
  role_id BIGINT NOT NULL COMMENT '角色id',
  user_id BIGINT NOT NULL COMMENT '用户id',
  create_time TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
  update_time TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '更新时间',
  PRIMARY KEY (id)
) ENGINE = InnoDB AUTO_INCREMENT = 1000 DEFAULT CHARSET = utf8 COMMENT '用户角色关系表';

CREATE TABLE auth_role_function(
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '编号id',
  role_id BIGINT NOT NULL COMMENT '角色id',
  funtion_id BIGINT NOT NULL COMMENT '功能id',
  status INT NOT NULL COMMENT '状态',
  create_time TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间',
  update_time TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '更新时间',
  PRIMARY KEY (id)
) ENGINE = InnoDB AUTO_INCREMENT = 1000 DEFAULT CHARSET = utf8 COMMENT '角色功能关系表';