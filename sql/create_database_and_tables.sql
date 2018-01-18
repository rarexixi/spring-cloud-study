DROP DATABASE `study_user`;

CREATE DATABASE `study_user`
  DEFAULT CHARACTER SET utf8mb4
  COLLATE utf8mb4_general_ci;

USE `study_user`;

CREATE TABLE `user`
(
  `id`          INT          NOT NULL AUTO_INCREMENT
  COMMENT '用户ID',
  `username`    VARCHAR(50)  NOT NULL
  COMMENT '用户名',
  `email`       VARCHAR(200) NOT NULL
  COMMENT '邮箱',
  `password`    VARCHAR(200) NOT NULL
  COMMENT '密码',
  `nick_name`   VARCHAR(50)  NOT NULL DEFAULT ''
  COMMENT '昵称',
  `is_deleted` TINYINT      NOT NULL DEFAULT 0
  COMMENT '是否删除',
  `create_time` TIMESTAMP    NOT NULL DEFAULT current_timestamp
  COMMENT '创建时间',
  `update_time` TIMESTAMP    NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp
  COMMENT '更新时间',

  PRIMARY KEY (`id`),
  UNIQUE (`username`),
  UNIQUE (`email`),
  INDEX (`nick_name`),
  INDEX (`create_time`),
  INDEX (`update_time`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE = utf8_unicode_ci
  COMMENT ='用户';

INSERT INTO `user` (`username`, `email`, `password`, `nick_name`) VALUES
  ('user01', 'user01@example.com', '123456', '用户01'),
  ('user02', 'user02@example.com', '123456', '用户02'),
  ('user03', 'user03@example.com', '123456', '用户03'),
  ('user04', 'user04@example.com', '123456', '用户04'),
  ('user05', 'user05@example.com', '123456', '用户05'),
  ('user06', 'user06@example.com', '123456', '用户06'),
  ('user07', 'user07@example.com', '123456', '用户07'),
  ('user08', 'user08@example.com', '123456', '用户08'),
  ('user09', 'user09@example.com', '123456', '用户09'),
  ('user10', 'user10@example.com', '123456', '用户10'),
  ('user11', 'user11@example.com', '123456', '用户11'),
  ('user12', 'user12@example.com', '123456', '用户12'),
  ('user13', 'user13@example.com', '123456', '用户13'),
  ('user14', 'user14@example.com', '123456', '用户14'),
  ('user15', 'user15@example.com', '123456', '用户15'),
  ('user16', 'user16@example.com', '123456', '用户16'),
  ('user17', 'user17@example.com', '123456', '用户17'),
  ('user18', 'user18@example.com', '123456', '用户18'),
  ('user19', 'user19@example.com', '123456', '用户19'),
  ('user20', 'user20@example.com', '123456', '用户20'),
  ('user21', 'user21@example.com', '123456', '用户21'),
  ('user22', 'user22@example.com', '123456', '用户22'),
  ('user23', 'user23@example.com', '123456', '用户23'),
  ('user24', 'user24@example.com', '123456', '用户24'),
  ('user25', 'user25@example.com', '123456', '用户25'),
  ('user26', 'user26@example.com', '123456', '用户26'),
  ('user27', 'user27@example.com', '123456', '用户27'),
  ('user28', 'user28@example.com', '123456', '用户28'),
  ('user29', 'user29@example.com', '123456', '用户29'),
  ('user30', 'user30@example.com', '123456', '用户30');

DROP DATABASE `study_order`;

CREATE DATABASE `study_order`
  DEFAULT CHARACTER SET utf8mb4
  COLLATE utf8mb4_general_ci;

USE `study_order`;

CREATE TABLE `order`
(
  `id`          INT          NOT NULL AUTO_INCREMENT
  COMMENT '用户ID',
  `order_num`    VARCHAR(50)  NOT NULL
  COMMENT '订单编号',
  `user_id`       INT NOT NULL
  COMMENT '用户ID',
  `is_deleted` TINYINT      NOT NULL DEFAULT 0
  COMMENT '是否删除',
  `create_time` TIMESTAMP    NOT NULL DEFAULT current_timestamp
  COMMENT '创建时间',
  `update_time` TIMESTAMP    NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp
  COMMENT '更新时间',

  PRIMARY KEY (`id`),
  UNIQUE (`order_num`),
  INDEX (`user_id`),
  INDEX (`create_time`),
  INDEX (`update_time`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE = utf8_unicode_ci
  COMMENT ='订单';


INSERT INTO `order` (`order_num`, `user_id`) VALUES
  ('study2018010101', 1),
  ('study2018010102', 2),
  ('study2018010103', 3),
  ('study2018010104', 4),
  ('study2018010105', 5),
  ('study2018010106', 6),
  ('study2018010107', 7),
  ('study2018010108', 8),
  ('study2018010109', 9),
  ('study2018010110', 10),
  ('study2018010111', 11),
  ('study2018010112', 12),
  ('study2018010113', 13),
  ('study2018010114', 14),
  ('study2018010115', 15),
  ('study2018010116', 16),
  ('study2018010117', 17),
  ('study2018010118', 18),
  ('study2018010119', 19),
  ('study2018010120', 20),
  ('study2018010121', 21),
  ('study2018010122', 22),
  ('study2018010123', 23),
  ('study2018010124', 24),
  ('study2018010125', 25),
  ('study2018010126', 26),
  ('study2018010127', 27),
  ('study2018010128', 28),
  ('study2018010129', 29),
  ('study2018010130', 30);
