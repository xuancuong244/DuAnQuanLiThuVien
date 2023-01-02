/*
       Nhóm 5 : Quản lý thư viên
	   Lớp :    IT17302
*/
--create database QLThuVien;
--use QLThuVien;

--drop database QLThuVien;

-- table nhân viên
create table NhanVien(
    MaNV nvarchar(15) NOT NULL,
	MatKhau nvarchar(50) NOT NULL,
	TenNV nvarchar(50) NOT NULL,
	VaiTro bit NOT NULL,
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
	SDT varchar(15) NOT NULL,
	MatKhau nvarchar(50) NOT NULL,
	PRIMARY KEY (MaDocGia)
);
-- table vi phạm
create table ViPham(
	MaViPham nvarchar(15) NOT NULL,
	TenViPham nvarchar(50) NOT NULL,
	MaDocGia nvarchar(15) NOT NULL,
	PRIMARY KEY (MaViPham),
	CONSTRAINT FK_ViPham_DocGia FOREIGN KEY (MaDocGia) REFERENCES DocGia(MaDocGia) on delete cascade
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
	Email nvarchar(50) NOT NULL,
	SDT varchar(15) NOT NULL,
	PRIMARY KEY (MaTacGia)
);
-- table nhà sản xuất
create table NhaXB(
    MaNXB nvarchar(15) NOT NULL,
	TenNXB nvarchar(50) NOT NULL,
	DiaChi nvarchar(50) NOT NULL,
	Email nvarchar(50) NOT NULL,
	SDT varchar(15) NOT NULL,
	PRIMARY KEY (MaNXB)
);
-- table sách
create table Sach(
    MaSach nvarchar(15) NOT NULL,
	TenSach nvarchar(50),
	MaLoai nvarchar(15),
	MaTacGia nvarchar(15),
	MaNV nvarchar(15),
	MaNXB nvarchar(15),
	NgayNhap date,
	soluong int,
	NoiDung nvarchar(500),
	Hinh nvarchar(50),
	url nvarchar(500),
	PRIMARY KEY (MaSach),
	CONSTRAINT FK_LoaiSach_Sach FOREIGN KEY (MaLoai) REFERENCES LoaiSach(MaLoai) on delete cascade,
	CONSTRAINT FK_NhaXB_Sach FOREIGN KEY (MaNXB) REFERENCES NhaXB(MaNXB) on delete cascade,
	CONSTRAINT FK_TacGia_Sach FOREIGN KEY (MaTacGia) REFERENCES TacGia(MaTacGia) on delete cascade,
	CONSTRAINT FK_NhanVien_Sach FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV) on delete cascade
);
-- table phiếu mượn
create table PhieuMuon(
    MaPhieu nvarchar(15) NOT NULL,
	MaDocGia nvarchar(15) NOT NULL,
	SoLuong int,
	NgayMuon date DEFAULT GETDATE(),
	NgayHenTra date DEFAULT (GETDATE() + 10),
	TrangThaiTra bit,
	PRIMARY KEY (MaPhieu),
	CONSTRAINT FK_DocGia_PhieuMuon FOREIGN KEY (MaDocGia) REFERENCES DocGia(MaDocGia) on delete cascade
);


---- table sách tác giả
--create table SachTacGia (
--    MaTacGia nvarchar(15) NOT NULL,
--	MaSach nvarchar(15) NOT NULL,
--	primary key(MaTacGia, MaSach),
--	CONSTRAINT FK_TacGia_SachTacGia FOREIGN KEY (MaTacGia) REFERENCES TacGia(MaTacGia) on delete cascade,
--	CONSTRAINT FK_Sach_SachTacGia FOREIGN KEY (MaSach) REFERENCES Sach(MaSach) on delete cascade
--);

-- table chi tiết phiếu mượn 
create table ChiTietPhieuMuon(
    MaPhieu nvarchar(15) NOT NULL,
	MaSach nvarchar(15) NOT NULL,
	NgayTra date NOT NULL,
	primary key(MaPhieu, MaSach),
	CONSTRAINT FK_PhieuMuon_ChiTietPhieuMuon FOREIGN KEY (MaPhieu) REFERENCES PhieuMuon(MaPhieu)on delete cascade,
	CONSTRAINT FK_Sach_ChiTietPhieuMuon FOREIGN KEY (MaSach) REFERENCES Sach(MaSach) on delete cascade
);

