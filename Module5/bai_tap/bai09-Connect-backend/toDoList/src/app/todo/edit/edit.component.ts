import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {Todo} from '../../todo';
import {TodoService} from '../../service/todo.service';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {

  id: number;
  todo: Todo;
  formGroup: FormGroup;
  constructor( private todoService: TodoService, private activatedRouter: ActivatedRoute, private router: Router ) { }

  ngOnInit(): void {
    this.activatedRouter.paramMap.subscribe((param) => {
      this.id = +param.get('id');
      // @ts-ignore
      this.todo = this.todoService.findTodoById(this.id).subscribe(
        (todo) => {
          // @ts-ignore
          this.formGroup = new FormGroup({
            content: new FormControl(todo.content)
          });
        }
      );
    });
  }

  editTodo(id: number) {
    console.log(this.formGroup.value);
    this.todoService.editTodo(id, this.formGroup.value).subscribe(
      () => {},
      () => {},
      () => {
        this.router.navigateByUrl('/');
      }
    );
  }
}
