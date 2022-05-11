import {Component, Input, OnInit} from '@angular/core';
import {FormGroup, FormControl, Validators} from '@angular/forms';
import {Register} from '../register';
import {RegisterList} from '../register-list';

@Component({
  selector: 'app-register-component',
  templateUrl: './register-component.component.html',
  styleUrls: ['./register-component.component.css']
})
export class RegisterComponentComponent implements OnInit {
  user: Register;
  countryList = [
    {id: 1, name: 'Viet Nam'},
    {id: 2, name: 'United States'},
    {id: 3, name: 'France'},
    {id: 4, name: 'Canada'}
  ];
  // register: RegisterList[];
  registerList: RegisterList[] = RegisterList.registerList;
  registerForm = new FormGroup({
    email: new FormControl('', [Validators.required, Validators.email]),
    pwGroup: new FormGroup({
      password: new FormControl('', [Validators.required, Validators.minLength(6)]),
      confirmPassword: new FormControl('', [Validators.required, Validators.minLength(6)])
    }),
    country: new FormControl('', [Validators.required]),
    age: new FormControl('', [Validators.required, Validators.min(18)]),
    gender: new FormControl('', [Validators.required]),
    phone: new FormControl('', [Validators.required, Validators.pattern(/^\+84\d{9,10}$/)])
  });
  constructor() {}

  ngOnInit(): void {
    // tslint:disable-next-line:no-unused-expression label-position
  }

  get email(){
    return this.registerForm.get('email');
  }
  get password(){
    return this.registerForm.get('pwGroup').get('password');
  }
  get confirmPassword(){
    return this.registerForm.get('pwGroup').get('confirmPassword');
  }
  get country(){
    return this.registerForm.get('country');
  }
  get age(){
    return this.registerForm.get('age');
  }
  get gender(){
    return this.registerForm.get('gender');
  }
  get phone(){
    return this.registerForm.get('phone');
  }

  onSubmit(user) {
    console.log(this.registerForm.value);
    this.registerList.push(user);
  }
}
