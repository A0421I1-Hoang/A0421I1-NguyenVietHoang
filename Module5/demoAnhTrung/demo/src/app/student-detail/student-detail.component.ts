import {Component, OnInit} from '@angular/core';
import {IStudent} from '../../model/student';

@Component({
  selector: 'app-student-detail',
  templateUrl: './student-detail.component.html',
})

export class StudentDetailComponent implements OnInit{
  student: IStudent = {
    id: 1,
    name: 'Việt Hoàng',
    age: 23,
    mark: 10,
    avatar: ''
  };

  constructor() {
  }

  ngOnInit(): void {
  }
}
