// tslint:disable-next-line:no-empty-interface
import {Register} from './register';
import {FormControl} from '@angular/forms';

export class RegisterList {
  static registerList: Register[] = [
    {
      email: 'hello@gmail.com',
      password: '123456',
      confirmPassword: '123456',
      country: 'VN',
      age: 24,
      gender: true,
      phone: '+84394125632',
    }
    ];
}