INSERT INTO  NhanVien values
('CuongNX', '123456',N'Nguyễn Xuân Cường', 1),
('VinhHT', '123456', N'Huỳnh Tấn Vĩnh', 0),
('PhucNT', '123456', N'Nguyễn Thiên Phúc', 0)

INSERT INTO DocGia values
('DG001',N'Nguyễn Văn A','2003/4/23',0,N'Quang Trung','nguyenvana@gmail.com','0917983231','123456'),
('DG002',N'Nguyễn Thị Nở','2003/4/23',0,N'An Giang','nguyenthino@gmail.com','0914231234','123456'),
('DG003',N'Huỳnh Tấn Thành','2003/4/23',0,N'Quảng Ngãi','huynhtanthanh@gmail.com','0123487921','123456'),
('DG004',N'Võ Thành Danh','2003/4/23',0,N'Đồng Nai','vothanhdanh@gmail.com','0366232311','123456'),
('DG005',N'Nguyễn Thiên Phúc','2003/4/23',0,N'Đà Nẵng','nguyenthienphuc@gmail.com','0356272217','123456'),
('DG006',N'Vũ Tấn Tài','2003/4/23',0,N'Hải Dương','vutantai@gmail.com','0452672312','123456')

INSERT INTO ViPham values
('VP001',N'Mượn sách quá hạn quy định','DG006'),
('VP002',N'Hư hỏng sách','DG002'),
('VP003',N'Mất sách','DG004')

INSERT INTO LoaiSach values
('LS001',N'Công Nghệ Thông Tin',N'Kệ 1'),
('LS002',N'Khoa học công nghệ - kinh tế',N'Kệ 2'),
('LS003',N'Văn học nghệ thuật',N'Kệ 3'),
('LS004',N'Tâm lí học',N'Kệ 4'),
('LS005',N'Truyện tiểu thuyết',N'Kệ 5'),
('LS006',N'Thiếu Nhi',N'Kệ 6'),
('LS007',N'Truyện Trinh Thám',N'Kệ 7'),
('LS008',N'Âm Nhạc',N'Kệ 8'),
('LS009',N'Tình cảm',N'Kệ 9'),
('LS010',N'Kinh Dị',N'Kệ 10'),
('LS011',N'Văn Hóa',N'Kệ 11'),
('LS012',N'Y Học',N'Kệ 12'),
('LS013',N'Hóa Học',N'Kệ 13'),
('LS014', N'Sách giáo trình', N'Kệ 14'),
('LS015', N'Sách bài tập', N'Kệ 15')



INSERT INTO TacGia values
('TG001',N'Nam An','1994/07/09','nguyenvana@gmail.com','0249732982'),
('TG002',N'Lê Thị Mĩ Hạnh','1994/07/09', 'nguyenvanb@gmail.com','0987654212'),
('TG003',N'Giảng Viên','1994/07/09', 'nguyenvanc@gmail.com','0873621871'),
('TG004',N'Phan Huy Khánh','1994/07/09','nguyenvand@gmail.com','0372188123'),
('TG005',N'Nguyễn Thanh Văn','1994/07/09','nguyenvane@gmail.com','0453161821'),
('TG006',N'Vương Trung Hiến','1994/07/09','nguyenvanf@gmail.com','0453161823'),
('TG007',N'Tina Seelig','1994/07/09','nguyenvang@gmail.com','0453161824'),
('TG008',N'Robin Sharma','1994/07/09','nguyenvanh@gmail.com','0453161825'),
('TG009',N'Joyce Forrell','1994/07/09','nguyenvafc@gmail.com','0453161826'),
('TG010',N'Goal Kicher','1994/07/09','nguyenvass@gmail.com','0453161827'),
('TG011',N'Tô Hải Triều','1994/07/09','nguyenvals@gmail.com','0453161891'),
('TG012',N'Mari Tamagarea','1994/07/09','nguyenvaass@gmail.com','0453161111'),
('TG013',N'Fernando Doglio','1994/07/09','nguyenvawer@gmail.com','0453161921')



