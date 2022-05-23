import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {BenhAn} from '../../model/benh-an';
import {BenhAnService} from '../../service/benhAn.service';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {

  benhAn: BenhAn;
  editForm: FormGroup;

  constructor(private fb: FormBuilder, private service: BenhAnService,
              private router: Router, private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const id = Number(paramMap.get('id'));
      console.log(id);
      this.service.findById(id).subscribe(next => {
        this.benhAn = next;
        console.log(this.benhAn);
        // @ts-ignore
        this.editForm.patchValue({
          id: this.benhAn.id,
          ma_benh_an: this.benhAn.ma_benh_an,
          ma_benh_nhan: this.benhAn.ma_benh_nhan,
          ten_benh_nhan: this.benhAn.ten_benh_nhan,
          ngay_nhap_vien: this.benhAn.ngay_nhap_vien,
          ngay_ra_vien: this.benhAn.ngay_ra_vien,
          ly_do: this.benhAn.ly_do,
          phuong_phap: this.benhAn.phuong_phap,
          bac_si_dieu_tri: this.benhAn.bac_si_dieu_tri,
        });
      });
    });
    // @ts-ignore
    this.editForm = this.fb.group({
      id: [''],
      ma_benh_an: [''],
      ma_benh_nhan: [''],
      ten_benh_nhan: ['', [Validators.required, Validators.pattern(/[^0-9/~?><.,@]$/)]],
      ngay_nhap_vien: ['', [Validators.required]],
      ngay_ra_vien: ['', [Validators.required]],
      ly_do: ['', [Validators.required, Validators.pattern(/[^0-9/~?><.,@]$/)]],
      phuong_phap: ['', [Validators.required]],
      bac_si_dieu_tri: ['', [Validators.required, Validators.pattern(/[^0-9/~?><.,@]$/)]],
    });
  }

  onSubmit(): void {
    // console.log(this.fb);
    if (this.editForm.valid) {
      this.benhAn = this.editForm.value;
      this.service.updateBenhAn(this.benhAn).subscribe(next => this.router.navigateByUrl('/list'));
    }
  }
}
