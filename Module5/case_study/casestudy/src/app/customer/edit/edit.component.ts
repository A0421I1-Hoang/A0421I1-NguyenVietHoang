import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {Customer} from '../customer';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';
import {CustomerService} from '../../service/customer.service';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {
  form = FormBuilder;
  customer: Customer;
  editForm: FormGroup;

  constructor(private fb: FormBuilder, private service: CustomerService,
              private router: Router, private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const id = Number(paramMap.get('id'));
      console.log(id);
      this.service.findById(id).subscribe(next => {
        this.customer = next;
        console.log(this.customer);
        // @ts-ignore
        this.editForm.patchValue({
          id: this.customer.id,
          customerCode: this.customer.customerCode,
          nameCustomer: this.customer.nameCustomer,
          birthDate: this.customer.birthDate,
          gender: this.customer.gender,
          idCard: this.customer.idCard,
          numberPhone: this.customer.numberPhone,
          email: this.customer.email,
          customerType: this.customer.customerType,
          address: this.customer.address,
        });
      });
    });
    // @ts-ignore
    this.editForm = this.fb.group({
      id: ['', Validators.required],
      nameCustomer: ['', [Validators.required, Validators.pattern(/[^0-9/~?><.,@]$/)]],
      customerCode: [''],
      birthDate: [''],
      gender: [''],
      idCard: [''],
      address: ['', [Validators.required, Validators.pattern(/[^0-9/~?><.,@]$/)]],
      email: ['', [Validators.required, Validators.pattern(/^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z0-9]+\.[a-zA-Z0-9]+$/)]],
      customerType: ['', Validators.required],
      numberPhone: ['', [Validators.required, Validators.pattern(/^([0-9]{10}|[0-9]{12})$/)]],
    });
  }

  onSubmit(): void {
    console.log(this.form);
    // @ts-ignore
    if (this.editForm.valid) {
      // @ts-ignore
      this.customer = this.editForm.value;
      this.service.updateCustomer(this.customer).subscribe(next => this.router.navigateByUrl('/list'));
    }
  }

}
