DROP DATABASE IF EXISTS HouseDatabase;
CREATE DATABASE HouseDatabase;
USE HouseDatabase;
DROP TABLE IF EXISTS account;
CREATE TABLE account
(
  user_id INT PRIMARY KEY AUTO_INCREMENT, #用户编号
  user_name VARCHAR(16),  #用户名
  user_password VARCHAR(16) #密码
)ENGINE = INNODB DEFAULT CHARSET = UTF8;

DROP TABLE IF EXISTS house_info;
CREATE TABLE house_info
(
  house_id INT PRIMARY KEY AUTO_INCREMENT, #房子编号
  house_name VARCHAR(20), #小区名
  house_type VARCHAR(6),  #房型
  house_floor VARCHAR(5), #楼层
  house_floor_space VARCHAR(20),  #房屋面积
  house_decorate VARCHAR(20), #房屋装修情况
  house_location VARCHAR(50), #地址
  house_rent_money DECIMAL,  #租金
  house_landlord VARCHAR(20), #房东
  house_landlord_telphone VARCHAR(30),  #房东电话
  house_isrent TINYINT  #是否出租  0 未出租 1 已出租
)ENGINE = INNODB DEFAULT CHARSET = UTF8;

DESC account;
DESC house_info;

INSERT INTO account VALUES(DEFAULT,'qwe',123);
INSERT INTO house_info VALUES(DEFAULT,'关山春晓','一室一厅','5/12','50M^2','平装','洪山区',1800,'武大郎','13156846431',0);
INSERT INTO house_info VALUES(DEFAULT,'保利花园','二室一厅','6/15','90M^2','精装','武昌区',2800,'西门庆','15316843441',1);
INSERT INTO house_info VALUES(DEFAULT,'金沙泊岸','三室两厅','37/53','170M^2','精装','青山区',3800,'潘金莲','14616564280',0);

select * from account;
select * from house_info;