INSERT INTO NhaXB values
('NXB001',N'Nhà xuất bản trẻ',N'72 Trần Quốc Thảo','chinhtriquocgia@gmail.com','0978321341'),
('NXB002',N'Kho tri thức cho người Việt',N'Hà Nội','hongduc@gmail.com','0392312123'),
('NXB003',N'Lê Thị Mỹ Hạnh',N'371 Hai Bà Trưng ','hoinhavan@gmail.com','0465882123'),
('NXB004',N'Phan Huy Khánh',N'57 Sương Nguyệt Ánh','khoahocxahoi@gmail.com','0355271871'),
('NXB005',N'Nhà xuất bản Lâm Đồng',N'Hà Nội','khoahoctunhien@gmail.com','0983872142'),
('NXB006',N'Nhà xuất bản Đồng Nai',N'56B Quốc Tử Giám','lyluanchinhtri@gmail.com','0873342271'),
('NXB007',N'Nhà xuất bản trẻ',N'46B Quốc Tử Giám','lyluanchinh@gmail.com','0873342222'),
('NXB008',N'Nhà xuất bản trẻ',N'26B Quốc Tử Giám','lyluantri@gmail.com','0873342274'),
('NXB009',N'Ninth Edition',N'11B Quốc Tử Giám','lynhtri@gmail.com','0873342275'),
('NXB010',N'Joyce Forrel',N'06B Quốc Tử Giám','lychinhtri@gmail.com','08733422711'),
('NXB011',N'Goal Kicker',N'76B Quốc Tử Giám','luanchinhtri@gmail.com','0873342279'),
('NXB012',N'Nhà xuất bản thanh niên',N'60B Quốc Tử Giám','chinhtri@gmail.com','0873342280'),
('NXB013',N'Nhà xuất bản Hà Nội',N'52B Quốc Tử Giám','lylnchinhtri@gmail.com','0873341271')

INSERT INTO Sach values 
('S001',N'Đắc nhân tâm','LS004','TG001','CuongNX','NXB001','2019/1/1',5,N'Quyển sách đầu tiên và hay nhất của mọi thời đại đưa bạn đến thành công','hinh1.png,hinh12.jpg,hinh11.jpg,hinh13.jpg', 'DacNhanTam.pdf'),
('S002',N'Công Nghệ BlockChain','LS001','TG003','CuongNX','NXB002','2018/6/1',5,N'Blockchain là gì? Tìm hiểu về Blockchain, Công nghệ Blockchain có thể nói là sự kết hợp giữa 3 loại công nghệ ','hinh2.jpg,21.jpg,22.jpg,23.jpg','CongNgheBlockchain.pdf'),
('S003',N'Lập trình hướng đối tượng','LS001','TG002','CuongNX','NXB003','2018/4/5',5,N'Giới thiệu về cách lập trình hướng đối tượng','hinh3.png,31.jpg,32.jpg,33.jpg','LapTrinhHuongDoiTuong.pdf'),
('S004',N'Phân tích và thiết kế hệ thống','LS001','TG004','CuongNX','NXB004','2019/1/1',5,N'Hệ thống thông tin quản lý ','hinh4.jpg,41.jpg,42.jpg,43.jpg','PhanTichVaThietKeHeThong.pdf'),
('S005',N'Dám Bị Ghét','LS004','TG005','CuongNX','NXB005','2019/1/1',5,N'Ở vùng ngoại ô của cố đô được ngợi ca là thành phố ngàn năm lịch sử, có một Triết gia phát biểu rằng, thế giới vô cùng đơn giản và con người có thể hạnh phúc ngay lúc này','hinh5.jpg,51.jpg,52.jpg,53.jpg','DamBiGhet.pdf'),
('S006',N'Bạn Thật Sự Có Tài','LS004','TG006','CuongNX','NXB006','2019/1/1',5,N'Việc chúng ta có khả năng đưa ra vô số phản ứng với thế giới quanh mình là một minh chứng cho thấy ta sinh ra để sáng tạo','hinh6.jpg,61.jpg,62.jpg,63.jpg','BanThatSuCoTai.pdf'),
('S007',N'Để Có Trí Nhớ Tốt','LS004','TG007','CuongNX','NXB007','2019/1/1',5,N'Có bao giờ bạn nghĩ rằng có được một trí nhớ tốt là điều rất quan trọng và nó giúp bạn thành công?','hinh7.jpg,71.jpg,72.jpg,73.jpg','DeCoTriNhoTot.pdf'),
('S008',N'Đời Ngắn Đừng Ngủ Dài','LS004','TG008','CuongNX','NXB008','2019/1/1',5,N'Những điều tốt nhất trong đời đều đòi hỏi nỗ lực, cam kết và kỷ luật. Người bạn Nido Qubein của tôi từng nói: “Cái giá của kỷ luật bao giờ cũng rẻ hơn cái giá của nỗi đau hối tiếc.” Hẳn rồi, ý tưởng này rất hiển nhiên. Thế nhưng điều hiển nhiên nhất lại hay bị lãng quên nhất.','hinh8.jpg,81.jpg,82.jpg,83.jpg','DoiNganDungNguDai.pdf'),
('S009',N'Java Programming','LS001','TG009','CuongNX','NXB009','2019/1/1',5,N'Những điều tốt nhất trong đời đều đòi hỏi nỗ lực, cam kết và kỷ luật. Người bạn Nido Qubein của tôi từng nói: “Cái giá của kỷ luật bao giờ cũng rẻ hơn cái giá của nỗi đau hối tiếc.” Hẳn rồi, ý tưởng này rất hiển nhiên. Thế nhưng điều hiển nhiên nhất lại hay bị lãng quên nhất.','hinh9.jpg,91.jpg,92.jpg,93.jpg','JavaPrograming.pdf'),
('S010',N'Javascript - NoteJS','LS001','TG010','CuongNX','NXB010','2019/1/1',5,N'This is an unofficial free book created for educational purposes and is not affiliated with official JavaScript® group(s) or company(s) nor Stack Overflow. All trademarks and registered trademarks are the property of their respective company owners','hinh10.jpg,101.jpg,102.jpg,103.jpg','javascript-notes-for-professionals.pdf'),
('S011',N'Luyện Trí Nhớ','LS004','TG011','CuongNX','NXB011','2019/1/1',5,N'Trước nay, bạn vẫn tự nhủ mình không thông minh bằng nhiều người, nên bạn ráng sức chuyên cần để đạt được thành tích tốt. Và quả thật bạn đã thành công. Điều gì giúp bạn đạt được điều đó?','hinh14.jpg,141.jpg,142.jpg,143.jpg','LuyenTriNho.pdf'),
('S012',N'Mặc Kệ Thiên Hạ','LS004','TG012','CuongNX','NXB012','2019/1/1',5,N'Nếu bạn định than thở"Mình mệt quá"hay "Mình cảm thấy bị tổn thương"rồi chờ mong ai đó xoa dịu thì đừng nên làm như vậy. Tại sao ư? Bởi điều đó không những không thể giúp bạn giải quyết nỗi khổ của bản thân mà còn cứa sâu vào vết thương của bạn','hinh15.jpg,151.jpg,152.jpg,153.jpg','MacKeThienHaSongNhuNguoiNhat.pdf'),
('S013',N'Rest API Dev NoteJS','LS001','TG013','CuongNX','NXB013','2019/1/1',5,N'To my loving wife, without whom this book would’ve never happened and to my beautiful boys, without whom this book would’ve happened a lot sooner','hinh16.jpg,161.jpg,162.jpg,163.jpg','rest-api-development-with-nodejs.pdf')

