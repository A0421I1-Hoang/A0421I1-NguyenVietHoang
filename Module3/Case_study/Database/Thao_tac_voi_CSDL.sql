-- Task 2
select Ho_va_ten from nhan_vien
WHERE Ho_va_ten LIKE '[HTK]%' and LEN(Ho_va_ten) <= 15;

-- Task 3
select Dia_chi from nhan_vien
where Dia_chi="Đà Nẵng" or Dia_chi="Quảng Trị";

-- Task 4
select Ho_va_ten
from khach_hang
join loai_khach
on loai_khach.ID_loai_khach = khach_hang.ID_loai_khach
join hop_dong
on hop_dong.ID_khach_hang=khach_hang.ID_khach_hang
join hop_dong_chi_tiet
on hop_dong.ID_hop_dong = hop_dong_chi_tiet.ID_hop_dong
where loai_khach.Ten_loai_khach = "Diamond";

-- Task 5
select khach_hang.ID_khach_hang, khach_hang.Ho_va_ten, loai_khach.Ten_loai_khach, hop_dong.ID_hop_dong, dich_vu.Ten_dich_vu, hop_dong.Ngay_lap_hop_dong, hop_dong.Ngay_ket_thuc, hop_dong.Tong_tien
from khach_hang
join loai_khach
on khach_hang.ID_khach_hang = loai_khach.ID_khach_hang
join hop_dong
on dich_vu.ID_dich_vu = hop_dong.ID_dich_vu
join hop_dong_chi_tiet
on hop_dong_chi_tiet.ID_hop_dong = hop_dong.ID_hop_dong
join dich_vu_di_kem
on dich_vu_di_kem.ID_dich_vu_di_kem=hop_dong_chi_tiet.ID_dich_vu_di_kem
where hop_dong.Tong_tien = hop_dong.Tien_dat_coc + hop_dong_chi_tiet.So_luong * dich_vu_di_kem.Gia;

-- Task 6
select dich_vu.ID_dich_vu, dich_vu.Ten_dich_vu, dich_vu.Dien_tich, dich_vu.Chi_phi_thue, loai_dich_vu.Ten_loai_dich_vu
from dich_vu
join loai_dich_vu
on loai_dich_vu.ID_loai_Dich_vu = dich_vu.ID_loai_Dich_vu
where not exists (select Ten_dich_vu from dich_vu);

-- Task 7
select dich_vu.ID_dich_vu, dich_vu.Ten_dich_vu, dich_vu.Dien_tich, dich_vu.So_nguoi_toi_da, dich_vu.Chi_phi_thue, loai_dich_vu.Ten_loai_dich_vu
from dich_vu
join loai_dich_vu
on loai_dich_vu.ID_loai_Dich_vu = dich_vu.ID_loai_Dich_vu
where Ngay_lap_hop_dong between '1/1/2018' and '31/12/2018';

-- Task 8
select distinct Ho_va_ten from khach_hang;

-- Task 9
select month(Ngay_lap_hop_dong) Thang , sum(Ngay_lap_hop_dong) Tong
from hop_dong
where year(Ngay_lap_hop_dong)=2019;

-- Task 10
select ID_hop_dong, Ngay_lap_hop_dong, Ngay_ket_thuc, Tien_dat_coc, hop_dong_chi_tiet.So_luong
from hop_dong
join hop_dong_chi_tiet 
on hop_dong.ID_hop_dong=hop_dong_chi_tiet.ID_hop_dong;

-- Task 11
select ID_dich_vu_di_kem,Ten_dich_vu_di_kem, Gia, Don_vi, Trang_thai_kha_dung, Ten_loai_khach
from dich_vu_di_kem
join hop_dong_chi_tiet
on hop_dong_chi_tiet.ID_dich_vu_di_kem=dich_vu_di_kem.ID_dich_vu_di_kem
join hop_dong
on hop_dong.ID_hop_dong_chi_tiet = hop_dong_chi_tiet.ID_hop_dong_chi_tiet
join khach_hang
on khach_hang.ID_khach_hang = hop_dong.ID_khach_hang
join loai_khach
on loai_khach.ID_loai_khach = khach_hang.ID_loai_khach
where Ten_loai_khach ="Diamond" and Dia_chi="Quảng Ngãi";

