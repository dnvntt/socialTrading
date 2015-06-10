begin;

drop schema public cascade;
create schema public;


CREATE TABLE account (
	id text PRIMARY KEY,
	risk_factor integer NOT NULL,
	username text NOT NULL,
	password text NOT NULL,
	name text NOT NULL,
	cash numeric(19,2) NOT NULL
);

CREATE TABLE trader (
	traderid text PRIMARY KEY,
	username text NOT NULL,
	password text NOT NULL,
	numberfollow integer,
	name text,
	monneyfollow numeric(19,2),
	cash numeric(19,2)
);

CREATE TABLE following (
	id text NOT NULL,
	traderid text NOT NULL,
	moneyallocate numeric(19,2) NOT NULL,
	maxopen integer NOT NULL,
	transactionid text NOT NULL,
	PRIMARY KEY (id, traderid),
	FOREIGN KEY (id) REFERENCES account (id),
	FOREIGN KEY (traderid) REFERENCES trader (traderid)
);


CREATE TABLE history (
	id text PRIMARY KEY,
	orderid text NOT NULL,
	traderid text NOT NULL,
	date timestamp without time zone NOT NULL
);


CREATE TABLE orderlist (
	orderid text PRIMARY KEY,
	stock text NOT NULL,
	quantity integer NOT NULL,
	price integer NOT NULL,
	date timestamp without time zone NOT NULL,
	side integer NOT NULL,
	type text NOT NULL
);


CREATE TABLE portfolio (
	id text NOT NULL,
	stock text NOT NULL,
	quantity integer NOT NULL,
	cost integer NOT NULL,
	PRIMARY KEY (id, stock)
);


CREATE TABLE stockrisk (
	stock text PRIMARY KEY,
	risk integer NOT NULL,
	name text NOT NULL,
	floor text NOT NULL
);


CREATE TABLE transaction (
	transactionid text NOT NULL,
	orderid text NOT NULL,
	PRIMARY KEY (transactionid, orderid)
);


INSERT INTO account (risk_factor, id, username, password, name, cash) VALUES
	(68, '0001210254', 'khanh', '123456', 'Do Quoc Huy', 445000000.00),
	(88, '0001210287', 'vnds', 'vnds1234', 'Tran Xuan Anh', 9474270200.00);


INSERT INTO trader (traderid, username, password, numberfollow, name, monneyfollow, cash) VALUES
	('0001041716',  'thutrang', '123456', 0, 'Tran Thu Trang', 0.00, 345000000.00),
	('0001052458',  'TrungTran', '123456', 0, 'Nguyen Manh Hung', 0.00, 134000000.00),
	('0001011079',  'Hero99', '123456', 1, 'Vu Xuan Kien', 250000000.00, 4972860400.00),
	('0001029605',  'tatthang', 'xuz123', 1, 'Le tat Thang', 60000000.00, 67800000.00);


INSERT INTO following (id, traderid, moneyallocate, maxopen, transactionid) VALUES
	('0001210287', '0001011079', 213.00, 3, '0001210287_0001011079');


INSERT INTO portfolio (id, stock, quantity, cost) VALUES
	('0001011079', 'POT', 50000, 13800),
	('0001011079', 'VND', 300, 13800);


INSERT INTO stockrisk (stock, risk, name, floor) VALUES
	('FPT', 30, 'Tập đoàn FPT', 10),
	('AAA', 60, 'Công ty nhựa An Phát', 02),
	('KLS', 34, 'Chứng khoán Kim Long', 02),
	('MSN', 15, 'Tập đoàn Masan', 10),
	('REE', 35, 'CTCP cơ điện lạnh', 10),
	('SAM', 35, 'CTCP Cáp Savico', 10),
	('VIC', 20, 'Tập đoàn Vin Group', 10),
	('VNM', 20, 'Sữa Vinamilk', 10),
	('VND', 30, 'Chứng khoán Vndirect', 02),
	('ACB', 28, 'Ngân hàng Á Châu', 02),
	('SSI', 20, 'Chứng khoán SSI', 10),
	('SHS', 50, 'CT chứng khoán SHB', 02),
	('SHB', 40, 'Ngân hàng SHB', 02),
	('POT', 30, 'CTCP thiết bị bưu điện', 02),
	('HQC', 20, 'Địa ốc Hoàng Quân', 10),
	('VHG', 20,  'Cao su Quảng Nam   ', 10),
	('PSD', 30,  'CT dịch vụ dầu khí ', 02),
	('PMC', 30, 'Dược phẩm Pharmedic', 02);

commit;