INSERT INTO PhieuMuon values
('PM001','DG001',2,'2020/5/25','2020/6/25', 0),
('PM002','DG002',4,'2020/7/17','2020/8/27', 1),
('PM003','DG003',1,'2020/11/5','2020/12/11', 0),
('PM004','DG004',3,'2021/1/4','2021/2/5', 1),
('PM005','DG005',5,'2021/6/2','2021/7/3', 0),
('PM006','DG006',3,'2022/10/1','2022/11/3', 1),
('PM007','DG006',3,'2022/10/1','2022/11/3', 1),
('PM008','DG006',3,'2022/10/1','2022/11/3', 1),
('PM009','DG006',3,'2022/10/1','2022/11/3', 1),
('PM010','DG006',3,'2022/10/1','2022/11/3', 1),
('PM011','DG006',3,'2022/10/1','2022/11/3', 1),
('PM012','DG006',3,'2022/10/1','2022/11/3', 1),
('PM013','DG006',3,'2022/10/1','2022/11/3', 1)

--INSERT INTO SachTacGia values
--('TG002','S001'),
--('TG004','S002'),
--('TG005','S003'),
--('TG004','S004')

INSERT INTO ChiTietPhieuMuon values
('PM001','S002','2020/6/25'),
('PM002','S001','2020/8/27'),
('PM003','S004','2020/12/11'),
('PM004','S003','2021/2/5'),
('PM005','S005','2021/2/5'),
('PM006','S006','2021/2/5'),
('PM007','S007','2021/2/5'),
('PM008','S008','2021/2/5'),
('PM009','S009','2021/2/5'),
('PM010','S010','2021/2/5'),
('PM011','S011','2021/2/5'),
('PM012','S012','2021/2/5'),
('PM013','S013','2021/2/5')


