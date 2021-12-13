create database case_study;
use case_study;
create table Nhan_vien (
ID_Nhan_vien int primary key,
Ho_va_ten varchar(45),
ID_vi_tri int,
ID_trinh_do int,
ID_bo_phan int,
Ngay_sinh date,
CMND varchar(45),
Luong varchar(45),
SDT varchar(45),
Email varchar(45),
Dia_chi varchar(45)
);

create table Vi_tri (
ID_vi_tri int primary key,
Ten_vi_tri varchar(45)
);

create table Trinh_do (
ID_trinh_do int primary key,
Trinh_do varchar(45)
);

create table Bo_phan (
ID_bo_phan int primary key,
Ten_bo_phan varchar(45)
);

create table Hop_dong(
ID_hop_dong int primary key,
ID_nhan_vien int,
ID_khach_hang int,
ID_dich_vu int,
Ngay_lap_hop_dong date,
Ngay_ket_thuc date,
Tien_dat_coc int,
Tong_tien int
);

create table Hop_dong_chi_tiet(
ID_hop_dong_chi_tiet int primary key,
ID_hop_dong int,
ID_dich_vu_di_kem int,
So_luong int
);

create table Dich_vu_di_kem (
ID_dich_vu_di_kem int primary key,
Ten_dich_vu_di_kem varchar(45),
Gia varchar(45),
Don_vi varchar(45),
Trang_thai_kha_dung varchar(45)
);

create table Khach_hang (
ID_khach_hang int primary key,
ID_loai_khach int,
Ho_va_ten varchar(45),
Ngay_sinh date,
CMND varchar(45),
SDT varchar(45),
Email varchar(45),
Dia_chi varchar(45)
);

create table Loai_khach (
ID_loai_khach int primary key,
Ten_loai_khach varchar(45)
);

create table Dich_vu (
ID_dich_vu int primary key,
Ten_dich_vu varchar(45),
Dien_tich int,
So_tang int,
So_nguoi_toi_da int,
Chi_phi_thue varchar(45),
ID_kieu_thue int,
ID_loai_dich_vu int,
Trang_thai varchar(45)
);

create table Kieu_thue (
ID_kieu_thue int primary key,
Ten_kieu_thue varchar(45),
Gia int
);

create table Loai_dich_vu (
ID_loai_Dich_vu int primary key,
Ten_loai_dich_vu varchar(45)
);

