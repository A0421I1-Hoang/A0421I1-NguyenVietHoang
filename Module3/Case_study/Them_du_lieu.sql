-- thêm mới nhân viên
insert into nhan_vien (ID_Nhan_vien,Ho_va_ten,ID_vi_tri,ID_trinh_do,ID_bo_phan,Ngay_sinh,CMND,Luong, SDT, Dia_chi)
value(1,"Nguyễn Văn Huy",1,1,1,18-5-96,"201745269",7000000,"0307145269","Đà Nẵng");
insert into nhan_vien (ID_Nhan_vien,Ho_va_ten,ID_vi_tri,ID_trinh_do,ID_bo_phan,Ngay_sinh,CMND,Luong, SDT, Dia_chi)
value(2,"Nguyễn Việt",1,1,1,8-9-96,"201793234",7000000,"0305456759","Đà Nẵng");
insert into nhan_vien (ID_Nhan_vien,Ho_va_ten,ID_vi_tri,ID_trinh_do,ID_bo_phan,Ngay_sinh,CMND,Luong, SDT, Dia_chi)
value(3,"Nguyễn Văn Huy",2,2,1,18-5-96,"206821211",10000000,"0534285214","Quảng Trị");
insert into nhan_vien (ID_Nhan_vien,Ho_va_ten,ID_vi_tri,ID_trinh_do,ID_bo_phan,Ngay_sinh,CMND,Luong, SDT, Dia_chi)
value(4,"Phan Thị Thùy Ngân",2,4,2,15-3-92,"205421753",12000000,"0753147789","Đà Nẵng");
insert into nhan_vien (ID_Nhan_vien,Ho_va_ten,ID_vi_tri,ID_trinh_do,ID_bo_phan,Ngay_sinh,CMND,Luong, SDT, Dia_chi)
value(5,"Nguyễn Thanh Tâm",6,4,4,23-10-91,"205746253",35000000,"0576214754","Quảng Trị");
insert into nhan_vien (ID_Nhan_vien,Ho_va_ten,ID_vi_tri,ID_trinh_do,ID_bo_phan,Ngay_sinh,CMND,Luong, SDT, Dia_chi)
value(6,"Lê Thành Nam",1,4,2,23-3-98,"203146745",7000000,"0572517436","Quảng Trị");
insert into nhan_vien (ID_Nhan_vien,Ho_va_ten,ID_vi_tri,ID_trinh_do,ID_bo_phan,Ngay_sinh,CMND,Luong, SDT, Dia_chi)
value(7,"Trần Thị Thùy Linh",2,4,2,15-7-98,"205142256",12000000,"0395789125","Quảng Trị");
insert into nhan_vien (ID_Nhan_vien,Ho_va_ten,ID_vi_tri,ID_trinh_do,ID_bo_phan,Ngay_sinh,CMND,Luong, SDT, Dia_chi)
value(8,"Trần Công Quốc",3,4,1,12-5-94,"204182293",25000000,"0426145249","Đà Nẵng");
insert into nhan_vien (ID_Nhan_vien,Ho_va_ten,ID_vi_tri,ID_trinh_do,ID_bo_phan,Ngay_sinh,CMND,Luong, SDT, Dia_chi)
value(9,"Nguyễn Minh Ánh",1,3,1,18-5-00,"203452249",7000000,"0578245123","Quảng Nam");
insert into nhan_vien (ID_Nhan_vien,Ho_va_ten,ID_vi_tri,ID_trinh_do,ID_bo_phan,Ngay_sinh,CMND,Luong, SDT, Dia_chi)
value(10,"Vũ Khởi Linh",1,1,1,18-5-96,"204147333",7000000,"0307145269","Quảng Nam");
insert into nhan_vien (ID_Nhan_vien,Ho_va_ten,ID_vi_tri,ID_trinh_do,ID_bo_phan,Ngay_sinh,CMND,Luong, SDT, Dia_chi)
value(10,"Trần Văn Vũ",3,4,2,14-8-96,"205125452",15000000,"0576147414","Hà Nội");
insert into nhan_vien (ID_Nhan_vien,Ho_va_ten,ID_vi_tri,ID_trinh_do,ID_bo_phan,Ngay_sinh,CMND,Luong, SDT, Dia_chi)
value(10,"Phan Mạnh Nam",1,1,1,18-5-96,"204147333",7000000,"0307645782","Sài Gòn");
insert into nhan_vien (ID_Nhan_vien,Ho_va_ten,ID_vi_tri,ID_trinh_do,ID_bo_phan,Ngay_sinh,CMND,Luong, SDT, Dia_chi)
value(10,"Vũ Khắc Công",1,2,1,18-5-96,"204147333",7000000,"0567414356","Hà Tĩnh");
insert into nhan_vien (ID_Nhan_vien,Ho_va_ten,ID_vi_tri,ID_trinh_do,ID_bo_phan,Ngay_sinh,CMND,Luong, SDT, Dia_chi)
value(10,"Lê Duy Khánh",2,3,1,18-5-96,"204147333",12000000,"0764285746","Nghệ An");