-- Stored 1
go
CREATE PROC sp_MaLoaiSach(@MaTheLoai varchar(15)) 
AS BEGIN 
 	Select Tls.MaLoai, TenLoai, ViTri, MaSach, TenSach, SoLuong
	from LoaiSach tls join Sach s on tls.MaLoai = s.MaLoai 
	where tls.MaLoai = @MaTheLoai
	order by SoLuong desc
END 
go
--exec sp_MaLoaiSach 'LS001'
-- Stored 2
go
CREATE PROC sp_LoaiSach
AS BEGIN 
 	Select Tls.MaLoai, TenLoai, ViTri, MaSach, TenSach, SoLuong
	from LoaiSach tls join Sach s on tls.MaLoai = s.MaLoai 
	order by SoLuong desc
END 
go
--exec sp_LoaiSach 
-- Stored 3
go
CREATE PROC sp_ViTriLoaiSach(@ViTri nvarchar(50)) 
AS BEGIN 
 	Select Tls.MaLoai, TenLoai, ViTri, MaSach, TenSach, SoLuong
	from LoaiSach tls join Sach s on tls.MaLoai = s.MaLoai 
	where ViTri = @ViTri
	order by SoLuong desc
END 
go
--exec sp_ViTriLoaiSach  'Tu so 2'	
--Stored 4
go
	CREATE PROC sp_soSachTLS(@MaTheLoai varchar(10)) 
AS BEGIN 
 	Select SUM(SoLuong) tongSachTLS
	from Sach
	where MaLoai = @MaTheLoai
END 
go
--exec sp_soSachTLS  'MTL6'
--Stored 5	
go
	CREATE PROC sp_soSachViTriTLS(@ViTri nvarchar(50)) 
AS BEGIN 
 	Select SUM(SoLuong) tongSachViTriTLS
from LoaiSach tls join Sach s on tls.MaLoai = s.MaLoai 
	where ViTri = @ViTri
END 
go
--exec sp_soSachViTriTLS  'Tu so 5'
--Stored 6
drop proc sp_soLoaiTLS
go
	CREATE PROC sp_soLoaiTLS(@MaTheLoai varchar(10)) 
AS BEGIN 
 	Select COUNT(tls.MaLoai) soTheLoaiTLS
from LoaiSach tls join Sach s on tls.MaLoai = s.MaLoai 
	where tls.MaLoai = @MaTheLoai
END 
go
--exec sp_soLoaiTLS  'MTL6'
--Stored 7
drop proc sp_soLoaiViTriTLS
go
	CREATE PROC sp_soLoaiViTriTLS(@ViTri nvarchar(50)) 
AS BEGIN 
 	Select count(MaLoai) soTheLoaiViTriTLS
	from LoaiSach 
	where ViTri = @ViTri
END 
go
--exec sp_soLoaiViTriTLS  'Tu so 5'
--Stored 8
drop proc sp_TongLoaiTLS

go
	CREATE PROC sp_TongLoaiTLS
AS BEGIN 
 	Select count(MaLoai) TongLoaiTLS from LoaiSach
END 
go
--exec sp_TongLoaiTLS
--Stored 8
drop proc sp_GioiTinhDG
go
	CREATE PROC sp_GioiTinhDG(@GioiTinh bit)
AS BEGIN 
 	Select * from DocGia where GioiTinh = @GioiTinh
END 
go
--exec sp_GioiTinhDG 0
--Stored 9
go
	CREATE PROC sp_tongGioiTinhDG(@GioiTinh bit)
AS BEGIN 
 	Select COUNT(GioiTinh) tongGioiTinhDG
	from DocGia where GioiTinh = @GioiTinh
END 
go
--exec sp_tongGioiTinhDG 1
--Stored 10
go
	CREATE PROC sp_tongDG
AS BEGIN 
 	Select COUNT(MaDocGia) tongDG
	from DocGia
END 
go
exec sp_tongDG
--Stored 11
go
	CREATE PROC sp_NgaySachGiam(@ngayBD varchar(50), @ngayKT varchar(50))
AS BEGIN 
 	Select * from Sach
	where ngaynhap >= @ngayBD and ngaynhap <= @ngayKT
	order by SoLuong desc
END 
go
--exec sp_NgaySachGiam '2019-02-15', '2019-02-22'
--Stored 12
go
	CREATE PROC sp_NgaySachTang(@ngayBD varchar(50), @ngayKT varchar(50))
AS BEGIN 
 	Select * from Sach
	where ngaynhap >= @ngayBD and ngaynhap <= @ngayKT
	order by SoLuong asc
