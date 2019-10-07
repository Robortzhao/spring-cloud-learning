#没有用到下面的SQL语句
#现在生成的模式是:
#   1.在yml文件中配置数据源
#   2.使用JPA来根据实体类自动生成数据表
#   3.使用生成的ddl语言组织sql插入
#有待改进

INSERT INTO user
VALUES (1, 30, 100.00, 'account1', '张三');
INSERT INTO user
VALUES (2, 30, 100.00, 'account2', '李四');
INSERT INTO user
VALUES (3, 30, 100.00, 'account3', '王五');