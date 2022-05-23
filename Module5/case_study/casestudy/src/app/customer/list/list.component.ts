import { Component, OnInit } from '@angular/core';
import {Customer} from '../customer';
import {CustomerService} from '../../service/customer.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  customerList: Customer[] ;

  constructor(private customerService: CustomerService) {}

  deleteRowData(customer) {
    this.customerService.deleteCustomer(customer.id).subscribe(() => {
        this.getAll();
      }
    );
  }

  ngOnInit(): void {
    this.getAll();
  }

  getAll() {
    this.customerService.getAll().subscribe(
      next => {
      this.customerList = next;
    });
  }
}