END 
go
--exec sp_NgaySachTang '2019-02-15', '2019-02-22'
--Stored 13
go
	CREATE PROC sp_TongSachNgaySach(@ngayBD varchar(50), @ngayKT varchar(50))
AS BEGIN 
 	Select sum(SoLuong) TongNgaySach
	from Sach
	where ngaynhap >= @ngayBD and ngaynhap <= @ngayKT
END 
go
--exec sp_TongSachNgaySach '2019-02-15', '2019-02-22'
--Stored 14
go
	CREATE PROC sp_TongSach
AS BEGIN 
 	Select sum(SoLuong) TongSach from Sach
END 
go
--exec sp_TongSach
--Stored 15
drop proc sp_PhieuMuon
go
	CREATE PROC sp_PhieuMuon
AS BEGIN 
 	Select pm.MaPhieu, sv.MaDocGia, sv.TenDocGia, s.TenSach,
	pm.SoLuong, NgayMuon, NgayHenTra
	from PhieuMuon pm join DocGia sv on pm.MaDocGia = sv.MaDocGia 
	join ChiTietPhieuMuon ct on ct.MaPhieu = pm.MaPhieu 
	join Sach s on ct.MaSach = s.MaSach

END 
go
exec sp_PhieuMuon
-- Stored 16
drop proc sp_MaDGPM
go

CREATE PROC sp_MaDGPM(@MaDocGia varchar(50)) 
AS BEGIN 
 	Select pm.MaPhieu, pm.MaDocGia, sv.TenDocGia, 
	s.TenSach, pm.SoLuong, NgayMuon, NgayHenTra
	from PhieuMuon pm join DocGia sv on pm.MaDocGia = sv.MaDocGia 
	join ChiTietPhieuMuon ct on ct.MaPhieu = pm.MaPhieu 
	join Sach s on ct.MaSach = s.MaSach
	where sv.MaDocGia = @MaDocGia
END 
go
--exec sp_MaDGPM 'DG001'
-- Stored 16-1
go
CREATE PROC sp_MaPhieu(@MaPhieu varchar(50)) 
AS BEGIN 
 	Select MaPhieu,pm.MaDocGia, pm.SoLuong, NgayMuon, NgayHenTra
	from PhieuMuon pm join Sach s on pm.MaDocGia = s.MaSach
	join DocGia sv on pm.MaDocGia = sv.MaDocGia
	where pm.MaPhieu = @MaPhieu
END 
go
--exec sp_MaPhieu 'PM02'
-- Stored 17
go
CREATE PROC sp_soSachDGPM(@MaDG varchar(50)) 
AS BEGIN 
 	Select sum(SoLuong) soSachDGPM, MaDocGia from PhieuMuon
	where MaDocGia = @MaDG
	group by MaDocGia
END 
go
--exec sp_soSachDGPM 'PS001'
-- Stored 18
go
CREATE PROC sp_MaSachPM(@MaSach varchar(10)) 
AS BEGIN 
 	Select pm.MaPhieu, pm.MaDocGia, sv.TenDocGia, 
	s.TenSach, pm.SoLuong, NgayMuon, NgayHenTra
	from PhieuMuon pm join DocGia sv on pm.MaDocGia = sv.MaDocGia 
	join ChiTietPhieuMuon ct on ct.MaPhieu = pm.MaPhieu 
	join Sach s on ct.MaSach = s.MaSach
	where s.MaSach = @MaSach
END 
go
--exec sp_MaSachPM 'S001'
-- Stored 19
go
CREATE PROC sp_soDGMuonSachPM(@MaSach varchar(10)) 
AS BEGIN 
 	Select COUNT(MaDocGia) tongDGMuonSach
	from PhieuMuon join ChiTietPhieuMuon on PhieuMuon.MaPhieu = ChiTietPhieuMuon.MaPhieu
	where MaSach = @MaSach
END 
go
--exec sp_soDGMuonSachPM 'S001'
-- Stored 20
go
	CREATE PROC sp_TongSachDGMuon
AS BEGIN 
 	Select sum(SoLuong) TongSachDGMuon from PhieuMuon
