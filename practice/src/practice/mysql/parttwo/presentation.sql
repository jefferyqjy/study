DROP TABLE IF EXISTS `actor`;
CREATE TABLE `actor` (
    `id` int(11) NOT NULL,
    `name` varchar(45) DEFAULT NULL,
    `update_time` datetime DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `actor` (`id`, `name`, `update_time`) VALUES (1,'a','2017-12-22 15:27:18'), (2,'b','2017-12-22 15:27:18'), (3,'c','2017-12-22 15:27:18');

DROP TABLE IF EXISTS `film`;
CREATE TABLE `film` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `film` (`id`, `name`) VALUES (3,'film0'),(1,'film1'),(2,'film2');

DROP TABLE IF EXISTS `film_actor`;
CREATE TABLE `film_actor` (
  `id` int(11) NOT NULL,
  `film_id` int(11) NOT NULL,
  `actor_id` int(11) NOT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_film_actor_id` (`film_id`,`actor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
INSERT INTO `film_actor` (`id`, `film_id`, `actor_id`) VALUES (1,1,1),(2,1,2),(3,2,1);

#############################################################################################

#演示derived_merge:derived_merge被自动开启
SET optimizer_switch = 'derived_merge=off'; 

#演示explain:整体字段
explain partitions select (select 1 from actor limit 1) from film;

#演示select_type:SIMPLE
explain select * from film where id = 2;

#演示select_type:PRIMARY & DERIVED & SUBQUERY
explain select (select 1 from actor where id=1) from (select * from film where id= 1) der;

#演示type:system & const
explain select * from (select * from film where id = 1) tmp;

#提供优化建议
show warnings;

#演示type:eq_ref
#film用到了主键id，对film而言，film_actor的一条记录只会关联film表的一条记录；
explain select * from film_actor left join film on film_actor.film_id = film.id;

#演示type:ref
#非主键或唯一索引，仅为普通股索引
explain select * from film where name = 'film1';

#演示type:range
#范围查询
explain select * from actor where id > 1;

#演示type:index & all
explain select * from film; 
explain select * from actor;

#演示key_len:只查询film_id和两个字段都查询，key_len结果不一样
#演示key_len:演示允许null占一个字节
explain select * from film_actor where film_id = 2 and actor_id = 1;

#演示ref:const 或者 demo.film_actor.film_id
explain select * from film_actor left join film on film_actor.film_id = film.id;

#演示extra:using index，using where;usingindex，覆盖索引，前导列
explain select film_id from film_actor where film_id = 1;
explain select film_id from film_actor where actor_id = 1;

#演示extra:using where
explain select * from actor where name = 'a';

#演示extra:extra的几个值基本上就是覆盖索引和查询是否前导列的几个组合

#演示extra:using temporary--distinct, group by 
explain select distinct name from actor;
#演示extra:film表的name字段有索引，可以直接索引中查询
explain select distinct name from film;

#演示extra:using filesort，结合数据结构讲
explain select * from actor order by name;
#演示extra:索引是排好序的数据结构
explain select * from film order by name;

########################################################################################
CREATE TABLE `employees` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(24) NOT NULL DEFAULT '' COMMENT '姓名',
  `age` int(11) NOT NULL DEFAULT '0' COMMENT '年龄',
  `position` varchar(20) NOT NULL DEFAULT '' COMMENT '职位',
  `hire_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '入职时间',
  PRIMARY KEY (`id`),
  KEY `idx_name_age_position` (`name`,`age`,`position`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='员工记录表';

INSERT INTO employees(name,age,position,hire_time) VALUES('LiLei',22,'manager',NOW());
INSERT INTO employees(name,age,position,hire_time) VALUES('HanMeimei', 23,'dev',NOW());
INSERT INTO employees(name,age,position,hire_time) VALUES('Lucy',23,'dev',NOW());


