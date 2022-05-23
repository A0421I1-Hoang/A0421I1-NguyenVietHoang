import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Customer} from '../customer/customer';
import {Observable} from 'rxjs';
import {CustomerType} from '../model/customer-type';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  readonly URL_CUSTOMER = 'http://localhost:3000/customers';
  readonly URL_CUSTOMERTYPE = 'http://localhost:3000/customerType';

  constructor(private httpClient: HttpClient) {
  }

  getAllCustomerType(): Observable<CustomerType[]>{
    return this.httpClient.get<CustomerType[]>(this.URL_CUSTOMERTYPE);
  }

  getAll(): Observable<Customer[]>{
    return this.httpClient.get<Customer[]>(this.URL_CUSTOMER);
  }

  saveCustomer(customer: Customer): Observable<Customer>{
    return this.httpClient.post<Customer>(this.URL_CUSTOMER, customer);
  }

  findById(id: number): Observable<Customer> {
    return this.httpClient.get<Customer>(this.URL_CUSTOMER + '/' + id);
  }

  deleteCustomer(id: string): Observable<Customer>{
    return this.httpClient.delete<Customer>(this.URL_CUSTOMER + '/' + id);
  }

  updateCustomer(customer: Customer): Observable<Customer>{
    return this.httpClient.put<Customer>(this.URL_CUSTOMER + '/' + customer.id, customer);
  }
}
