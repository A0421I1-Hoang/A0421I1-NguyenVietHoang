import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {CustomerService} from '../../service/customer.service';
import {Router} from '@angular/router';
import {Customer} from '../customer';
import {CustomerType} from '../../model/customer-type';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {
  formCreateCustomer: FormGroup;
  customer: Customer;
  customerType: CustomerType[];

  constructor(private customerService: CustomerService,
              private router: Router) { }

  ngOnInit(): void {
    this.getAllCustomerType();
    this.formCreateCustomer = new FormGroup({
      id: new FormControl(),
      customerCode: new FormControl(),
      nameCustomer: new FormControl(),
      birthDate: new FormControl(),
      gender: new FormControl(),
      idCard: new FormControl(),
      numberPhone: new FormControl(),
      email: new FormControl(),
      customerType: new FormControl(),
      address: new FormControl(),
    });
  }

  createCustomer(){
    console.log(this.formCreateCustomer.value);
    this.customerService.saveCustomer(this.formCreateCustomer.value).subscribe(
      () => {},
      () => {},
      () => {
        this.router.navigateByUrl('/list');
      },
    );
  }

  getAllCustomerType(){
    this.customerService.getAllCustomerType().subscribe(data => {
      this.customerType = data;
    });
  }

}
