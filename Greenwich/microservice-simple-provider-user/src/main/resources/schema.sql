drop table user;
create table user
(
    id       int(4)      NOT NULL AUTO_INCREMENT,
    username varchar(40) NOT NULL,
    name     varchar(20) NOT NULL,
    age      int(3)      NOT NULL,
    balance  decimal(10, 2) DEFAULT NULL,
    primary key (id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 4
  DEFAULT CHARSET = utf8;