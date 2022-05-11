import { Component, OnInit } from '@angular/core';
import {LogIn} from '../log-in';
import {FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-login-component',
  templateUrl: './login-component.component.html',
  styleUrls: ['./login-component.component.css']
})
export class LoginComponentComponent implements OnInit {
  user: LogIn;
  logInForm = new FormGroup({
    email: new FormControl('', [Validators.required, Validators.email]),
    password: new FormControl('', [Validators.required, Validators.minLength(6)]),
  });

  constructor() { }

  ngOnInit(): void {
  }

  onSubmit(user) {
    console.log(this.logInForm.value);
  }

}
