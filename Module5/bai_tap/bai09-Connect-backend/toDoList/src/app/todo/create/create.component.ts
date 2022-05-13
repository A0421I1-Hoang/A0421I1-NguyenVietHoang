import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {TodoService} from '../../service/todo.service';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {

  constructor(private todoService: TodoService, private activatedRouter: ActivatedRoute, private router: Router) { }
  todo = new FormGroup({
    id: new FormControl(),
    content: new FormControl(),
    complete: new FormControl(),
  });
  ngOnInit(): void {
  }

  createToDo(todo){
    this.todoService.createTodo(todo).subscribe(
      () => {},
      () => {},
      () => {
        this.router.navigateByUrl('/');
      },
    );
  }
}