-- Thêm mới bộ phận
insert into bo_phan(ID_bo_phan, Ten_bo_phan)
value(1,"Marketing");
insert into bo_phan(ID_bo_phan, Ten_bo_phan)
value(2,"Hành chính");
insert into bo_phan(ID_bo_phan, Ten_bo_phan)
value(3,"Phục vụ");
insert into bo_phan(ID_bo_phan, Ten_bo_phan)
value(4,"Quản lý");

-- Thêm mới trình độ
insert into trinh_do(ID_trinh_do, Trinh_do)
value(1,"Trung cấp");
insert into trinh_do(ID_trinh_do, Trinh_do)
value(2,"Cao đẳng");
insert into trinh_do(ID_trinh_do, Trinh_do)
value(3,"Đại học");
insert into trinh_do(ID_trinh_do, Trinh_do)
value(4,"Sau đại học");

-- Thêm mới vị trí
insert into vi_tri (ID_vi_tri, Ten_vi_tri)
value(1,"Lễ tân");
insert into vi_tri (ID_vi_tri, Ten_vi_tri)
value(2,"Phục vụ");
insert into vi_tri (ID_vi_tri, Ten_vi_tri)
value(3,"Chuyên viên");
insert into vi_tri (ID_vi_tri, Ten_vi_tri)
value(4,"Giám sát");
insert into vi_tri (ID_vi_tri, Ten_vi_tri)
value(5,"Quản lý");
insert into vi_tri (ID_vi_tri, Ten_vi_tri)
value(6,"Giám đốc");

-- Thêm mới loại khách 
insert into loai_khach (ID_loai_khach, Ten_loai_khach)
value(1,"Member");
insert into loai_khach (ID_loai_khach, Ten_loai_khach)
value(2,"Silver");
insert into loai_khach (ID_loai_khach, Ten_loai_khach)
value(3,"Gold");
insert into loai_khach (ID_loai_khach, Ten_loai_khach)
value(4,"Platinium");
insert into loai_khach (ID_loai_khach, Ten_loai_khach)
value(5,"Diamond");

