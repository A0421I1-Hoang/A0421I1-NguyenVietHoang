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
on loai_dich_vu.ID_loai_Dich_vu = dich_vu.ID_loai_Dich_vu;