-- Task 12
select ID_hop_dong, NV.Ten_nhan_vien, KH.Ten_khach_hang, KH.SDT, Ten_dich_vu, HDCT.So_luong, Tien_dat_coc
from hop_dong
join nhan_vien NV
on NV.ID_nhan_vien = hop_dong.ID_nhan_vien
join khach_hang KH
on KH.ID_khach_hang = hop_dong.ID_khach_hang
join hop_dong_chi_tiet HDCT
on hop_dong.ID_hop_dong_chi_tiet = HDCT.ID_hop_dong_chi_tiet
where Ngay_lap_hop_dong between '1/10/2019' and '31/12/2019';

-- Tash 13
select Ten_dich_vu_di_kem, Gia, max(hd.So_luong)
from dich_vu_di_kem
join hop_dong_chi_tiet
on hop_dong_chi_tiet.ID_dich_vu_di_kem = dich_vu_di_kem.ID_dich_vu_di_kem
join hop_dong hd
on hop_dong.ID_hop_dong = hop_dong_chi_tiet.ID_hop_dong;

-- Tash 14
select HD.ID_hop_dong, LDV.Ten_loai_dich_vu, Ten_dich_vu_di_kem, HDCT.So_luong
from dich_vu_di_kem
join hop_dong_chi_tiet HDCT
on hop_dong_chi_tiet.ID_dich_vu_di_kem = dich_vu_di_kem.ID_dich_vu_di_kem
join hop_dong HD
on hop_dong.ID_hop_dong = hop_dong_chi_tiet.ID_hop_dong
join dich_vu DV
on dich_vu.ID_dich_vu = hop_dong.ID_dich_vu
join loai_dich_vu LDV
on LDV.ID_loai_Dich_vu = DV.ID_loai_Dich_vu
where HDCT.So_luong = 1;

-- Task 15
select ID_nhan_vien, Ho_va_ten, TD.Trinh_do, BP.Ten_bo_phan, SDT, Dia_chi, count(HD.Ngay_lap_hop_dong)
from nhan_vien
join bo_phan BP
on BP.Ten_bo_phan = nhan_vien.Ten_bo_phan
join trinh_do TD
on TD.ID_trinh_do = nhan_vien.ID_trinh_do
join hop_dong HD
on HD.ID_nhan_vien = nhan_vien.ID_nhan_vien
where count(HD.Ngay_lap_hop_dong) <=3;

-- Task 16 
delete from nhan_vien
where not exists (select Ngay_lap_hop_dong from hop_dong where Ngay_lap_hop_dong between '1/1/2017' and '31/12/2019');

-- Task 17
update loai_khach
set Ten_loai_khach = 'Diamond'
where Ten_loai_khach = 'Platinium' and (select Tong_tien from hop_dong where Tong_tien>10000000);

-- Task 18
delete from khach_hang
where (select Ngay_lap_hop_dong from hop_dong where Ngay_lap_hop_dong < '1/1/2016');

-- Task 19
update dich_vu_di_kem
set Gia = Gia*2
where (select So_luong from hop_dong_chi_tiet where So_luong > 10);

-- Task 20
select NV.ID_nhan_vien, NV.Ho_va_ten, NV.Email, NV.SDT, NV.Ngay_sinh, NV.Dia_chi, KH.ID_khach_hang, KH.Ho_va_ten, KH.Email, KH.SDT, KH.Ngay_sinh, KH.Dia_chi
from nhan_vien NV
join hop_dong HD
on NV.ID_nhan_vien = HD.ID_nhan_vien
join khach_hang KH
on KH.ID_khach_hang = HD.ID_khach_hang;

