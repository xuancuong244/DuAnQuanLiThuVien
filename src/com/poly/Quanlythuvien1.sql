/*
       Nhóm 5 : Quản lý thư viên
	   Lớp :    IT17302
*/
create database QLThuVien;
use QLThuVien;

drop database QLThuVien;

-- table tài khoản
create table TaiKhoan(
    TenDangNhap nvarchar(50) NOT NULL,
	MatKhau nvarchar(50) NOT NULL,
	VaiTro nvarchar(15) NOT NULL,
	PRIMARY KEY (TenDangNhap)
);
-- table nhân viên
create table NhanVien(
    MaNV nvarchar(15) NOT NULL,
	TenNV nvarchar(50) NOT NULL,
	DiaChi nvarchar(150) NOT NULL,
	Email nvarchar(50) NOT NULL,
	SDT int NOT NULL,
	PRIMARY KEY (MaNV)
);
-- table độc giả
create table DocGia(
    MaDocGia nvarchar(15) NOT NULL,
	TenDocGia nvarchar(50) NOT NULL,
	NgaySinh date not null,
	GioiTinh bit not null,
	DiaChi nvarchar(150) NOT NULL,
	Email nvarchar(50) NOT NULL,
	SDT int NOT NULL,
	PRIMARY KEY (MaDocGia)
);
-- table vi phạm
create table ViPham(
	MaViPham nvarchar(15) NOT NULL,
	TenViPham nvarchar(50) NOT NULL,
	MaDocGia nvarchar(15) NOT NULL,
	PRIMARY KEY (MaViPham),
	CONSTRAINT FK_ViPham_DocGia FOREIGN KEY (MaDocGia) REFERENCES DocGia(MaDocGia)
);
-- table loại sách
create table LoaiSach(
	MaLoai nvarchar(15) NOT NULL,
	TenLoai nvarchar(50) NOT NULL,
	ViTri nvarchar(50),
	PRIMARY KEY (MaLoai)
);
-- table tác giả
create table TacGia(
    MaTacGia nvarchar(15) NOT NULL,
	TenTacGia nvarchar(50) NOT NULL,
	NgaySinh date not null,
	DiaChi nvarchar(150) NOT NULL,
	Email nvarchar(50) NOT NULL,
	PRIMARY KEY (MaTacGia)
);
-- table nhà sản xuất
create table NhaXB(
    MaNXB nvarchar(15) NOT NULL,
	TenNXB nvarchar(50) NOT NULL,
	DiaChi nvarchar(50) NOT NULL,
	Email nvarchar(50) NOT NULL,
	SDT int NOT NULL,
	PRIMARY KEY (MaNXB)
);
-- table sách
create table Sach(
    MaSach nvarchar(15) NOT NULL,
	TenSach nvarchar(50) NOT NULL,
	MaLoai nvarchar(15) NOT NULL,
	MaTacGia nvarchar(15) NOT NULL,
	MaNV nvarchar(15) NOT NULL,
	SoLuong int NOT NULL,
	MaNXB nvarchar(15) NOT NULL,
	NgayNhap date NOT NULL,
	NoiDung nvarchar(50) Not null,
	Hinh nvarchar(50) not null,
	PRIMARY KEY (MaSach),
	CONSTRAINT FK_LoaiSach_Sach FOREIGN KEY (MaLoai) REFERENCES LoaiSach(MaLoai),
	CONSTRAINT FK_NhaXB_Sach FOREIGN KEY (MaNXB) REFERENCES NhaXB(MaNXB),
	CONSTRAINT FK_TacGia_Sach FOREIGN KEY (MaTacGia) REFERENCES TacGia(MaTacGia),
	CONSTRAINT FK_NhanVien_Sach FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV)
);
-- table phiếu mượn
create table PhieuMuon(
    MaPhieu nvarchar(15) NOT NULL,
	MaDocGia nvarchar(15) NOT NULL,
	SoLuong int,
	MaSach nvarchar(15) NOT NULL,
	NgayMuon date DEFAULT GETDATE(),
	NgayHenTra date DEFAULT (GETDATE() + 10),
	PRIMARY KEY (MaPhieu),
	CONSTRAINT FK_Sach_PhieuMuon FOREIGN KEY (MaSach) REFERENCES Sach(MaSach),
	CONSTRAINT FK_DocGia_PhieuMuon FOREIGN KEY (MaDocGia) REFERENCES DocGia(MaDocGia)
);


-- table sách tác giả
create table SachTacGia (
    MaTacGia nvarchar(15) NOT NULL,
	MaSach nvarchar(15) NOT NULL,
	CONSTRAINT FK_TacGia_SachTacGia FOREIGN KEY (MaTacGia) REFERENCES TacGia(MaTacGia),
	CONSTRAINT FK_Sach_SachTacGia FOREIGN KEY (MaSach) REFERENCES Sach(MaSach)
);
-- table chi tiết phiếu mượn 
create table ChiTietPhieuMuon(
    MaPhieu nvarchar(15) NOT NULL,
	MaSach nvarchar(15) NOT NULL,
	NgayTra date NOT NULL,
	CONSTRAINT FK_PhieuMuon_ChiTietPhieuMuon FOREIGN KEY (MaPhieu) REFERENCES PhieuMuon(MaPhieu),
	CONSTRAINT FK_Sach_ChiTietPhieuMuon FOREIGN KEY (MaSach) REFERENCES Sach(MaSach)
);
INSERT INTO TaiKhoan values
('CuongNX','123456','Admin'),
('VinhHT','123456','User'),
('PhucT','123456','DocGia')