-- Thêm mới dịch vụ 
insert into dich_vu (ID_dich_vu,Ten_dich_vu,Dien_tich,So_tang,So_nguoi_toi_da,Chi_phi_thue,ID_kieu_thue,ID_loai_dich_vu,Trang_thai)
value (1,"Villa",200,2,8,5000000,1,1,"Khả dụng");
insert into dich_vu (ID_dich_vu,Ten_dich_vu,Dien_tich,So_tang,So_nguoi_toi_da,Chi_phi_thue,ID_kieu_thue,ID_loai_dich_vu,Trang_thai)
value (2,"Villa",200,2,8,5000000,1,1,"Khả dụng");
insert into dich_vu (ID_dich_vu,Ten_dich_vu,Dien_tich,So_tang,So_nguoi_toi_da,Chi_phi_thue,ID_kieu_thue,ID_loai_dich_vu,Trang_thai)
value (3,"Villa",200,2,8,5000000,1,1,"Khả dụng");
insert into dich_vu (ID_dich_vu,Ten_dich_vu,Dien_tich,So_tang,So_nguoi_toi_da,Chi_phi_thue,ID_kieu_thue,ID_loai_dich_vu,Trang_thai)
value (4,"Villa",200,2,8,5000000,1,1,"Khả dụng");
insert into dich_vu (ID_dich_vu,Ten_dich_vu,Dien_tich,So_tang,So_nguoi_toi_da,Chi_phi_thue,ID_kieu_thue,ID_loai_dich_vu,Trang_thai)
value (5,"Villa",200,2,8,5000000,1,1,"Khả dụng");
insert into dich_vu (ID_dich_vu,Ten_dich_vu,Dien_tich,So_tang,So_nguoi_toi_da,Chi_phi_thue,ID_kieu_thue,ID_loai_dich_vu,Trang_thai)
value (6,"Villa",200,2,8,5000000,1,1,"Khả dụng");
insert into dich_vu (ID_dich_vu,Ten_dich_vu,Dien_tich,So_tang,So_nguoi_toi_da,Chi_phi_thue,ID_kieu_thue,ID_loai_dich_vu,Trang_thai)
value (7,"Villa",200,2,8,5000000,1,1,"Khả dụng");
insert into dich_vu (ID_dich_vu,Ten_dich_vu,Dien_tich,So_tang,So_nguoi_toi_da,Chi_phi_thue,ID_kieu_thue,ID_loai_dich_vu,Trang_thai)
value (8,"Villa",200,2,8,5000000,1,1,"Khả dụng");
insert into dich_vu (ID_dich_vu,Ten_dich_vu,Dien_tich,So_tang,So_nguoi_toi_da,Chi_phi_thue,ID_kieu_thue,ID_loai_dich_vu,Trang_thai)
value (9,"Villa",200,2,8,5000000,1,1,"Khả dụng");
insert into dich_vu (ID_dich_vu,Ten_dich_vu,Dien_tich,So_tang,So_nguoi_toi_da,Chi_phi_thue,ID_kieu_thue,ID_loai_dich_vu,Trang_thai)
value (10,"Villa",200,2,8,5000000,1,1,"Khả dụng");

-- Thêm mới kiểu thuê 
insert into kieu_thue (ID_kieu_thue,Ten_kieu_thue,Gia)
value(1,"Thuê theo giờ",500000);
insert into kieu_thue (ID_kieu_thue,Ten_kieu_thue,Gia)
value(2,"Thuê theo ngày",2000000);
insert into kieu_thue (ID_kieu_thue,Ten_kieu_thue,Gia)
value(3,"Thuê theo tháng",10000000);
insert into kieu_thue (ID_kieu_thue,Ten_kieu_thue,Gia)
value(4,"Thuê theo năm",50000000);

-- Thêm mới dịch vụ đi kèm
insert into dich_vu_di_kem(ID_dich_vu_di_kem,Ten_dich_vu_di_kem,Gia,Don_vi,Trang_thai_kha_dung)
value(1,"massage",300000,"VNĐ","Khả dụng");
insert into dich_vu_di_kem(ID_dich_vu_di_kem,Ten_dich_vu_di_kem,Gia,Don_vi,Trang_thai_kha_dung)
value(2,"Karaoke",250000,"VNĐ/giờ","Khả dụng");
insert into dich_vu_di_kem(ID_dich_vu_di_kem,Ten_dich_vu_di_kem,Gia,Don_vi,Trang_thai_kha_dung)
value(3,"Thức ăn",200000,"VNĐ/món","Khả dụng");
insert into dich_vu_di_kem(ID_dich_vu_di_kem,Ten_dich_vu_di_kem,Gia,Don_vi,Trang_thai_kha_dung)
value(4,"Đồ uống",50000,"VNĐ/chai","Khả dụng");
insert into dich_vu_di_kem(ID_dich_vu_di_kem,Ten_dich_vu_di_kem,Gia,Don_vi,Trang_thai_kha_dung)
value(5,"Thuê xe",500000,"VNĐ/lượt","Khả dụng");

-- Thêm mới hợp đồng