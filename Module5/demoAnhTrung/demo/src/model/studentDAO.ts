import {IStudent} from './student';

export class StudentDAO{
  static studentDao: IStudent[] = [
    {
      id: 1,
      name: 'Việt Hoàng',
      age: 23,
      mark: 10,
      avatar: '',
    },
    {
      id: 2,
      name: 'Trung Hậu',
      age: 21,
      mark: 8,
      avatar: '',
    },
    {
      id: 3,
      name: 'Thanh Toàn',
      age: 21,
      mark: 8,
      avatar: '',
    }
  ];
}