-- INSERT INTO  NhanVien values
-- ('NV001',N'Nguyễn Xuân Cường',N'Quang Trung','nguyenxuancuong@gmail.com',0917983231),
-- ('NV002',N'Huỳnh Tấn Vĩnh',N'Quảng Ngãi','huynhtanvinh@gmail.com',0914231234),
-- ('NV003',N'Nguyễn Thiên Phúc',N'An Giang','nguyenthienphuc@gmail.com',0123487921)


--INSERT INTO DocGia values
--('DG001',N'Nguyễn Văn A',N'Quang Trung','nguyenvana@gmail.com',0917983231,''),
--('DG002',N'Nguyễn Thị Nở',N'An Giang','nguyenthino@gmail.com',0914231234,'VP002'),
--('DG003',N'Huỳnh Tấn Thành',N'Quảng Ngãi','huynhtanthanh@gmail.com',0123487921,''),
--('DG004',N'Võ Thành Danh',N'Đồng Nai','vothanhdanh@gmail.com',0366232311,'VP003'),
--('DG005',N'Nguyễn Thiên Phúc',N'Đà Nẵng','nguyenthienphuc@gmail.com',0356272217,''),
--('DG006',N'Vũ Tấn Tài',N'Hải Dương','vutantai@gmail.com',0452672312,'VP001')

-- INSERT INTO ViPham values
-- ('VP001',N'Mượn sách quá hạn quy định','DG006'),
-- ('VP002',N'Hư hỏng sách','DG002'),
-- ('VP003',N'Mất sách','DG004')
-- 
-- 
-- INSERT INTO PhieuMuon values
-- ('PM001','NV002','DG001',2,'2020/5/25','2020/6/25'),
-- ('PM002','NV002','DG002',4,'2020/7/17','2020/8/27'),
-- ('PM003','NV002','DG003',1,'2020/11/5','2020/12/11'),
-- ('PM004','NV002','DG004',3,'2021/1/4','2021/2/5'),
-- ('PM005','NV002','DG005',5,'2021/6/2','2021/7/3'),
-- ('PM006','NV002','DG006',3,'2022/10/1','2022/11/3')
-- 
-- INSERT INTO LoaiSach values
-- ('LS001',N'Chính trị - pháp luật',''),
-- ('LS002',N'Khoa học công nghệ - kinh tế',''),
-- ('LS003',N'Văn học nghệ thuật',''),
-- ('LS004',N'Văn hóa xã hội lịch sử',''),
-- ('LS005',N'Truyện tiểu thuyết',''),
-- ('LS006',N'Thiếu Nhi','')
-- 
-- --INSERT INTO TacGia values
-- --('TG001',N'Nguyễn Văn A','nguyenvana@gmail.com',0249732982),
-- --('TG002',N'Nguyễn Văn B','nguyenvanb@gmail.com',0987654212),
-- --('TG003',N'Nguyễn Văn C','nguyenvanc@gmail.com',0873621871),
-- --('TG004',N'Nguyễn Văn D','nguyenvand@gmail.com',0372188123),
-- --('TG005',N'Nguyễn Văn E','nguyenvane@gmail.com',0453161821)
-- 
-- INSERT INTO NhaXB values
-- ('NXB001',N'Chính trị Quốc gia',N'72 Trần Quốc Thảo','chinhtriquocgia@gmail.com','0978321341'),
-- ('NXB002',N'Hồng Đức',N'Hà Nội','hongduc@gmail.com','0392312123'),
-- ('NXB003',N'Hội nhà văn',N'371 Hai Bà Trưng ','hoinhavan@gmail.com','0465882123'),
-- ('NXB004',N'Khoa học xã hội',N'57 Sương Nguyệt Ánh','khoahocxahoi@gmail.com','0355271871'),
-- ('NXB005',N'Khoa học tự nhiên và Công nghệ',N'Hà Nội','khoahoctunhien@gmail.com','0983872142'),
-- ('NXB006',N'Lý luận chính trị',N'56B Quốc Tử Giám','lyluanchinhtri@gmail.com','0873342271')
-- 
-- INSERT INTO NgonNgu values
-- ('NG001','Tiếng Việt'),
-- ('NG002','Tiếng Anh')
-- 
-- INSERT INTO Sach values 
-- ('S001',N'Đắc nhân tâm','LS001','TG002',2,'NXB002','2019/1/1','NG001',N'không có nội dung','hinh1.png'),
-- ('S002',N'Trân trọng chính mình','LS003','TG004',1,'NXB005','2018/6/1','NG001',N'không có nội dung','hinh2.png'),
-- ('S003',N'The definitive book','LS005','TG005',3,'NXB003','2018/4/5','NG002',N'không có nội dung','hinh3.png'),
-- ('S004',N'Chớ hoang mang chuyện gì cũng có cách lo toan','LS004','TG004',2,'NXB005','2019/1/1','NG001',N'không có nội dung','hinh4.png'),
-- ('S005',N'Bao giờ hết ế','LS002','TG001',2,'NXB005','2017/1/1','NG001',N'không có nội dung','hinh5.png')
-- 
-- INSERT INTO SachTacGia values
-- ('TG002','S001'),
-- ('TG004','S002'),
-- ('TG005','S003'),
-- ('TG004','S004'),
-- ('TG001','S005')
-- 
-- INSERT INTO ChiTietPhieuMuon values
-- ('PM001','S002','2020/6/25'),
-- ('PM002','S001','2020/8/27'),
-- ('PM003','S004','2020/12/11'),
-- ('PM004','S003','2021/2/5'),
-- ('PM005','S005','2021/7/3'),
-- ('PM006','S004','2022/11/3')
-- 
-- select * from sachtacgia
