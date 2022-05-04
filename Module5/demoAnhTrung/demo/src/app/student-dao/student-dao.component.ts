import { Component, OnInit } from '@angular/core';
import {IStudent} from '../../model/student';
import {StudentDAO} from '../../model/studentDAO';

@Component({
  selector: 'app-student-dao',
  templateUrl: './student-dao.component.html',
})
export class StudentDAOComponent implements OnInit {

  students: IStudent[] = StudentDAO.studentDao;

  constructor() {}

  ngOnInit(): void {
  }

}