END 
go
--exec sp_TongSachDGMuon
-- Stored 21
drop proc sp_DGMuonNhieuSachNhat
go
CREATE PROC sp_DGMuonNhieuSachNhat
AS BEGIN 
 	Select  pm.MaDocGia, sv.TenDocGia, sum(pm.SoLuong) DGMuonNhieuSachNhat
	from PhieuMuon pm join DocGia sv on pm.MaDocGia = sv.MaDocGia
	 join ChiTietPhieuMuon ct on ct.MaPhieu = pm.MaPhieu 
	join Sach s on ct.MaSach = s.MaSach
	group by pm.MaDocGia, sv.TenDocGia
	order by sum(pm.SoLuong) desc
END 
go
--exec sp_DGMuonNhieuSachNhat
-- Stored 22
drop proc sp_DGMuonItSachNhat
go
CREATE PROC sp_DGMuonItSachNhat
AS BEGIN 
 	Select  pm.MaDocGia, sv.TenDocGia, sum(pm.SoLuong) DGMuonItSachNhat
	from PhieuMuon pm join DocGia sv on pm.MaDocGia = sv.MaDocGia
	 join ChiTietPhieuMuon ct on ct.MaPhieu = pm.MaPhieu 
	join Sach s on ct.MaSach = s.MaSach
	group by pm.MaDocGia, sv.TenDocGia
	order by sum(pm.SoLuong) asc
END 
go
--exec sp_DGMuonItSachNhat
-- Stored 23
drop PROC sp_SachMuonNhieuNhat
go
CREATE PROC sp_SachMuonNhieuNhat
AS BEGIN 
 	Select  s.MaSach, s.TenSach, sum(pm.SoLuong) SachMuonNhieuNhat
	from PhieuMuon pm  join ChiTietPhieuMuon ct on ct.MaPhieu = pm.MaPhieu 
	join Sach s on ct.MaSach = s.MaSach
	group by s.MaSach,  s.TenSach
	order by sum(pm.SoLuong) desc
END 
go
--exec sp_SachMuonNhieuNhat
-- Stored 24
drop PROC sp_SachMuonItNhat
go
CREATE PROC sp_SachMuonItNhat
AS BEGIN 
 	Select  s.MaSach, s.TenSach, sum(pm.SoLuong) SachMuonItNhat
	from PhieuMuon pm  join ChiTietPhieuMuon ct on ct.MaPhieu = pm.MaPhieu 
	join Sach s on ct.MaSach = s.MaSach
	group by s.MaSach,  s.TenSach
	order by sum(pm.SoLuong) asc
END 
go
--exec sp_SachMuonItNhat
-- Stored 25
drop PROC sp_DGConHanTraSach
go
	CREATE PROC sp_DGConHanTraSach
AS BEGIN 
 	Select pm.MaPhieu, pm.MaDocGia, sv.TenDocGia, s.MaSach, s.TenSach, 
	pm.SoLuong, NgayMuon, NgayHenTra
	from PhieuMuon pm join DocGia sv on pm.MaDocGia = sv.MaDocGia
	 join ChiTietPhieuMuon ct on ct.MaPhieu = pm.MaPhieu 
	join Sach s on ct.MaSach = s.MaSach
	where NgayHenTra > (select GETDATE())
END 
go
--exec sp_DGConHanTraSach
-- Stored 26
drop proc sp_DGQuaHanTraSach
go
	CREATE PROC sp_DGQuaHanTraSach
AS BEGIN 
 	Select pm.MaPhieu, pm.MaDocGia, sv.TenDocGia, s.MaSach, s.TenSach, 
	pm.SoLuong, NgayMuon, NgayHenTra
	from PhieuMuon pm join DocGia sv on pm.MaDocGia = sv.MaDocGia
	 join ChiTietPhieuMuon ct on ct.MaPhieu = pm.MaPhieu 
	join Sach s on ct.MaSach = s.MaSach
	where NgayHenTra < (select GETDATE())
END 
go
--exec sp_DGQuaHanTraSach
-- Stored 27
go
	CREATE PROC sp_TongDGConHanTraSach
AS BEGIN 
 	Select COUNT(DISTINCT MaDocGia) TongDGConHanTraSach 
	from PhieuMuon
	where NgayHenTra > (select GETDATE())
END 
go
--exec sp_TongDGConHanTraSach
-- Stored 28
go
	CREATE PROC sp_TongDGQuaHanTraSach
AS BEGIN 
 	Select COUNT(DISTINCT MaDocGia) TongDGQuaHanTraSach
	from PhieuMuon
	where NgayHenTra < (select GETDATE())
END 
go
--exec sp_TongDGQuaHanTraSach
-- Stored 29
go
	CREATE PROC sp_TongSoPhieuConHanTraSach
AS BEGIN 
 	Select COUNT(MaPhieu) TongSoPhieuConHanTraSach
	from PhieuMuon
	where NgayHenTra > (select GETDATE())
END 
go
--exec sp_TongSoPhieuConHanTraSach
-- Stored 30
go
	CREATE PROC sp_TongSoPhieuQuaHanTraSach
AS BEGIN 
 	Select COUNT(MaPhieu) TongSoPhieuQuaHanTraSach
	from PhieuMuon
	where NgayHenTra < (select GETDATE())
END 
go
--exec sp_TongSoPhieuQuaHanTraSach
-- Stored 31
go
	CREATE PROC sp_TongPM
AS BEGIN 
 	Select COUNT(MaPhieu) TongPM
	from PhieuMuon
END 
go
--exec sp_TongPM

-- Stored 32
-- Stored 33
go
	CREATE PROC sp_DGChuaMuonSach
AS BEGIN 
 	Select sv.MaDocGia, matkhau, TenDocGia, NgaySinh, GioiTinh, DiaChi, SDT, Email
	from DocGia sv full join PhieuMuon pm on sv.MaDocGia = pm.MaDocGia
	where pm.MaDocGia IS NULL
END 
go
--exec sp_DGChuaMuonSach
-- Stored 34
go
	CREATE PROC sp_DGDaMuonSach
AS BEGIN 
 	Select DISTINCT pm.MaDocGia, matkhau, TenDocGia, NgaySinh, GioiTinh, DiaChi, SDT, Email
	from DocGia sv join PhieuMuon pm on sv.MaDocGia = pm.MaDocGia
END 
go
--exec sp_DGDaMuonSach
-- Stored 35
go
	CREATE PROC sp_TongDGChuaMuonSach
AS BEGIN 
 	Select COUNT(sv.MaDocGia) TongSVChuaMuonSach
	from DocGia sv full join PhieuMuon pm on sv.MaDocGia = pm.MaDocGia
	where pm.MaDocGia IS NULL
END 
go
--exec sp_TongDGChuaMuonSach
-- Stored 36
go
	CREATE PROC sp_TongDGDaMuonSach
AS BEGIN 
 	Select COUNT(DISTINCT pm.MaDocGia) TongDGDaMuonSach
	from DocGia sv join PhieuMuon pm on sv.MaDocGia = pm.MaDocGia
END 
go
--exec sp_TongDGDaMuonSach
-- Stored 37
drop PROC sp_SachMuonNhieuNhatDGUI
go
CREATE PROC sp_SachMuonNhieuNhatDGUI
AS BEGIN 
 	Select  s.MaSach, s.TenSach, sum(pm.SoLuong) SachMuonNhieuNhaDGUI
	from PhieuMuon pm  join ChiTietPhieuMuon ct on ct.MaPhieu = pm.MaPhieu 
	join Sach s on ct.MaSach = s.MaSach
	group by s.MaSach,  s.TenSach
	order by sum(pm.SoLuong) desc
END 
go
--exec sp_SachMuonNhieuNhat
-- Stored 38
go
CREATE PROC sp_SachMuonItNhatDGUI
AS BEGIN 
 	Select  s.MaSach, s.TenSach, sum(pm.SoLuong) SachMuonItNhatSVUI
	from PhieuMuon pm  join ChiTietPhieuMuon ct on ct.MaPhieu = pm.MaPhieu 
	join Sach s on ct.MaSach = s.MaSach
	group by s.MaSach,  s.TenSach
	order by sum(pm.SoLuong) asc
END 
go
--exec sp_SachMuonItNhatDGUI
go 
-- Stored 39
CREATE PROC [dbo].[sp_TaoPhieu](
	@MaPhieu varchar(10),
	@MaDocGia varchar(10),
	@NgayMuon date,
	@NgayHenTra date)
AS BEGIN
	INSERT INTO PhieuMuon(MaPhieu,MaDocGia,NgayMuon,NgayHenTra) 
	VALUES (@MaPhieu,@MaDocGia,@NgayMuon,@NgayHenTra)
END

SELECT masach,
                tensach,
                loaisach.tenloai,
                tacgia.tentacgia,
                manv,
                nhaXB.tenNXB,
                ngaynhap,
                soluong,
                noidung,
                hinh,
                url
                FROM Sach join LoaiSach on sach.maloai = loaisach.maloai
                join nhaXb on nhaXB.maNXB = sach.maNXB
                join tacgia on tacgia.matacgia = sach.matacgia
